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
import org.oasis_open.docs.dss_x.ns.base.RequestBaseType;


/**
 * <p>Classe Java pour PendingRequestType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PendingRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/dss-x/ns/base}RequestBaseType">
 *       &lt;sequence>
 *         &lt;element name="ClaimedIdentity" type="{http://docs.oasis-open.org/dss-x/ns/core}ClaimedIdentityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingRequestType", propOrder = {
    "claimedIdentity"
})
public class PendingRequestType
    extends RequestBaseType
{

    @XmlElement(name = "ClaimedIdentity")
    protected ClaimedIdentityType claimedIdentity;

    /**
     * Obtient la valeur de la propriété claimedIdentity.
     * 
     * @return
     *     possible object is
     *     {@link ClaimedIdentityType }
     *     
     */
    public ClaimedIdentityType getClaimedIdentity() {
        return claimedIdentity;
    }

    /**
     * Définit la valeur de la propriété claimedIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimedIdentityType }
     *     
     */
    public void setClaimedIdentity(ClaimedIdentityType value) {
        this.claimedIdentity = value;
    }

}
