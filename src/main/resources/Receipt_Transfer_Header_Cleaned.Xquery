xquery version "1.0";

declare namespace xf = "http://tempuri.org/IAMSAPReceiptTransferExport_V1/Transformations/Header/";
declare variable $in.headers.foo external;

declare function xf:muis() as element() {
     <mouad>{$in.headers.foo}</mouad>
};

xf:muis()