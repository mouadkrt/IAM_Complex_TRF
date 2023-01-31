
package ariba.buyer.vsap;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Receipt_ReceiptTransferResponse_Item" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:Ariba:Buyer:vsap}Receipt_ReceiptTransferResponse" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReceiptError_ReceiptTransferErrorImport_Item" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:Ariba:Buyer:vsap}ReceiptError_ReceiptTransferErrorImport" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlRootElement(name = "WSReceiptTransferReply")
public class WSReceiptTransferReply {

    @XmlElement(name = "Receipt_ReceiptTransferResponse_Item")
    protected WSReceiptTransferReply.ReceiptReceiptTransferResponseItem receiptReceiptTransferResponseItem;
    @XmlElement(name = "ReceiptError_ReceiptTransferErrorImport_Item")
    protected WSReceiptTransferReply.ReceiptErrorReceiptTransferErrorImportItem receiptErrorReceiptTransferErrorImportItem;
    @XmlAttribute(name = "partition")
    protected String partition;
    @XmlAttribute(name = "variant")
    protected String variant;

    /**
     * Gets the value of the receiptReceiptTransferResponseItem property.
     * 
     * @return
     *     possible object is
     *     {@link WSReceiptTransferReply.ReceiptReceiptTransferResponseItem }
     *     
     */
    public WSReceiptTransferReply.ReceiptReceiptTransferResponseItem getReceiptReceiptTransferResponseItem() {
        return receiptReceiptTransferResponseItem;
    }

    /**
     * Sets the value of the receiptReceiptTransferResponseItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSReceiptTransferReply.ReceiptReceiptTransferResponseItem }
     *     
     */
    public void setReceiptReceiptTransferResponseItem(WSReceiptTransferReply.ReceiptReceiptTransferResponseItem value) {
        this.receiptReceiptTransferResponseItem = value;
    }

    /**
     * Gets the value of the receiptErrorReceiptTransferErrorImportItem property.
     * 
     * @return
     *     possible object is
     *     {@link WSReceiptTransferReply.ReceiptErrorReceiptTransferErrorImportItem }
     *     
     */
    public WSReceiptTransferReply.ReceiptErrorReceiptTransferErrorImportItem getReceiptErrorReceiptTransferErrorImportItem() {
        return receiptErrorReceiptTransferErrorImportItem;
    }

    /**
     * Sets the value of the receiptErrorReceiptTransferErrorImportItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSReceiptTransferReply.ReceiptErrorReceiptTransferErrorImportItem }
     *     
     */
    public void setReceiptErrorReceiptTransferErrorImportItem(WSReceiptTransferReply.ReceiptErrorReceiptTransferErrorImportItem value) {
        this.receiptErrorReceiptTransferErrorImportItem = value;
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
     *         &lt;element name="item" type="{urn:Ariba:Buyer:vsap}ReceiptError_ReceiptTransferErrorImport" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class ReceiptErrorReceiptTransferErrorImportItem {

        protected List<ReceiptErrorReceiptTransferErrorImport> item;

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
         * {@link ReceiptErrorReceiptTransferErrorImport }
         * 
         * 
         */
        public List<ReceiptErrorReceiptTransferErrorImport> getItem() {
            if (item == null) {
                item = new ArrayList<ReceiptErrorReceiptTransferErrorImport>();
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
     *         &lt;element name="item" type="{urn:Ariba:Buyer:vsap}Receipt_ReceiptTransferResponse" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class ReceiptReceiptTransferResponseItem {

        protected List<ReceiptReceiptTransferResponse> item;

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
         * {@link ReceiptReceiptTransferResponse }
         * 
         * 
         */
        public List<ReceiptReceiptTransferResponse> getItem() {
            if (item == null) {
                item = new ArrayList<ReceiptReceiptTransferResponse>();
            }
            return this.item;
        }

    }

}
