
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDelegateTypeByRoleIdAndDelegateTypeCodeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDelegateTypeByRoleIdAndDelegateTypeCodeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://rice.kuali.org/kim/v2_0}delegateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDelegateTypeByRoleIdAndDelegateTypeCodeResponse", propOrder = {
    "delegateType"
})
public class GetDelegateTypeByRoleIdAndDelegateTypeCodeResponse {

    protected DelegateTypeType delegateType;

    /**
     * Gets the value of the delegateType property.
     * 
     * @return
     *     possible object is
     *     {@link DelegateTypeType }
     *     
     */
    public DelegateTypeType getDelegateType() {
        return delegateType;
    }

    /**
     * Sets the value of the delegateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelegateTypeType }
     *     
     */
    public void setDelegateType(DelegateTypeType value) {
        this.delegateType = value;
    }

}
