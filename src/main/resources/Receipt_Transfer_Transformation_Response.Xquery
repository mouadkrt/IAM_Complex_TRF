xquery version "1.0";
(:: pragma bea:global-element-parameter parameter="$z_ARIBA_GR_TRANSFERResponse" element="ns1:Z_ARIBA_GR_TRANSFERResponse" location="../Wsdl/IAMSAPReceiptTransferExport_Adapter_WS_V1.0.wsdl" ::)
(:: pragma bea:global-element-return element="ns0:WSReceiptTransferReply" location="../Wsdl/IAMSAPReceiptTransferExport.wsdl" ::)

declare namespace ns1 = "urn:iwaysoftware:ibse:jul2003:Z_ARIBA_GR_TRANSFER:response";
declare namespace ns0 = "urn:Ariba:Buyer:vsap";
declare namespace xf = "http://tempuri.org/IAMSAPReceiptTransferExport_V1/Transformations/Receipt_Transfer_Transformation_Response/";

declare function xf:Receipt_Transfer_Transformation_Response($z_ARIBA_GR_TRANSFERResponse as element(ns1:Z_ARIBA_GR_TRANSFERResponse))
    as element(ns0:WSReceiptTransferReply) {
        <ns0:WSReceiptTransferReply>
            <ns0:Receipt_ReceiptTransferResponse_Item>
                <ns0:item>
                    <ns0:ReceiptItems>
                        {
                            for $item in $z_ARIBA_GR_TRANSFERResponse/ns1:Z_ARIBA_GR_TRANSFER.Response/ns1:GR_ITEM/ns1:item
                            return
                                <ns0:item>
                                    <ns0:IAMSAPLiberateStockDocument>{ fn:concat(fn:concat(data($item/ns1:MJAHR_A),"-"), data($item/ns1:MBLNR_A)) }</ns0:IAMSAPLiberateStockDocument>
                                    <ns0:IAMSAPBlockedStockDocument>{ fn:concat(fn:concat(data($item/ns1:MJAHR_R),"-"), data($item/ns1:MBLNR_R)) }</ns0:IAMSAPBlockedStockDocument>
                                    <ns0:NumberInCollection>{ data($item/ns1:ARIBA_ITNO) }</ns0:NumberInCollection>
                                </ns0:item>
                        }
                    </ns0:ReceiptItems>
                    <ns0:UniqueName>{ data($z_ARIBA_GR_TRANSFERResponse/ns1:Z_ARIBA_GR_TRANSFER.Response/ns1:GR_ITEM/ns1:item[1]/ns1:ARIBA_GRNO) }</ns0:UniqueName>
                </ns0:item>
            </ns0:Receipt_ReceiptTransferResponse_Item>
            <ns0:ReceiptError_ReceiptTransferErrorImport_Item>
                {
                    for $item in $z_ARIBA_GR_TRANSFERResponse/ns1:Z_ARIBA_GR_TRANSFER.Response/ns1:ERROR_MSG_TABLE/ns1:item
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
            </ns0:ReceiptError_ReceiptTransferErrorImport_Item>
        </ns0:WSReceiptTransferReply>
};

declare variable $z_ARIBA_GR_TRANSFERResponse as element(ns1:Z_ARIBA_GR_TRANSFERResponse) external;

xf:Receipt_Transfer_Transformation_Response($z_ARIBA_GR_TRANSFERResponse)