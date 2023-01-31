
package ariba.buyer.vsap;

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
 * <p>Java class for Receipt_ReceiptTransferResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Receipt_ReceiptTransferResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ReceiptItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="IAMSAPLiberateStockDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="IAMSAPBlockedStockDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NumberInCollection" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
@XmlType(name = "Receipt_ReceiptTransferResponse", propOrder = {

})
public class ReceiptReceiptTransferResponse {

    @XmlElement(name = "ReceiptItems")
    protected ReceiptReceiptTransferResponse.ReceiptItems receiptItems;
    @XmlElementRef(name = "UniqueName", namespace = "urn:Ariba:Buyer:vsap", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uniqueName;

    /**
     * Gets the value of the receiptItems property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptReceiptTransferResponse.ReceiptItems }
     *     
     */
    public ReceiptReceiptTransferResponse.ReceiptItems getReceiptItems() {
        return receiptItems;
    }

    /**
     * Sets the value of the receiptItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptReceiptTransferResponse.ReceiptItems }
     *     
     */
    public void setReceiptItems(ReceiptReceiptTransferResponse.ReceiptItems value) {
        this.receiptItems = value;
    }

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
     *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="IAMSAPLiberateStockDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="IAMSAPBlockedStockDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NumberInCollection" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
    public static class ReceiptItems {

        protected List<ReceiptReceiptTransferResponse.ReceiptItems.Item> item;

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
         * {@link ReceiptReceiptTransferResponse.ReceiptItems.Item }
         * 
         * 
         */
        public List<ReceiptReceiptTransferResponse.ReceiptItems.Item> getItem() {
            if (item == null) {
                item = new ArrayList<ReceiptReceiptTransferResponse.ReceiptItems.Item>();
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
         *         &lt;element name="IAMSAPLiberateStockDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="IAMSAPBlockedStockDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NumberInCollection" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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

            @XmlElementRef(name = "IAMSAPLiberateStockDocument", namespace = "urn:Ariba:Buyer:vsap", type = JAXBElement.class, required = false)
            protected JAXBElement<String> iamsapLiberateStockDocument;
            @XmlElementRef(name = "IAMSAPBlockedStockDocument", namespace = "urn:Ariba:Buyer:vsap", type = JAXBElement.class, required = false)
            protected JAXBElement<String> iamsapBlockedStockDocument;
            @XmlElementRef(name = "NumberInCollection", namespace = "urn:Ariba:Buyer:vsap", type = JAXBElement.class, required = false)
            protected JAXBElement<BigInteger> numberInCollection;

            /**
             * Gets the value of the iamsapLiberateStockDocument property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getIAMSAPLiberateStockDocument() {
                return iamsapLiberateStockDocument;
            }

            /**
             * Sets the value of the iamsapLiberateStockDocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setIAMSAPLiberateStockDocument(JAXBElement<String> value) {
                this.iamsapLiberateStockDocument = value;
            }

            /**
             * Gets the value of the iamsapBlockedStockDocument property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getIAMSAPBlockedStockDocument() {
                return iamsapBlockedStockDocument;
            }

            /**
             * Sets the value of the iamsapBlockedStockDocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setIAMSAPBlockedStockDocument(JAXBElement<String> value) {
                this.iamsapBlockedStockDocument = value;
            }

            /**
             * Gets the value of the numberInCollection property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
             *     
             */
            public JAXBElement<BigInteger> getNumberInCollection() {
                return numberInCollection;
            }

            /**
             * Sets the value of the numberInCollection property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
             *     
             */
            public void setNumberInCollection(JAXBElement<BigInteger> value) {
                this.numberInCollection = value;
            }

        }

    }

}
