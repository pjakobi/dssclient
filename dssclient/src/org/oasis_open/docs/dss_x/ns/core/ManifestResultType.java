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
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.dss_x.ns.nslist.NsPrefixMappingType;


/**
 * <p>Classe Java pour ManifestResultType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ManifestResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceXpath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Status">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI">
 *               &lt;enumeration value="urn:oasis:names:tc:dss:1.0:manifeststatus:Valid"/>
 *               &lt;enumeration value="urn:oasis:names:tc:dss:1.0:manifeststatus:Invalid"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NsPrefixMapping" type="{http://docs.oasis-open.org/dss-x/ns/nsList}NsPrefixMappingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManifestResultType", propOrder = {
    "referenceXpath",
    "status",
    "nsPrefixMapping"
})
public class ManifestResultType {

    @XmlElement(name = "ReferenceXpath", required = true)
    protected String referenceXpath;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "NsPrefixMapping")
    protected List<NsPrefixMappingType> nsPrefixMapping;

    /**
     * Obtient la valeur de la propriété referenceXpath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceXpath() {
        return referenceXpath;
    }

    /**
     * Définit la valeur de la propriété referenceXpath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceXpath(String value) {
        this.referenceXpath = value;
    }

    /**
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the nsPrefixMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nsPrefixMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNsPrefixMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NsPrefixMappingType }
     * 
     * 
     */
    public List<NsPrefixMappingType> getNsPrefixMapping() {
        if (nsPrefixMapping == null) {
            nsPrefixMapping = new ArrayList<NsPrefixMappingType>();
        }
        return this.nsPrefixMapping;
    }

}
