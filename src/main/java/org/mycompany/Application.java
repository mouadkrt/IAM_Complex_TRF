package org.mycompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//import ariba.buyer.vsap.*;
//import com.cleverbuilder.bookservice.GetAllBooks;

/*import javax.xml.namespace.QName;
import org.apache.camel.dataformat.soap.name.*;
import org.apache.camel.model.dataformat.SoapJaxbDataFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;*/
import org.apache.camel.builder.RouteBuilder;
/*import org.apache.camel.builder.xml.Namespaces;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.converter.jaxb.JaxbDataFormat;*/

@SpringBootApplication
@ImportResource({"classpath:spring/camel-context.xml"})
public class Application extends RouteBuilder {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void configure() {
        
        //Logger LOGGER=LoggerFactory.getLogger(Application.class);

       

        //SoapJaxbDataFormat soapWSReceiptTransferRequest = new SoapJaxbDataFormat("ariba.buyer.vsap", QNS);
        
       /*  JaxbDataFormat jdb = new JaxbDataFormat();
        jdb.setContextPath("ariba.buyer.vsap");
        LOGGER.info(">>> DataFormatName: " +jdb.getDataFormatName());*/

       
        //SoapJaxbDataFormat soapWSReceiptTransferRequest = new SoapJaxbDataFormat("ariba.buyer.vsa", new ServiceInterfaceStrategy(WSReceiptTransferRequest.class, false));

        //SoapJaxbDataFormat soapWSReceiptTransferRequest = new SoapJaxbDataFormat("ariba.buyer.vsa", new TypeNameStrategy());

        //QName qName = new QName("urn:Ariba:Buyer:vsap","WSReceiptTransferRequest");
        //QName qName = new QName("http://www.cleverbuilder.com/BookService/","GetAllBooks");
        //SoapJaxbDataFormat soapWSReceiptTransferRequest = new SoapJaxbDataFormat("ariba.buyer.vsa.Headers:ariba.buyer.vsa.ObjectFactory:ariba.buyer.vsa.ReceiptErrorReceiptTransferErrorImport:ariba.buyer.vsa.ReceiptReceiptTransferHeaderDetails:ariba.buyer.vsa.ReceiptReceiptTransferLineDetails:ariba.buyer.vsa.ReceiptReceiptTransferResponse:ariba.buyer.vsa.WSReceiptTransfer:ariba.buyer.vsa.WSReceiptTransferPortType:ariba.buyer.vsa.WSReceiptTransferReply:ariba.buyer.vsa.WSReceiptTransferRequest", new QNameStrategy(qName));
        //SoapJaxbDataFormat soapWSReceiptTransferRequest = new SoapJaxbDataFormat("com.cleverbuilder.bookservice", new QNameStrategy(qName));
        //SoapJaxbDataFormat soapWSReceiptTransferRequest = new SoapJaxbDataFormat("com.cleverbuilder.bookservice.GetAllBooks", new ServiceInterfaceStrategy(GetAllBooks.class, false));
        //JaxbDataFormat jaxbDataFormat = new JaxbDataFormat();

       // Namespaces ns0 = new Namespaces("", "urn:Ariba:Buyer:vsap");
        from("netty4-http:http:0.0.0.0:8086")
        //.streamCaching()
        //from("jetty:http://0.0.0.0:8123/foo")
        //.process(new MyProcessor());
        //.unmarshal().string("UTF-8")
        //.convertBodyTo(String.class)
        //.marshal(jaxbDataFormat)
        //.unmarshal().serialization()
        //.marshal(soapWSReceiptTransferRequest);
        //.unmarshal(new JacksonDataFormat(WSReceiptTransferRequest.class))
        //.log("Received : ${body}")
        //.to("xquery:Receipt_Transfer_Header_Cleaned.Xquery?runLoggingLevel=TRACE");
        //.unmarshal(soapWSReceiptTransferRequest)
       // .unmarshal(jdb)
        //.transform().xquery("resource:classpath:Receipt_Transfer_Header_Cleaned.Xquery");
        //.setBody(body().append(" World!"));
        //.transform().xquery("resource:classpath:Receipt_Transfer_Header_Cleaned.Xquery");
        .to("stream:out");
    }

}
