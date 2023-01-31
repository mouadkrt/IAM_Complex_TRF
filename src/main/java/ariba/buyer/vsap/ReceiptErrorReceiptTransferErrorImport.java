
package ariba.buyer.vsap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Name null, type ariba.integration.core.ReceiptError, variant var1iam.
 * 
 * <p>Java class for ReceiptError_ReceiptTransferErrorImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiptError_ReceiptTransferErrorImport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrorNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrorSAPModule" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrorClient" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ErrorSAPField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumInSet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrorSAPScreen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrorSAPId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrorSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiptError_ReceiptTransferErrorImport", propOrder = {

})
public class ReceiptErrorReceiptTransferErrorImport {

    @XmlElement(name = "Type", required = true, nillable = true)
    protected String type;
    @XmlElement(name = "ErrorNumber", required = true, nillable = true)
    protected String errorNumber;
    @XmlElement(name = "ErrorMessage", required = true, nillable = true)
    protected String errorMessage;
    @XmlElement(name = "ErrorSAPModule", required = true, nillable = true)
    protected String errorSAPModule;
    @XmlElement(name = "ErrorClient", required = true, nillable = true)
    protected String errorClient;
    @XmlElement(name = "Date", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "ErrorSAPField", required = true, nillable = true)
    protected String errorSAPField;
    @XmlElement(name = "NumInSet", required = true, nillable = true)
    protected String numInSet;
    @XmlElement(name = "ErrorSAPScreen", required = true, nillable = true)
    protected String errorSAPScreen;
    @XmlElement(name = "ErrorSAPId", required = true, nillable = true)
    protected String errorSAPId;
    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElement(name = "ErrorSystem", required = true, nillable = true)
    protected String errorSystem;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the errorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorNumber() {
        return errorNumber;
    }

    /**
     * Sets the value of the errorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorNumber(String value) {
        this.errorNumber = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the errorSAPModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSAPModule() {
        return errorSAPModule;
    }

    /**
     * Sets the value of the errorSAPModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSAPModule(String value) {
        this.errorSAPModule = value;
    }

    /**
     * Gets the value of the errorClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorClient() {
        return errorClient;
    }

    /**
     * Sets the value of the errorClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorClient(String value) {
        this.errorClient = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the errorSAPField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSAPField() {
        return errorSAPField;
    }

    /**
     * Sets the value of the errorSAPField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSAPField(String value) {
        this.errorSAPField = value;
    }

    /**
     * Gets the value of the numInSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumInSet() {
        return numInSet;
    }

    /**
     * Sets the value of the numInSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumInSet(String value) {
        this.numInSet = value;
    }

    /**
     * Gets the value of the errorSAPScreen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSAPScreen() {
        return errorSAPScreen;
    }

    /**
     * Sets the value of the errorSAPScreen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSAPScreen(String value) {
        this.errorSAPScreen = value;
    }

    /**
     * Gets the value of the errorSAPId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSAPId() {
        return errorSAPId;
    }

    /**
     * Sets the value of the errorSAPId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSAPId(String value) {
        this.errorSAPId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the errorSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSystem() {
        return errorSystem;
    }

    /**
     * Sets the value of the errorSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSystem(String value) {
        this.errorSystem = value;
    }

}
