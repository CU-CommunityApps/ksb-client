
package org.kuali.rice.core.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getComponentByCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getComponentByCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="namespaceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="componentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getComponentByCode", propOrder = {
    "namespaceCode",
    "componentCode"
})
public class GetComponentByCode {

    protected String namespaceCode;
    protected String componentCode;

    /**
     * Gets the value of the namespaceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespaceCode() {
        return namespaceCode;
    }

    /**
     * Sets the value of the namespaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespaceCode(String value) {
        this.namespaceCode = value;
    }

    /**
     * Gets the value of the componentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentCode() {
        return componentCode;
    }

    /**
     * Sets the value of the componentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentCode(String value) {
        this.componentCode = value;
    }

}
