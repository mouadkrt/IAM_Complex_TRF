xquery version "1.0";
(:: pragma bea:global-element-parameter parameter="$purchaseOrderExportRequest" element="ns1:PurchaseOrderExportRequest" location="../Wsdl/PurchaseOrderExport.wsdl" ::)
(:: pragma bea:global-element-return element="ns0:Z_ARIBA_BAPI_PO_CREATE" location="../Wsdl/PurchaseOrderExport_Adapter_WS_V1.0.wsdl" ::)

declare namespace ns1 = "urn:Ariba:Buyer:vsap";
declare namespace ns0 = "urn:iwaysoftware:ibse:jul2003:Z_ARIBA_BAPI_PO_CREATE";
declare namespace xf = "http://tempuri.org/PurchaseOrderExport_V1/Transformations/PO_Export_Transformation_Request/";

declare function xf:PO_Export_Transformation_Request($purchaseOrderExportRequest as document-node())
    as element(ns0:Z_ARIBA_BAPI_PO_CREATE) {
        <ns0:Z_ARIBA_BAPI_PO_CREATE>
            <ns0:Z_ARIBA_BAPI_PO_CREATE>
                <ns0:PARTITION>{ data($purchaseOrderExportRequest//@partition) }</ns0:PARTITION>
                <ns0:PO_HEADER>
                    <ns0:DOC_DATE>
                        {
                            fn:concat(fn:concat(fn:concat(fn:substring(data($purchaseOrderExportRequest//ns1:ERPOrder_PurchOrdHeaderDetails_Item/ns1:item[1]/ns1:CreationDateString),
                            1,4),"/"),
                            fn:concat(fn:substring(data($purchaseOrderExportRequest//ns1:ERPOrder_PurchOrdHeaderDetails_Item/ns1:item[1]/ns1:CreationDateString),
                            5,2),"/")),fn:substring(data($purchaseOrderExportRequest//ns1:ERPOrder_PurchOrdHeaderDetails_Item/ns1:item[1]/ns1:CreationDateString),
                            7,2))
                        }
</ns0:DOC_DATE>
                    <ns0:PURCH_ORG>{ data($purchaseOrderExportRequest//ns1:ERPOrder_PurchOrdHeaderDetails_Item/ns1:item[1]/ns1:PurchaseOrg/ns1:UniqueName) }</ns0:PURCH_ORG>
                    <ns0:PUR_GROUP>{ data($purchaseOrderExportRequest//ns1:ERPOrder_PurchOrdHeaderDetails_Item/ns1:item[1]/ns1:PurchaseGroup/ns1:UniqueName) }</ns0:PUR_GROUP>
                    <ns0:VENDOR>{ data($purchaseOrderExportRequest//ns1:ERPOrder_PurchOrdHeaderDetails_Item/ns1:item[1]/ns1:Supplier/ns1:UniqueName) }</ns0:VENDOR>
                    <ns0:PO_NUMBER>{ data($purchaseOrderExportRequest//ns1:ERPOrder_PurchOrdHeaderDetails_Item/ns1:item[1]/ns1:UniqueName) }</ns0:PO_NUMBER>
                    <ns0:ARIBA_DOC_TYPE>{ data($purchaseOrderExportRequest//ns1:ERPOrder_PurchOrdHeaderDetails_Item/ns1:item[1]/ns1:IAMOrderMethodCategory) }</ns0:ARIBA_DOC_TYPE>
                    <ns0:ERPORDERID>{ data($purchaseOrderExportRequest//ns1:ERPOrder_PurchOrdHeaderDetails_Item/ns1:item[1]/ns1:UniqueName) }</ns0:ERPORDERID>
                </ns0:PO_HEADER>
                <ns0:PO_HEADER_ADD_DATA>
                    <ns0:PMNTTRMS>{ data($purchaseOrderExportRequest//ns1:ERPOrder_PurchOrdHeaderDetails_Item/ns1:item[1]/ns1:PaymentTerms/ns1:UniqueName) }</ns0:PMNTTRMS>
                    <ns0:CURRENCY>{ data($purchaseOrderExportRequest//ns1:ERPOrder_PurchOrdHeaderDetails_Item/ns1:item[1]/ns1:Currency/ns1:UniqueName) }</ns0:CURRENCY>
                    <ns0:OUR_REF>
                        {
                            fn:substring(data($purchaseOrderExportRequest//ns1:ERPOrder_PurchOrdHeaderDetails_Item/ns1:item[1]/ns1:IAMSAPAdditionalReference),
                            1    ,
                            12)
                        }
</ns0:OUR_REF>
                </ns0:PO_HEADER_ADD_DATA>
                <ns0:VARIANT>{ data($purchaseOrderExportRequest//@variant) }</ns0:VARIANT>
                <ns0:PO_COND>
                    {
                        for $item in $purchaseOrderExportRequest//ns1:ERPOrder_PurchOrdLineDetails_Item/ns1:item[1]/ns1:LineItems/ns1:item[1]/ns1:IAMPriceConditions/ns1:item
                        return
                            <ns0:item>
                                <ns0:KSCHL>{ data($item/ns1:PriceConditionType/ns1:UniqueName) }</ns0:KSCHL>
                                <ns0:KBETR>{ (fn:round(fn:number($item/ns1:IamDiscountValue)*1000)) div 1000 }</ns0:KBETR>
                            </ns0:item>
                    }
                </ns0:PO_COND>
                <ns0:PO_ITEMS>
                    {
                        for $item in $purchaseOrderExportRequest//ns1:ERPOrder_PurchOrdLineDetails_Item/ns1:item[1]/ns1:LineItems/ns1:item
                        return
                            <ns0:item>
                                <ns0:PO_ITEM>{ data($item/ns1:NumberOnPOString) }</ns0:PO_ITEM>
                                <ns0:MATERIAL>{ data($item/ns1:ItemMasterID/ns1:BuyerPartNumber) }</ns0:MATERIAL>
                                <ns0:PUR_MAT>
                                    {
                                        if (data($purchaseOrderExportRequest//ns1:ERPOrder_PurchOrdHeaderDetails_Item/ns1:item[1]/ns1:IAMOrderMethodCategory) = "ZARD") then
                                            ("")
                                        else 
                                            data($item/ns1:Description/ns1:ItemNumber)
                                    }
</ns0:PUR_MAT>
                                <ns0:ITEM_CAT>
                                    {
                                        if (data($item/ns1:ItemCategory/ns1:UniqueName) = "M") then
                                            ("")
                                        else 
                                            data($item/ns1:ItemCategory/ns1:UniqueName)
                                    }
</ns0:ITEM_CAT>
                                <ns0:ACCTASSCAT>
                                    {
                                        if (data($item/ns1:AccountCategory/ns1:UniqueName) = "-") then
                                            ("")
                                        else 
                                            data($item/ns1:AccountCategory/ns1:UniqueName)
                                    }
</ns0:ACCTASSCAT>
                                <ns0:STORE_LOC>{ data($item/ns1:ShipTo/ns1:IAMWarehouseUniqueName) }</ns0:STORE_LOC>
                                <ns0:MAT_GRP>{ data($item/ns1:CommodityCode/ns1:UniqueName) }</ns0:MAT_GRP>
                                <ns0:SHORT_TEXT>
                                    {
                                        fn:replace(fn:substring(data($item/ns1:Description/ns1:Description),1,40),
                                        "\\r\\n"," ")
                                    }
</ns0:SHORT_TEXT>
                                <ns0:DISTRIB>{ data($item/ns1:SAPDistributionFlag) }</ns0:DISTRIB>
                                <ns0:PART_INV>{ data($item/ns1:SAPPartialInvoiceFlag) }</ns0:PART_INV>
                                <ns0:PLANT>{ data($item/ns1:ShipTo/ns1:IAMPlantUniqueName) }</ns0:PLANT>
                                <ns0:UNIT>{ data($item/ns1:Description/ns1:UnitOfMeasure/ns1:UniqueName) }</ns0:UNIT>
                                <ns0:NET_PRICE>{ data($item/ns1:Description/ns1:Price/ns1:Amount) }</ns0:NET_PRICE>
                                <ns0:PRICE_UNIT>1</ns0:PRICE_UNIT>
                                <ns0:REQ_ID>{ data($item/ns1:RequisitionNumber) }</ns0:REQ_ID>
                                <ns0:ITEMONREQ>{ data($item/ns1:ItemOnReq) }</ns0:ITEMONREQ>
                            </ns0:item>
                    }
                </ns0:PO_ITEMS>
                <ns0:PO_ITEM_ACCOUNT_ASSIGNMENT>
                    {
                        for $item in $purchaseOrderExportRequest//ns1:ERPOrder_PurchOrdAcctDetails_Item/ns1:item[1]/ns1:LineItems/ns1:item
                        return
                            <ns0:item>
                                <ns0:PO_ITEM>{ data($item/ns1:Accountings/ns1:SplitAccountings/ns1:item[1]/ns1:POLineNumber) }</ns0:PO_ITEM>
                                <ns0:SERIAL_NO>{ xs:string( data($item/ns1:Accountings/ns1:SplitAccountings/ns1:item[1]/ns1:NumberInCollection) ) }</ns0:SERIAL_NO>
                                <ns0:QUANTITY>
                                    {
                                        if (data($item/ns1:ReceivingType) = 3) then
                                            (data($item/ns1:Accountings/ns1:SplitAccountings/ns1:item[1]/ns1:Amount/ns1:Amount))
                                        else 
                                            data($item/ns1:Accountings/ns1:SplitAccountings/ns1:item[1]/ns1:Quantity)
                                    }
</ns0:QUANTITY>
                                <ns0:DISTR_PERC>
                                    {
                                        if (data($item/ns1:Accountings/ns1:SplitAccountings/ns1:item[1]/ns1:Percentage) = 100) then
                                            (0.0)
                                        else 
                                            data($item/ns1:Accountings/ns1:SplitAccountings/ns1:item[1]/ns1:Percentage)
                                    }
</ns0:DISTR_PERC>
                                <ns0:G_L_ACCT>{ data($item/ns1:Accountings/ns1:SplitAccountings/ns1:item[1]/ns1:GeneralLedger/ns1:UniqueName) }</ns0:G_L_ACCT>
                                <ns0:COST_CTR>{ data($item/ns1:Accountings/ns1:SplitAccountings/ns1:item[1]/ns1:CostCenter/ns1:UniqueName) }</ns0:COST_CTR>
                                <ns0:ASSET_NO>{ data($item/ns1:Accountings/ns1:SplitAccountings/ns1:item[1]/ns1:Asset/ns1:UniqueName) }</ns0:ASSET_NO>
                                <ns0:SUB_NUMBER>{ data($item/ns1:Accountings/ns1:SplitAccountings/ns1:item[1]/ns1:Asset/ns1:SubNumber) }</ns0:SUB_NUMBER>
                                <ns0:ORDER_NO>{ data($item/ns1:Accountings/ns1:SplitAccountings/ns1:item[1]/ns1:InternalOrder/ns1:UniqueName) }</ns0:ORDER_NO>
                                <ns0:WBS_ELEM_E>{ data($item/ns1:Accountings/ns1:SplitAccountings/ns1:item[1]/ns1:WBSElement/ns1:UniqueName) }</ns0:WBS_ELEM_E>
                            </ns0:item>
                    }
                </ns0:PO_ITEM_ACCOUNT_ASSIGNMENT>
                <ns0:PO_ITEM_ADD_DATA>
                    {
                        for $item in $purchaseOrderExportRequest//ns1:ERPOrder_PurchOrdLineAddDetails_Item/ns1:item[1]/ns1:LineItems/ns1:item
                        return
                            <ns0:item>
                                <ns0:OVERDELTOL>{ data($item/ns1:OverTolerance) }</ns0:OVERDELTOL>
                                <ns0:UNDER_TOL>{ data($item/ns1:UnderTolerance) }</ns0:UNDER_TOL>
                                <ns0:PO_ITEM>{ data($item/ns1:NumberOnPOString) }</ns0:PO_ITEM>
                            </ns0:item>
                    }
                </ns0:PO_ITEM_ADD_DATA>
                <ns0:PO_ITEM_SCHEDULES>
                    {
                        for $item in $purchaseOrderExportRequest//ns1:ERPOrder_PurchOrdScheduleDetails_Item/ns1:item[1]/ns1:LineItems/ns1:item
                        return
                            <ns0:item>
                                <ns0:PO_ITEM>{ data($item/ns1:NumberOnPOString) }</ns0:PO_ITEM>
                                <ns0:DELIV_DATE>{ fn:concat(fn:concat(fn:concat(fn:substring(data($item/ns1:NeedByDateString),1,4),"/"),fn:concat(fn:substring(data($item/ns1:NeedByDateString),5,2),"/")),fn:substring(data($item/ns1:NeedByDateString),7,2)) }</ns0:DELIV_DATE>
                                <ns0:QUANTITY>
                                    {
                                        if (xs:decimal(data($purchaseOrderExportRequest//ns1:ERPOrder_PurchOrdAcctDetails_Item/ns1:item[1]/ns1:LineItems/ns1:item[1]/ns1:ReceivingType)) = 3) then
                                            (data($purchaseOrderExportRequest//ns1:ERPOrder_PurchOrdScheduleDetails_Item/ns1:item[1]/ns1:LineItems/ns1:item[1]/ns1:Description/ns1:Price/ns1:Amount)*data($purchaseOrderExportRequest//ns1:ERPOrder_PurchOrdScheduleDetails_Item/ns1:item[1]/ns1:LineItems/ns1:item[1]/ns1:Quantity))
                                        else 
                                            data($item/ns1:Quantity)
                                    }
</ns0:QUANTITY>
                                <ns0:PREQ_ITEM>{ xs:string( data($item/ns1:OriginatingSystemLineNumber) ) }</ns0:PREQ_ITEM>
                            </ns0:item>
                    }
                </ns0:PO_ITEM_SCHEDULES>
                <ns0:PO_ITEM_TEXT>
                    {
                        for $item in $purchaseOrderExportRequest//ns1:ERPOrder_PurchOrdLineText_Item/ns1:item[1]/ns1:SAPOrderInfo/ns1:item
                        return
                            <ns0:item>
                                <ns0:PO_NUMBER>{ xs:string( data($item/ns1:Index) ) }</ns0:PO_NUMBER>
                                <ns0:PO_ITEM>{ data($item/ns1:NumberOnPOString) }</ns0:PO_ITEM>
                                <ns0:TEXT_ID>{ data($item/ns1:TextID) }</ns0:TEXT_ID>
                                <ns0:TEXT_FORM>{ data($item/ns1:TextObject) }</ns0:TEXT_FORM>
                                <ns0:TEXT_LINE>{ data($item/ns1:POString) }</ns0:TEXT_LINE>
                            </ns0:item>
                    }
                </ns0:PO_ITEM_TEXT>
                <ns0:PO_ZZIMMOS>
                    {
                        for $item in $purchaseOrderExportRequest//ns1:ERPOrder_PurchOrdLineDetails_Item/ns1:item[1]/ns1:LineItems/ns1:item
                        return
                            <ns0:item>
                                <ns0:EBELP>{ data($item/ns1:NumberOnPOString) }</ns0:EBELP>
                                <ns0:UMSON>
                                    {
                                        if (data($item/ns1:IAMItemsGrat) = "G") then
                                            ("")
                                        else 
                                            "X"
                                    }
</ns0:UMSON>
                                <ns0:PRIXNUL>{ xs:string( data($item/ns1:Description/ns1:Price/ns1:Amount) ) }</ns0:PRIXNUL>
                                <ns0:ZZIMMOS>
                                    {
                                        if (data($item/ns1:AccountCategory/ns1:UniqueName) = "A") then
                                            if (data($item/ns1:IAMAssetInfo) = "-") then
                                                ("")
                                            else 
                                                data($item/ns1:IAMAssetInfo)
                                        else 
                                            ""
                                    }
</ns0:ZZIMMOS>
                            </ns0:item>
                    }
                </ns0:PO_ZZIMMOS>
            </ns0:Z_ARIBA_BAPI_PO_CREATE>
        </ns0:Z_ARIBA_BAPI_PO_CREATE>
};

declare variable $in.body as xs:string external;
declare variable $purchaseOrderExportRequest as document-node() := fn:parse-xml($in.body);

xf:PO_Export_Transformation_Request($purchaseOrderExportRequest)