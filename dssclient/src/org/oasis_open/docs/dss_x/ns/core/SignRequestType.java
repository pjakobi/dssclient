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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.dss_x.ns.base.RequestBaseType;


/**
 * <p>Classe Java pour SignRequestType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SignRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/dss-x/ns/base}RequestBaseType">
 *       &lt;sequence>
 *         &lt;element name="InputDocuments" type="{http://docs.oasis-open.org/dss-x/ns/core}InputDocumentsType" minOccurs="0"/>
 *         &lt;element name="OptionalInputs" type="{http://docs.oasis-open.org/dss-x/ns/core}OptionalInputsSignType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="SignRequestType")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignRequestType", propOrder = {
    "inputDocuments",
    "optionalInputs"
})
public class SignRequestType
    extends RequestBaseType
{

    @XmlElement(name = "InputDocuments")
    protected InputDocumentsType inputDocuments;
    @XmlElement(name = "OptionalInputs")
    protected OptionalInputsSignType optionalInputs;

    /**
     * Obtient la valeur de la propriété inputDocuments.
     * 
     * @return
     *     possible object is
     *     {@link InputDocumentsType }
     *     
     */
    public InputDocumentsType getInputDocuments() {
        return inputDocuments;
    }

    /**
     * Définit la valeur de la propriété inputDocuments.
     * 
     * @param value
     *     allowed object is
     *     {@link InputDocumentsType }
     *     
     */
    public void setInputDocuments(InputDocumentsType value) {
        this.inputDocuments = value;
    }

    /**
     * Obtient la valeur de la propriété optionalInputs.
     * 
     * @return
     *     possible object is
     *     {@link OptionalInputsSignType }
     *     
     */
    public OptionalInputsSignType getOptionalInputs() {
        return optionalInputs;
    }

    /**
     * Définit la valeur de la propriété optionalInputs.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalInputsSignType }
     *     
     */
    public void setOptionalInputs(OptionalInputsSignType value) {
        this.optionalInputs = value;
    }

}
