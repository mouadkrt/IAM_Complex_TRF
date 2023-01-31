
package ariba.buyer.vsap;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Name null, type ariba.receiving.core.Receipt, variant var1iam.
 * 
 * <p>Java class for Receipt_ReceiptTransferLineDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Receipt_ReceiptTransferLineDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ReceiptItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="itemmuis" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="ERPPONumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ERPPOLineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="UnitOfMeasure" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="UniqueName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="LineItem" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="IAMFinalDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="ReceivingType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="IAMStructuredRejectReason" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="UniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ReceiptId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="IAMSAPMaterialDocumentReference" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="ValuationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="MaterialDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="MaterialDocumentYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="DocumentItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="NumberRejected" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="IAMSerialNumbersToReject" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="NumberInCollection" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="IAMNumberAQualif" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="NumberAccepted" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="AmountAccepted" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Receipt_ReceiptTransferLineDetails", propOrder = {

})
public class ReceiptReceiptTransferLineDetails {

    @XmlElement(name = "ReceiptItems")
    protected ReceiptReceiptTransferLineDetails.ReceiptItems receiptItems;

    /**
     * Gets the value of the receiptItems property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptReceiptTransferLineDetails.ReceiptItems }
     *     
     */
    public ReceiptReceiptTransferLineDetails.ReceiptItems getReceiptItems() {
        return receiptItems;
    }

    /**
     * Sets the value of the receiptItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptReceiptTransferLineDetails.ReceiptItems }
     *     
     */
    public void setReceiptItems(ReceiptReceiptTransferLineDetails.ReceiptItems value) {
        this.receiptItems = value;
    }


