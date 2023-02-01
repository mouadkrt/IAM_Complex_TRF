package ma.munisys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.apache.camel.Exchange;
//import org.springframework.context.annotation.ImportResource;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A spring-boot application that includes a Camel route builder to setup the Camel routes
 */
@SpringBootApplication
//@ImportResource({"classpath:spring/camel-context.xml"})
public class Application extends RouteBuilder {

    // must have a main method spring-boot can run
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void configure() {

        from("netty4-http:http:0.0.0.0:8086")
        .routeId("muis_route1")
        //.multicast(new muisAddSoapHeader(), true)
        .multicast(new muisAddSoapHeader())
        .aggregationStrategyMethodAllowNull()
        .parallelProcessing()
        .to("direct:muis_trans_req_header","direct:muis_trans_req_body")
        .end();
        

            from("direct:muis_trans_req_header")
            .routeId("muis_route1.1")
            .log("muis_route1.1 is being invoked ...")
            .convertBodyTo(String.class)
            //.delayer(5000)
            .to("xquery:Receipt_Transfer_Header.Xquery")
            //.transform(constant("DATA_FROM_PATH_1"))
            .end();
            //.to("direct:muis_trans_req_header_done");

            from("direct:muis_trans_req_body")
            .routeId("muis_route1.2")
            .log("muis_route1.2 is being invoked ...")
            .convertBodyTo(String.class)
            .to("xquery:Receipt_Transfer_Header2.Xquery")
            //.transform(constant("DATA_FROM_PATH_2"))
            .end();
            //.to("direct:muis_trans_req_body_done");

        
        /*from("direct:muis_trans_req_body_done")
        .routeId("muis_route2")
        .log("muis_route2 is being invoked ...")
        .pollEnrich("direct:muis_trans_req_header_done", 5000, new muisAddSoapHeader()); */

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
 
        LOGGER.info("Inside aggregator oldExchange : " + oldExchange.getIn().getBody(String.class));

        String oldBody = oldExchange.getIn().getBody(String.class);

        LOGGER.info("Inside aggregator newExchange : " + newExchange.getIn().getBody(String.class));
        
        String newBody = newExchange.getIn().getBody(String.class);

       

        String mergedStr = oldBody + " :muis: " + newBody;
        
        newExchange.getIn().setBody(mergedStr);
                
        return newExchange;
    }

}
