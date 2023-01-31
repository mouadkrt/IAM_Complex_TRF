xquery version "1.0";
(:: pragma bea:global-element-parameter parameter="$wSReceiptTransferRequest" element="ns0:WSReceiptTransferRequest" location="../Wsdl/IAMSAPReceiptTransferExport.wsdl" ::)
(:: pragma bea:global-element-return element="ns1:ibsinfo" location="../Wsdl/IAMSAPReceiptTransferExport_Adapter_WS_V1.0.wsdl" ::)

declare namespace ns1 = "urn:schemas-iwaysoftware-com:iwse";
declare namespace ns0 = "urn:Ariba:Buyer:vsap";
declare namespace xf = "http://tempuri.org/IAMSAPReceiptTransferExport_V1/Transformations/Header/";

declare function xf:Header($wSReceiptTransferRequest as document-node())     as element(ns1:ibsinfo) {
        <ns1:ibsinfo>
            <ns1:service>IAMSAPReceiptTransferExport_V1</ns1:service>
            <ns1:method>Z_ARIBA_GR_TRANSFER</ns1:method>
            <ns1:license>test</ns1:license>
            <pass>{$wSReceiptTransferRequest//*[name()='WSReceiptTransferRequest']/*[name()='Receipt_ReceiptTransferHeaderDetails_Item']/*[name()='item'[1]]/*[name()='Login']/text()}</pass>
        </ns1:ibsinfo>
};

(: declare variable $wSReceiptTransferRequest as document-node() := doc("wSReceiptTransferRequest.xml"); :)
declare variable $in.body as xs:string external; 
declare variable $wSReceiptTransferRequest as document-node() := fn:parse-xml($in.body); 

xf:Header($wSReceiptTransferRequest)