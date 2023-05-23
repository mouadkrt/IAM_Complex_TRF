xquery version "1.0";
(:: pragma bea:local-element-parameter parameter="$orderInfo_PurchOrdHeaderStatusInfo_Item1" type="ns0:PurchOrdHeaderStatusImportRequest/ns0:OrderInfo_PurchOrdHeaderStatusInfo_Item" location="../Wsdl/PurchOrdHeaderStatusImport.wsdl" ::)
(:: pragma bea:global-element-return element="ns1:ibsinfo" location="../Wsdl/PurchaseOrderHeaderStatusImport_Adapter_WS_V1.0.wsdl" ::)

declare namespace ns1 = "urn:schemas-iwaysoftware-com:iwse";
declare namespace ns0 = "urn:Ariba:Buyer:vsap";
declare namespace xf = "http://tempuri.org/PurchaseOrderHeaderStatusImport_V1/Transformations/PO_Header_Status_Export_Header/";

declare function xf:PO_Header_Status_Export_Header($orderInfo_PurchOrdHeaderStatusInfo_Item1 as document-node())
    as element(ns1:ibsinfo) {
        <ns1:ibsinfo>
            <ns1:service>PurchaseOrderHeaderStatusImport_V1</ns1:service>
            <ns1:method>Z_ARIBA_PO_HEADER_STATUS</ns1:method>
            <ns1:license>test</ns1:license>
            {
                for $Login in $orderInfo_PurchOrdHeaderStatusInfo_Item1//ns0:item[1]/ns0:Login
                return
                    <ns1:Username>{ data($Login) }</ns1:Username>
            }
            {
                for $Password in $orderInfo_PurchOrdHeaderStatusInfo_Item1//ns0:item[1]/ns0:Password
                return
                    <ns1:Password>{ data($Password) }</ns1:Password>
            }
        </ns1:ibsinfo>
};

declare variable $in.body as xs:string external;
declare variable $orderInfo_PurchOrdHeaderStatusInfo_Item1 as document-node() := fn:parse-xml($in.body);

xf:PO_Header_Status_Export_Header($orderInfo_PurchOrdHeaderStatusInfo_Item1)