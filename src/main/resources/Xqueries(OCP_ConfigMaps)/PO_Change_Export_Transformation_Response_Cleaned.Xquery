xquery version "1.0";
(:: pragma bea:global-element-parameter parameter="$z_ARIBA_BAPI_PO_CHANGEResponse1" element="ns1:Z_ARIBA_BAPI_PO_CHANGEResponse" location="../Wsdl/PurchaseOrderChangeExport_Adapter_WS_V2.0.wsdl" ::)
(:: pragma bea:global-element-return element="ns0:PurchaseOrderChangeExportReply" location="../Wsdl/PurchaseOrderChangeExport.wsdl" ::)

declare namespace ns1 = "urn:iwaysoftware:ibse:jul2003:Z_ARIBA_BAPI_PO_CHANGE:response";
declare namespace ns0 = "urn:Ariba:Buyer:vsap";
declare namespace xf = "http://tempuri.org/PurchaseOrderChangeExport_V1/Transformations/PO_Change_Export_Transformation_Response/";

declare function xf:PO_Change_Export_Transformation_Response($z_ARIBA_BAPI_PO_CHANGEResponse1 as document-node())
    as element(ns0:PurchaseOrderChangeExportReply) {
        <ns0:PurchaseOrderChangeExportReply partition = "{ data($z_ARIBA_BAPI_PO_CHANGEResponse1//ns1:Z_ARIBA_BAPI_PO_CHANGE.Response/ns1:E_PARTITION) }"
                                            variant = "{ data($z_ARIBA_BAPI_PO_CHANGEResponse1//ns1:Z_ARIBA_BAPI_PO_CHANGE.Response/ns1:E_VARIANT) }">
            <ns0:ERPOrder_ChangePurchOrdNumberPull_Item>
                <ns0:item>
                    <ns0:ERPPOVersionNumber>{ data($z_ARIBA_BAPI_PO_CHANGEResponse1//ns1:Z_ARIBA_BAPI_PO_CHANGE.Response/ns1:RETURNMSG) }</ns0:ERPPOVersionNumber>
                    <ns0:UniqueName>{ data($z_ARIBA_BAPI_PO_CHANGEResponse1//ns1:Z_ARIBA_BAPI_PO_CHANGE.Response/ns1:ERPORDERID) }</ns0:UniqueName>
                </ns0:item>
            </ns0:ERPOrder_ChangePurchOrdNumberPull_Item>
            <ns0:PurchaseOrderError_PurchOrdErrorImport_Item>
                {
                    for $item in $z_ARIBA_BAPI_PO_CHANGEResponse1//ns1:Z_ARIBA_BAPI_PO_CHANGE.Response/ns1:ERROR_MSG_TABLE/ns1:item
                    return
                        <ns0:item>
                            <ns0:Type>{ data($item/ns1:TYPE) }</ns0:Type>
                            <ns0:ErrorNumber>{ data($item/ns1:MSGNR) }</ns0:ErrorNumber>
                            <ns0:ErrorMessage>{ data($item/ns1:MESSAGE) }</ns0:ErrorMessage>
                            <ns0:ErrorSAPModule>{ data($item/ns1:DYNAME) }</ns0:ErrorSAPModule>
                            <ns0:ErrorClient>{ data($item/ns1:MANDT) }</ns0:ErrorClient>
                            <ns0:Date>{ data(fn:string-join(for $v in fn:concat(fn:concat(fn:concat(fn:substring(data($item/ns1:DATETIME2),9,2),"/"), fn:concat(fn:substring(data($item/ns1:DATETIME2),6,2),"/")), fn:substring(data($item/ns1:DATETIME2),1,4)) return $v cast as xs:string, '')) }</ns0:Date>
                            <ns0:ErrorSAPField>{ data($item/ns1:FLDNAME) }</ns0:ErrorSAPField>
                            <ns0:NumInSet>{ data($item/ns1:NUMINSET) }</ns0:NumInSet>
                            <ns0:ErrorSAPScreen>{ data($item/ns1:DYNUMB) }</ns0:ErrorSAPScreen>
                            <ns0:ErrorSAPId>{ data($item/ns1:MSGID) }</ns0:ErrorSAPId>
                            <ns0:Id>{ data($item/ns1:ERPORDERID) }</ns0:Id>
                            <ns0:ErrorSystem>{ data($item/ns1:SYSID) }</ns0:ErrorSystem>
                        </ns0:item>
                }
            </ns0:PurchaseOrderError_PurchOrdErrorImport_Item>
        </ns0:PurchaseOrderChangeExportReply>
};

declare variable $in.body as xs:string external;
declare variable $z_ARIBA_BAPI_PO_CHANGEResponse1 as document-node() := fn:parse-xml($in.body);

xf:PO_Change_Export_Transformation_Response($z_ARIBA_BAPI_PO_CHANGEResponse1)