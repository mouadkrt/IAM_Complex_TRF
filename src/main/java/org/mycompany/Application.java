package org.mycompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.apache.camel.builder.RouteBuilder;

@SpringBootApplication
@ImportResource({"classpath:spring/camel-context.xml"})
public class Application extends RouteBuilder {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void configure() {
        // populate the message queue with some messages
        from("netty4-http:http:0.0.0.0:8086")
        .process(new MyProcessor());
       // .to("xquery:Receipt_Transfer_Header_Cleaned.Xquery");
    }

}
