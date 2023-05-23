xquery version "1.0" encoding "Cp1252";
(:: pragma bea:global-element-parameter parameter="$purchaseOrderCancelExportRequest1" element="ns0:PurchaseOrderCancelExportRequest" location="../Wsdl/PurchaseOrderCancelExport.wsdl" ::)
(:: pragma bea:global-element-return element="ns1:Z_ARIBA_BAPI_PO_CANCEL" location="../Wsdl/PurchaseOrderCancelExport_Adapter_WS_V1.0.wsdl" ::)

declare namespace xf = "http://tempuri.org/PurchaseOrderCancelExport_V1/Transformations/PO_Cancel_Export_Transformation_Request/";
declare namespace ns1 = "urn:iwaysoftware:ibse:jul2003:Z_ARIBA_BAPI_PO_CANCEL";
declare namespace ns0 = "urn:Ariba:Buyer:vsap";

declare function xf:PO_Cancel_Export_Transformation_Request($purchaseOrderCancelExportRequest1 as document-node())
    as element(ns1:Z_ARIBA_BAPI_PO_CANCEL) {
        <ns1:Z_ARIBA_BAPI_PO_CANCEL>
            <ns1:Z_ARIBA_BAPI_PO_CANCEL>
                {
                    for $partition in $purchaseOrderCancelExportRequest1//@partition
                    return
                        <ns1:PARTITION>{ data($partition) }</ns1:PARTITION>
                }
                <ns1:PO_HEADER>
                    <ns1:EBELN>{ data($purchaseOrderCancelExportRequest1//ns0:ERPOrder_CancelPurchOrdHeader_Item/ns0:item[1]/ns0:ERPPONumber) }</ns1:EBELN>
                    <ns1:ERPORDERID>{ data($purchaseOrderCancelExportRequest1//ns0:ERPOrder_CancelPurchOrdHeader_Item/ns0:item[1]/ns0:UniqueName) }</ns1:ERPORDERID>
                    <ns1:VERSION>{ xs:string( data($purchaseOrderCancelExportRequest1//ns0:ERPOrder_CancelPurchOrdHeader_Item/ns0:item[1]/ns0:VersionNumber) ) }</ns1:VERSION>
                </ns1:PO_HEADER>
                {
                    for $variant in $purchaseOrderCancelExportRequest1//@variant
                    return
                        <ns1:VARIANT>{ data($variant) }</ns1:VARIANT>
                }
            </ns1:Z_ARIBA_BAPI_PO_CANCEL>
        </ns1:Z_ARIBA_BAPI_PO_CANCEL>
};

declare variable $in.body as xs:string external;
declare variable $purchaseOrderCancelExportRequest1 as document-node() := fn:parse-xml($in.body);

xf:PO_Cancel_Export_Transformation_Request($purchaseOrderCancelExportRequest1)