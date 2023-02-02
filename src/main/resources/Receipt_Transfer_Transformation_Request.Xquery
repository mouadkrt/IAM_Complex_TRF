xquery version "1.0";
(:: pragma bea:global-element-parameter parameter="$wSReceiptTransferRequest" element="*[name()='WSReceiptTransferRequest" location="../Wsdl/IAMSAPReceiptTransferExport.wsdl" ::)
(:: pragma bea:global-element-return element="ns1:Z_ARIBA_GR_TRANSFER" location="../Wsdl/IAMSAPReceiptTransferExport_Adapter_WS_V1.0.wsdl" ::)

declare namespace ns1 = "urn:iwaysoftware:ibse:jul2003:Z_ARIBA_GR_TRANSFER";
declare namespace ns0 = "urn:Ariba:Buyer:vsap";
declare namespace xf = "http://tempuri.org/IAMSAPReceiptTransferExport_V1/Receipt_Transfer_Transformation_Request/";

declare function xf:Receipt_Transfer_Transformation_Request($wSReceiptTransferRequest as document-node())
    as element(ns1:Z_ARIBA_GR_TRANSFER) {
        <ns1:Z_ARIBA_GR_TRANSFER>
            <ns1:Z_ARIBA_GR_TRANSFER>
                <ns1:PARTITION>{ data($wSReceiptTransferRequest/@partition) }</ns1:PARTITION>
                <ns1:VARIANT>{ data($wSReceiptTransferRequest/@variant) }</ns1:VARIANT>
                <ns1:GR_ITEM>
                    {
                        for $item in $wSReceiptTransferRequest//*[name()='Receipt_ReceiptTransferLineDetails_Item']/*[name()='item'[1]]/*[name()='ReceiptItems']/*[name()='item']
                        return
                            <ns1:item>
                                <ns1:MBLNR>{ data($item/*[name()='IAMSAPMaterialDocumentReference']/*[name()='MaterialDocument']) }</ns1:MBLNR>
                                <ns1:MJAHR>{ data($item/*[name()='IAMSAPMaterialDocumentReference']/*[name()='MaterialDocumentYear']) }</ns1:MJAHR>
                                <ns1:ZEILE>{ data($item/*[name()='IAMSAPMaterialDocumentReference']/*[name()='DocumentItemNumber']) }</ns1:ZEILE>
                                <ns1:ZQACCEPT>
                                    {

                                            data($item/*[name()='IAMNumberAQualif'])
                                    }
</ns1:ZQACCEPT>
                                <ns1:ZUACCEPT>{ data($item/*[name()='UnitOfMeasure']/*[name()='UniqueName']) }</ns1:ZUACCEPT>
                                <ns1:ZQREFUS>{ data($item/*[name()='NumberRejected']) }</ns1:ZQREFUS>
                                <ns1:ZUREFUS>{ data($item/*[name()='UnitOfMeasure']/*[name()='UniqueName']) }</ns1:ZUREFUS>
                                <ns1:BWTAR>{ data($item/*[name()='IAMSAPMaterialDocumentReference']/*[name()='ValuationType']) }</ns1:BWTAR>
                                <ns1:GRUND>{ data($item/*[name()='IAMStructuredRejectReason']/*[name()='UniqueName']) }</ns1:GRUND>
                                <ns1:ARIBA_GRNO>{ data($wSReceiptTransferRequest/*[name()='Receipt_ReceiptTransferHeaderDetails_Item']/*[name()='item'[1]]/*[name()='UniqueName']) }</ns1:ARIBA_GRNO>
                                <ns1:ARIBA_ITNO>{ xs:string( data($item/*[name()='NumberInCollection']) ) }</ns1:ARIBA_ITNO>
                                <ns1:NO_MORE_GR>
                                    {
                                        if (xs:string(data($wSReceiptTransferRequest/*[name()='Receipt_ReceiptTransferLineDetails_Item']/*[name()='item'[1]]/*[name()='ReceiptItems']/*[name()='item'[1]]/*[name()='LineItem']/*[name()='IAMFinalDelivery'])) = "true") then
                                            ("X")
                                        else 
                                            ""
                                    }
</ns1:NO_MORE_GR>
                            </ns1:item>
                    }
                </ns1:GR_ITEM>
                <ns1:GR_SERIAL>
                    {
                        for $item in $wSReceiptTransferRequest//*[name()='Receipt_ReceiptTransferLineDetails_Item']/*[name()='item'[1]]/*[name()='ReceiptItems']/*[name()='item']
                        return
                            <ns1:item>
                                <ns1:MBLNR>{ data($item/*[name()='IAMSAPMaterialDocumentReference']/*[name()='MaterialDocument']) }</ns1:MBLNR>
                                <ns1:MJAHR>{ data($item/*[name()='IAMSAPMaterialDocumentReference']/*[name()='MaterialDocumentYear']) }</ns1:MJAHR>
                                <ns1:ZEILE>{ data($item/*[name()='IAMSAPMaterialDocumentReference']/*[name()='DocumentItemNumber']) }</ns1:ZEILE>
                                <ns1:SERNR>{ data($item/*[name()='IAMSerialNumbersToReject']/*[name()='item'[1]]/*[name()='SerialNumber']) }</ns1:SERNR>
                            </ns1:item>
                    }
                </ns1:GR_SERIAL>
            </ns1:Z_ARIBA_GR_TRANSFER>
        </ns1:Z_ARIBA_GR_TRANSFER>
};


declare variable $in.body as xs:string external; 
declare variable $wSReceiptTransferRequest as document-node() := fn:parse-xml($in.body); 

xf:Receipt_Transfer_Transformation_Request($wSReceiptTransferRequest)