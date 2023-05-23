xquery version "1.0";
(:: pragma bea:global-element-parameter parameter="$wSReceiptTransferRequest" element="ns0:WSReceiptTransferRequest" location="../Wsdl/IAMSAPReceiptTransferExport.wsdl" ::)
(:: pragma bea:global-element-return element="ns1:Z_ARIBA_GR_TRANSFER" location="../Wsdl/IAMSAPReceiptTransferExport_Adapter_WS_V1.0.wsdl" ::)

declare namespace ns1 = "urn:iwaysoftware:ibse:jul2003:Z_ARIBA_GR_TRANSFER";
declare namespace ns0 = "urn:Ariba:Buyer:vsap";
declare namespace xf = "http://tempuri.org/IAMSAPReceiptTransferExport_V1/Receipt_Transfer_Transformation_Request/";

declare function xf:Receipt_Transfer_Transformation_Request($wSReceiptTransferRequest as document-node())
    as element(ns1:Z_ARIBA_GR_TRANSFER) {
        <ns1:Z_ARIBA_GR_TRANSFER>
            <ns1:Z_ARIBA_GR_TRANSFER>
                <ns1:PARTITION>{ data($wSReceiptTransferRequest//@partition) }</ns1:PARTITION>
                <ns1:VARIANT>{ data($wSReceiptTransferRequest//@variant) }</ns1:VARIANT>
                <ns1:GR_ITEM>
                    {
                        for $item in $wSReceiptTransferRequest//ns0:Receipt_ReceiptTransferLineDetails_Item/ns0:item[1]/ns0:ReceiptItems/ns0:item
                        return
                            <ns1:item>
                                <ns1:MBLNR>{ data($item/ns0:IAMSAPMaterialDocumentReference/ns0:MaterialDocument) }</ns1:MBLNR>
                                <ns1:MJAHR>{ data($item/ns0:IAMSAPMaterialDocumentReference/ns0:MaterialDocumentYear) }</ns1:MJAHR>
                                <ns1:ZEILE>{ data($item/ns0:IAMSAPMaterialDocumentReference/ns0:DocumentItemNumber) }</ns1:ZEILE>
                                <ns1:ZQACCEPT>
                                    {

                                            data($item/ns0:IAMNumberAQualif)
                                    }
</ns1:ZQACCEPT>
                                <ns1:ZUACCEPT>{ data($item/ns0:UnitOfMeasure/ns0:UniqueName) }</ns1:ZUACCEPT>
                                <ns1:ZQREFUS>{ data($item/ns0:NumberRejected) }</ns1:ZQREFUS>
                                <ns1:ZUREFUS>{ data($item/ns0:UnitOfMeasure/ns0:UniqueName) }</ns1:ZUREFUS>
                                <ns1:BWTAR>{ data($item/ns0:IAMSAPMaterialDocumentReference/ns0:ValuationType) }</ns1:BWTAR>
                                <ns1:GRUND>{ data($item/ns0:IAMStructuredRejectReason/ns0:UniqueName) }</ns1:GRUND>
                                <ns1:ARIBA_GRNO>{ data($wSReceiptTransferRequest//ns0:Receipt_ReceiptTransferHeaderDetails_Item/ns0:item[1]/ns0:UniqueName) }</ns1:ARIBA_GRNO>
                                <ns1:ARIBA_ITNO>{ xs:string( data($item/ns0:NumberInCollection) ) }</ns1:ARIBA_ITNO>
                                <ns1:NO_MORE_GR>
                                    {
                                        if (xs:string(data($wSReceiptTransferRequest//ns0:Receipt_ReceiptTransferLineDetails_Item/ns0:item[1]/ns0:ReceiptItems/ns0:item[1]/ns0:LineItem/ns0:IAMFinalDelivery)) = "true") then
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
                        for $item in $wSReceiptTransferRequest//ns0:Receipt_ReceiptTransferLineDetails_Item/ns0:item[1]/ns0:ReceiptItems/ns0:item
                        return
                            <ns1:item>
                                <ns1:MBLNR>{ data($item/ns0:IAMSAPMaterialDocumentReference/ns0:MaterialDocument) }</ns1:MBLNR>
                                <ns1:MJAHR>{ data($item/ns0:IAMSAPMaterialDocumentReference/ns0:MaterialDocumentYear) }</ns1:MJAHR>
                                <ns1:ZEILE>{ data($item/ns0:IAMSAPMaterialDocumentReference/ns0:DocumentItemNumber) }</ns1:ZEILE>
                                <ns1:SERNR>{ data($item/ns0:IAMSerialNumbersToReject/ns0:item[1]/ns0:SerialNumber) }</ns1:SERNR>
                            </ns1:item>
                    }
                </ns1:GR_SERIAL>
            </ns1:Z_ARIBA_GR_TRANSFER>
        </ns1:Z_ARIBA_GR_TRANSFER>
};

declare variable $in.body as xs:string external;
declare variable $wSReceiptTransferRequest as document-node() := fn:parse-xml($in.body);


xf:Receipt_Transfer_Transformation_Request($wSReceiptTransferRequest)