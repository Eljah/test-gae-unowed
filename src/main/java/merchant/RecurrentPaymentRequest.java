/**
 * RecurrentPaymentRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package merchant;


/**
 *  RecurrentPaymentRequest bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class RecurrentPaymentRequest implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = recurrentPaymentRequest
       Namespace URI = http://engine.paymentgate.ru/webservices/merchant
       Namespace Prefix = ns1
     */

    /**
     * field for OrderNumber
     */
    protected String localOrderNumber;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOrderNumberTracker = false;

    /**
     * field for Language
     */
    protected String localLanguage;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLanguageTracker = false;

    /**
     * field for BindingId
     */
    protected String localBindingId;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBindingIdTracker = false;

    /**
     * field for Amount
     */
    protected long localAmount;

    /**
     * field for Currency
     */
    protected String localCurrency;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCurrencyTracker = false;

    /**
     * field for Description
     */
    protected String localDescription;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDescriptionTracker = false;

    /**
     * field for PreAuth
     */
    protected boolean localPreAuth;

    /**
     * field for AdditionalParameters
     */
    protected AdditionalParameters_type2 localAdditionalParameters;

    public boolean isOrderNumberSpecified() {
        return localOrderNumberTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public String getOrderNumber() {
        return localOrderNumber;
    }

    /**
     * Auto generated setter method
     * @param param OrderNumber
     */
    public void setOrderNumber(String param) {
        localOrderNumberTracker = param != null;

        this.localOrderNumber = param;
    }

    public boolean isLanguageSpecified() {
        return localLanguageTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public String getLanguage() {
        return localLanguage;
    }

    /**
     * Auto generated setter method
     * @param param Language
     */
    public void setLanguage(String param) {
        localLanguageTracker = param != null;

        this.localLanguage = param;
    }

    public boolean isBindingIdSpecified() {
        return localBindingIdTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public String getBindingId() {
        return localBindingId;
    }

    /**
     * Auto generated setter method
     * @param param BindingId
     */
    public void setBindingId(String param) {
        localBindingIdTracker = param != null;

        this.localBindingId = param;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getAmount() {
        return localAmount;
    }

    /**
     * Auto generated setter method
     * @param param Amount
     */
    public void setAmount(long param) {
        this.localAmount = param;
    }

    public boolean isCurrencySpecified() {
        return localCurrencyTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public String getCurrency() {
        return localCurrency;
    }

    /**
     * Auto generated setter method
     * @param param Currency
     */
    public void setCurrency(String param) {
        localCurrencyTracker = param != null;

        this.localCurrency = param;
    }

    public boolean isDescriptionSpecified() {
        return localDescriptionTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public String getDescription() {
        return localDescription;
    }

    /**
     * Auto generated setter method
     * @param param Description
     */
    public void setDescription(String param) {
        localDescriptionTracker = param != null;

        this.localDescription = param;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getPreAuth() {
        return localPreAuth;
    }

    /**
     * Auto generated setter method
     * @param param PreAuth
     */
    public void setPreAuth(boolean param) {
        this.localPreAuth = param;
    }

    /**
     * Auto generated getter method
     * @return ru.paymentgate.engine.webservices.merchant.AdditionalParameters_type2
     */
    public AdditionalParameters_type2 getAdditionalParameters() {
        return localAdditionalParameters;
    }

    /**
     * Auto generated setter method
     * @param param AdditionalParameters
     */
    public void setAdditionalParameters(
        AdditionalParameters_type2 param) {
        this.localAdditionalParameters = param;
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
                this, parentQName));
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
        String prefix = null;
        String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
            xmlWriter);

        if (serializeType) {
            String namespacePrefix = registerPrefix(xmlWriter,
                    "http://engine.paymentgate.ru/webservices/merchant");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":recurrentPaymentRequest", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "recurrentPaymentRequest", xmlWriter);
            }
        }

        if (localOrderNumberTracker) {
            namespace = "";
            writeStartElement(null, namespace, "orderNumber", xmlWriter);

            if (localOrderNumber == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "orderNumber cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localOrderNumber);
            }

            xmlWriter.writeEndElement();
        }

        if (localLanguageTracker) {
            namespace = "";
            writeStartElement(null, namespace, "language", xmlWriter);

            if (localLanguage == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "language cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localLanguage);
            }

            xmlWriter.writeEndElement();
        }

        if (localBindingIdTracker) {
            namespace = "";
            writeStartElement(null, namespace, "bindingId", xmlWriter);

            if (localBindingId == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "bindingId cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localBindingId);
            }

            xmlWriter.writeEndElement();
        }

        namespace = "";
        writeStartElement(null, namespace, "amount", xmlWriter);

        if (localAmount == Long.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "amount cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localAmount));
        }

        xmlWriter.writeEndElement();

        if (localCurrencyTracker) {
            namespace = "";
            writeStartElement(null, namespace, "currency", xmlWriter);

            if (localCurrency == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "currency cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCurrency);
            }

            xmlWriter.writeEndElement();
        }

        if (localDescriptionTracker) {
            namespace = "";
            writeStartElement(null, namespace, "description", xmlWriter);

            if (localDescription == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "description cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDescription);
            }

            xmlWriter.writeEndElement();
        }

        namespace = "";
        writeStartElement(null, namespace, "preAuth", xmlWriter);

        if (false) {
            throw new org.apache.axis2.databinding.ADBException(
                "preAuth cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localPreAuth));
        }

        xmlWriter.writeEndElement();

        if (localAdditionalParameters == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "additionalParameters cannot be null!!");
        }

        localAdditionalParameters.serialize(new javax.xml.namespace.QName("",
                "additionalParameters"), xmlWriter);

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

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static RecurrentPaymentRequest parse(
            javax.xml.stream.XMLStreamReader reader) throws Exception {
            RecurrentPaymentRequest object = new RecurrentPaymentRequest();

            int event;
            javax.xml.namespace.QName currentQName = null;
            String nillableValue = null;
            String prefix = "";
            String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                if (reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        String type = fullTypeName.substring(fullTypeName.indexOf(
                                    ":") + 1);

                        if (!"recurrentPaymentRequest".equals(type)) {
                            //find namespace for the prefix
                            String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (RecurrentPaymentRequest) ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "orderNumber").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "orderNumber" +
                            "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setOrderNumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "language").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "language" + "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setLanguage(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "bindingId").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "bindingId" + "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setBindingId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "amount").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "amount" + "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setAmount(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "currency").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "currency" + "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setCurrency(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "description").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "description" +
                            "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setDescription(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "preAuth").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "preAuth" + "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setPreAuth(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "additionalParameters").equals(
                            reader.getName())) {
                    object.setAdditionalParameters(AdditionalParameters_type2.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()) {
                    // 2 - A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new Exception(e);
            }

            return object;
        }
    } //end of factory class
}
