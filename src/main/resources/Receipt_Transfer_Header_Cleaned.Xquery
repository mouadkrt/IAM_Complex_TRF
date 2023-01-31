xquery version "1.0";

declare namespace ns1 = "urn:schemas-iwaysoftware-com:iwse";
declare namespace ns0 = "urn:Ariba:Buyer:vsap";
declare namespace xf = "http://tempuri.org/IAMSAPReceiptTransferExport_V1/Transformations/Header/";

(: declare variable $in.headers.foo external; :)
(: declare variable $in.body as element(ns0:WSReceiptTransferRequest) external; :)
 declare variable $in.body as xs:string external; 
declare variable $in.headers.key1 as xs:string external; 


declare function xf:muis($body as xs:string)  {
    <all>
     <mouad>static text </mouad>
     <you>{$body}</you>
    </all>
};

xf:muis($in.body)