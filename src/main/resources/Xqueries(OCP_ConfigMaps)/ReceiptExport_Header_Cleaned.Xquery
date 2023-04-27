xquery version "1.0";
(:: pragma bea:global-element-parameter parameter="$receiptExportRequest" element="ns0:ReceiptExportRequest" location="../Wsdl/ReceiptExport.wsdl" ::)
(:: pragma bea:global-element-return element="ns1:ibsinfo" location="../Wsdl/ReceiptExport_Adapter_WS_V1.0.wsdl" ::)

declare namespace ns1 = "urn:schemas-iwaysoftware-com:iwse";
declare namespace ns0 = "urn:Ariba:Buyer:vsap";
declare namespace xf = "http://tempuri.org/ReceiptExport_V1/Transformations/Header/";

declare function xf:Header($receiptExportRequest as document-node())
    as element(ns1:ibsinfo) {
        <ns1:ibsinfo>
            <ns1:service>ReceiptExport_V1</ns1:service>
            <ns1:method>Z_ARIBA_GR_PUSH</ns1:method>
            <ns1:license>test</ns1:license>
            {
                for $Login in $receiptExportRequest//ns0:Receipt_ReceiptHeaderDetails_Item/ns0:item[1]/ns0:Login
                return
                    <ns1:Username>{ data($Login) }</ns1:Username>
            }
            {
                for $Password in $receiptExportRequest//ns0:Receipt_ReceiptHeaderDetails_Item/ns0:item[1]/ns0:Password
                return
                    <ns1:Password>{ data($Password) }</ns1:Password>
            }
        </ns1:ibsinfo>
};

declare variable $in.body as xs:string external;
declare variable $receiptExportRequest as document-node() := fn:parse-xml($in.body);


xf:Header($receiptExportRequest)