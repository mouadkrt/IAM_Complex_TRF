xquery version "1.0";
(:: pragma bea:global-element-parameter parameter="$purchaseOrderChangeExportRequest1" element="ns0:PurchaseOrderChangeExportRequest" location="../Wsdl/PurchaseOrderChangeExport.wsdl" ::)
(:: pragma bea:global-element-return element="ns1:Z_ARIBA_BAPI_PO_CHANGE" location="../Wsdl/PurchaseOrderChangeExport_Adapter_WS_V2.0.wsdl" ::)

declare namespace ns1 = "urn:iwaysoftware:ibse:jul2003:Z_ARIBA_BAPI_PO_CHANGE";
declare namespace ns0 = "urn:Ariba:Buyer:vsap";
declare namespace xf = "http://tempuri.org/PurchaseOrderChangeExport_V1/Transformations/PO_Change_Export_Transformation_Request/";

declare function xf:PO_Change_Export_Transformation_Request($purchaseOrderChangeExportRequest1 as document-node())
    as element(ns1:Z_ARIBA_BAPI_PO_CHANGE) {
        <ns1:Z_ARIBA_BAPI_PO_CHANGE>
            <ns1:Z_ARIBA_BAPI_PO_CHANGE>
                {
                    for $partition in $purchaseOrderChangeExportRequest1//@partition
                    return
                        <ns1:PARTITION>{ data($partition) }</ns1:PARTITION>
                }
                <ns1:PO_HEADER>
                    <ns1:EBELN>{ data($purchaseOrderChangeExportRequest1//ns0:ERPOrder_ChangePurchOrdHeaderDet_Item/ns0:item[1]/ns0:ERPPONumber) }</ns1:EBELN>
                    <ns1:ERPORDERID>{ data($purchaseOrderChangeExportRequest1//ns0:ERPOrder_ChangePurchOrdHeaderDet_Item/ns0:item[1]/ns0:UniqueName) }</ns1:ERPORDERID>
                    <ns1:VERSION>{ xs:string( data($purchaseOrderChangeExportRequest1//ns0:ERPOrder_ChangePurchOrdHeaderDet_Item/ns0:item[1]/ns0:VersionNumber) ) }</ns1:VERSION>
                    <ns1:LIFNR>{ data($purchaseOrderChangeExportRequest1//ns0:ERPOrder_ChangePurchOrdHeaderDet_Item/ns0:item[1]/ns0:Supplier/ns0:UniqueName) }</ns1:LIFNR>
                    <ns1:ORDERTYPE>{ data($purchaseOrderChangeExportRequest1//ns0:ERPOrder_ChangePurchOrdHeaderDet_Item/ns0:item[1]/ns0:IAMOrderMethodCategory) }</ns1:ORDERTYPE>
                    <ns1:EKGRP>{ data($purchaseOrderChangeExportRequest1//ns0:ERPOrder_ChangePurchOrdHeaderDet_Item/ns0:item[1]/ns0:PurchaseGroup/ns0:UniqueName) }</ns1:EKGRP>
                    <ns1:EKORG>{ data($purchaseOrderChangeExportRequest1//ns0:ERPOrder_ChangePurchOrdHeaderDet_Item/ns0:item[1]/ns0:PurchaseOrg/ns0:UniqueName) }</ns1:EKORG>
                    <ns1:WAERS>{ data($purchaseOrderChangeExportRequest1//ns0:ERPOrder_ChangePurchOrdHeaderDet_Item/ns0:item[1]/ns0:Currency/ns0:UniqueName) }</ns1:WAERS>
                    <ns1:PMNTTRMS>{ data($purchaseOrderChangeExportRequest1//ns0:ERPOrder_ChangePurchOrdHeaderDet_Item/ns0:item[1]/ns0:PaymentTerms/ns0:UniqueName) }</ns1:PMNTTRMS>
                </ns1:PO_HEADER>
                {
                    for $variant in $purchaseOrderChangeExportRequest1//@variant
                    return
                        <ns1:VARIANT>{ data($variant) }</ns1:VARIANT>
                }
                <ns1:DELPO_ACCNTS>
                    {
                        for $item in $purchaseOrderChangeExportRequest1//ns0:ERPOrder_ChangePurchOrdDelAcct_Item/ns0:item[1]/ns0:LineItems/ns0:item[1]/ns0:Accountings/ns0:DeletedSplitAccountings/ns0:item
                        return
                            <ns1:item>
                                <ns1:EBELP>{ data($item/ns0:POLineNumber) }</ns1:EBELP>
                                <ns1:SERIAL_NO>{ data($item/ns0:SAPSerialNumber) }</ns1:SERIAL_NO>
                            </ns1:item>
                    }
                </ns1:DELPO_ACCNTS>
                <ns1:DELPO_ITEMS>
                    {
                        for $item in $purchaseOrderChangeExportRequest1//ns0:ERPOrder_ChangePurchOrdDelItems_Item/ns0:item[1]/ns0:DeletedERPLineItems/ns0:item
                        return
                            <ns1:item>
                                <ns1:EBELP>{ data($item/ns0:NumberOnPOString) }</ns1:EBELP>
                            </ns1:item>
                    }
                </ns1:DELPO_ITEMS>
                <ns1:PO_ACCOUNTS>
                    {
                        for $item0 in $purchaseOrderChangeExportRequest1//ns0:ERPOrder_ChangePurchOrdAcctDet_Item/ns0:item[1]/ns0:LineItems/ns0:item
                        return
                            <ns1:item>
                                <ns1:EBELP>{ data($item0/ns0:Accountings/ns0:SplitAccountings/ns0:item[1]/ns0:POLineNumber) }</ns1:EBELP>
                                <ns1:SERIAL_NO>{ xs:string( data($item0/ns0:Accountings/ns0:SplitAccountings/ns0:item[1]/ns0:NumberInCollection) ) }</ns1:SERIAL_NO>
                                <ns1:MKNTM>{ data($item0/ns0:Accountings/ns0:SplitAccountings/ns0:item[1]/ns0:ERPSplitValue) }</ns1:MKNTM>
                                <ns1:SAKTO>{ data($item0/ns0:Accountings/ns0:SplitAccountings/ns0:item[1]/ns0:GeneralLedger/ns0:UniqueName) }</ns1:SAKTO>
                                <ns1:KOSTL>{ data($item0/ns0:Accountings/ns0:SplitAccountings/ns0:item[1]/ns0:CostCenter/ns0:UniqueName) }</ns1:KOSTL>
                                <ns1:AUFNR>{ data($item0/ns0:Accountings/ns0:SplitAccountings/ns0:item[1]/ns0:InternalOrder/ns0:UniqueName) }</ns1:AUFNR>
                                <ns1:ANLN1>{ data($item0/ns0:Accountings/ns0:SplitAccountings/ns0:item[1]/ns0:Asset/ns0:UniqueName) }</ns1:ANLN1>
                                <ns1:ANLN2>{ data($item0/ns0:Accountings/ns0:SplitAccountings/ns0:item[1]/ns0:Asset/ns0:SubNumber) }</ns1:ANLN2>
                                <ns1:PS_PSP_PNR>{ data($item0/ns0:Accountings/ns0:SplitAccountings/ns0:item[1]/ns0:WBSElement/ns0:UniqueName) }</ns1:PS_PSP_PNR>
                                <ns1:CHGSTATE>{ xs:string( data($item0/ns0:Accountings/ns0:SplitAccountings/ns0:item[1]/ns0:ChangedState) ) }</ns1:CHGSTATE>
                            </ns1:item>
                    }
                </ns1:PO_ACCOUNTS>
                <ns1:PO_COND>
                    {
                        for $item in $purchaseOrderChangeExportRequest1//ns0:ERPOrder_ChangePurchOrdLineDet_Item/ns0:item[1]/ns0:LineItems/ns0:item[1]/ns0:IAMPriceConditions/ns0:item
                        return
                            <ns1:item>
                                <ns1:KSCHL>{ data($item/ns0:PriceConditionType/ns0:UniqueName) }</ns1:KSCHL>
                                <ns1:KBETR>{ (fn:round(fn:number($item/ns0:IamDiscountValue)*1000)) div 1000 }</ns1:KBETR>
                            </ns1:item>
                    }
                </ns1:PO_COND>
                <ns1:PO_ITEMS>
                    {
                        for $item in $purchaseOrderChangeExportRequest1//ns0:ERPOrder_ChangePurchOrdLineDet_Item/ns0:item[1]/ns0:LineItems/ns0:item
                        return
                            <ns1:item>
                                <ns1:EBELP>{ data($item/ns0:NumberOnPOString) }</ns1:EBELP>
                                <ns1:TXZ01>{ fn:substring(data($item/ns0:Description/ns0:Description),1,40) }</ns1:TXZ01>
                                <ns1:MATKL>{ data($item/ns0:CommodityCode/ns0:UniqueName) }</ns1:MATKL>
                                <ns1:KNTTP>
                                    {
                                        if (data($item/ns0:AccountCategory/ns0:UniqueName) = "-") then
                                            (())
                                        else 
                                            data($item/ns0:AccountCategory/ns0:UniqueName)
                                    }
</ns1:KNTTP>
                                <ns1:WERKS>{ data($item/ns0:ShipTo/ns0:IAMPlantUniqueName) }</ns1:WERKS>
                                <ns1:NETPR>
                                    {
                                        if (data($item/ns0:IAMItemsGrat) = "G") then
                                            ("0")
                                        else 
                                            data($item/ns0:Description/ns0:Price/ns0:Amount)
                                    }
</ns1:NETPR>
                                <ns1:MENGE>{ data($item/ns0:Quantity) }</ns1:MENGE>
                                <ns1:MEINS>{ data($item/ns0:Description/ns0:UnitOfMeasure/ns0:UniqueName) }</ns1:MEINS>
                                <ns1:EEIND>
                                    {
                                        fn:concat(fn:concat(fn:concat(fn:substring(data($item/ns0:NeedByDateString),
                                        1,4),"/"),fn:concat(fn:substring(data($item/ns0:NeedByDateString),5,2),"/")),fn:substring(data($item/ns0:NeedByDateString),7,2))
                                    }
</ns1:EEIND>
                                <ns1:EMATNR>
                                    {
                                        if (data($purchaseOrderChangeExportRequest1//ns0:ERPOrder_ChangePurchOrdHeaderDet_Item/ns0:item[1]/ns0:IAMOrderMethodCategory) = "ZARD") then
                                            ("")
                                        else 
                                            data($item/ns0:Description/ns0:ItemNumber)
                                    }
</ns1:EMATNR>
                                <ns1:EPSTP>{ data($item/ns0:ItemCategory/ns0:UniqueName) }</ns1:EPSTP>
                                <ns1:REQ_ID>{ data($item/ns0:OriginatingSystemReferenceID) }</ns1:REQ_ID>
                                <ns1:ITEMONREQ>{ data($item/ns0:ItemOnReq) }</ns1:ITEMONREQ>
                                <ns1:VRTKZ>{ data($item/ns0:SAPDistributionFlag) }</ns1:VRTKZ>
                                <ns1:TWRKZ>{ data($item/ns0:SAPPartialInvoiceFlag) }</ns1:TWRKZ>
                                <ns1:UNTTO>
                                    {
                                        if (data($item/ns0:UnderTolerance) = "") then
                                            (0)
                                        else 
                                            xs:decimal( data($item/ns0:UnderTolerance) )
                                    }
</ns1:UNTTO>
                                <ns1:UEBTO>
                                    {
                                        if (data($item/ns0:OverTolerance) = "") then
                                            (0)
                                        else 
                                            xs:decimal( data($item/ns0:OverTolerance) )
                                    }
</ns1:UEBTO>
                                <ns1:CHGSTATE>{ xs:string( data($item/ns0:ChangedState) ) }</ns1:CHGSTATE>
                                <ns1:LGORT>{ data($item/ns0:ShipTo/ns0:IAMWarehouseUniqueName) }</ns1:LGORT>
                            </ns1:item>
                    }
                </ns1:PO_ITEMS>
                <ns1:PO_TEXT>
                    {
                        for $item in $purchaseOrderChangeExportRequest1//ns0:ERPOrder_ChangePurchOrdLineText_Item/ns0:item[1]/ns0:SAPOrderInfo/ns0:item
                        return
                            <ns1:item>
                                <ns1:EBELP>{ data($item/ns0:NumberOnPOString) }</ns1:EBELP>
                                <ns1:TDOBJECT>{ data($item/ns0:TextObject) }</ns1:TDOBJECT>
                                <ns1:TDID>{ data($item/ns0:TextID) }</ns1:TDID>
                                <ns1:STRINGNUM>{ xs:string( data($item/ns0:Index) ) }</ns1:STRINGNUM>
                                <ns1:STRING>{ data($item/ns0:POString) }</ns1:STRING>
                            </ns1:item>
                    }
                </ns1:PO_TEXT>
            </ns1:Z_ARIBA_BAPI_PO_CHANGE>
        </ns1:Z_ARIBA_BAPI_PO_CHANGE>
};

declare variable $in.body as xs:string external;
declare variable $purchaseOrderChangeExportRequest1 as document-node() := fn:parse-xml($in.body);

xf:PO_Change_Export_Transformation_Request($purchaseOrderChangeExportRequest1)