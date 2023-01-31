
package ariba.buyer.vsap;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Receipt_ReceiptTransferHeaderDetails_Item" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:Ariba:Buyer:vsap}Receipt_ReceiptTransferHeaderDetails" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Receipt_ReceiptTransferLineDetails_Item" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:Ariba:Buyer:vsap}Receipt_ReceiptTransferLineDetails" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attribute name="partition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="variant" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "WSReceiptTransferRequest")
public class WSReceiptTransferRequest {

    @XmlElement(name = "Receipt_ReceiptTransferHeaderDetails_Item")
    protected WSReceiptTransferRequest.ReceiptReceiptTransferHeaderDetailsItem receiptReceiptTransferHeaderDetailsItem;
    @XmlElement(name = "Receipt_ReceiptTransferLineDetails_Item")
    protected WSReceiptTransferRequest.ReceiptReceiptTransferLineDetailsItem receiptReceiptTransferLineDetailsItem;
    @XmlAttribute(name = "partition")
    protected String partition;
    @XmlAttribute(name = "variant")
    protected String variant;

    /**
     * Gets the value of the receiptReceiptTransferHeaderDetailsItem property.
     * 
     * @return
     *     possible object is
     *     {@link WSReceiptTransferRequest.ReceiptReceiptTransferHeaderDetailsItem }
     *     
     */
    public WSReceiptTransferRequest.ReceiptReceiptTransferHeaderDetailsItem getReceiptReceiptTransferHeaderDetailsItem() {
        return receiptReceiptTransferHeaderDetailsItem;
    }

    /**
     * Sets the value of the receiptReceiptTransferHeaderDetailsItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSReceiptTransferRequest.ReceiptReceiptTransferHeaderDetailsItem }
     *     
     */
    public void setReceiptReceiptTransferHeaderDetailsItem(WSReceiptTransferRequest.ReceiptReceiptTransferHeaderDetailsItem value) {
        this.receiptReceiptTransferHeaderDetailsItem = value;
    }

    /**
     * Gets the value of the receiptReceiptTransferLineDetailsItem property.
     * 
     * @return
     *     possible object is
     *     {@link WSReceiptTransferRequest.ReceiptReceiptTransferLineDetailsItem }
     *     
     */
    public WSReceiptTransferRequest.ReceiptReceiptTransferLineDetailsItem getReceiptReceiptTransferLineDetailsItem() {
        return receiptReceiptTransferLineDetailsItem;
    }

    /**
     * Sets the value of the receiptReceiptTransferLineDetailsItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSReceiptTransferRequest.ReceiptReceiptTransferLineDetailsItem }
     *     
     */
    public void setReceiptReceiptTransferLineDetailsItem(WSReceiptTransferRequest.ReceiptReceiptTransferLineDetailsItem value) {
        this.receiptReceiptTransferLineDetailsItem = value;
    }

    /**
     * Gets the value of the partition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartition() {
        return partition;
    }

    /**
     * Sets the value of the partition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartition(String value) {
        this.partition = value;
    }

    /**
     * Gets the value of the variant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @WebResult
    public String getVariant() {
        return variant;
    }

    /**
     * Sets the value of the variant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariant(String value) {
        this.variant = value;
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
     *       &lt;sequence>
     *         &lt;element name="item" type="{urn:Ariba:Buyer:vsap}Receipt_ReceiptTransferHeaderDetails" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class ReceiptReceiptTransferHeaderDetailsItem {

        protected List<ReceiptReceiptTransferHeaderDetails> item;

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
         * {@link ReceiptReceiptTransferHeaderDetails }
         * 
         * 
         */
        public List<ReceiptReceiptTransferHeaderDetails> getItem() {
            if (item == null) {
                item = new ArrayList<ReceiptReceiptTransferHeaderDetails>();
            }
            return this.item;
        }

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
     *       &lt;sequence>
     *         &lt;element name="item" type="{urn:Ariba:Buyer:vsap}Receipt_ReceiptTransferLineDetails" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class ReceiptReceiptTransferLineDetailsItem {

        protected List<ReceiptReceiptTransferLineDetails> item;

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
         * {@link ReceiptReceiptTransferLineDetails }
         * 
         * 
         */
        public List<ReceiptReceiptTransferLineDetails> getItem() {
            if (item == null) {
                item = new ArrayList<ReceiptReceiptTransferLineDetails>();
            }
            return this.item;
        }

    }

}
