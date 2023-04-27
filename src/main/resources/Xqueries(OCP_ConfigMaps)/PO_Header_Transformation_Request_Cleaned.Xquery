xquery version "1.0" encoding "Cp1252";
(:: pragma bea:global-element-parameter parameter="$purchOrdHeaderStatusImportRequest1" element="ns0:PurchOrdHeaderStatusImportRequest" location="../Wsdl/PurchOrdHeaderStatusImport.wsdl" ::)
(:: pragma bea:global-element-return element="ns1:Z_ARIBA_PO_HEADER_STATUS" location="../Wsdl/PurchaseOrderHeaderStatusImport_Adapter_WS_V1.0.wsdl" ::)

declare namespace xf = "http://tempuri.org/PurchaseOrderHeaderStatusImport_V1/Transformations/PO_Header_Transformation_Request/";
declare namespace ns1 = "urn:iwaysoftware:ibse:jul2003:Z_ARIBA_PO_HEADER_STATUS";
declare namespace ns0 = "urn:Ariba:Buyer:vsap";

declare function xf:PO_Header_Transformation_Request($purchOrdHeaderStatusImportRequest1 as document-node())
    as element(ns1:Z_ARIBA_PO_HEADER_STATUS) {
        <ns1:Z_ARIBA_PO_HEADER_STATUS>
            <ns1:Z_ARIBA_PO_HEADER_STATUS>
                <ns1:PARTITION>{ data($purchOrdHeaderStatusImportRequest1//@partition) }</ns1:PARTITION>
                <ns1:VARIANT>{ data($purchOrdHeaderStatusImportRequest1//@variant) }</ns1:VARIANT>
                <ns1:HEADERSTATUSINFO>
                    <ns1:item>
                        <ns1:ERPORDERID>{ data($purchOrdHeaderStatusImportRequest1//ns0:OrderInfo_PurchOrdHeaderStatusInfo_Item/ns0:item[1]/ns0:OrderInfoDetails/ns0:item[1]/ns0:UniqueName) }</ns1:ERPORDERID>
                        <ns1:PONUMBER>{ data($purchOrdHeaderStatusImportRequest1//ns0:OrderInfo_PurchOrdHeaderStatusInfo_Item/ns0:item[1]/ns0:OrderInfoDetails/ns0:item[1]/ns0:ERPPONumber) }</ns1:PONUMBER>
                    </ns1:item>
                </ns1:HEADERSTATUSINFO>
            </ns1:Z_ARIBA_PO_HEADER_STATUS>
        </ns1:Z_ARIBA_PO_HEADER_STATUS>
};

declare variable $in.body as xs:string external;
declare variable $purchOrdHeaderStatusImportRequest1 as document-node() := fn:parse-xml($in.body);

xf:PO_Header_Transformation_Request($purchOrdHeaderStatusImportRequest1)