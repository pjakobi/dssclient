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
import org.oasis_open.docs.dss_x.ns.base.AnyType;
import org.oasis_open.docs.dss_x.ns.saml2.rewritten.NameIDType;


/**
 * <p>Classe Java pour ClaimedIdentityType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ClaimedIdentityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://docs.oasis-open.org/dss-x/ns/saml2/rewritten}NameIDType"/>
 *         &lt;element name="SupportingInfo" type="{http://docs.oasis-open.org/dss-x/ns/base}AnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimedIdentityType", propOrder = {
    "name",
    "supportingInfo"
})
public class ClaimedIdentityType {

    @XmlElement(name = "Name", required = true)
    protected NameIDType name;
    @XmlElement(name = "SupportingInfo")
    protected AnyType supportingInfo;

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link NameIDType }
     *     
     */
    public NameIDType getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link NameIDType }
     *     
     */
    public void setName(NameIDType value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété supportingInfo.
     * 
     * @return
     *     possible object is
     *     {@link AnyType }
     *     
     */
    public AnyType getSupportingInfo() {
        return supportingInfo;
    }

    /**
     * Définit la valeur de la propriété supportingInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyType }
     *     
     */
    public void setSupportingInfo(AnyType value) {
        this.supportingInfo = value;
    }

}
