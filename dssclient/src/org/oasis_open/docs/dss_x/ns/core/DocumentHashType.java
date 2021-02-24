//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.02.17 à 05:01:13 PM CET 
//


package org.oasis_open.docs.dss_x.ns.core;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.dss_x.ns.base.DigestInfoType;
import org.oasis_open.docs.dss_x.ns.xmldsig.rewritten.TransformsType;


/**
 * <p>Classe Java pour DocumentHashType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DocumentHashType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/dss-x/ns/core}DocumentBaseType">
 *       &lt;sequence>
 *         &lt;element name="Transforms" type="{http://docs.oasis-open.org/dss-x/ns/xmldsig/rewritten}TransformsType" minOccurs="0"/>
 *         &lt;element name="DigestInfos" type="{http://docs.oasis-open.org/dss-x/ns/base}DigestInfoType" maxOccurs="unbounded"/>
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
@XmlType(name = "DocumentHashType", propOrder = {
    "transforms",
    "digestInfos"
})
public class DocumentHashType
    extends DocumentBaseType
{

    @XmlElement(name = "Transforms")
    protected TransformsType transforms;
    @XmlElement(name = "DigestInfos", required = true)
    protected List<DigestInfoType> digestInfos;
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
     * Gets the value of the digestInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the digestInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDigestInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DigestInfoType }
     * 
     * 
     */
    public List<DigestInfoType> getDigestInfos() {
        if (digestInfos == null) {
            digestInfos = new ArrayList<DigestInfoType>();
        }
        return this.digestInfos;
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
