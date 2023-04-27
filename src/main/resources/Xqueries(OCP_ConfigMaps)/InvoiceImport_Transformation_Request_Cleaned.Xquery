xquery version "1.0";
(:: pragma bea:global-element-parameter parameter="$wSInvoiceImportRequest1" element="ns0:WSInvoiceImportRequest" location="../Wsdl/WSInvoiceImport.wsdl" ::)
(:: pragma bea:global-element-return element="ns1:ZARIBA_INVOICED_PO_ITEMS_SOAP" location="../Wsdl/InvoiceImport_Adapter_WS_V1.0.wsdl" ::)

declare namespace ns1 = "urn:iwaysoftware:ibse:jul2003:ZARIBA_INVOICED_PO_ITEMS_SOAP";
declare namespace ns3 = "";
declare namespace ns0 = "urn:Ariba:Buyer:vsap";
declare namespace xf = "http://tempuri.org/InvoiceImport_V1/Transformations/InvoiceImport_Transformation_Request/";

declare function xf:InvoiceImport_Transformation_Request($wSInvoiceImportRequest1 as document-node())
    as element(ns1:ZARIBA_INVOICED_PO_ITEMS_SOAP) {
        <ns1:ZARIBA_INVOICED_PO_ITEMS_SOAP>
            <ns1:ZARIBA_INVOICED_PO_ITEMS_SOAP>
                <ns1:ENDDATE>
                {
                    if (fn:string($wSInvoiceImportRequest1//ns0:WSLoadSapInvoice_WSInvoiceImport_Item/ns0:item[1]/ns0:EndDate)) then
                            (fn:concat(fn:concat(fn:concat(fn:substring(data($wSInvoiceImportRequest1//ns0:WSLoadSapInvoice_WSInvoiceImport_Item/ns0:item[1]/ns0:EndDate),
                            1,4),"-"), fn:concat(fn:substring(data($wSInvoiceImportRequest1//ns0:WSLoadSapInvoice_WSInvoiceImport_Item/ns0:item[1]/ns0:EndDate),
                            5,2),"-")), fn:substring(data($wSInvoiceImportRequest1//ns0:WSLoadSapInvoice_WSInvoiceImport_Item/ns0:item[1]/ns0:EndDate),
                            7,2)))
                        else 
                            ()
                }
                </ns1:ENDDATE>
                <ns1:PARTITION>{ data($wSInvoiceImportRequest1//@partition) }</ns1:PARTITION>
                <ns1:STARTDATE>
                {
                   if (fn:string($wSInvoiceImportRequest1//ns0:WSLoadSapInvoice_WSInvoiceImport_Item/ns0:item[1]/ns0:IntegrationFromDate)) then
                            (fn:concat(fn:concat(fn:concat(fn:substring(data($wSInvoiceImportRequest1//ns0:WSLoadSapInvoice_WSInvoiceImport_Item/ns0:item[1]/ns0:IntegrationFromDate),
                            1,4),"-"), fn:concat(fn:substring(data($wSInvoiceImportRequest1//ns0:WSLoadSapInvoice_WSInvoiceImport_Item/ns0:item[1]/ns0:IntegrationFromDate),
                            5,2),"-")), fn:substring(data($wSInvoiceImportRequest1//ns0:WSLoadSapInvoice_WSInvoiceImport_Item/ns0:item[1]/ns0:IntegrationFromDate),
                            7,2)))
                        else 
                            ()
                }
                </ns1:STARTDATE>
                <ns1:VARIANT>{ data($wSInvoiceImportRequest1//@variant) }</ns1:VARIANT>
            </ns1:ZARIBA_INVOICED_PO_ITEMS_SOAP>
        </ns1:ZARIBA_INVOICED_PO_ITEMS_SOAP>
};

declare variable $in.body as xs:string external;
declare variable $wSInvoiceImportRequest1 as document-node() := fn:parse-xml($in.body);

xf:InvoiceImport_Transformation_Request($wSInvoiceImportRequest1)