package org.mycompany;

import org.apache.camel.Processor;
import org.apache.cxf.message.Exchange;

public class MyProcessor implements Processor {

    @Override
    public void process(org.apache.camel.Exchange exchange) throws Exception {
        String payload = exchange.getIn().getBody(String.class);
        System.out.println(payload);
        //exchange.getIn().setBody("<test>Changed body</test>");
    }

}