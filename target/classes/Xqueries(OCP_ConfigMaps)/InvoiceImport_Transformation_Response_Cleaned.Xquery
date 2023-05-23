xquery version "1.0";
(:: pragma bea:global-element-parameter parameter="$zARIBA_INVOICED_PO_ITEMS_SOAPResponse1" element="ns0:ZARIBA_INVOICED_PO_ITEMS_SOAPResponse" location="../Wsdl/InvoiceImport_Adapter_WS_V1.0.wsdl" ::)
(:: pragma bea:global-element-return element="ns1:WSInvoiceImportReply" location="../Wsdl/WSInvoiceImport.wsdl" ::)

declare namespace ns1 = "urn:Ariba:Buyer:vsap";
declare namespace ns0 = "urn:iwaysoftware:ibse:jul2003:ZARIBA_INVOICED_PO_ITEMS_SOAP:response";
declare namespace xf = "http://tempuri.org/InvoiceImport_V1/Transformations/InvoiceImport_Transformation_Response/";

declare function xf:InvoiceImport_Transformation_Response($zARIBA_INVOICED_PO_ITEMS_SOAPResponse1 as document-node())
    as element(ns1:WSInvoiceImportReply) {
        <ns1:WSInvoiceImportReply>
            <ns1:IAMSAPInvoice_WSInvoiceImportResponse_Item>
                {
                    for $item in $zARIBA_INVOICED_PO_ITEMS_SOAPResponse1//ns0:ZARIBA_INVOICED_PO_ITEMS_SOAP.Response/ns0:ZINVPOITEMS/ns0:item
                    return
                        <ns1:item>
                            {
                                for $QTEFACT in $item/ns0:QTEFACT
                                return
                                    <ns1:InvoiceQuantity>{ data($QTEFACT) }</ns1:InvoiceQuantity>
                            }
                            {
                                for $BSTME in $item/ns0:BSTME
                                return
                                    <ns1:InvoiceUnite>{ data($BSTME) }</ns1:InvoiceUnite>
                            }
                            {
                                for $EBELP in $item/ns0:EBELP
                                return
                                    <ns1:OrderLineNumber>{ data($EBELP) }</ns1:OrderLineNumber>
                            }
                            {
                                for $QTEFACTPRE in $item/ns0:QTEFACTPRE
                                return
                                    <ns1:InvoiceQuantityPre>{ data($QTEFACTPRE) }</ns1:InvoiceQuantityPre>
                            }
                            {
                                for $QTECHUPRE in $item/ns0:QTECHUPRE
                                return
                                    <ns1:InvoiceQuantityPreUl>{ data($QTECHUPRE) }</ns1:InvoiceQuantityPreUl>
                            }
                            {
                                for $EBELN in $item/ns0:EBELN
                                return
                                    <ns1:OrderNumber>{ data($EBELN) }</ns1:OrderNumber>
                            }
                            {
                                for $SENDDATE in $zARIBA_INVOICED_PO_ITEMS_SOAPResponse1//ns0:ZARIBA_INVOICED_PO_ITEMS_SOAP.Response/ns0:SENDDATE
                                return
                                    <ns1:MaterialDocumentYear>{ fn:concat(fn:substring(data($SENDDATE),1,4),fn:substring(data($SENDDATE),6,2),fn:substring(data($SENDDATE),9,2)) }</ns1:MaterialDocumentYear>
                            }
                            {
                                for $QTECHU in $item/ns0:QTECHU
                                return
                                    <ns1:InvoiceQuantityUl>{ data($QTECHU) }</ns1:InvoiceQuantityUl>
                            }
                            {
                                for $QTECIAPRE in $item/ns0:QTECIAPRE
                                return
                                    <ns1:InvoiceQuantityPreCIA>{ data($QTECIAPRE) }</ns1:InvoiceQuantityPreCIA>
                            }
                            {
                                for $QTECIA in $item/ns0:QTECIA
                                return
                                    <ns1:InvoiceQuantityCIA>{ data($QTECIA) }</ns1:InvoiceQuantityCIA>
                            }
                        </ns1:item>
                }
            </ns1:IAMSAPInvoice_WSInvoiceImportResponse_Item>
        </ns1:WSInvoiceImportReply>
};

declare variable $in.body as xs:string external;
declare variable $zARIBA_INVOICED_PO_ITEMS_SOAPResponse1 as document-node() := fn:parse-xml($in.body);

xf:InvoiceImport_Transformation_Response($zARIBA_INVOICED_PO_ITEMS_SOAPResponse1)