/**
 * GetLastOrdersForMerchantsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package merchant;


/**
 *  GetLastOrdersForMerchantsRequest bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class GetLastOrdersForMerchantsRequest extends AbstractServiceRequest
    implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = getLastOrdersForMerchantsRequest
       Namespace URI = http://engine.paymentgate.ru/webservices/merchant
       Namespace Prefix = ns1
     */

    /**
     * field for Page
     */
    protected int localPage;

    /**
     * field for Size
     */
    protected int localSize;

    /**
     * field for From
     */
    protected java.util.Calendar localFrom;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFromTracker = false;

    /**
     * field for To
     */
    protected java.util.Calendar localTo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localToTracker = false;

    /**
     * field for TransactionStates
     */
    protected TransactionStates localTransactionStates;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTransactionStatesTracker = false;

    /**
     * field for Merchants
     */
    protected Merchants localMerchants;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMerchantsTracker = false;

    /**
     * field for SearchByCreatedDate
     */
    protected boolean localSearchByCreatedDate;

    /**
     * Auto generated getter method
     * @return int
     */
    public int getPage() {
        return localPage;
    }

    /**
     * Auto generated setter method
     * @param param Page
     */
    public void setPage(int param) {
        this.localPage = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getSize() {
        return localSize;
    }

    /**
     * Auto generated setter method
     * @param param Size
     */
    public void setSize(int param) {
        this.localSize = param;
    }

    public boolean isFromSpecified() {
        return localFromTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getFrom() {
        return localFrom;
    }

    /**
     * Auto generated setter method
     * @param param From
     */
    public void setFrom(java.util.Calendar param) {
        localFromTracker = param != null;

        this.localFrom = param;
    }

    public boolean isToSpecified() {
        return localToTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getTo() {
        return localTo;
    }

    /**
     * Auto generated setter method
     * @param param To
     */
    public void setTo(java.util.Calendar param) {
        localToTracker = param != null;

        this.localTo = param;
    }

    public boolean isTransactionStatesSpecified() {
        return localTransactionStatesTracker;
    }

    /**
     * Auto generated getter method
     * @return ru.paymentgate.engine.webservices.merchant.TransactionStates
     */
    public TransactionStates getTransactionStates() {
        return localTransactionStates;
    }

    /**
     * Auto generated setter method
     * @param param TransactionStates
     */
    public void setTransactionStates(
        TransactionStates param) {
        localTransactionStatesTracker = param != null;

        this.localTransactionStates = param;
    }

    public boolean isMerchantsSpecified() {
        return localMerchantsTracker;
    }

    /**
     * Auto generated getter method
     * @return ru.paymentgate.engine.webservices.merchant.Merchants
     */
    public Merchants getMerchants() {
        return localMerchants;
    }

    /**
     * Auto generated setter method
     * @param param Merchants
     */
    public void setMerchants(
        Merchants param) {
        localMerchantsTracker = param != null;

        this.localMerchants = param;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getSearchByCreatedDate() {
        return localSearchByCreatedDate;
    }

    /**
     * Auto generated setter method
     * @param param SearchByCreatedDate
     */
    public void setSearchByCreatedDate(boolean param) {
        this.localSearchByCreatedDate = param;
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

        String namespacePrefix = registerPrefix(xmlWriter,
                "http://engine.paymentgate.ru/webservices/merchant");

        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "type", namespacePrefix + ":getLastOrdersForMerchantsRequest",
                xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "type", "getLastOrdersForMerchantsRequest", xmlWriter);
        }

        if (localLanguage != null) {
            writeAttribute("", "language",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localLanguage), xmlWriter);
        }

        namespace = "";
        writeStartElement(null, namespace, "page", xmlWriter);

        if (localPage == Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "page cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localPage));
        }

        xmlWriter.writeEndElement();

        namespace = "";
        writeStartElement(null, namespace, "size", xmlWriter);

        if (localSize == Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "size cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localSize));
        }

        xmlWriter.writeEndElement();

        if (localFromTracker) {
            namespace = "";
            writeStartElement(null, namespace, "from", xmlWriter);

            if (localFrom == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "from cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localFrom));
            }

            xmlWriter.writeEndElement();
        }

        if (localToTracker) {
            namespace = "";
            writeStartElement(null, namespace, "to", xmlWriter);

            if (localTo == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "to cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localTo));
            }

            xmlWriter.writeEndElement();
        }

        if (localTransactionStatesTracker) {
            if (localTransactionStates == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "transactionStates cannot be null!!");
            }

            localTransactionStates.serialize(new javax.xml.namespace.QName("",
                    "transactionStates"), xmlWriter);
        }

        if (localMerchantsTracker) {
            if (localMerchants == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "merchants cannot be null!!");
            }

            localMerchants.serialize(new javax.xml.namespace.QName("",
                    "merchants"), xmlWriter);
        }

        namespace = "";
        writeStartElement(null, namespace, "searchByCreatedDate", xmlWriter);

        if (false) {
            throw new org.apache.axis2.databinding.ADBException(
                "searchByCreatedDate cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localSearchByCreatedDate));
        }

        xmlWriter.writeEndElement();

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
        public static GetLastOrdersForMerchantsRequest parse(
            javax.xml.stream.XMLStreamReader reader) throws Exception {
            GetLastOrdersForMerchantsRequest object = new GetLastOrdersForMerchantsRequest();

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

                        if (!"getLastOrdersForMerchantsRequest".equals(type)) {
                            //find namespace for the prefix
                            String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (GetLastOrdersForMerchantsRequest) ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "language"
                String tempAttribLanguage = reader.getAttributeValue(null,
                        "language");

                if (tempAttribLanguage != null) {
                    String content = tempAttribLanguage;

                    object.setLanguage(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribLanguage));
                } else {
                }

                handledAttributes.add("language");

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "page").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "page" + "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setPage(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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
                        new javax.xml.namespace.QName("", "size").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "size" + "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setSize(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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
                        new javax.xml.namespace.QName("", "from").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "from" + "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setFrom(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "to").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "to" + "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setTo(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "transactionStates").equals(
                            reader.getName())) {
                    object.setTransactionStates(TransactionStates.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "merchants").equals(
                            reader.getName())) {
                    object.setMerchants(Merchants.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "searchByCreatedDate").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "searchByCreatedDate" +
                            "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setSearchByCreatedDate(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
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
