package ma.munisys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

//import java.nio.file.Path;

import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.processor.aggregate.AggregationStrategy;

//import org.springframework.context.annotation.ImportResource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
//@ImportResource({"classpath:spring/camel-context.xml"})
public class Application extends RouteBuilder {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void configure() {

        from("netty4-http:proxy://0.0.0.0:8443?ssl=true&keyStoreFile=/keystore_iam.jks&passphrase=123.pwdMunisys&trustStoreFile=/keystore_iam.jks")
            .routeId("muis_route1")
            .log(LoggingLevel.INFO, "-------------- IAM_Complex_TRF START -----------------------")
            .log(LoggingLevel.INFO, "Initial received body : \n${body}")
            .setHeader("X-Request-ID", constant(UUID.randomUUID()))
            .multicast(new transformRequest())
            .aggregationStrategyMethodAllowNull()
            .parallelProcessing()
            .to("direct:muis_trans_req_header","direct:muis_trans_req_body")
            .log(LoggingLevel.INFO, "-------------- IAM_Complex_TRF END -----------------------")
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
                                    + "${headers." + Exchange.HTTP_PATH + "}")
            .toD("netty4-http:"
                + "${headers." + Exchange.HTTP_SCHEME + "}://"
                + "${headers." + Exchange.HTTP_HOST + "}:"
                + "${headers." + Exchange.HTTP_PORT + "}"
                + "${headers." + Exchange.HTTP_PATH + "}")
            .convertBodyTo(String.class)
            .log(LoggingLevel.INFO, "Backend response in.headers (before transformation) : \n${in.headers}")
            .log(LoggingLevel.INFO, "Backend response body (before transformation) : \n${body}")
            .to("xquery:file:/Transform/Response.Xquery")
            .log(LoggingLevel.INFO, "Backend response body (after transformation) : \n${body}");
            //.to("xquery:Response.Xquery");
        
                from("direct:muis_trans_req_header")
                    .routeId("muis_route1.1")
                    .log("muis_route1.1 is being invoked ...")
                    .convertBodyTo(String.class)
                    //.delayer(5000)
                    .to("xquery:file:/Transform/Header.Xquery")
                    //.to("xquery:Header.Xquery")
                .end();

                from("direct:muis_trans_req_body")
                    .routeId("muis_route1.2")
                    .log("muis_route1.2 is being invoked ...")
                    .convertBodyTo(String.class)
                    .to("xquery:file:/Transform/Request.Xquery")
                    //.to("xquery:Request.Xquery")
                .end();

       //.transform().xquery("Receipt_Transfer_Header.Xquery", "urn:Ariba:Buyer:vsap");
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
        LOGGER.info("Inside aggregator oldExchange : " + oldBody);

        String newBody = newExchange.getIn().getBody(String.class);
        LOGGER.info("Inside aggregator newExchange : " + newBody);
        
        String mergedStr = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">" +
                                "<soapenv:Header>" +
                                    oldBody +
                                "</soapenv:Header>" +
                                "<soap:Body xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" +
                                newBody +
                                "</soap:Body>" +
                            "</soapenv:Envelope>";        

        newExchange.getIn().setBody(mergedStr);

        LOGGER.info("Inside aggregator merged Exchange : " + newExchange.getIn().getBody());        
        return newExchange;
    }

}
