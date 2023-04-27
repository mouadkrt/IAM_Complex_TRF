xquery version "1.0";
(:: pragma bea:local-element-parameter parameter="$eRPOrder_CancelPurchOrdHeader_Item1" type="ns0:PurchaseOrderCancelExportRequest/ns0:ERPOrder_CancelPurchOrdHeader_Item" location="../Wsdl/PurchaseOrderCancelExport.wsdl" ::)
(:: pragma bea:global-element-return element="ns1:ibsinfo" location="../Wsdl/PurchaseOrderCancelExport_Adapter_WS_V1.0.wsdl" ::)

declare namespace ns1 = "urn:schemas-iwaysoftware-com:iwse";
declare namespace ns0 = "urn:Ariba:Buyer:vsap";
declare namespace xf = "http://tempuri.org/PurchaseOrderCancelExport_V1/Transformations/PO_Cancel_Export_Header/";

declare function xf:PO_Cancel_Export_Header($eRPOrder_CancelPurchOrdHeader_Item1 as document-node())
    as element(ns1:ibsinfo) {
        <ns1:ibsinfo>
            <ns1:service>PurchaseOrderCancelExport_V1</ns1:service>
            <ns1:method>Z_ARIBA_BAPI_PO_CANCEL</ns1:method>
            <ns1:license>test</ns1:license>
            {
                for $Login in $eRPOrder_CancelPurchOrdHeader_Item1//ns0:item[1]/ns0:Login
                return
                    <ns1:Username>{ data($Login) }</ns1:Username>
            }
            {
                for $Password in $eRPOrder_CancelPurchOrdHeader_Item1//ns0:item[1]/ns0:Password
                return
                    <ns1:Password>{ data($Password) }</ns1:Password>
            }
        </ns1:ibsinfo>
};

declare variable $in.body as xs:string external;
declare variable $eRPOrder_CancelPurchOrdHeader_Item1 as document-node() := fn:parse-xml($in.body);

xf:PO_Cancel_Export_Header($eRPOrder_CancelPurchOrdHeader_Item1)