xquery version "1.0";
(:: pragma bea:global-element-parameter parameter="$z_ARIBA_GR_TRANSFERResponse" element="*[name()='Z_ARIBA_GR_TRANSFERResponse" location="../Wsdl/IAMSAPReceiptTransferExport_Adapter_WS_V1.0.wsdl" ::)
(:: pragma bea:global-element-return element="ns0:WSReceiptTransferReply" location="../Wsdl/IAMSAPReceiptTransferExport.wsdl" ::)

declare namespace ns1 = "urn:iwaysoftware:ibse:jul2003:Z_ARIBA_GR_TRANSFER:response";
declare namespace ns0 = "urn:Ariba:Buyer:vsap";
declare namespace xf = "http://tempuri.org/IAMSAPReceiptTransferExport_V1/Transformations/Receipt_Transfer_Transformation_Response/";

declare function xf:Receipt_Transfer_Transformation_Response($z_ARIBA_GR_TRANSFERResponse as document-node())
    as element(ns0:WSReceiptTransferReply) {
        <ns0:WSReceiptTransferReply>
            <ns0:Receipt_ReceiptTransferResponse_Item>
                <ns0:item>
                    <ns0:ReceiptItems>
                        {
                            for $item in $z_ARIBA_GR_TRANSFERResponse//*[name()='Z_ARIBA_GR_TRANSFER.Response']/*[name()='GR_ITEM']/*[name()='item']
                            return
                                <ns0:item>
                                    <ns0:IAMSAPLiberateStockDocument>{ fn:concat(fn:concat(data($item/*[name()='MJAHR_A']),"-"), data($item/*[name()='MBLNR_A'])) }</ns0:IAMSAPLiberateStockDocument>
                                    <ns0:IAMSAPBlockedStockDocument>{ fn:concat(fn:concat(data($item/*[name()='MJAHR_R']),"-"), data($item/*[name()='MBLNR_R'])) }</ns0:IAMSAPBlockedStockDocument>
                                    <ns0:NumberInCollection>{ data($item/*[name()='ARIBA_ITNO']) }</ns0:NumberInCollection>
                                </ns0:item>
                        }
                    </ns0:ReceiptItems>
                    <ns0:UniqueName>{ data($z_ARIBA_GR_TRANSFERResponse//*[name()='Z_ARIBA_GR_TRANSFER.Response']/*[name()='GR_ITEM']/*[name()='item'[1]]/*[name()='ARIBA_GRNO']) }</ns0:UniqueName>
                </ns0:item>
            </ns0:Receipt_ReceiptTransferResponse_Item>
            <ns0:ReceiptError_ReceiptTransferErrorImport_Item>
                {
                    for $item in $z_ARIBA_GR_TRANSFERResponse//*[name()='Z_ARIBA_GR_TRANSFER.Response']/*[name()='ERROR_MSG_TABLE']/*[name()='item']
                    return
                        <ns0:item>
                            <ns0:Type>{ data($item/*[name()='TYPE']) }</ns0:Type>
                            <ns0:ErrorNumber>{ data($item/*[name()='MSGNR']) }</ns0:ErrorNumber>
                            <ns0:ErrorMessage>{ data($item/*[name()='MESSAGE']) }</ns0:ErrorMessage>
                            <ns0:ErrorSAPModule>{ data($item/*[name()='DYNAME']) }</ns0:ErrorSAPModule>
                            <ns0:ErrorClient>{ data($item/*[name()='MANDT']) }</ns0:ErrorClient>
                            <ns0:Date>{ data(fn:string-join(for $v in fn:concat(fn:concat(fn:concat(fn:substring(data($item/*[name()='DATETIME2']),9,2),"/"), fn:concat(fn:substring(data($item/*[name()='DATETIME2']),6,2),"/")), fn:substring(data($item/*[name()='DATETIME2']),1,4)) return $v cast as xs:string, '')) }</ns0:Date>
                            <ns0:ErrorSAPField>{ data($item/*[name()='FLDNAME']) }</ns0:ErrorSAPField>
                            <ns0:NumInSet>{ data($item/*[name()='NUMINSET']) }</ns0:NumInSet>
                            <ns0:ErrorSAPScreen>{ data($item/*[name()='DYNUMB']) }</ns0:ErrorSAPScreen>
                            <ns0:ErrorSAPId>{ data($item/*[name()='MSGID']) }</ns0:ErrorSAPId>
                            <ns0:Id>{ data($item/*[name()='MBLNR']) }</ns0:Id>
                            <ns0:ErrorSystem>{ data($item/*[name()='SYSID']) }</ns0:ErrorSystem>
                        </ns0:item>
                }
            </ns0:ReceiptError_ReceiptTransferErrorImport_Item>
        </ns0:WSReceiptTransferReply>
};

declare variable $in.body as xs:string external; 
declare variable $z_ARIBA_GR_TRANSFERResponse as document-node() := fn:parse-xml($in.body); 

xf:Receipt_Transfer_Transformation_Response($z_ARIBA_GR_TRANSFERResponse)