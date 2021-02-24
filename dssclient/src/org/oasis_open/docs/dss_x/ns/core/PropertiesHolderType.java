//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.02.17 à 05:01:13 PM CET 
//


package org.oasis_open.docs.dss_x.ns.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PropertiesHolderType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PropertiesHolderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignedProperties" type="{http://docs.oasis-open.org/dss-x/ns/core}PropertiesType" minOccurs="0"/>
 *         &lt;element name="UnsignedProperties" type="{http://docs.oasis-open.org/dss-x/ns/core}PropertiesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertiesHolderType", propOrder = {
    "signedProperties",
    "unsignedProperties"
})
public class PropertiesHolderType {

    @XmlElement(name = "SignedProperties")
    protected PropertiesType signedProperties;
    @XmlElement(name = "UnsignedProperties")
    protected PropertiesType unsignedProperties;

    /**
     * Obtient la valeur de la propriété signedProperties.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesType }
     *     
     */
    public PropertiesType getSignedProperties() {
        return signedProperties;
    }

    /**
     * Définit la valeur de la propriété signedProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesType }
     *     
     */
    public void setSignedProperties(PropertiesType value) {
        this.signedProperties = value;
    }

    /**
     * Obtient la valeur de la propriété unsignedProperties.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesType }
     *     
     */
    public PropertiesType getUnsignedProperties() {
        return unsignedProperties;
    }

    /**
     * Définit la valeur de la propriété unsignedProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesType }
     *     
     */
    public void setUnsignedProperties(PropertiesType value) {
        this.unsignedProperties = value;
    }

}
