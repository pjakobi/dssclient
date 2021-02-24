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
 * <p>Classe Java pour UseVerificationTimeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="UseVerificationTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="CurrentTime" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SpecificTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Base64Content" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UseVerificationTimeType", propOrder = {
    "currentTime",
    "specificTime",
    "base64Content"
})
public class UseVerificationTimeType {

    @XmlElement(name = "CurrentTime", defaultValue = "false")
    protected Boolean currentTime;
    @XmlElement(name = "SpecificTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar specificTime;
    @XmlElement(name = "Base64Content")
    protected byte[] base64Content;

    /**
     * Obtient la valeur de la propriété currentTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentTime() {
        return currentTime;
    }

    /**
     * Définit la valeur de la propriété currentTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentTime(Boolean value) {
        this.currentTime = value;
    }

    /**
     * Obtient la valeur de la propriété specificTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecificTime() {
        return specificTime;
    }

    /**
     * Définit la valeur de la propriété specificTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecificTime(XMLGregorianCalendar value) {
        this.specificTime = value;
    }

    /**
     * Obtient la valeur de la propriété base64Content.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBase64Content() {
        return base64Content;
    }

    /**
     * Définit la valeur de la propriété base64Content.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBase64Content(byte[] value) {
        this.base64Content = value;
    }

}
