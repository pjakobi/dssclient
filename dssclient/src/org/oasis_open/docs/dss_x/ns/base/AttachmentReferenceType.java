//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.02.17 à 05:01:13 PM CET 
//


package org.oasis_open.docs.dss_x.ns.base;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AttachmentReferenceType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AttachmentReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DigestInfo" type="{http://docs.oasis-open.org/dss-x/ns/base}DigestInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AttRefURI" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentReferenceType", propOrder = {
    "digestInfo"
})
public class AttachmentReferenceType {

    @XmlElement(name = "DigestInfo")
    protected List<DigestInfoType> digestInfo;
    @XmlAttribute(name = "AttRefURI", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String attRefURI;

    /**
     * Gets the value of the digestInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the digestInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDigestInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DigestInfoType }
     * 
     * 
     */
    public List<DigestInfoType> getDigestInfo() {
        if (digestInfo == null) {
            digestInfo = new ArrayList<DigestInfoType>();
        }
        return this.digestInfo;
    }

    /**
     * Obtient la valeur de la propriété attRefURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttRefURI() {
        return attRefURI;
    }

    /**
     * Définit la valeur de la propriété attRefURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttRefURI(String value) {
        this.attRefURI = value;
    }

}
