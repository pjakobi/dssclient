//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.02.17 à 05:01:13 PM CET 
//


package org.oasis_open.docs.dss_x.ns.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ResultType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultMajor">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI">
 *               &lt;enumeration value="urn:oasis:names:tc:dss:1.0:resultmajor:Success"/>
 *               &lt;enumeration value="urn:oasis:names:tc:dss:1.0:resultmajor:RequesterError"/>
 *               &lt;enumeration value="urn:oasis:names:tc:dss:1.0:resultmajor:ResponderError"/>
 *               &lt;enumeration value="urn:oasis:names:tc:dss:1.0:resultmajor:InsufficientInformation"/>
 *               &lt;enumeration value="urn:oasis:names:tc:dss:1.0:profiles:asynchronousprocessing:resultmajor:Pending"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ResultMinor" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ResultMessage" type="{http://docs.oasis-open.org/dss-x/ns/base}InternationalStringType" minOccurs="0"/>
 *         &lt;element name="ProblemReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultType", propOrder = {
    "resultMajor",
    "resultMinor",
    "resultMessage",
    "problemReference"
})
public class ResultType {

    @XmlElement(name = "ResultMajor", required = true)
    protected String resultMajor;
    @XmlElement(name = "ResultMinor")
    @XmlSchemaType(name = "anyURI")
    protected String resultMinor;
    @XmlElement(name = "ResultMessage")
    protected InternationalStringType resultMessage;
    @XmlElement(name = "ProblemReference")
    protected String problemReference;

    /**
     * Obtient la valeur de la propriété resultMajor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultMajor() {
        return resultMajor;
    }

    /**
     * Définit la valeur de la propriété resultMajor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultMajor(String value) {
        this.resultMajor = value;
    }

    /**
     * Obtient la valeur de la propriété resultMinor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultMinor() {
        return resultMinor;
    }

    /**
     * Définit la valeur de la propriété resultMinor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultMinor(String value) {
        this.resultMinor = value;
    }

    /**
     * Obtient la valeur de la propriété resultMessage.
     * 
     * @return
     *     possible object is
     *     {@link InternationalStringType }
     *     
     */
    public InternationalStringType getResultMessage() {
        return resultMessage;
    }

    /**
     * Définit la valeur de la propriété resultMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalStringType }
     *     
     */
    public void setResultMessage(InternationalStringType value) {
        this.resultMessage = value;
    }

    /**
     * Obtient la valeur de la propriété problemReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemReference() {
        return problemReference;
    }

    /**
     * Définit la valeur de la propriété problemReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemReference(String value) {
        this.problemReference = value;
    }

}
