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


/**
 * <p>Classe Java pour OptionalOutputsSignType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OptionalOutputsSignType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/dss-x/ns/core}OptionalOutputsBaseType">
 *       &lt;sequence>
 *         &lt;element name="DocumentWithSignature" type="{http://docs.oasis-open.org/dss-x/ns/core}DocumentWithSignatureType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionalOutputsSignType", propOrder = {
    "documentWithSignature"
})
public class OptionalOutputsSignType
    extends OptionalOutputsBaseType
{

    @XmlElement(name = "DocumentWithSignature")
    protected List<DocumentWithSignatureType> documentWithSignature;

    /**
     * Gets the value of the documentWithSignature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentWithSignature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentWithSignature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentWithSignatureType }
     * 
     * 
     */
    public List<DocumentWithSignatureType> getDocumentWithSignature() {
        if (documentWithSignature == null) {
            documentWithSignature = new ArrayList<DocumentWithSignatureType>();
        }
        return this.documentWithSignature;
    }

}
