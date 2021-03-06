
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getActionRequestsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getActionRequestsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionsTaken">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/kew/v2_0}actionTaken" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
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
@XmlType(name = "getActionRequestsResponse", propOrder = {
    "actionsTaken"
})
public class GetActionRequestsResponse {

    @XmlElement(required = true)
    protected GetActionRequestsResponse.ActionsTaken actionsTaken;

    /**
     * Gets the value of the actionsTaken property.
     * 
     * @return
     *     possible object is
     *     {@link GetActionRequestsResponse.ActionsTaken }
     *     
     */
    public GetActionRequestsResponse.ActionsTaken getActionsTaken() {
        return actionsTaken;
    }

    /**
     * Sets the value of the actionsTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetActionRequestsResponse.ActionsTaken }
     *     
     */
    public void setActionsTaken(GetActionRequestsResponse.ActionsTaken value) {
        this.actionsTaken = value;
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
     *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}actionTaken" maxOccurs="unbounded" minOccurs="0"/>
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
        "actionTaken"
    })
    public static class ActionsTaken {

        protected List<ActionTakenType> actionTaken;

        /**
         * Gets the value of the actionTaken property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actionTaken property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActionTaken().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActionTakenType }
         * 
         * 
         */
        public List<ActionTakenType> getActionTaken() {
            if (actionTaken == null) {
                actionTaken = new ArrayList<ActionTakenType>();
            }
            return this.actionTaken;
        }

    }

}
