xquery version "1.0";
(:: pragma bea:global-element-parameter parameter="$receiptExportRequest" element="ns0:ReceiptExportRequest" location="../Wsdl/ReceiptExport.wsdl" ::)
(:: pragma bea:global-element-return element="ns1:Z_ARIBA_GR_PUSH" location="../Wsdl/ReceiptExport_Adapter_WS_V1.0.wsdl" ::)

declare namespace ns1 = "urn:iwaysoftware:ibse:jul2003:Z_ARIBA_GR_PUSH";
declare namespace ns0 = "urn:Ariba:Buyer:vsap";
declare namespace xf = "http://tempuri.org/ReceiptExport_V1/Transformations/ReceiptExport_Transformation_Request/";

declare function xf:ReceiptExport_Transformation_Request($receiptExportRequest as document-node())
    as element(ns1:Z_ARIBA_GR_PUSH) {
        <ns1:Z_ARIBA_GR_PUSH>
            <ns1:Z_ARIBA_GR_PUSH>
                <ns1:GR_HEADER>
                    <ns1:BLDAT>
                        {
                            fn:concat(fn:concat(fn:concat(fn:substring(data($receiptExportRequest//ns0:Receipt_ReceiptHeaderDetails_Item/ns0:item[1]/ns0:CreateDateString),
                            1,4),"/"),
                            fn:concat(fn:substring(data($receiptExportRequest//ns0:Receipt_ReceiptHeaderDetails_Item/ns0:item[1]/ns0:CreateDateString),
                            5,2),"/")),fn:substring(data($receiptExportRequest//ns0:Receipt_ReceiptHeaderDetails_Item/ns0:item[1]/ns0:CreateDateString),
                            7,2))
                        }
</ns1:BLDAT>
                    <ns1:BUDAT>
                        {
                            fn:concat(fn:concat(fn:concat(fn:substring(data($receiptExportRequest//ns0:Receipt_ReceiptHeaderDetails_Item/ns0:item[1]/ns0:ApprovedDateString),
                            1,4),"/"),
                            fn:concat(fn:substring(data($receiptExportRequest//ns0:Receipt_ReceiptHeaderDetails_Item/ns0:item[1]/ns0:ApprovedDateString),
                            5,2),"/")),fn:substring(data($receiptExportRequest//ns0:Receipt_ReceiptHeaderDetails_Item/ns0:item[1]/ns0:ApprovedDateString),
                            7,2))
                        }
</ns1:BUDAT>
                    <ns1:LFSNR>{ data($receiptExportRequest//ns0:Receipt_ReceiptHeaderDetails_Item/ns0:item[1]/ns0:InvoicingFlag) }</ns1:LFSNR>
                    <ns1:BWARTWE>{ data($receiptExportRequest//ns0:Receipt_ReceiptHeaderDetails_Item/ns0:item[1]/ns0:IAMCodeMouvement) }</ns1:BWARTWE>
                    <ns1:BKTXT>
                        {
                            if (fn:string-length($receiptExportRequest//ns0:Receipt_ReceiptHeaderDetails_Item/ns0:item[1]/ns0:MasterAgreement/ns0:UniqueName) = 0) then
                                (data($receiptExportRequest//ns0:Receipt_ReceiptHeaderDetails_Item/ns0:item[1]/ns0:ERPPONumber))
                            else 
                                data($receiptExportRequest//ns0:Receipt_ReceiptHeaderDetails_Item/ns0:item[1]/ns0:MasterAgreement/ns0:UniqueName)
                        }
</ns1:BKTXT>
                    <ns1:EBELN>{ data($receiptExportRequest//ns0:Receipt_ReceiptHeaderDetails_Item/ns0:item[1]/ns0:ERPPONumber) }</ns1:EBELN>
                    <ns1:ARIBA_GRNO>{ data($receiptExportRequest//ns0:Receipt_ReceiptHeaderDetails_Item/ns0:item[1]/ns0:UniqueName) }</ns1:ARIBA_GRNO>
                </ns1:GR_HEADER>
                <ns1:PARTITION>{ data($receiptExportRequest//@partition) }</ns1:PARTITION>
                <ns1:VARIANT>{ data($receiptExportRequest//@variant) }</ns1:VARIANT>
                <ns1:GR_ITEMS>
                    {
                        for $item in $receiptExportRequest//ns0:Receipt_ReceiptLineDetails_Item/ns0:item[1]/ns0:ReceiptItems/ns0:item
                        return
                            <ns1:item>
                                <ns1:ARIBA_ITNO>{ xs:string( data($item/ns0:NumberInCollection) ) }</ns1:ARIBA_ITNO>
                                <ns1:ERFMG>
                                    {
                                        if (xs:decimal(data($receiptExportRequest//ns0:Receipt_ReceiptHeaderDetails_Item/ns0:item[1]/ns0:InvoicingFlag)) = 1) then
                                            (data($item/ns0:NumberAccepted))
                                        else 
                                            data($item/ns0:IAMNumberAQualif)
                                    }
</ns1:ERFMG>
                                <ns1:ERFME>{ data($item/ns0:UnitOfMeasure/ns0:UniqueName) }</ns1:ERFME>
                                <ns1:ELIKZ>
                                    {
                                        if (xs:string(data($receiptExportRequest//ns0:Receipt_ReceiptLineDetails_Item/ns0:item[1]/ns0:ReceiptItems/ns0:item[1]/ns0:LineItem/ns0:IAMFinalDelivery)) = "true") then
                                            ("X")
                                        else 
                                            ""
                                    }
</ns1:ELIKZ>
                                <ns1:EBELN>{ data($item/ns0:ERPPONumber) }</ns1:EBELN>
                                <ns1:EBELP>{ data($item/ns0:ERPPOLineNumber) }</ns1:EBELP>
                                <ns1:ARIBA_GRNO>{ data($item/ns0:ReceiptId) }</ns1:ARIBA_GRNO>
                                <ns1:MBLNR>{ data($item/ns0:IAMRejectedSendtoSAP) }</ns1:MBLNR>
                                <ns1:SGTXT>{ data($item/ns0:IAMLineLevelComments) }</ns1:SGTXT>
                            </ns1:item>
                    }
                </ns1:GR_ITEMS>
            </ns1:Z_ARIBA_GR_PUSH>
        </ns1:Z_ARIBA_GR_PUSH>
};

declare variable $in.body as xs:string external;
declare variable $receiptExportRequest as document-node() := fn:parse-xml($in.body);


xf:ReceiptExport_Transformation_Request($receiptExportRequest)