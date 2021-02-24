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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour VerificationTimeInfoType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VerificationTimeInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VerificationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AdditionalTimeInfo" type="{http://docs.oasis-open.org/dss-x/ns/core}AdditionalTimeInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationTimeInfoType", propOrder = {
    "verificationTime",
    "additionalTimeInfo"
})
public class VerificationTimeInfoType {

    @XmlElement(name = "VerificationTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar verificationTime;
    @XmlElement(name = "AdditionalTimeInfo")
    protected List<AdditionalTimeInfoType> additionalTimeInfo;

    /**
     * Obtient la valeur de la propriété verificationTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVerificationTime() {
        return verificationTime;
    }

    /**
     * Définit la valeur de la propriété verificationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVerificationTime(XMLGregorianCalendar value) {
        this.verificationTime = value;
    }

    /**
     * Gets the value of the additionalTimeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalTimeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalTimeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalTimeInfoType }
     * 
     * 
     */
    public List<AdditionalTimeInfoType> getAdditionalTimeInfo() {
        if (additionalTimeInfo == null) {
            additionalTimeInfo = new ArrayList<AdditionalTimeInfoType>();
        }
        return this.additionalTimeInfo;
    }

}
