xquery version "1.0";

declare namespace xf = "http://tempuri.org/IAMSAPReceiptTransferExport_V1/Transformations/Header/";

(: declare variable $in.headers.foo external; :)
declare variable $in.body  external; 


declare function xf:muis($body) {
     <mouad>{$body}</mouad>
};

xf:muis($in.body)