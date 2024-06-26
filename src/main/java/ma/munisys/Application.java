package ma.munisys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

//import java.nio.file.Path;

import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Message;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.processor.aggregate.AggregationStrategy;

//import org.springframework.context.annotation.ImportResource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Application extends RouteBuilder {


    static String REQUEST_TIMEOUT = System.getenv().getOrDefault("REQUEST_TIMEOUT", "3600000");
    static String CONNECT_TIMEOUT = System.getenv().getOrDefault("CONNECT_TIMEOUT", "60000");

    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void configure() {

        //from("netty4-http:proxy://0.0.0.0:8443?sync=true&keepAlive=false&disconnect=false&reuseChannel=true&backlog=1000&ssl=true&keyStoreFile=/keystore_iam.jks&passphrase=123.pwdMunisys&trustStoreFile=/keystore_iam.jks")
        from("netty4-http:proxy://0.0.0.0:8443?backlog=200&ssl=true&keyStoreFile=/certs/keystore_iam.jks&passphrase=changeit&trustStoreFile=/certs/keystore_iam.jks")
        //from("netty4-http:proxy://0.0.0.0:8081?backlog=1000")
        //from("netty4-http:proxy://0.0.0.0:8086") // Enable this for local dev troubleshooting, and disable the above line
            .routeId("muis_route1")
            .log(LoggingLevel.INFO, "-------------- IAM_Complex_TRF START version iam_1.29 -----------------------\n")
            .setHeader("X-Request-ID", simple(UUID.randomUUID().toString()))
            .log(LoggingLevel.INFO, "Initial received header : \n${in.headers} \n")
            .log(LoggingLevel.INFO, "Initial received body : \n${body} \n")
            .multicast(new transformRequest())
				.aggregationStrategyMethodAllowNull()
				.parallelProcessing()
				.to("direct:muis_trans_req_header","direct:muis_trans_req_body")
			.end()
        // Uncomment the two following line to let this fuse app proxy the request to some backend
        // To be commented if this fuse app is to be used as a camel-proxy policy to let 3scale use it as a helper to transformer the request before handling it to the backend
           //.setHeader("CamelHttpMethod", constant("POST"))
            //.to("netty4-http:http:130.24.31.210:8090")
        // Transformaing the backend reply
            //.to("Receipt_Transfer_Transformation_Response.Xquery")
            .log(LoggingLevel.INFO, "MUIS toD : ${headers." + Exchange.HTTP_SCHEME + "}://"
                                    + "${headers." + Exchange.HTTP_HOST + "}:"
                                    + "${headers." + Exchange.HTTP_PORT + "}"
                                    + "${headers." + Exchange.HTTP_PATH + "}?connectTimeout="+CONNECT_TIMEOUT+"&requestTimeout="+REQUEST_TIMEOUT+"\n")
            .toD("netty4-http:"
                + "${headers." + Exchange.HTTP_SCHEME + "}://"
                + "${headers." + Exchange.HTTP_HOST + "}:"
                + "${headers." + Exchange.HTTP_PORT + "}"
                + "${headers." + Exchange.HTTP_PATH + "}?connectTimeout="+CONNECT_TIMEOUT+"&requestTimeout="+REQUEST_TIMEOUT)
                // connectTimeout (producer) :   Time to wait for a socket connection to be available. Value is in milliseconds.
                // requestTimeout (producer) : Allows to use a timeout for the Netty producer when calling a remote server. 
                //                            By default no timeout is in use. The value is in milliseconds, so eg 30000 is 30 seconds. 
                //                            The requestTimeout is using Netty’s ReadTimeoutHandler to trigger the timeout.
                // 

            .convertBodyTo(String.class)
            .log(LoggingLevel.INFO, "Backend response in.headers (before transformation) : \n${in.headers} \n")
            .log(LoggingLevel.INFO, "Backend response body (before transformation) : \n${body} \n")
            .to("xquery:file:/Transform/Response.Xquery")
            .process(Application::addSoapEnvelope)
            //.to("xquery:Response.Xquery")  // Enable this for local dev troubleshooting, and disable the above line
            .log(LoggingLevel.INFO, "Backend response body (after transformation) : \n${body} \n");
        
                from("direct:muis_trans_req_header")
                    .routeId("muis_route1.1")
                    .log("muis_route1.1 ('direct:muis_trans_req_header') is being invoked ...\n")
                    .convertBodyTo(String.class)
                    .to("xquery:file:/Transform/Header.Xquery")
                    //.to("xquery:Header.Xquery") // Enable this for local dev troubleshooting, and disable the above line
                .end();

                from("direct:muis_trans_req_body")
                    .routeId("muis_route 1.2")
                    .log("muis_route 1.2 ('direct:muis_trans_req_body') is being invoked ...")
                    .convertBodyTo(String.class)
                    .to("xquery:file:/Transform/Request.Xquery")
                    //.to("xquery:Request.Xquery")  // Enable this for local dev troubleshooting, and disable the above line
                .end();

       //.transform().xquery("Receipt_Transfer_Header.Xquery", "urn:Ariba:Buyer:vsap");
    }

    public static void addSoapEnvelope(Exchange exchange) {
        final Message message = exchange.getIn();
        String body = message.getBody(String.class);
        String newBody = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"> <SOAP-ENV:Body xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" + body + "</SOAP-ENV:Body> </soapenv:Envelope>";
        message.setBody(newBody);
    }
}

class transformRequest implements AggregationStrategy  {
    private static final Logger LOGGER = LoggerFactory.getLogger(transformRequest.class.getName());

    @Override   
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {

        if(oldExchange == null) {
            return newExchange;
        }
 
        String oldBody = oldExchange.getIn().getBody(String.class);
        LOGGER.info("Inside aggregator oldExchange : " + oldBody + "\n");

        String newBody = newExchange.getIn().getBody(String.class);
        LOGGER.info("Inside aggregator newExchange : " + newBody + "\n");
        
        String mergedStr = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">" +
                                "<soapenv:Header>" +
                                    oldBody +
                                "</soapenv:Header>" +
                                "<soap:Body xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" +
                                newBody +
                                "</soap:Body>" +
                            "</soapenv:Envelope>";

        newExchange.getIn().setBody(mergedStr);

        LOGGER.info("Inside aggregator merged Exchange : " + newExchange.getIn().getBody() + "\n");
        LOGGER.info("Inside aggregator merged Exchange.HTTP_RESPONSE_CODE : " + Exchange.HTTP_RESPONSE_CODE + "\n");
        return newExchange;
    }

}
