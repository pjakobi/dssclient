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
 * <p>Classe Java pour OptionalInputsSignType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OptionalInputsSignType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/dss-x/ns/core}OptionalInputsBaseType">
 *       &lt;sequence>
 *         &lt;element name="SignatureType" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="IntendedAudience" type="{http://docs.oasis-open.org/dss-x/ns/core}IntendedAudienceType" minOccurs="0"/>
 *         &lt;element name="KeySelector" type="{http://docs.oasis-open.org/dss-x/ns/core}KeySelectorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Properties" type="{http://docs.oasis-open.org/dss-x/ns/core}PropertiesHolderType" minOccurs="0"/>
 *         &lt;element name="IncludeObject" type="{http://docs.oasis-open.org/dss-x/ns/core}IncludeObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IncludeEContent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SignaturePlacement" type="{http://docs.oasis-open.org/dss-x/ns/core}SignaturePlacementType" minOccurs="0"/>
 *         &lt;element name="SignedReferences" type="{http://docs.oasis-open.org/dss-x/ns/core}SignedReferencesType" minOccurs="0"/>
 *         &lt;element name="SignatureAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignatureQualityLevel" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionalInputsSignType", propOrder = {
    "signatureType",
    "intendedAudience",
    "keySelector",
    "properties",
    "includeObject",
    "includeEContent",
    "signaturePlacement",
    "signedReferences",
    "signatureAlgorithm",
    "signatureQualityLevel"
})
public class OptionalInputsSignType
    extends OptionalInputsBaseType
{

    @XmlElement(name = "SignatureType")
    @XmlSchemaType(name = "anyURI")
    protected String signatureType;
    @XmlElement(name = "IntendedAudience")
    protected IntendedAudienceType intendedAudience;
    @XmlElement(name = "KeySelector")
    protected List<KeySelectorType> keySelector;
    @XmlElement(name = "Properties")
    protected PropertiesHolderType properties;
    @XmlElement(name = "IncludeObject")
    protected List<IncludeObjectType> includeObject;
    @XmlElement(name = "IncludeEContent", defaultValue = "false")
    protected Boolean includeEContent;
    @XmlElement(name = "SignaturePlacement")
    protected SignaturePlacementType signaturePlacement;
    @XmlElement(name = "SignedReferences")
    protected SignedReferencesType signedReferences;
    @XmlElement(name = "SignatureAlgorithm")
    protected String signatureAlgorithm;
    @XmlElement(name = "SignatureQualityLevel")
    @XmlSchemaType(name = "anyURI")
    protected String signatureQualityLevel;

    /**
     * Obtient la valeur de la propriété signatureType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureType() {
        return signatureType;
    }

    /**
     * Définit la valeur de la propriété signatureType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureType(String value) {
        this.signatureType = value;
    }

    /**
     * Obtient la valeur de la propriété intendedAudience.
     * 
     * @return
     *     possible object is
     *     {@link IntendedAudienceType }
     *     
     */
    public IntendedAudienceType getIntendedAudience() {
        return intendedAudience;
    }

    /**
     * Définit la valeur de la propriété intendedAudience.
     * 
     * @param value
     *     allowed object is
     *     {@link IntendedAudienceType }
     *     
     */
    public void setIntendedAudience(IntendedAudienceType value) {
        this.intendedAudience = value;
    }

    /**
     * Gets the value of the keySelector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keySelector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeySelector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeySelectorType }
     * 
     * 
     */
    public List<KeySelectorType> getKeySelector() {
        if (keySelector == null) {
            keySelector = new ArrayList<KeySelectorType>();
        }
        return this.keySelector;
    }

    /**
     * Obtient la valeur de la propriété properties.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesHolderType }
     *     
     */
    public PropertiesHolderType getProperties() {
        return properties;
    }

    /**
     * Définit la valeur de la propriété properties.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesHolderType }
     *     
     */
    public void setProperties(PropertiesHolderType value) {
        this.properties = value;
    }

    /**
     * Gets the value of the includeObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includeObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludeObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncludeObjectType }
     * 
     * 
     */
    public List<IncludeObjectType> getIncludeObject() {
        if (includeObject == null) {
            includeObject = new ArrayList<IncludeObjectType>();
        }
        return this.includeObject;
    }

    /**
     * Obtient la valeur de la propriété includeEContent.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeEContent() {
        return includeEContent;
    }

    /**
     * Définit la valeur de la propriété includeEContent.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeEContent(Boolean value) {
        this.includeEContent = value;
    }

    /**
     * Obtient la valeur de la propriété signaturePlacement.
     * 
     * @return
     *     possible object is
     *     {@link SignaturePlacementType }
     *     
     */
    public SignaturePlacementType getSignaturePlacement() {
        return signaturePlacement;
    }

    /**
     * Définit la valeur de la propriété signaturePlacement.
     * 
     * @param value
     *     allowed object is
     *     {@link SignaturePlacementType }
     *     
     */
    public void setSignaturePlacement(SignaturePlacementType value) {
        this.signaturePlacement = value;
    }

    /**
     * Obtient la valeur de la propriété signedReferences.
     * 
     * @return
     *     possible object is
     *     {@link SignedReferencesType }
     *     
     */
    public SignedReferencesType getSignedReferences() {
        return signedReferences;
    }

    /**
     * Définit la valeur de la propriété signedReferences.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedReferencesType }
     *     
     */
    public void setSignedReferences(SignedReferencesType value) {
        this.signedReferences = value;
    }

    /**
     * Obtient la valeur de la propriété signatureAlgorithm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    /**
     * Définit la valeur de la propriété signatureAlgorithm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureAlgorithm(String value) {
        this.signatureAlgorithm = value;
    }

    /**
     * Obtient la valeur de la propriété signatureQualityLevel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureQualityLevel() {
        return signatureQualityLevel;
    }

    /**
     * Définit la valeur de la propriété signatureQualityLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureQualityLevel(String value) {
        this.signatureQualityLevel = value;
    }

}
