//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.02.17 à 05:01:13 PM CET 
//


package org.oasis_open.docs.dss_x.ns.core;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.dss_x.ns.base.Base64DataType;
import org.oasis_open.docs.dss_x.ns.xmldsig.rewritten.TransformsType;


/**
 * <p>Classe Java pour TransformedDataType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TransformedDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/dss-x/ns/core}DocumentBaseType">
 *       &lt;sequence>
 *         &lt;element name="Transforms" type="{http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten}TransformsType" minOccurs="0"/>
 *         &lt;element name="Base64Data" type="{http://docs.oasis-open.org/dss-x/ns/base}Base64DataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="WhichReference" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransformedDataType", propOrder = {
    "transforms",
    "base64Data"
})
public class TransformedDataType
    extends DocumentBaseType
{

    @XmlElement(name = "Transforms")
    protected TransformsType transforms;
    @XmlElement(name = "Base64Data", required = true)
    protected Base64DataType base64Data;
    @XmlAttribute(name = "WhichReference")
    protected BigInteger whichReference;

    /**
     * Obtient la valeur de la propriété transforms.
     * 
     * @return
     *     possible object is
     *     {@link TransformsType }
     *     
     */
    public TransformsType getTransforms() {
        return transforms;
    }

    /**
     * Définit la valeur de la propriété transforms.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformsType }
     *     
     */
    public void setTransforms(TransformsType value) {
        this.transforms = value;
    }

    /**
     * Obtient la valeur de la propriété base64Data.
     * 
     * @return
     *     possible object is
     *     {@link Base64DataType }
     *     
     */
    public Base64DataType getBase64Data() {
        return base64Data;
    }

    /**
     * Définit la valeur de la propriété base64Data.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64DataType }
     *     
     */
    public void setBase64Data(Base64DataType value) {
        this.base64Data = value;
    }

    /**
     * Obtient la valeur de la propriété whichReference.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWhichReference() {
        return whichReference;
    }

    /**
     * Définit la valeur de la propriété whichReference.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWhichReference(BigInteger value) {
        this.whichReference = value;
    }

}
