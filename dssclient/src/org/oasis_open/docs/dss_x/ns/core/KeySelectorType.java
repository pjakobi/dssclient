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
 * <p>Classe Java pour KeySelectorType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="KeySelectorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="X509Digest" type="{http://docs.oasis-open.org/dss-x/ns/core}X509DigestType"/>
 *         &lt;element name="X509SubjectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="X509SKI" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="X509Certificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="KeyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeySelectorType", propOrder = {
    "x509Digest",
    "x509SubjectName",
    "x509SKI",
    "x509Certificate",
    "keyName"
})
public class KeySelectorType {

    @XmlElement(name = "X509Digest")
    protected X509DigestType x509Digest;
    @XmlElement(name = "X509SubjectName")
    protected String x509SubjectName;
    @XmlElement(name = "X509SKI")
    protected byte[] x509SKI;
    @XmlElement(name = "X509Certificate")
    protected byte[] x509Certificate;
    @XmlElement(name = "KeyName")
    protected String keyName;

    /**
     * Obtient la valeur de la propriété x509Digest.
     * 
     * @return
     *     possible object is
     *     {@link X509DigestType }
     *     
     */
    public X509DigestType getX509Digest() {
        return x509Digest;
    }

    /**
     * Définit la valeur de la propriété x509Digest.
     * 
     * @param value
     *     allowed object is
     *     {@link X509DigestType }
     *     
     */
    public void setX509Digest(X509DigestType value) {
        this.x509Digest = value;
    }

    /**
     * Obtient la valeur de la propriété x509SubjectName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX509SubjectName() {
        return x509SubjectName;
    }

    /**
     * Définit la valeur de la propriété x509SubjectName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX509SubjectName(String value) {
        this.x509SubjectName = value;
    }

    /**
     * Obtient la valeur de la propriété x509SKI.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getX509SKI() {
        return x509SKI;
    }

    /**
     * Définit la valeur de la propriété x509SKI.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setX509SKI(byte[] value) {
        this.x509SKI = value;
    }

    /**
     * Obtient la valeur de la propriété x509Certificate.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getX509Certificate() {
        return x509Certificate;
    }

    /**
     * Définit la valeur de la propriété x509Certificate.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setX509Certificate(byte[] value) {
        this.x509Certificate = value;
    }

    /**
     * Obtient la valeur de la propriété keyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * Définit la valeur de la propriété keyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyName(String value) {
        this.keyName = value;
    }

}
