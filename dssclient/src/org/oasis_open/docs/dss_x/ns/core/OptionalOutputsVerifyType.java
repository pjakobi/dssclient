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
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.dss_x.ns.saml2.rewritten.NameIDType;


/**
 * <p>Classe Java pour OptionalOutputsVerifyType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OptionalOutputsVerifyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/dss-x/ns/core}OptionalOutputsBaseType">
 *       &lt;sequence>
 *         &lt;element name="VerifyManifestResults" type="{http://docs.oasis-open.org/dss-x/ns/core}VerifyManifestResultsType" minOccurs="0"/>
 *         &lt;element name="SigningTimeInfo" type="{http://docs.oasis-open.org/dss-x/ns/core}SigningTimeInfoType" minOccurs="0"/>
 *         &lt;element name="VerificationTimeInfo" type="{http://docs.oasis-open.org/dss-x/ns/core}VerificationTimeInfoType" minOccurs="0"/>
 *         &lt;element name="ProcessingDetails" type="{http://docs.oasis-open.org/dss-x/ns/core}ProcessingDetailsType" minOccurs="0"/>
 *         &lt;element name="SignerIdentity" type="{http://docs.oasis-open.org/dss-x/ns/saml2/rewritten}NameIDType" minOccurs="0"/>
 *         &lt;element name="AugmentedSignature" type="{http://docs.oasis-open.org/dss-x/ns/core}AugmentedSignatureType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TimestampedSignature" type="{http://docs.oasis-open.org/dss-x/ns/core}AugmentedSignatureType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionalOutputsVerifyType", propOrder = {
    "verifyManifestResults",
    "signingTimeInfo",
    "verificationTimeInfo",
    "processingDetails",
    "signerIdentity",
    "augmentedSignature",
    "timestampedSignature"
})
public class OptionalOutputsVerifyType
    extends OptionalOutputsBaseType
{

    @XmlElement(name = "VerifyManifestResults")
    protected VerifyManifestResultsType verifyManifestResults;
    @XmlElement(name = "SigningTimeInfo")
    protected SigningTimeInfoType signingTimeInfo;
    @XmlElement(name = "VerificationTimeInfo")
    protected VerificationTimeInfoType verificationTimeInfo;
    @XmlElement(name = "ProcessingDetails")
    protected ProcessingDetailsType processingDetails;
    @XmlElement(name = "SignerIdentity")
    protected NameIDType signerIdentity;
    @XmlElement(name = "AugmentedSignature")
    protected List<AugmentedSignatureType> augmentedSignature;
    @XmlElement(name = "TimestampedSignature")
    protected List<AugmentedSignatureType> timestampedSignature;

    /**
     * Obtient la valeur de la propriété verifyManifestResults.
     * 
     * @return
     *     possible object is
     *     {@link VerifyManifestResultsType }
     *     
     */
    public VerifyManifestResultsType getVerifyManifestResults() {
        return verifyManifestResults;
    }

    /**
     * Définit la valeur de la propriété verifyManifestResults.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifyManifestResultsType }
     *     
     */
    public void setVerifyManifestResults(VerifyManifestResultsType value) {
        this.verifyManifestResults = value;
    }

    /**
     * Obtient la valeur de la propriété signingTimeInfo.
     * 
     * @return
     *     possible object is
     *     {@link SigningTimeInfoType }
     *     
     */
    public SigningTimeInfoType getSigningTimeInfo() {
        return signingTimeInfo;
    }

    /**
     * Définit la valeur de la propriété signingTimeInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link SigningTimeInfoType }
     *     
     */
    public void setSigningTimeInfo(SigningTimeInfoType value) {
        this.signingTimeInfo = value;
    }

    /**
     * Obtient la valeur de la propriété verificationTimeInfo.
     * 
     * @return
     *     possible object is
     *     {@link VerificationTimeInfoType }
     *     
     */
    public VerificationTimeInfoType getVerificationTimeInfo() {
        return verificationTimeInfo;
    }

    /**
     * Définit la valeur de la propriété verificationTimeInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationTimeInfoType }
     *     
     */
    public void setVerificationTimeInfo(VerificationTimeInfoType value) {
        this.verificationTimeInfo = value;
    }

    /**
     * Obtient la valeur de la propriété processingDetails.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingDetailsType }
     *     
     */
    public ProcessingDetailsType getProcessingDetails() {
        return processingDetails;
    }

    /**
     * Définit la valeur de la propriété processingDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingDetailsType }
     *     
     */
    public void setProcessingDetails(ProcessingDetailsType value) {
        this.processingDetails = value;
    }

    /**
     * Obtient la valeur de la propriété signerIdentity.
     * 
     * @return
     *     possible object is
     *     {@link NameIDType }
     *     
     */
    public NameIDType getSignerIdentity() {
        return signerIdentity;
    }

    /**
     * Définit la valeur de la propriété signerIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link NameIDType }
     *     
     */
    public void setSignerIdentity(NameIDType value) {
        this.signerIdentity = value;
    }

    /**
     * Gets the value of the augmentedSignature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the augmentedSignature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAugmentedSignature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AugmentedSignatureType }
     * 
     * 
     */
    public List<AugmentedSignatureType> getAugmentedSignature() {
        if (augmentedSignature == null) {
            augmentedSignature = new ArrayList<AugmentedSignatureType>();
        }
        return this.augmentedSignature;
    }

    /**
     * Gets the value of the timestampedSignature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timestampedSignature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimestampedSignature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AugmentedSignatureType }
     * 
     * 
     */
    public List<AugmentedSignatureType> getTimestampedSignature() {
        if (timestampedSignature == null) {
            timestampedSignature = new ArrayList<AugmentedSignatureType>();
        }
        return this.timestampedSignature;
    }

}
