
package ariba.buyer.vsap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Name null, type ariba.receiving.core.Receipt, variant var1iam.
 * 
 * <p>Java class for Receipt_ReceiptTransferHeaderDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Receipt_ReceiptTransferHeaderDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ERPPONumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IAMSAPUniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreateDateString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IAMOrderMethodCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniqueName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApprovedDateString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Receipt_ReceiptTransferHeaderDetails", propOrder = {

})
public class ReceiptReceiptTransferHeaderDetails {

    @XmlElement(name = "ERPPONumber", required = true, nillable = true)
    protected String erppoNumber;
    @XmlElementRef(name = "Password", namespace = "urn:Ariba:Buyer:vsap", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "IAMSAPUniqueName", namespace = "urn:Ariba:Buyer:vsap", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iamsapUniqueName;
    @XmlElement(name = "CreateDateString", required = true, nillable = true)
    protected String createDateString;
    @XmlElementRef(name = "IAMOrderMethodCategory", namespace = "urn:Ariba:Buyer:vsap", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iamOrderMethodCategory;
    @XmlElement(name = "UniqueName", required = true, nillable = true)
    protected String uniqueName;
    @XmlElementRef(name = "Login", namespace = "urn:Ariba:Buyer:vsap", type = JAXBElement.class, required = false)
    protected JAXBElement<String> login;
    @XmlElement(name = "ApprovedDateString", required = true, nillable = true)
    protected String approvedDateString;

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
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
    }

    /**
     * Gets the value of the iamsapUniqueName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIAMSAPUniqueName() {
        return iamsapUniqueName;
    }

    /**
     * Sets the value of the iamsapUniqueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIAMSAPUniqueName(JAXBElement<String> value) {
        this.iamsapUniqueName = value;
    }

    /**
     * Gets the value of the createDateString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDateString() {
        return createDateString;
    }

    /**
     * Sets the value of the createDateString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDateString(String value) {
        this.createDateString = value;
    }

    /**
     * Gets the value of the iamOrderMethodCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIAMOrderMethodCategory() {
        return iamOrderMethodCategory;
    }

    /**
     * Sets the value of the iamOrderMethodCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIAMOrderMethodCategory(JAXBElement<String> value) {
        this.iamOrderMethodCategory = value;
    }

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

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLogin(JAXBElement<String> value) {
        this.login = value;
    }

    /**
     * Gets the value of the approvedDateString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedDateString() {
        return approvedDateString;
    }

    /**
     * Sets the value of the approvedDateString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedDateString(String value) {
        this.approvedDateString = value;
    }

}
