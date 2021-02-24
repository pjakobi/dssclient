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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour SigningTimeInfoType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SigningTimeInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SigningTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SigningTimeBoundaries" type="{http://docs.oasis-open.org/dss-x/ns/core}SigningTimeBoundariesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SigningTimeInfoType", propOrder = {
    "signingTime",
    "signingTimeBoundaries"
})
public class SigningTimeInfoType {

    @XmlElement(name = "SigningTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signingTime;
    @XmlElement(name = "SigningTimeBoundaries")
    protected SigningTimeBoundariesType signingTimeBoundaries;

    /**
     * Obtient la valeur de la propriété signingTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSigningTime() {
        return signingTime;
    }

    /**
     * Définit la valeur de la propriété signingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSigningTime(XMLGregorianCalendar value) {
        this.signingTime = value;
    }

    /**
     * Obtient la valeur de la propriété signingTimeBoundaries.
     * 
     * @return
     *     possible object is
     *     {@link SigningTimeBoundariesType }
     *     
     */
    public SigningTimeBoundariesType getSigningTimeBoundaries() {
        return signingTimeBoundaries;
    }

    /**
     * Définit la valeur de la propriété signingTimeBoundaries.
     * 
     * @param value
     *     allowed object is
     *     {@link SigningTimeBoundariesType }
     *     
     */
    public void setSigningTimeBoundaries(SigningTimeBoundariesType value) {
        this.signingTimeBoundaries = value;
    }

}
