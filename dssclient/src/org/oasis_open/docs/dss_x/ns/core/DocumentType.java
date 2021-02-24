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
import org.oasis_open.docs.dss_x.ns.base.Base64DataType;


/**
 * <p>Classe Java pour DocumentType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DocumentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/dss-x/ns/core}DocumentBaseType">
 *       &lt;sequence>
 *         &lt;element name="Base64Data" type="{http://docs.oasis-open.org/dss-x/ns/base}Base64DataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", propOrder = {
    "base64Data"
})
public class DocumentType
    extends DocumentBaseType
{

    @XmlElement(name = "Base64Data", required = true)
    protected Base64DataType base64Data;

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

}
