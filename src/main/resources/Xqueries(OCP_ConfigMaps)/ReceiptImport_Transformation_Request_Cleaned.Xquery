xquery version "1.0";
(:: pragma bea:global-element-parameter parameter="$wSReceiptImportRequest" element="ns1:WSReceiptImportRequest" location="../Wsdl/ReceiptImport.wsdl" ::)
(:: pragma bea:global-element-return element="ns0:Z_ARIBA_GR_QUALITY" location="../Wsdl/ReceiptImport_Adapter_WS_V1.0.wsdl" ::)

declare namespace ns1 = "urn:Ariba:Buyer:vsap";
declare namespace ns0 = "urn:iwaysoftware:ibse:jul2003:Z_ARIBA_GR_QUALITY";
declare namespace xf = "http://tempuri.org/ReceiptImport_V1/Transformations/ReceiptImport_Transformation_Request/";

declare function xf:ReceiptImport_Transformation_Request($wSReceiptImportRequest as document-node())
    as element(ns0:Z_ARIBA_GR_QUALITY) {
        <ns0:Z_ARIBA_GR_QUALITY>
            <ns0:Z_ARIBA_GR_QUALITY>
                <ns0:PARTITION>{ data($wSReceiptImportRequest//@partition) }</ns0:PARTITION>
                <ns0:STARTDATE>
                    {
                        if (fn:string($wSReceiptImportRequest//ns1:WSLoadSapReceipt_WSReceiptImport_Item/ns1:item[1]/ns1:IntegrationFromDate)) then
                            (fn:concat(fn:concat(fn:concat(fn:substring(data($wSReceiptImportRequest//ns1:WSLoadSapReceipt_WSReceiptImport_Item/ns1:item[1]/ns1:IntegrationFromDate),
                            1,4),"/"), fn:concat(fn:substring(data($wSReceiptImportRequest//ns1:WSLoadSapReceipt_WSReceiptImport_Item/ns1:item[1]/ns1:IntegrationFromDate),
                            5,2),"/")), fn:substring(data($wSReceiptImportRequest//ns1:WSLoadSapReceipt_WSReceiptImport_Item/ns1:item[1]/ns1:IntegrationFromDate),
                            7,2)))
                        else 
                            ()
                    }
</ns0:STARTDATE>
                <ns0:VARIANT>{ data($wSReceiptImportRequest//@variant) }</ns0:VARIANT>
            </ns0:Z_ARIBA_GR_QUALITY>
        </ns0:Z_ARIBA_GR_QUALITY>
};

declare variable $in.body as xs:string external;
declare variable $wSReceiptImportRequest as document-node() := fn:parse-xml($in.body);

xf:ReceiptImport_Transformation_Request($wSReceiptImportRequest)