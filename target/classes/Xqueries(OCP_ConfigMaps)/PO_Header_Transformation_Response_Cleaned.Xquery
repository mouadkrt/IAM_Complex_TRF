xquery version "1.0" encoding "Cp1252";
(:: pragma bea:global-element-parameter parameter="$z_ARIBA_PO_HEADER_STATUSResponse1" element="ns0:Z_ARIBA_PO_HEADER_STATUSResponse" location="../Wsdl/PurchaseOrderHeaderStatusImport_Adapter_WS_V1.0.wsdl" ::)
(:: pragma bea:global-element-return element="ns1:PurchOrdHeaderStatusImportReply" location="../Wsdl/PurchOrdHeaderStatusImport.wsdl" ::)

declare namespace xf = "http://tempuri.org/PurchaseOrderHeaderStatusImport_V1/Transformations/PO_Header_Transformation_Response/";
declare namespace ns1 = "urn:Ariba:Buyer:vsap";
declare namespace ns0 = "urn:iwaysoftware:ibse:jul2003:Z_ARIBA_PO_HEADER_STATUS:response";

declare function xf:PO_Header_Transformation_Response($z_ARIBA_PO_HEADER_STATUSResponse1 as document-node())
    as element(ns1:PurchOrdHeaderStatusImportReply) {
         <ns1:PurchOrdHeaderStatusImportReply partition = "{ data($z_ARIBA_PO_HEADER_STATUSResponse1//ns0:Z_ARIBA_PO_HEADER_STATUS.Response/ns0:E_PARTITION) }"
                                             variant = "{ data($z_ARIBA_PO_HEADER_STATUSResponse1//ns0:Z_ARIBA_PO_HEADER_STATUS.Response/ns0:E_VARIANT) }">
            <ns1:ERPOrder_PurchOrdHeaderStatusPull_Item>
                <ns1:item>
                    <ns1:ERPAllowCancel>
                        {
                            if (data($z_ARIBA_PO_HEADER_STATUSResponse1//ns0:Z_ARIBA_PO_HEADER_STATUS.Response/ns0:HEADERSTATUSINFO/ns0:item[1]/ns0:SAPALLOWCANCEL) = "N") then
                                ("false")
                            else 
                                "true"
                        }
</ns1:ERPAllowCancel>
                    <ns1:UniqueName>{ data($z_ARIBA_PO_HEADER_STATUSResponse1//ns0:Z_ARIBA_PO_HEADER_STATUS.Response/ns0:HEADERSTATUSINFO/ns0:item[1]/ns0:ERPORDERID) }</ns1:UniqueName>
                </ns1:item>
            </ns1:ERPOrder_PurchOrdHeaderStatusPull_Item>
        </ns1:PurchOrdHeaderStatusImportReply>
};

declare variable $in.body as xs:string external;
declare variable $z_ARIBA_PO_HEADER_STATUSResponse1 as document-node() := fn:parse-xml($in.body);

xf:PO_Header_Transformation_Response($z_ARIBA_PO_HEADER_STATUSResponse1)