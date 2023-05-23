xquery version "1.0";
(:: pragma bea:global-element-parameter parameter="$wSInvoiceImportRequest1" element="ns0:WSInvoiceImportRequest" location="../Wsdl/WSInvoiceImport.wsdl" ::)
(:: pragma bea:global-element-return element="ns1:ibsinfo" location="../Wsdl/InvoiceImport_Adapter_WS_V1.0.wsdl" ::)

declare namespace ns1 = "urn:schemas-iwaysoftware-com:iwse";
declare namespace ns0 = "urn:Ariba:Buyer:vsap";
declare namespace xf = "http://tempuri.org/InvoiceImport_V1/Transformations/InvoiceImport_Header/";

declare function xf:InvoiceImport_Header($wSInvoiceImportRequest1 as document-node())
    as element(ns1:ibsinfo) {
        <ns1:ibsinfo>
            <ns1:service>InvoiceImport_V1</ns1:service>
            <ns1:method>ZARIBA_INVOICED_PO_ITEMS_SOAP</ns1:method>
            <ns1:license>test</ns1:license>
            {
                for $Login in $wSInvoiceImportRequest1//ns0:WSLoadSapInvoice_WSInvoiceImport_Item/ns0:item[1]/ns0:Login
                return
                    <ns1:Username>{ data($Login) }</ns1:Username>
            }
            {
                for $Password in $wSInvoiceImportRequest1//ns0:WSLoadSapInvoice_WSInvoiceImport_Item/ns0:item[1]/ns0:Password
                return
                    <ns1:Password>{ data($Password) }</ns1:Password>
            }
        </ns1:ibsinfo>
};

declare variable $in.body as xs:string external;
declare variable $wSInvoiceImportRequest1 as document-node() := fn:parse-xml($in.body);

xf:InvoiceImport_Header($wSInvoiceImportRequest1)