package ma.munisys;

import org.apache.camel.Processor;

public class MyProcessor implements Processor {

    @Override
    public void process(org.apache.camel.Exchange exchange) throws Exception {
        String payload = exchange.getIn().getBody(String.class);
        // System.out.println(payload);
        exchange.getOut().setBody("<replyy_transformed>" + payload + "</replyy_transformed>");
    }

}