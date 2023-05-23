xquery version "1.0";
(:: pragma bea:global-element-parameter parameter="$wSReceiptImportRequest" element="ns0:WSReceiptImportRequest" location="../Wsdl/ReceiptImport.wsdl" ::)
(:: pragma bea:global-element-return element="ns1:ibsinfo" location="../Wsdl/ReceiptImport_Adapter_WS_V1.0.wsdl" ::)

declare namespace ns1 = "urn:schemas-iwaysoftware-com:iwse";
declare namespace ns0 = "urn:Ariba:Buyer:vsap";
declare namespace xf = "http://tempuri.org/ReceiptImport_V1/Transformations/Header/";

declare function xf:Header($wSReceiptImportRequest as document-node())
    as element(ns1:ibsinfo) {
        <ns1:ibsinfo>
            <ns1:service>ReceiptImport_V1</ns1:service>
            <ns1:method>Z_ARIBA_GR_QUALITY</ns1:method>
            <ns1:license>test</ns1:license>
            {
                for $Login in $wSReceiptImportRequest//ns0:WSLoadSapReceipt_WSReceiptImport_Item/ns0:item[1]/ns0:Login
                return
                    <ns1:Username>{ data($Login) }</ns1:Username>
            }
            {
                for $Password in $wSReceiptImportRequest//ns0:WSLoadSapReceipt_WSReceiptImport_Item/ns0:item[1]/ns0:Password
                return
                    <ns1:Password>{ data($Password) }</ns1:Password>
            }
        </ns1:ibsinfo>
};

declare variable $in.body as xs:string external;
declare variable $wSReceiptImportRequest as document-node() := fn:parse-xml($in.body);

xf:Header($wSReceiptImportRequest)