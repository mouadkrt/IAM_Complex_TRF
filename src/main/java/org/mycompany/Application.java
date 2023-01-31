package org.mycompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.apache.camel.builder.RouteBuilder;

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
        .convertBodyTo(String.class)
        //.process(new MyProcessor())
       .to("xquery:Receipt_Transfer_Header_Cleaned.Xquery");
    }

}
