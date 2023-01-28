package org.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
        String payload = exchange.getIn().getBody(String.class);
        System.out.println(payload);
        exchange.getIn().setBody(payload);
    }

}