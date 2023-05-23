xquery version "1.0" encoding "Cp1252";
(:: pragma bea:local-element-parameter parameter="$eRPOrder_PurchOrdHeaderDetails_Item1" type="ns0:PurchaseOrderExportRequest/ns0:ERPOrder_PurchOrdHeaderDetails_Item" location="../Wsdl/PurchaseOrderExport.wsdl" ::)
(:: pragma bea:global-element-return element="ns1:ibsinfo" location="../Wsdl/PurchaseOrderExport_Adapter_WS_V1.0.wsdl" ::)

declare namespace xf = "http://tempuri.org/PurchaseOrderExport_V1/Transformations/PO_Export_Header/";
declare namespace ns1 = "urn:schemas-iwaysoftware-com:iwse";
declare namespace ns0 = "urn:Ariba:Buyer:vsap";

declare function xf:PO_Export_Header($eRPOrder_PurchOrdHeaderDetails_Item1 as document-node())
    as element(ns1:ibsinfo) {
        <ns1:ibsinfo>
            <ns1:service>PurchaseOrderExport_V2</ns1:service>
            <ns1:method>Z_ARIBA_BAPI_PO_CREATE</ns1:method>
            <ns1:license>test</ns1:license>
            {
                for $Login in $eRPOrder_PurchOrdHeaderDetails_Item1//ns0:item[1]/ns0:Login
                return
                    <ns1:Username>{ data($Login) }</ns1:Username>
            }
            {
                for $Password in $eRPOrder_PurchOrdHeaderDetails_Item1//ns0:item[1]/ns0:Password
                return
                    <ns1:Password>{ data($Password) }</ns1:Password>
            }
        </ns1:ibsinfo>
};

declare variable $in.body as xs:string external;
declare variable $eRPOrder_PurchOrdHeaderDetails_Item1 as document-node() := fn:parse-xml($in.body);

xf:PO_Export_Header($eRPOrder_PurchOrdHeaderDetails_Item1)