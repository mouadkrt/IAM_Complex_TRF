xquery version "1.0";
(:: pragma bea:global-element-parameter parameter="$z_ARIBA_BAPI_PO_CREATEResponse1" element="ns1:Z_ARIBA_BAPI_PO_CREATEResponse" location="../Wsdl/PurchaseOrderExport_Adapter_WS_V1.0.wsdl" ::)
(:: pragma bea:global-element-return element="ns0:PurchaseOrderExportReply" location="../Wsdl/PurchaseOrderExport.wsdl" ::)

declare namespace ns1 = "urn:iwaysoftware:ibse:jul2003:Z_ARIBA_BAPI_PO_CREATE:response";
declare namespace ns0 = "urn:Ariba:Buyer:vsap";
declare namespace xf = "http://tempuri.org/PurchaseOrderExport_V1/Transformations/PO_Export_Transformation_Response/";

declare function xf:PO_Export_Transformation_Response($z_ARIBA_BAPI_PO_CREATEResponse1 as document-node())
    as element(ns0:PurchaseOrderExportReply) {
        <ns0:PurchaseOrderExportReply partition = "{ data($z_ARIBA_BAPI_PO_CREATEResponse1//ns1:Z_ARIBA_BAPI_PO_CREATE.Response/ns1:E_PARTITION) }"
                                      variant = "{ data($z_ARIBA_BAPI_PO_CREATEResponse1//ns1:Z_ARIBA_BAPI_PO_CREATE.Response/ns1:E_VARIANT) }">
            <ns0:Requisition_PurchOrdNumberImport_Item>
                <ns0:item>
                    <ns0:LineItems>
                        {
                            for $item in $z_ARIBA_BAPI_PO_CREATEResponse1//ns1:Z_ARIBA_BAPI_PO_CREATE.Response/ns1:PUR_ORDER_DETAILS/ns1:item
                            return
                                <ns0:item>
                                    <ns0:ERPPONumber>{ data($item/ns1:EBELN) }</ns0:ERPPONumber>
                                    <ns0:POUnitPrice>{ xs:string( data($item/ns1:NETPR) ) }</ns0:POUnitPrice>
                                    <ns0:SAPPOLineNumber>{ data($item/ns1:EBELP) }</ns0:SAPPOLineNumber>
                                    <ns0:POQuantity>{ xs:string( data($item/ns1:MENGE) ) }</ns0:POQuantity>
                                    <ns0:NumberInCollection>{ xs:integer( data($item/ns1:ITEMONREQ) ) }</ns0:NumberInCollection>
                                    <ns0:PODeliveryDate>
                                        {
                                            if (fn:string(data($z_ARIBA_BAPI_PO_CREATEResponse1//ns1:Z_ARIBA_BAPI_PO_CREATE.Response/ns1:PUR_ORDER_DELIVERY/ns1:item[xs:int(data($item/ns1:EBELP))]/ns1:EINDT))) then
                                                (data(fn:string-join(for $v in fn:concat(fn:concat(fn:concat(fn:substring(data($z_ARIBA_BAPI_PO_CREATEResponse1//ns1:Z_ARIBA_BAPI_PO_CREATE.Response/ns1:PUR_ORDER_DELIVERY/ns1:item[xs:int(data($item/ns1:EBELP))]/ns1:EINDT),
                                                9,2),"/"), fn:concat(fn:substring(data($z_ARIBA_BAPI_PO_CREATEResponse1//ns1:Z_ARIBA_BAPI_PO_CREATE.Response/ns1:PUR_ORDER_DELIVERY/ns1:item[xs:int(data($item/ns1:EBELP))]/ns1:EINDT),
                                                6,2),"/")), fn:substring(data($z_ARIBA_BAPI_PO_CREATEResponse1//ns1:Z_ARIBA_BAPI_PO_CREATE.Response/ns1:PUR_ORDER_DELIVERY/ns1:item[xs:int(data($item/ns1:EBELP))]/ns1:EINDT),
                                                1,4)) return $v cast as xs:string, '')))
                                            else 
                                                ()
                                        }
</ns0:PODeliveryDate>
                                </ns0:item>
                        }
                    </ns0:LineItems>
                    <ns0:UniqueName>{ data($z_ARIBA_BAPI_PO_CREATEResponse1//ns1:Z_ARIBA_BAPI_PO_CREATE.Response/ns1:PUR_ORDER_DETAILS/ns1:item[1]/ns1:REQ_ID) }</ns0:UniqueName>
                </ns0:item>
            </ns0:Requisition_PurchOrdNumberImport_Item>
            <ns0:PurchaseOrderError_PurchOrdErrorImport_Item>
                {
                    for $item in $z_ARIBA_BAPI_PO_CREATEResponse1//ns1:Z_ARIBA_BAPI_PO_CREATE.Response/ns1:ERROR_MSG_TABLE/ns1:item
                    return
                        <ns0:item>
                            <ns0:Type>{ data($item/ns1:TYPE) }</ns0:Type>
                            <ns0:ErrorNumber>{ data($item/ns1:MSGNR) }</ns0:ErrorNumber>
                            <ns0:ErrorMessage>{ data($item/ns1:MESSAGE) }</ns0:ErrorMessage>
                            <ns0:ErrorSAPModule>{ data($item/ns1:DYNAME) }</ns0:ErrorSAPModule>
                            <ns0:ErrorClient>{ data($item/ns1:MANDT) }</ns0:ErrorClient>
                            <ns0:Date>{ data(fn:string-join(for $v1 in fn:concat(fn:concat(fn:concat(fn:substring(data($item/ns1:DATETIME2),9,2),"/"), fn:concat(fn:substring(data($item/ns1:DATETIME2),6,2),"/")), fn:substring(data($item/ns1:DATETIME2),1,4)) return $v1 cast as xs:string, '')) }</ns0:Date>
                            <ns0:ErrorSAPField>{ data($item/ns1:FLDNAME) }</ns0:ErrorSAPField>
                            <ns0:NumInSet>{ data($item/ns1:NUMINSET) }</ns0:NumInSet>
                            <ns0:ErrorSAPScreen>{ data($item/ns1:DYNUMB) }</ns0:ErrorSAPScreen>
                            <ns0:ErrorSAPId>{ data($item/ns1:MSGID) }</ns0:ErrorSAPId>
                            <ns0:Id>{ data($item/ns1:EBELN) }</ns0:Id>
                            <ns0:ErrorSystem>{ data($item/ns1:SYSID) }</ns0:ErrorSystem>
                        </ns0:item>
                }
            </ns0:PurchaseOrderError_PurchOrdErrorImport_Item>
        </ns0:PurchaseOrderExportReply>
};

declare variable $in.body as xs:string external;
declare variable $z_ARIBA_BAPI_PO_CREATEResponse1 as document-node() := fn:parse-xml($in.body);

xf:PO_Export_Transformation_Response($z_ARIBA_BAPI_PO_CREATEResponse1)