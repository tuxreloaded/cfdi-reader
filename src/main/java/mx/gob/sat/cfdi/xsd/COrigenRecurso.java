//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.05.20 a las 03:57:47 PM CST 
//


package mx.gob.sat.cfdi.xsd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para c_OrigenRecurso.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="c_OrigenRecurso">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="IP"/>
 *     &lt;enumeration value="IF"/>
 *     &lt;enumeration value="IM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "c_OrigenRecurso", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina")
@XmlEnum
public enum COrigenRecurso {

    IP,
    IF,
    IM;

    public String value() {
        return name();
    }

    public static COrigenRecurso fromValue(String v) {
        return valueOf(v);
    }

}
