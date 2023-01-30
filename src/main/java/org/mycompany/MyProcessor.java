package org.mycompany;

import org.apache.camel.Exchange;

import org.apache.camel.Processor;
import org.apache.camel.component.cxf.CxfPayload;
import org.apache.camel.util.CastUtils;
import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;

import java.util.List;
import java.util.Map;

import javax.xml.soap.*;

public class MyProcessor implements Processor {

   /*  public void processData(
            @Header("org.apache.cxf.headers.Header.list") List<SoapHeader> soapHeaders,
            Exchange exchange) {       
 
        // Print SOAP Headers
        for (SoapHeader soapHeader : soapHeaders) {
            System.out.println(soapHeader.getName().getLocalPart() + "  : "
                             + ((Element)soapHeader.getObject()).getTextContent());
        }
 
    }*/

    public void process(Exchange exchange) throws Exception {

        // Get some HTTP Header with key key1 :
            /*String val1 = exchange.getIn().getHeader("key1", String.class);
            System.out.println(val1);*/

        // Get the HTTP Body as String :
            /*String body = exchange.getIn().getBody(String.class);
            System.out.println(body);*/
        

           /*CxfPayload body = exchange.getIn().getBody(CxfPayload.class);
            System.out.println(body);*/

            /*Logger LOGGER = LoggerFactory.getLogger(MyProcessor.class);
            
            Object payload = exchange.getIn().getBody();
            LOGGER.info("Got message: " + payload);*/
            //SoapMessage soapBody = (SoapMessage) payload.getBody();
            //System.out.println(soapBody);

          
            /*SoapMessage soapMessage = (SoapMessage)exchange.getIn().getHeader("CamelCxfMessage");
            List<org.apache.cxf.headers.Header> aaa = ((SoapMessage) soapMessage.getExchange()).getHeaders();
            for (Object header : aaa) {
                SoapHeader soapHeader = (SoapHeader) header;
                org.w3c.dom.Element element = (Element) soapHeader.getObject();
                Element transactionID = (Element) element.getElementsByTagName("ns1:service").item(0);

                System.out.println(transactionID.getTextContent());
            }*/

        /*SOAPPart part = request.getSOAPPart();
        SOAPEnvelope env = part.getEnvelope();
        SOAPHeader header = env.getHeader();
        if (header == null) {
            // Throw an exception
        }*/

        //String payload = exchange.getIn().getBody(String.class);
       
       /* String payload = exchange.getIn().getBody(String.class);
        System.out.println(payload);
        exchange.getIn().setBody(payload); */
    }

}