xquery version "1.0";
(:: pragma bea:global-element-parameter parameter="$z_ARIBA_GR_PUSHResponse" element="ns1:Z_ARIBA_GR_PUSHResponse" location="../Wsdl/ReceiptExport_Adapter_WS_V1.0.wsdl" ::)
(:: pragma bea:global-element-return element="ns0:ReceiptExportReply" location="../Wsdl/ReceiptExport.wsdl" ::)

declare namespace ns1 = "urn:iwaysoftware:ibse:jul2003:Z_ARIBA_GR_PUSH:response";
declare namespace ns0 = "urn:Ariba:Buyer:vsap";
declare namespace xf = "http://tempuri.org/ReceiptExport_V1/Transformations/ReceiptExport_Transformation_Response/";

declare function xf:ReceiptExport_Transformation_Response($z_ARIBA_GR_PUSHResponse as document-node())
    as element(ns0:ReceiptExportReply) {
        <ns0:ReceiptExportReply>
            <ns0:Receipt_ReceiptNumberImport_Item>
                {
                    for $item in $z_ARIBA_GR_PUSHResponse//ns1:Z_ARIBA_GR_PUSH.Response/ns1:GR_ITEMS/ns1:item
                    return
                        <ns0:item>
                            <ns0:IAMCodeMouvement>{ data($item/ns1:SGTXT) }</ns0:IAMCodeMouvement>
                            <ns0:ReceiptItems>
                                <ns0:item>
                                    <ns0:ERPReceiptLineNumber>{ xs:string(data($item/ns1:ZEILE)) }</ns0:ERPReceiptLineNumber>
                                    <ns0:NumberInCollection>{ data($item/ns1:ARIBA_ITNO) }</ns0:NumberInCollection>
                                </ns0:item>
                            </ns0:ReceiptItems>
                            <ns0:ERPReceiptNumber>{ data($item/ns1:MBLNR) }</ns0:ERPReceiptNumber>
                            <ns0:UniqueName>{ data($item/ns1:ARIBA_GRNO) }</ns0:UniqueName>
                        </ns0:item>
                }
            </ns0:Receipt_ReceiptNumberImport_Item>
            <ns0:ReceiptError_ReceiptErrorImport_Item>
                {
                    for $item in $z_ARIBA_GR_PUSHResponse//ns1:Z_ARIBA_GR_PUSH.Response/ns1:ERROR_MSG_TABLE/ns1:item
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
                            <ns0:Id>{ data($item/ns1:MBLNR) }</ns0:Id>
                            <ns0:ErrorSystem>{ data($item/ns1:SYSID) }</ns0:ErrorSystem>
                        </ns0:item>
                }
            </ns0:ReceiptError_ReceiptErrorImport_Item>
        </ns0:ReceiptExportReply>
};

declare variable $in.body as xs:string external;
declare variable $z_ARIBA_GR_PUSHResponse as document-node() := fn:parse-xml($in.body);


xf:ReceiptExport_Transformation_Response($z_ARIBA_GR_PUSHResponse)