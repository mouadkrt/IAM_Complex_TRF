package ma.munisys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.apache.camel.Exchange;
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

        from("netty4-http:http:0.0.0.0:8086")
        .routeId("muis_route1")
        .multicast(new muisAddSoapHeader())
        .aggregationStrategyMethodAllowNull()
        .parallelProcessing()
        .to("direct:muis_trans_req_header","direct:muis_trans_req_body")
        .end()
        /*  .setHeader("CamelHttpMethod", constant("POST"))
        .to("netty4-http:http:localhost:8090")*/
        .process(new MyProcessor()); 
        
            from("direct:muis_trans_req_header")
            .routeId("muis_route1.1")
            .log("muis_route1.1 is being invoked ...")
            .convertBodyTo(String.class)
            //.delayer(5000)
            .to("xquery:Receipt_Transfer_Header.Xquery")
            .end();

            from("direct:muis_trans_req_body")
            .routeId("muis_route1.2")
            .log("muis_route1.2 is being invoked ...")
            .convertBodyTo(String.class)
            .to("xquery:Receipt_Transfer_Transformation_Request.Xquery")
            .end();

        //.process(new MyProcessor());
       //.transform().xquery("Receipt_Transfer_Header.Xquery", "urn:Ariba:Buyer:vsap");

    }
}

class muisAddSoapHeader implements AggregationStrategy  {
    private static final Logger LOGGER = LoggerFactory.getLogger(muisAddSoapHeader.class.getName());

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
