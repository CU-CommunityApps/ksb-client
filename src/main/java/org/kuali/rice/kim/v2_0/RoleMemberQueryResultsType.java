
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for RoleMemberQueryResultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoleMemberQueryResultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="results" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/kim/v2_0}roleMember" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="totalRowCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="moreResultsAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;any processContents='skip' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleMemberQueryResultsType", propOrder = {
    "results",
    "totalRowCount",
    "moreResultsAvailable",
    "any"
})
public class RoleMemberQueryResultsType {

    protected RoleMemberQueryResultsType.Results results;
    protected Integer totalRowCount;
    protected boolean moreResultsAvailable;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link RoleMemberQueryResultsType.Results }
     *     
     */
    public RoleMemberQueryResultsType.Results getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleMemberQueryResultsType.Results }
     *     
     */
    public void setResults(RoleMemberQueryResultsType.Results value) {
        this.results = value;
    }

    /**
     * Gets the value of the totalRowCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalRowCount() {
        return totalRowCount;
    }

    /**
     * Sets the value of the totalRowCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalRowCount(Integer value) {
        this.totalRowCount = value;
    }

    /**
     * Gets the value of the moreResultsAvailable property.
     * 
     */
    public boolean isMoreResultsAvailable() {
        return moreResultsAvailable;
    }

    /**
     * Sets the value of the moreResultsAvailable property.
     * 
     */
    public void setMoreResultsAvailable(boolean value) {
        this.moreResultsAvailable = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
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
     *         &lt;element ref="{http://rice.kuali.org/kim/v2_0}roleMember" maxOccurs="unbounded" minOccurs="0"/>
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
        "roleMember"
    })
    public static class Results {

        protected List<RoleMemberType> roleMember;

        /**
         * Gets the value of the roleMember property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roleMember property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoleMember().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoleMemberType }
         * 
         * 
         */
        public List<RoleMemberType> getRoleMember() {
            if (roleMember == null) {
                roleMember = new ArrayList<RoleMemberType>();
            }
            return this.roleMember;
        }

    }

}
