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
 * <p>Classe Java pour SigningTimeBoundariesType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SigningTimeBoundariesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LowerBoundary" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UpperBoundary" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SigningTimeBoundariesType", propOrder = {
    "lowerBoundary",
    "upperBoundary"
})
public class SigningTimeBoundariesType {

    @XmlElement(name = "LowerBoundary")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lowerBoundary;
    @XmlElement(name = "UpperBoundary")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar upperBoundary;

    /**
     * Obtient la valeur de la propriété lowerBoundary.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLowerBoundary() {
        return lowerBoundary;
    }

    /**
     * Définit la valeur de la propriété lowerBoundary.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLowerBoundary(XMLGregorianCalendar value) {
        this.lowerBoundary = value;
    }

    /**
     * Obtient la valeur de la propriété upperBoundary.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpperBoundary() {
        return upperBoundary;
    }

    /**
     * Définit la valeur de la propriété upperBoundary.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpperBoundary(XMLGregorianCalendar value) {
        this.upperBoundary = value;
    }

}
