package org.mycompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import javax.xml.namespace.QName;
//import org.apache.camel.dataformat.soap.name.ServiceInterfaceStrategy;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.builder.xml.Namespaces;
import org.apache.camel.model.dataformat.SoapJaxbDataFormat;

@SpringBootApplication
@ImportResource({"classpath:spring/camel-context.xml"})
public class Application extends RouteBuilder {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void configure() {
        
        //SoapJaxbDataFormat soapWSReceiptTransferRequest = new SoapJaxbDataFormat(WSReceiptTransferRequest.class.getPackage().getName(), new QNameStrategy(new QName("http://ws.example.com","exampleDataResponse")));
        //SoapJaxbDataFormat soapWSReceiptTransferRequest = new SoapJaxbDataFormat("com.example.customerservice", new ServiceInterfaceStrategy(WSReceiptTransferRequest.class));

        //Namespaces ns0 = new Namespaces("", "urn:Ariba:Buyer:vsap");
        from("netty4-http:http:0.0.0.0:8086")
        //.streamCaching()
        //from("jetty:http://0.0.0.0:8123/foo")
        //.process(new MyProcessor());
        .to("xquery:Receipt_Transfer_Header_Cleaned.Xquery?dataFormat=CXF_MESSAGE&runLoggingLevel=TRACE");
        //.marshal(soapWSReceiptTransferRequest)
        //.transform().xquery("resource:classpath:Receipt_Transfer_Header_Cleaned.Xquery", ns0);
        //.transform().xquery("resource:classpath:Receipt_Transfer_Header_Cleaned.Xquery");
    }

}
