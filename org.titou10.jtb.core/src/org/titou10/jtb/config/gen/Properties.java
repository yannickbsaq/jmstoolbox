//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.08.07 à 09:24:22 AM EDT 
//

package org.titou10.jtb.config.gen;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.titou10.jtb.util.EncryptUtils;

/**
 * <p>
 * Classe Java pour anonymous complex type.
 * 
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="property" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="kind" type="{}propertyKind" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "property" })
@XmlRootElement(name = "properties")
public class Properties {

   @XmlElement(required = true)
   protected List<Properties.Property> property;

   /**
    * Gets the value of the property property.
    * 
    * <p>
    * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned
    * list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the property property.
    * 
    * <p>
    * For example, to add a new item, do as follows:
    * 
    * <pre>
    * getProperty().add(newItem);
    * </pre>
    * 
    * 
    * <p>
    * Objects of the following type(s) are allowed in the list {@link Properties.Property }
    * 
    * 
    */
   public List<Properties.Property> getProperty() {
      if (property == null) {
         property = new ArrayList<Properties.Property>();
      }
      return this.property;
   }

   /**
    * <p>
    * Classe Java pour anonymous complex type.
    * 
    * <p>
    * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
    * 
    * <pre>
    * &lt;complexType>
    *   &lt;complexContent>
    *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
    *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
    *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
    *       &lt;attribute name="kind" type="{}propertyKind" />
    *     &lt;/restriction>
    *   &lt;/complexContent>
    * &lt;/complexType>
    * </pre>
    * 
    * 
    */
   @XmlAccessorType(XmlAccessType.FIELD)
   @XmlType(name = "")
   public static class Property {

      @XmlAttribute(name = "name")
      protected String       name;
      @XmlAttribute(name = "value")
      protected String       value;
      @XmlAttribute(name = "kind")
      protected PropertyKind kind;

      public String getValue() {
         return EncryptUtils.decrypt(value);
      }

      public void setValue(String value, boolean encrypt) {
         if (encrypt) {
            this.value = EncryptUtils.encrypt(value);
         } else {
            this.value = value;
         }
      }

      /**
       * Obtient la valeur de la propriété name.
       * 
       * @return possible object is {@link String }
       * 
       */
      public String getName() {
         return name;
      }

      /**
       * Définit la valeur de la propriété name.
       * 
       * @param value
       *           allowed object is {@link String }
       * 
       */
      public void setName(String value) {
         this.name = value;
      }

      /**
       * Obtient la valeur de la propriété kind.
       * 
       * @return possible object is {@link PropertyKind }
       * 
       */
      public PropertyKind getKind() {
         return kind;
      }

      /**
       * Définit la valeur de la propriété kind.
       * 
       * @param value
       *           allowed object is {@link PropertyKind }
       * 
       */
      public void setKind(PropertyKind value) {
         this.kind = value;
      }

   }

}