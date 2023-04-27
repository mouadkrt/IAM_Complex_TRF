xquery version "1.0";
(:: pragma bea:global-element-parameter parameter="$z_ARIBA_GR_QUALITYResponse" element="ns1:Z_ARIBA_GR_QUALITYResponse" location="../Wsdl/ReceiptImport_Adapter_WS_V1.0.wsdl" ::)
(:: pragma bea:global-element-return element="ns0:WSReceiptImportReply" location="../Wsdl/ReceiptImport.wsdl" ::)

declare namespace ns1 = "urn:iwaysoftware:ibse:jul2003:Z_ARIBA_GR_QUALITY:response";
declare namespace ns0 = "urn:Ariba:Buyer:vsap";
declare namespace xf = "http://tempuri.org/ReceiptImport_V1/Transformations/ReceiptImport_Transformation_Response/";

declare function xf:ReceiptImport_Transformation_Response($z_ARIBA_GR_QUALITYResponse as document-node())
    as element(ns0:WSReceiptImportReply) {
        <ns0:WSReceiptImportReply>
            <ns0:IAMSAPReceipt_WSReceiptImportResponse_Item>
                {
                    for $item in $z_ARIBA_GR_QUALITYResponse//ns1:Z_ARIBA_GR_QUALITY.Response/ns1:GOOD_RECEIPT_PO/ns1:item
                    return
                        <ns0:item>
                            <ns0:UnitOfMeasure>
                                <ns0:UniqueName>{ data($item/ns1:ERFME) }</ns0:UniqueName>
                            </ns0:UnitOfMeasure>
                            <ns0:DocumentDateStr>{ data($item/ns1:BLDAT) }</ns0:DocumentDateStr>
                            <ns0:WarehouseCode>{ data($item/ns1:LGORT) }</ns0:WarehouseCode>
                            <ns0:ReferenceDocumentYear>{ data($item/ns1:SJAHR) }</ns0:ReferenceDocumentYear>
                            <ns0:DocumentItemNumber>{ data($item/ns1:ZEILE) }</ns0:DocumentItemNumber>
                            <ns0:OrderNumber>{ data($item/ns1:EBELN) }</ns0:OrderNumber>
                            <ns0:MovementType>{ data($item/ns1:BWART) }</ns0:MovementType>
                            <ns0:SAPUser>{ data($item/ns1:USNAM) }</ns0:SAPUser>
                            <ns0:ReceivedQuantity>{ xs:double(data($item/ns1:ERFMG)) }</ns0:ReceivedQuantity>
                            <ns0:AccountingDateStr>{ data($item/ns1:CPUDT) }</ns0:AccountingDateStr>
                            <ns0:LastChangedDateStr>{ data($item/ns1:AEDAT) }</ns0:LastChangedDateStr>
                            <ns0:StockType>{ data($item/ns1:INSMK) }</ns0:StockType>
                            <ns0:HeaderInfo>{ data($item/ns1:BKTXT) }</ns0:HeaderInfo>
                            <ns0:ReferenceDocument>{ data($item/ns1:SMBLN) }</ns0:ReferenceDocument>
                            <ns0:DeliveryComplete>{ data($item/ns1:ELIKZ) }</ns0:DeliveryComplete>
                            <ns0:UnloadingPoint>{ data($item/ns1:ABLAD) }</ns0:UnloadingPoint>
                            <ns0:ReferenceDocumentItemNumber>{ data($item/ns1:SMBLP) }</ns0:ReferenceDocumentItemNumber>
                            <ns0:DeliveryNoteQuantity>{ xs:double(data($item/ns1:LSMNG)) }</ns0:DeliveryNoteQuantity>
                            <ns0:ItemText>{ data($item/ns1:SGTXT) }</ns0:ItemText>
                            <ns0:PlantCode>{ data($item/ns1:WERKS) }</ns0:PlantCode>
                            <ns0:MaterialNumber>{ data($item/ns1:MATNR) }</ns0:MaterialNumber>
                            <ns0:OrderLineNumber>{ data($item/ns1:EBELP) }</ns0:OrderLineNumber>
                            <ns0:ValuationType>{ data($item/ns1:BWTAR) }</ns0:ValuationType>
                            <ns0:MaterialDocument>{ data($item/ns1:MBLNR) }</ns0:MaterialDocument>
                            <ns0:DeliveryNoteUnitOfMeasure>
                                <ns0:UniqueName>{ data($item/ns1:LSMEH) }</ns0:UniqueName>
                            </ns0:DeliveryNoteUnitOfMeasure>
                            <ns0:DeliveryNoteNr>{ data($item/ns1:XBLNR) }</ns0:DeliveryNoteNr>
                            <ns0:MaterialDocumentYear>{ data($item/ns1:MJAHR) }</ns0:MaterialDocumentYear>
                            <ns0:PostingDateStr>{ data($item/ns1:BUDAT) }</ns0:PostingDateStr>
                            <ns0:ShipToParty>{ data($item/ns1:WEMPF) }</ns0:ShipToParty>
                            <ns0:EntryTime>{ data($item/ns1:CPUTM) }</ns0:EntryTime>
                        </ns0:item>
                }
            </ns0:IAMSAPReceipt_WSReceiptImportResponse_Item>
        </ns0:WSReceiptImportReply>
};

declare variable $in.body as xs:string external;
declare variable $z_ARIBA_GR_QUALITYResponse as document-node() := fn:parse-xml($in.body);

xf:ReceiptImport_Transformation_Response($z_ARIBA_GR_QUALITYResponse)