    /**
     * Class name ariba.receiving.core.ReceiptItem, group name Reference, variant var1iam.
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="itemmuis" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="ERPPONumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ERPPOLineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="UnitOfMeasure" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="UniqueName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="LineItem" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="IAMFinalDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="ReceivingType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="IAMStructuredRejectReason" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="UniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ReceiptId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="IAMSAPMaterialDocumentReference" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="ValuationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="MaterialDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="MaterialDocumentYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="DocumentItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="NumberRejected" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="IAMSerialNumbersToReject" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="NumberInCollection" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="IAMNumberAQualif" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="NumberAccepted" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="AmountAccepted" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "itemmuis"
    })
    public static class ReceiptItems {

        protected List<ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis> itemmuis;

        /**
         * Gets the value of the itemmuis property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemmuis property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemmuis().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis }
         * 
         * 
         */
        public List<ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis> getItemmuis() {
            if (itemmuis == null) {
                itemmuis = new ArrayList<ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis>();
            }
            return this.itemmuis;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="ERPPONumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ERPPOLineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="UnitOfMeasure" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="UniqueName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="LineItem" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="IAMFinalDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="ReceivingType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="IAMStructuredRejectReason" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="UniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ReceiptId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="IAMSAPMaterialDocumentReference" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="ValuationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="MaterialDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="MaterialDocumentYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="DocumentItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="NumberRejected" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="IAMSerialNumbersToReject" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="NumberInCollection" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="IAMNumberAQualif" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="NumberAccepted" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="AmountAccepted" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Itemmuis {

            @XmlElement(name = "ERPPONumber", required = true, nillable = true)
            protected String erppoNumber;
            @XmlElement(name = "ERPPOLineNumber", required = true, nillable = true)
            protected String erppoLineNumber;
            @XmlElement(name = "UnitOfMeasure")
            protected ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.UnitOfMeasure unitOfMeasure;
            @XmlElement(name = "LineItem")
            protected ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.LineItem lineItem;
            @XmlElement(name = "IAMStructuredRejectReason")
            protected ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMStructuredRejectReason iamStructuredRejectReason;
            @XmlElement(name = "ReceiptId", required = true, nillable = true)
            protected String receiptId;
            @XmlElement(name = "IAMSAPMaterialDocumentReference")
            protected ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSAPMaterialDocumentReference iamsapMaterialDocumentReference;
            @XmlElementRef(name = "NumberRejected", namespace = "urn:Ariba:Buyer:vsap", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> numberRejected;
            @XmlElement(name = "IAMSerialNumbersToReject")
            protected ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSerialNumbersToReject iamSerialNumbersToReject;
            @XmlElement(name = "NumberInCollection", required = true, nillable = true)
            protected BigInteger numberInCollection;
            @XmlElement(name = "IAMNumberAQualif", required = true, nillable = true)
            protected BigDecimal iamNumberAQualif;
            @XmlElement(name = "NumberAccepted", required = true, nillable = true)
            protected BigDecimal numberAccepted;
            @XmlElement(name = "AmountAccepted")
            protected ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.AmountAccepted amountAccepted;

            /**
             * Gets the value of the erppoNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getERPPONumber() {
                return erppoNumber;
            }

            /**
             * Sets the value of the erppoNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setERPPONumber(String value) {
                this.erppoNumber = value;
            }

            /**
             * Gets the value of the erppoLineNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getERPPOLineNumber() {
                return erppoLineNumber;
            }

            /**
             * Sets the value of the erppoLineNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setERPPOLineNumber(String value) {
                this.erppoLineNumber = value;
            }

            /**
             * Gets the value of the unitOfMeasure property.
             * 
             * @return
             *     possible object is
             *     {@link ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.UnitOfMeasure }
             *     
             */
            public ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.UnitOfMeasure getUnitOfMeasure() {
                return unitOfMeasure;
            }

            /**
             * Sets the value of the unitOfMeasure property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.UnitOfMeasure }
             *     
             */
            public void setUnitOfMeasure(ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.UnitOfMeasure value) {
                this.unitOfMeasure = value;
            }

            /**
             * Gets the value of the lineItem property.
             * 
             * @return
             *     possible object is
             *     {@link ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.LineItem }
             *     
             */
            public ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.LineItem getLineItem() {
                return lineItem;
            }

            /**
             * Sets the value of the lineItem property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.LineItem }
             *     
             */
            public void setLineItem(ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.LineItem value) {
                this.lineItem = value;
            }

            /**
             * Gets the value of the iamStructuredRejectReason property.
             * 
             * @return
             *     possible object is
             *     {@link ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMStructuredRejectReason }
             *     
             */
            public ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMStructuredRejectReason getIAMStructuredRejectReason() {
                return iamStructuredRejectReason;
            }

            /**
             * Sets the value of the iamStructuredRejectReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMStructuredRejectReason }
             *     
             */
            public void setIAMStructuredRejectReason(ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMStructuredRejectReason value) {
                this.iamStructuredRejectReason = value;
            }

            /**
             * Gets the value of the receiptId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReceiptId() {
                return receiptId;
            }

            /**
             * Sets the value of the receiptId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReceiptId(String value) {
                this.receiptId = value;
            }

            /**
             * Gets the value of the iamsapMaterialDocumentReference property.
             * 
             * @return
             *     possible object is
             *     {@link ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSAPMaterialDocumentReference }
             *     
             */
            public ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSAPMaterialDocumentReference getIAMSAPMaterialDocumentReference() {
                return iamsapMaterialDocumentReference;
            }

            /**
             * Sets the value of the iamsapMaterialDocumentReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSAPMaterialDocumentReference }
             *     
             */
            public void setIAMSAPMaterialDocumentReference(ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSAPMaterialDocumentReference value) {
                this.iamsapMaterialDocumentReference = value;
            }

            /**
             * Gets the value of the numberRejected property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *     
             */
            public JAXBElement<BigDecimal> getNumberRejected() {
                return numberRejected;
            }

            /**
             * Sets the value of the numberRejected property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *     
             */
            public void setNumberRejected(JAXBElement<BigDecimal> value) {
                this.numberRejected = value;
            }

            /**
             * Gets the value of the iamSerialNumbersToReject property.
             * 
             * @return
             *     possible object is
             *     {@link ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSerialNumbersToReject }
             *     
             */
            public ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSerialNumbersToReject getIAMSerialNumbersToReject() {
                return iamSerialNumbersToReject;
            }

            /**
             * Sets the value of the iamSerialNumbersToReject property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSerialNumbersToReject }
             *     
             */
            public void setIAMSerialNumbersToReject(ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSerialNumbersToReject value) {
                this.iamSerialNumbersToReject = value;
            }

            /**
             * Gets the value of the numberInCollection property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNumberInCollection() {
                return numberInCollection;
            }

            /**
             * Sets the value of the numberInCollection property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNumberInCollection(BigInteger value) {
                this.numberInCollection = value;
            }

            /**
             * Gets the value of the iamNumberAQualif property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getIAMNumberAQualif() {
                return iamNumberAQualif;
            }

            /**
             * Sets the value of the iamNumberAQualif property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setIAMNumberAQualif(BigDecimal value) {
                this.iamNumberAQualif = value;
            }

            /**
             * Gets the value of the numberAccepted property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNumberAccepted() {
                return numberAccepted;
            }

            /**
             * Sets the value of the numberAccepted property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNumberAccepted(BigDecimal value) {
                this.numberAccepted = value;
            }

            /**
             * Gets the value of the amountAccepted property.
             * 
             * @return
             *     possible object is
             *     {@link ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.AmountAccepted }
             *     
             */
            public ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.AmountAccepted getAmountAccepted() {
                return amountAccepted;
            }

            /**
             * Sets the value of the amountAccepted property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.AmountAccepted }
             *     
             */
            public void setAmountAccepted(ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.AmountAccepted value) {
                this.amountAccepted = value;
            }


            /**
             * Class name ariba.basic.core.Money, group name Reference, variant var1iam.
             * 
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;all>
             *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class AmountAccepted {

                @XmlElement(name = "Amount", required = true, nillable = true)
                protected BigDecimal amount;

                /**
                 * Gets the value of the amount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAmount() {
                    return amount;
                }

                /**
                 * Sets the value of the amount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAmount(BigDecimal value) {
                    this.amount = value;
                }

            }


            /**
             * Class name iam.sap.IAMSAPReceipt, group name Reference, variant var1iam.
             * 
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;all>
             *         &lt;element name="ValuationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="MaterialDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="MaterialDocumentYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="DocumentItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class IAMSAPMaterialDocumentReference {

                @XmlElementRef(name = "ValuationType", namespace = "urn:Ariba:Buyer:vsap", type = JAXBElement.class, required = false)
                protected JAXBElement<String> valuationType;
                @XmlElementRef(name = "MaterialDocument", namespace = "urn:Ariba:Buyer:vsap", type = JAXBElement.class, required = false)
                protected JAXBElement<String> materialDocument;
                @XmlElementRef(name = "MaterialDocumentYear", namespace = "urn:Ariba:Buyer:vsap", type = JAXBElement.class, required = false)
                protected JAXBElement<String> materialDocumentYear;
                @XmlElementRef(name = "DocumentItemNumber", namespace = "urn:Ariba:Buyer:vsap", type = JAXBElement.class, required = false)
                protected JAXBElement<String> documentItemNumber;

                /**
                 * Gets the value of the valuationType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getValuationType() {
                    return valuationType;
                }

                /**
                 * Sets the value of the valuationType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setValuationType(JAXBElement<String> value) {
                    this.valuationType = value;
                }

                /**
                 * Gets the value of the materialDocument property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getMaterialDocument() {
                    return materialDocument;
                }

                /**
                 * Sets the value of the materialDocument property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setMaterialDocument(JAXBElement<String> value) {
                    this.materialDocument = value;
                }

                /**
                 * Gets the value of the materialDocumentYear property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getMaterialDocumentYear() {
                    return materialDocumentYear;
                }

                /**
                 * Sets the value of the materialDocumentYear property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setMaterialDocumentYear(JAXBElement<String> value) {
                    this.materialDocumentYear = value;
                }

                /**
                 * Gets the value of the documentItemNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getDocumentItemNumber() {
                    return documentItemNumber;
                }

                /**
                 * Sets the value of the documentItemNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setDocumentItemNumber(JAXBElement<String> value) {
                    this.documentItemNumber = value;
                }

            }


            /**
             * Class name iam.IAMSerialNumber, group name Reference, variant var1iam.
             * 
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/all>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "item"
            })
            public static class IAMSerialNumbersToReject {

                protected List<ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSerialNumbersToReject.Item> item;

                /**
                 * Gets the value of the item property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the item property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getItem().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSerialNumbersToReject.Item }
                 * 
                 * 
                 */
                public List<ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSerialNumbersToReject.Item> getItem() {
                    if (item == null) {
                        item = new ArrayList<ReceiptReceiptTransferLineDetails.ReceiptItems.Itemmuis.IAMSerialNumbersToReject.Item>();
                    }
                    return this.item;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;all>
                 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/all>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class Item {

                    @XmlElementRef(name = "SerialNumber", namespace = "urn:Ariba:Buyer:vsap", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> serialNumber;

                    /**
                     * Gets the value of the serialNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getSerialNumber() {
                        return serialNumber;
                    }

                    /**
                     * Sets the value of the serialNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setSerialNumber(JAXBElement<String> value) {
                        this.serialNumber = value;
                    }

                }

            }


            /**
             * Class name iam.sap.IAMSAPReceiptRejectReason, group name Reference, variant var1iam.
             * 
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;all>
             *         &lt;element name="UniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class IAMStructuredRejectReason {

                @XmlElementRef(name = "UniqueName", namespace = "urn:Ariba:Buyer:vsap", type = JAXBElement.class, required = false)
                protected JAXBElement<String> uniqueName;

                /**
                 * Gets the value of the uniqueName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getUniqueName() {
                    return uniqueName;
                }

                /**
                 * Sets the value of the uniqueName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setUniqueName(JAXBElement<String> value) {
                    this.uniqueName = value;
                }

            }


            /**
             * Class name ariba.receiving.core.ReceivableLineItem, group name Reference, variant var1iam.
             * 
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;all>
             *         &lt;element name="IAMFinalDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *         &lt;element name="ReceivingType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class LineItem {

                @XmlElementRef(name = "IAMFinalDelivery", namespace = "urn:Ariba:Buyer:vsap", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> iamFinalDelivery;
                @XmlElement(name = "ReceivingType", required = true, nillable = true)
                protected BigInteger receivingType;

                /**
                 * Gets the value of the iamFinalDelivery property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getIAMFinalDelivery() {
                    return iamFinalDelivery;
                }

                /**
                 * Sets the value of the iamFinalDelivery property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setIAMFinalDelivery(JAXBElement<Boolean> value) {
                    this.iamFinalDelivery = value;
                }

                /**
                 * Gets the value of the receivingType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getReceivingType() {
                    return receivingType;
                }

                /**
                 * Sets the value of the receivingType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setReceivingType(BigInteger value) {
                    this.receivingType = value;
                }

            }


            /**
             * Class name ariba.basic.core.UnitOfMeasure, group name Reference, variant var1iam.
             * 
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;all>
             *         &lt;element name="UniqueName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class UnitOfMeasure {

                @XmlElement(name = "UniqueName", required = true, nillable = true)
                protected String uniqueName;

                /**
                 * Gets the value of the uniqueName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUniqueName() {
                    return uniqueName;
                }

                /**
                 * Sets the value of the uniqueName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUniqueName(String value) {
                    this.uniqueName = value;
                }

            }

        }

    }

}
