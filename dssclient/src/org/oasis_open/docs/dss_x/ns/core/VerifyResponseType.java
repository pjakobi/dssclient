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
import org.oasis_open.docs.dss_x.ns.base.ResponseBaseType;


/**
 * <p>Classe Java pour VerifyResponseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VerifyResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/dss-x/ns/base}ResponseBaseType">
 *       &lt;sequence>
 *         &lt;element name="OptionalOutputs" type="{http://docs.oasis-open.org/dss-x/ns/core}OptionalOutputsVerifyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyResponseType", propOrder = {
    "optionalOutputs"
})
public class VerifyResponseType
    extends ResponseBaseType
{

    @XmlElement(name = "OptionalOutputs")
    protected OptionalOutputsVerifyType optionalOutputs;

    /**
     * Obtient la valeur de la propriété optionalOutputs.
     * 
     * @return
     *     possible object is
     *     {@link OptionalOutputsVerifyType }
     *     
     */
    public OptionalOutputsVerifyType getOptionalOutputs() {
        return optionalOutputs;
    }

    /**
     * Définit la valeur de la propriété optionalOutputs.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalOutputsVerifyType }
     *     
     */
    public void setOptionalOutputs(OptionalOutputsVerifyType value) {
        this.optionalOutputs = value;
    }

}
