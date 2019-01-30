/**
 * OrderFeature.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package merchant;


/**
 *  OrderFeature bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class OrderFeature implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://engine.paymentgate.ru/webservices/merchant",
            "orderFeature", "ns1");
    private static java.util.HashMap _table_ = new java.util.HashMap();
    public static final String _FIXED_BINDING = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FIXED_BINDING");
    public static final String _BINDING_NOT_NEEDED = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "BINDING_NOT_NEEDED");
    public static final String _FIXED_BONUS_AMOUNT = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FIXED_BONUS_AMOUNT");
    public static final String _FORCE_TDS = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FORCE_TDS");
    public static final String _FORCE_SSL = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FORCE_SSL");
    public static final String _FRAUD_FORCE_TDS = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FRAUD_FORCE_TDS");
    public static final String _FRAUD_FORCE_SSL = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FRAUD_FORCE_SSL");
    public static final String _AUTO_PAYMENT = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "AUTO_PAYMENT");
    public static final String _FORCE_NO_CVC = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FORCE_NO_CVC");
    public static final String _FORCE_FULL_TDS = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FORCE_FULL_TDS");
    public static final String _VERIFY = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "VERIFY");
    public static final String _SKIP_PAYER_EMAIL_NOTIFY = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SKIP_PAYER_EMAIL_NOTIFY");
    public static final String _SKIP_PAYER_PHONE_NOTIFY = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SKIP_PAYER_PHONE_NOTIFY");
    public static final String _FORCE_GENERATE_ORDERNUMBER = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FORCE_GENERATE_ORDERNUMBER");
    public static final String _PAY_BY_CLIENT = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "PAY_BY_CLIENT");
    public static final OrderFeature FIXED_BINDING = new OrderFeature(_FIXED_BINDING,
            true);
    public static final OrderFeature BINDING_NOT_NEEDED = new OrderFeature(_BINDING_NOT_NEEDED,
            true);
    public static final OrderFeature FIXED_BONUS_AMOUNT = new OrderFeature(_FIXED_BONUS_AMOUNT,
            true);
    public static final OrderFeature FORCE_TDS = new OrderFeature(_FORCE_TDS,
            true);
    public static final OrderFeature FORCE_SSL = new OrderFeature(_FORCE_SSL,
            true);
    public static final OrderFeature FRAUD_FORCE_TDS = new OrderFeature(_FRAUD_FORCE_TDS,
            true);
    public static final OrderFeature FRAUD_FORCE_SSL = new OrderFeature(_FRAUD_FORCE_SSL,
            true);
    public static final OrderFeature AUTO_PAYMENT = new OrderFeature(_AUTO_PAYMENT,
            true);
    public static final OrderFeature FORCE_NO_CVC = new OrderFeature(_FORCE_NO_CVC,
            true);
    public static final OrderFeature FORCE_FULL_TDS = new OrderFeature(_FORCE_FULL_TDS,
            true);
    public static final OrderFeature VERIFY = new OrderFeature(_VERIFY, true);
    public static final OrderFeature SKIP_PAYER_EMAIL_NOTIFY = new OrderFeature(_SKIP_PAYER_EMAIL_NOTIFY,
            true);
    public static final OrderFeature SKIP_PAYER_PHONE_NOTIFY = new OrderFeature(_SKIP_PAYER_PHONE_NOTIFY,
            true);
    public static final OrderFeature FORCE_GENERATE_ORDERNUMBER = new OrderFeature(_FORCE_GENERATE_ORDERNUMBER,
            true);
    public static final OrderFeature PAY_BY_CLIENT = new OrderFeature(_PAY_BY_CLIENT,
            true);

    /**
     * field for OrderFeature
     */
    protected String localOrderFeature;

    // Constructor
    protected OrderFeature(String value, boolean isRegisterValue) {
        localOrderFeature = value;

        if (isRegisterValue) {
            _table_.put(localOrderFeature, this);
        }
    }

    public String getValue() {
        return localOrderFeature;
    }

    public boolean equals(Object obj) {
        return (obj == this);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        return localOrderFeature.toString();
    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName,
        final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {
        return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                this, MY_QNAME));
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        //We can safely assume an element has only one type associated with it
        String namespace = parentQName.getNamespaceURI();
        String _localName = parentQName.getLocalPart();

        writeStartElement(null, namespace, _localName, xmlWriter);

        // add the type details if this is used in a simple type
        if (serializeType) {
            String namespacePrefix = registerPrefix(xmlWriter,
                    "http://engine.paymentgate.ru/webservices/merchant");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":orderFeature", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "orderFeature", xmlWriter);
            }
        }

        if (localOrderFeature == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "orderFeature cannot be null !!");
        } else {
            xmlWriter.writeCharacters(localOrderFeature);
        }

        xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
        if (namespace.equals(
                    "http://engine.paymentgate.ru/webservices/merchant")) {
            return "ns1";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(String prefix,
        String namespace, String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(String prefix,
        String namespace, String attName,
        String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
        } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(String namespace,
        String attName, String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(String namespace,
        String attName, javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        String attributeNamespace = qname.getNamespaceURI();
        String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        String attributeValue;

        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" +
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            StringBuffer stringToWrite = new StringBuffer();
            String namespaceURI = null;
            String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }

                namespaceURI = qnames[i].getNamespaceURI();

                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);

                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
        String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        public static OrderFeature fromValue(String value)
            throws IllegalArgumentException {
            OrderFeature enumeration = (OrderFeature) _table_.get(value);

            // handle unexpected enumeration values properly
            if (enumeration == null) {
                throw new IllegalArgumentException();
            }

            return enumeration;
        }

        public static OrderFeature fromString(String value,
                                              String namespaceURI)
            throws IllegalArgumentException {
            try {
                return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        value));
            } catch (Exception e) {
                throw new IllegalArgumentException();
            }
        }

        public static OrderFeature fromString(
            javax.xml.stream.XMLStreamReader xmlStreamReader,
            String content) {
            if (content.indexOf(":") > -1) {
                String prefix = content.substring(0,
                        content.indexOf(":"));
                String namespaceUri = xmlStreamReader.getNamespaceContext()
                                                               .getNamespaceURI(prefix);

                return OrderFeature.Factory.fromString(content, namespaceUri);
            } else {
                return OrderFeature.Factory.fromString(content, "");
            }
        }

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static OrderFeature parse(
            javax.xml.stream.XMLStreamReader reader) throws Exception {
            OrderFeature object = null;

            // initialize a hash map to keep values
            java.util.Map attributeMap = new java.util.HashMap();
            java.util.List extraAttributeList = new java.util.ArrayList<org.apache.axiom.om.OMAttribute>();

            int event;
            javax.xml.namespace.QName currentQName = null;
            String nillableValue = null;
            String prefix = "";
            String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                while (!reader.isEndElement()) {
                    if (reader.isStartElement() || reader.hasText()) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "orderFeature" +
                                "  cannot be null");
                        }

                        String content = reader.getElementText();

                        if (content.indexOf(":") > 0) {
                            // this seems to be a Qname so find the namespace and send
                            prefix = content.substring(0, content.indexOf(":"));
                            namespaceuri = reader.getNamespaceURI(prefix);
                            object = OrderFeature.Factory.fromString(content,
                                    namespaceuri);
                        } else {
                            // this seems to be not a qname send and empty namespace incase of it is
                            // check is done in fromString method
                            object = OrderFeature.Factory.fromString(content, "");
                        }
                    } else {
                        reader.next();
                    }
                } // end of while loop
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new Exception(e);
            }

            return object;
        }
    } //end of factory class
}
