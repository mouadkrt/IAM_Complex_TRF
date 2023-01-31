
package ariba.buyer.vsap;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ariba.buyer.vsap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReceiptReceiptTransferLineDetailsReceiptItemsItemmuisIAMSAPMaterialDocumentReferenceMaterialDocument_QNAME = new QName("urn:Ariba:Buyer:vsap", "MaterialDocument");
    private final static QName _ReceiptReceiptTransferLineDetailsReceiptItemsItemmuisIAMSAPMaterialDocumentReferenceMaterialDocumentYear_QNAME = new QName("urn:Ariba:Buyer:vsap", "MaterialDocumentYear");
    private final static QName _ReceiptReceiptTransferLineDetailsReceiptItemsItemmuisIAMSAPMaterialDocumentReferenceValuationType_QNAME = new QName("urn:Ariba:Buyer:vsap", "ValuationType");
    private final static QName _ReceiptReceiptTransferLineDetailsReceiptItemsItemmuisIAMSAPMaterialDocumentReferenceDocumentItemNumber_QNAME = new QName("urn:Ariba:Buyer:vsap", "DocumentItemNumber");
    private final static QName _ReceiptReceiptTransferResponseReceiptItemsItemNumberInCollection_QNAME = new QName("urn:Ariba:Buyer:vsap", "NumberInCollection");
    private final static QName _ReceiptReceiptTransferResponseReceiptItemsItemIAMSAPLiberateStockDocument_QNAME = new QName("urn:Ariba:Buyer:vsap", "IAMSAPLiberateStockDocument");
    private final static QName _ReceiptReceiptTransferResponseReceiptItemsItemIAMSAPBlockedStockDocument_QNAME = new QName("urn:Ariba:Buyer:vsap", "IAMSAPBlockedStockDocument");
    private final static QName _ReceiptReceiptTransferResponseUniqueName_QNAME = new QName("urn:Ariba:Buyer:vsap", "UniqueName");
    private final static QName _ReceiptReceiptTransferLineDetailsReceiptItemsItemmuisIAMSerialNumbersToRejectItemSerialNumber_QNAME = new QName("urn:Ariba:Buyer:vsap", "SerialNumber");
    private final static QName _ReceiptReceiptTransferLineDetailsReceiptItemsItemmuisLineItemIAMFinalDelivery_QNAME = new QName("urn:Ariba:Buyer:vsap", "IAMFinalDelivery");
    private final static QName _ReceiptReceiptTransferHeaderDetailsIAMOrderMethodCategory_QNAME = new QName("urn:Ariba:Buyer:vsap", "IAMOrderMethodCategory");
    private final static QName _ReceiptReceiptTransferHeaderDetailsPassword_QNAME = new QName("urn:Ariba:Buyer:vsap", "Password");
    private final static QName _ReceiptReceiptTransferHeaderDetailsIAMSAPUniqueName_QNAME = new QName("urn:Ariba:Buyer:vsap", "IAMSAPUniqueName");
    private final static QName _ReceiptReceiptTransferHeaderDetailsLogin_QNAME = new QName("urn:Ariba:Buyer:vsap", "Login");
    private final static QName _ReceiptReceiptTransferLineDetailsReceiptItemsItemmuisNumberRejected_QNAME = new QName("urn:Ariba:Buyer:vsap", "NumberRejected");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ariba.buyer.vsap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WSReceiptTransferReply }
     * 
     */
    public WSReceiptTransferReply createWSReceiptTransferReply() {
        return new WSReceiptTransferReply();
    }

    /**
     * Create an instance of {@link WSReceiptTransferRequest }
     * 
     */
    public WSReceiptTransferRequest createWSReceiptTransferRequest() {
        return new WSReceiptTransferRequest();
    }

    /**
     * Create an instance of {@link ReceiptReceiptTransferResponse }
     * 
     */
    public ReceiptReceiptTransferResponse createReceiptReceiptTransferResponse() {
        return new ReceiptReceiptTransferResponse();
    }

    /**
     * Create an instance of {@link ReceiptReceiptTransferResponse.ReceiptItems }
     * 
     */
    public ReceiptReceiptTransferResponse.ReceiptItems createReceiptReceiptTransferResponseReceiptItems() {
        return new ReceiptReceiptTransferResponse.ReceiptItems();
    }

    /**
     * Create an instance of {@link ReceiptReceiptTransferLineDetails }
     * 
     */
    public ReceiptReceiptTransferLineDetails createReceiptReceiptTransferLineDetails() {
        return new ReceiptReceiptTransferLineDetails();
    }

    /**
     * Create an instance of {@link ReceiptReceiptTransferLineDetails.ReceiptItems }
     * 
     */
    public ReceiptReceiptTransferLineDetails.ReceiptItems createReceiptReceiptTransferLineDetailsReceiptItems() {
        return new ReceiptReceiptTransferLineDetails.ReceiptItems();
    }

    /**
     * Create an instance of {@link ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis }
     * 
     */
    public ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis createReceiptReceiptTransferLineDetailsReceiptItemsItemmuis() {
        return new ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis();
    }

    /**
     * Create an instance of {@link ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSerialNumbersToReject }
     * 
     */
    public ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSerialNumbersToReject createReceiptReceiptTransferLineDetailsReceiptItemsItemmuisIAMSerialNumbersToReject() {
        return new ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSerialNumbersToReject();
    }

    /**
     * Create an instance of {@link WSReceiptTransferReply.ReceiptReceiptTransferResponseItem }
     * 
     */
    public WSReceiptTransferReply.ReceiptReceiptTransferResponseItem createWSReceiptTransferReplyReceiptReceiptTransferResponseItem() {
        return new WSReceiptTransferReply.ReceiptReceiptTransferResponseItem();
    }

    /**
     * Create an instance of {@link WSReceiptTransferReply.ReceiptErrorReceiptTransferErrorImportItem }
     * 
     */
    public WSReceiptTransferReply.ReceiptErrorReceiptTransferErrorImportItem createWSReceiptTransferReplyReceiptErrorReceiptTransferErrorImportItem() {
        return new WSReceiptTransferReply.ReceiptErrorReceiptTransferErrorImportItem();
    }

    /**
     * Create an instance of {@link Headers }
     * 
     */
    public Headers createHeaders() {
        return new Headers();
    }

    /**
     * Create an instance of {@link WSReceiptTransferRequest.ReceiptReceiptTransferHeaderDetailsItem }
     * 
     */
    public WSReceiptTransferRequest.ReceiptReceiptTransferHeaderDetailsItem createWSReceiptTransferRequestReceiptReceiptTransferHeaderDetailsItem() {
        return new WSReceiptTransferRequest.ReceiptReceiptTransferHeaderDetailsItem();
    }

    /**
     * Create an instance of {@link WSReceiptTransferRequest.ReceiptReceiptTransferLineDetailsItem }
     * 
     */
    public WSReceiptTransferRequest.ReceiptReceiptTransferLineDetailsItem createWSReceiptTransferRequestReceiptReceiptTransferLineDetailsItem() {
        return new WSReceiptTransferRequest.ReceiptReceiptTransferLineDetailsItem();
    }

    /**
     * Create an instance of {@link ReceiptReceiptTransferHeaderDetails }
     * 
     */
    public ReceiptReceiptTransferHeaderDetails createReceiptReceiptTransferHeaderDetails() {
        return new ReceiptReceiptTransferHeaderDetails();
    }

    /**
     * Create an instance of {@link ReceiptErrorReceiptTransferErrorImport }
     * 
     */
    public ReceiptErrorReceiptTransferErrorImport createReceiptErrorReceiptTransferErrorImport() {
        return new ReceiptErrorReceiptTransferErrorImport();
    }

    /**
     * Create an instance of {@link ReceiptReceiptTransferResponse.ReceiptItems.Item }
     * 
     */
    public ReceiptReceiptTransferResponse.ReceiptItems.Item createReceiptReceiptTransferResponseReceiptItemsItem() {
        return new ReceiptReceiptTransferResponse.ReceiptItems.Item();
    }

    /**
     * Create an instance of {@link ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.UnitOfMeasure }
     * 
     */
    public ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.UnitOfMeasure createReceiptReceiptTransferLineDetailsReceiptItemsItemmuisUnitOfMeasure() {
        return new ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.UnitOfMeasure();
    }

    /**
     * Create an instance of {@link ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.LineItem }
     * 
     */
    public ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.LineItem createReceiptReceiptTransferLineDetailsReceiptItemsItemmuisLineItem() {
        return new ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.LineItem();
    }

    /**
     * Create an instance of {@link ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMStructuredRejectReason }
     * 
     */
    public ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMStructuredRejectReason createReceiptReceiptTransferLineDetailsReceiptItemsItemmuisIAMStructuredRejectReason() {
        return new ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMStructuredRejectReason();
    }

    /**
     * Create an instance of {@link ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSAPMaterialDocumentReference }
     * 
     */
    public ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSAPMaterialDocumentReference createReceiptReceiptTransferLineDetailsReceiptItemsItemmuisIAMSAPMaterialDocumentReference() {
        return new ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSAPMaterialDocumentReference();
    }

    /**
     * Create an instance of {@link ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.AmountAccepted }
     * 
     */
    public ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.AmountAccepted createReceiptReceiptTransferLineDetailsReceiptItemsItemmuisAmountAccepted() {
        return new ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.AmountAccepted();
    }

    /**
     * Create an instance of {@link ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSerialNumbersToReject.Item }
     * 
     */
    public ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSerialNumbersToReject.Item createReceiptReceiptTransferLineDetailsReceiptItemsItemmuisIAMSerialNumbersToRejectItem() {
        return new ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSerialNumbersToReject.Item();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vsap", name = "MaterialDocument", scope = ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSAPMaterialDocumentReference.class)
    public JAXBElement<String> createReceiptReceiptTransferLineDetailsReceiptItemsItemmuisIAMSAPMaterialDocumentReferenceMaterialDocument(String value) {
        return new JAXBElement<String>(_ReceiptReceiptTransferLineDetailsReceiptItemsItemmuisIAMSAPMaterialDocumentReferenceMaterialDocument_QNAME, String.class, ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSAPMaterialDocumentReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vsap", name = "MaterialDocumentYear", scope = ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSAPMaterialDocumentReference.class)
    public JAXBElement<String> createReceiptReceiptTransferLineDetailsReceiptItemsItemmuisIAMSAPMaterialDocumentReferenceMaterialDocumentYear(String value) {
        return new JAXBElement<String>(_ReceiptReceiptTransferLineDetailsReceiptItemsItemmuisIAMSAPMaterialDocumentReferenceMaterialDocumentYear_QNAME, String.class, ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSAPMaterialDocumentReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vsap", name = "ValuationType", scope = ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSAPMaterialDocumentReference.class)
    public JAXBElement<String> createReceiptReceiptTransferLineDetailsReceiptItemsItemmuisIAMSAPMaterialDocumentReferenceValuationType(String value) {
        return new JAXBElement<String>(_ReceiptReceiptTransferLineDetailsReceiptItemsItemmuisIAMSAPMaterialDocumentReferenceValuationType_QNAME, String.class, ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSAPMaterialDocumentReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vsap", name = "DocumentItemNumber", scope = ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSAPMaterialDocumentReference.class)
    public JAXBElement<String> createReceiptReceiptTransferLineDetailsReceiptItemsItemmuisIAMSAPMaterialDocumentReferenceDocumentItemNumber(String value) {
        return new JAXBElement<String>(_ReceiptReceiptTransferLineDetailsReceiptItemsItemmuisIAMSAPMaterialDocumentReferenceDocumentItemNumber_QNAME, String.class, ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSAPMaterialDocumentReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vsap", name = "NumberInCollection", scope = ReceiptReceiptTransferResponse.ReceiptItems.Item.class)
    public JAXBElement<BigInteger> createReceiptReceiptTransferResponseReceiptItemsItemNumberInCollection(BigInteger value) {
        return new JAXBElement<BigInteger>(_ReceiptReceiptTransferResponseReceiptItemsItemNumberInCollection_QNAME, BigInteger.class, ReceiptReceiptTransferResponse.ReceiptItems.Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vsap", name = "IAMSAPLiberateStockDocument", scope = ReceiptReceiptTransferResponse.ReceiptItems.Item.class)
    public JAXBElement<String> createReceiptReceiptTransferResponseReceiptItemsItemIAMSAPLiberateStockDocument(String value) {
        return new JAXBElement<String>(_ReceiptReceiptTransferResponseReceiptItemsItemIAMSAPLiberateStockDocument_QNAME, String.class, ReceiptReceiptTransferResponse.ReceiptItems.Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vsap", name = "IAMSAPBlockedStockDocument", scope = ReceiptReceiptTransferResponse.ReceiptItems.Item.class)
    public JAXBElement<String> createReceiptReceiptTransferResponseReceiptItemsItemIAMSAPBlockedStockDocument(String value) {
        return new JAXBElement<String>(_ReceiptReceiptTransferResponseReceiptItemsItemIAMSAPBlockedStockDocument_QNAME, String.class, ReceiptReceiptTransferResponse.ReceiptItems.Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vsap", name = "UniqueName", scope = ReceiptReceiptTransferResponse.class)
    public JAXBElement<String> createReceiptReceiptTransferResponseUniqueName(String value) {
        return new JAXBElement<String>(_ReceiptReceiptTransferResponseUniqueName_QNAME, String.class, ReceiptReceiptTransferResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vsap", name = "SerialNumber", scope = ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSerialNumbersToReject.Item.class)
    public JAXBElement<String> createReceiptReceiptTransferLineDetailsReceiptItemsItemmuisIAMSerialNumbersToRejectItemSerialNumber(String value) {
        return new JAXBElement<String>(_ReceiptReceiptTransferLineDetailsReceiptItemsItemmuisIAMSerialNumbersToRejectItemSerialNumber_QNAME, String.class, ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSerialNumbersToReject.Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vsap", name = "IAMFinalDelivery", scope = ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.LineItem.class)
    public JAXBElement<Boolean> createReceiptReceiptTransferLineDetailsReceiptItemsItemmuisLineItemIAMFinalDelivery(Boolean value) {
        return new JAXBElement<Boolean>(_ReceiptReceiptTransferLineDetailsReceiptItemsItemmuisLineItemIAMFinalDelivery_QNAME, Boolean.class, ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.LineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vsap", name = "IAMOrderMethodCategory", scope = ReceiptReceiptTransferHeaderDetails.class)
    public JAXBElement<String> createReceiptReceiptTransferHeaderDetailsIAMOrderMethodCategory(String value) {
        return new JAXBElement<String>(_ReceiptReceiptTransferHeaderDetailsIAMOrderMethodCategory_QNAME, String.class, ReceiptReceiptTransferHeaderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vsap", name = "Password", scope = ReceiptReceiptTransferHeaderDetails.class)
    public JAXBElement<String> createReceiptReceiptTransferHeaderDetailsPassword(String value) {
        return new JAXBElement<String>(_ReceiptReceiptTransferHeaderDetailsPassword_QNAME, String.class, ReceiptReceiptTransferHeaderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vsap", name = "IAMSAPUniqueName", scope = ReceiptReceiptTransferHeaderDetails.class)
    public JAXBElement<String> createReceiptReceiptTransferHeaderDetailsIAMSAPUniqueName(String value) {
        return new JAXBElement<String>(_ReceiptReceiptTransferHeaderDetailsIAMSAPUniqueName_QNAME, String.class, ReceiptReceiptTransferHeaderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vsap", name = "Login", scope = ReceiptReceiptTransferHeaderDetails.class)
    public JAXBElement<String> createReceiptReceiptTransferHeaderDetailsLogin(String value) {
        return new JAXBElement<String>(_ReceiptReceiptTransferHeaderDetailsLogin_QNAME, String.class, ReceiptReceiptTransferHeaderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vsap", name = "NumberRejected", scope = ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.class)
    public JAXBElement<BigDecimal> createReceiptReceiptTransferLineDetailsReceiptItemsItemmuisNumberRejected(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ReceiptReceiptTransferLineDetailsReceiptItemsItemmuisNumberRejected_QNAME, BigDecimal.class, ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Ariba:Buyer:vsap", name = "UniqueName", scope = ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMStructuredRejectReason.class)
    public JAXBElement<String> createReceiptReceiptTransferLineDetailsReceiptItemsItemmuisIAMStructuredRejectReasonUniqueName(String value) {
        return new JAXBElement<String>(_ReceiptReceiptTransferResponseUniqueName_QNAME, String.class, ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMStructuredRejectReason.class, value);
    }

}
