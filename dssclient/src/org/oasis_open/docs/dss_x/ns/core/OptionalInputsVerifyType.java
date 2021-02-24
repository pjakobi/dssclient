//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.02.17 à 05:01:13 PM CET 
//


package org.oasis_open.docs.dss_x.ns.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour OptionalInputsVerifyType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OptionalInputsVerifyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/dss-x/ns/core}OptionalInputsBaseType">
 *       &lt;sequence>
 *         &lt;element name="UseVerificationTime" type="{http://docs.oasis-open.org/dss-x/ns/core}UseVerificationTimeType" minOccurs="0"/>
 *         &lt;element name="ReturnVerificationTimeInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AdditionalKeyInfo" type="{http://docs.oasis-open.org/dss-x/ns/core}AdditionalKeyInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReturnProcessingDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReturnSigningTimeInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReturnSignerIdentity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReturnAugmentedSignature" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ReturnTimestampedSignature" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VerifyManifests" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionalInputsVerifyType", propOrder = {
    "useVerificationTime",
    "returnVerificationTimeInfo",
    "additionalKeyInfo",
    "returnProcessingDetails",
    "returnSigningTimeInfo",
    "returnSignerIdentity",
    "returnAugmentedSignature",
    "returnTimestampedSignature",
    "verifyManifests"
})
public class OptionalInputsVerifyType
    extends OptionalInputsBaseType
{

    @XmlElement(name = "UseVerificationTime")
    protected UseVerificationTimeType useVerificationTime;
    @XmlElement(name = "ReturnVerificationTimeInfo", defaultValue = "false")
    protected Boolean returnVerificationTimeInfo;
    @XmlElement(name = "AdditionalKeyInfo")
    protected List<AdditionalKeyInfoType> additionalKeyInfo;
    @XmlElement(name = "ReturnProcessingDetails", defaultValue = "false")
    protected Boolean returnProcessingDetails;
    @XmlElement(name = "ReturnSigningTimeInfo", defaultValue = "false")
    protected Boolean returnSigningTimeInfo;
    @XmlElement(name = "ReturnSignerIdentity", defaultValue = "false")
    protected Boolean returnSignerIdentity;
    @XmlElement(name = "ReturnAugmentedSignature")
    @XmlSchemaType(name = "anyURI")
    protected String returnAugmentedSignature;
    @XmlElement(name = "ReturnTimestampedSignature")
    @XmlSchemaType(name = "anyURI")
    protected List<String> returnTimestampedSignature;
    @XmlElement(name = "VerifyManifests", defaultValue = "false")
    protected Boolean verifyManifests;

    /**
     * Obtient la valeur de la propriété useVerificationTime.
     * 
     * @return
     *     possible object is
     *     {@link UseVerificationTimeType }
     *     
     */
    public UseVerificationTimeType getUseVerificationTime() {
        return useVerificationTime;
    }

    /**
     * Définit la valeur de la propriété useVerificationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link UseVerificationTimeType }
     *     
     */
    public void setUseVerificationTime(UseVerificationTimeType value) {
        this.useVerificationTime = value;
    }

    /**
     * Obtient la valeur de la propriété returnVerificationTimeInfo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnVerificationTimeInfo() {
        return returnVerificationTimeInfo;
    }

    /**
     * Définit la valeur de la propriété returnVerificationTimeInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnVerificationTimeInfo(Boolean value) {
        this.returnVerificationTimeInfo = value;
    }

    /**
     * Gets the value of the additionalKeyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalKeyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalKeyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalKeyInfoType }
     * 
     * 
     */
    public List<AdditionalKeyInfoType> getAdditionalKeyInfo() {
        if (additionalKeyInfo == null) {
            additionalKeyInfo = new ArrayList<AdditionalKeyInfoType>();
        }
        return this.additionalKeyInfo;
    }

    /**
     * Obtient la valeur de la propriété returnProcessingDetails.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnProcessingDetails() {
        return returnProcessingDetails;
    }

    /**
     * Définit la valeur de la propriété returnProcessingDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnProcessingDetails(Boolean value) {
        this.returnProcessingDetails = value;
    }

    /**
     * Obtient la valeur de la propriété returnSigningTimeInfo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnSigningTimeInfo() {
        return returnSigningTimeInfo;
    }

    /**
     * Définit la valeur de la propriété returnSigningTimeInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnSigningTimeInfo(Boolean value) {
        this.returnSigningTimeInfo = value;
    }

    /**
     * Obtient la valeur de la propriété returnSignerIdentity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnSignerIdentity() {
        return returnSignerIdentity;
    }

    /**
     * Définit la valeur de la propriété returnSignerIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnSignerIdentity(Boolean value) {
        this.returnSignerIdentity = value;
    }

    /**
     * Obtient la valeur de la propriété returnAugmentedSignature.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnAugmentedSignature() {
        return returnAugmentedSignature;
    }

    /**
     * Définit la valeur de la propriété returnAugmentedSignature.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAugmentedSignature(String value) {
        this.returnAugmentedSignature = value;
    }

    /**
     * Gets the value of the returnTimestampedSignature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnTimestampedSignature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnTimestampedSignature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReturnTimestampedSignature() {
        if (returnTimestampedSignature == null) {
            returnTimestampedSignature = new ArrayList<String>();
        }
        return this.returnTimestampedSignature;
    }

    /**
     * Obtient la valeur de la propriété verifyManifests.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerifyManifests() {
        return verifyManifests;
    }

    /**
     * Définit la valeur de la propriété verifyManifests.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerifyManifests(Boolean value) {
        this.verifyManifests = value;
    }

}
