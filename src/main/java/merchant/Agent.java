/**
 * Agent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package merchant;


/**
 *  Agent bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Agent implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = agent
       Namespace URI = http://engine.paymentgate.ru/webservices/merchant
       Namespace Prefix = ns1
     */

    /**
     * field for AgentType
     */
    protected merchant.AgentType localAgentType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAgentTypeTracker = false;

    /**
     * field for PayingOperation
     */
    protected java.lang.String localPayingOperation;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPayingOperationTracker = false;

    /**
     * field for PayingPhones
     */
    protected java.lang.String localPayingPhones;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPayingPhonesTracker = false;

    /**
     * field for PaymentsOperatorPhones
     */
    protected java.lang.String localPaymentsOperatorPhones;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPaymentsOperatorPhonesTracker = false;

    /**
     * field for MtOperatorPhones
     */
    protected java.lang.String localMtOperatorPhones;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMtOperatorPhonesTracker = false;

    /**
     * field for MtOperatorName
     */
    protected java.lang.String localMtOperatorName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMtOperatorNameTracker = false;

    /**
     * field for MtOperatorAddress
     */
    protected java.lang.String localMtOperatorAddress;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMtOperatorAddressTracker = false;

    /**
     * field for MtOperatorInn
     */
    protected java.lang.String localMtOperatorInn;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMtOperatorInnTracker = false;

    public boolean isAgentTypeSpecified() {
        return localAgentTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return merchant.AgentType
     */
    public merchant.AgentType getAgentType() {
        return localAgentType;
    }

    /**
     * Auto generated setter method
     * @param param AgentType
     */
    public void setAgentType(
        merchant.AgentType param) {
        localAgentTypeTracker = param != null;

        this.localAgentType = param;
    }

    public boolean isPayingOperationSpecified() {
        return localPayingOperationTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPayingOperation() {
        return localPayingOperation;
    }

    /**
     * Auto generated setter method
     * @param param PayingOperation
     */
    public void setPayingOperation(java.lang.String param) {
        localPayingOperationTracker = param != null;

        this.localPayingOperation = param;
    }

    public boolean isPayingPhonesSpecified() {
        return localPayingPhonesTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPayingPhones() {
        return localPayingPhones;
    }

    /**
     * Auto generated setter method
     * @param param PayingPhones
     */
    public void setPayingPhones(java.lang.String param) {
        localPayingPhonesTracker = param != null;

        this.localPayingPhones = param;
    }

    public boolean isPaymentsOperatorPhonesSpecified() {
        return localPaymentsOperatorPhonesTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPaymentsOperatorPhones() {
        return localPaymentsOperatorPhones;
    }

    /**
     * Auto generated setter method
     * @param param PaymentsOperatorPhones
     */
    public void setPaymentsOperatorPhones(java.lang.String param) {
        localPaymentsOperatorPhonesTracker = param != null;

        this.localPaymentsOperatorPhones = param;
    }

    public boolean isMtOperatorPhonesSpecified() {
        return localMtOperatorPhonesTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMtOperatorPhones() {
        return localMtOperatorPhones;
    }

    /**
     * Auto generated setter method
     * @param param MtOperatorPhones
     */
    public void setMtOperatorPhones(java.lang.String param) {
        localMtOperatorPhonesTracker = param != null;

        this.localMtOperatorPhones = param;
    }

    public boolean isMtOperatorNameSpecified() {
        return localMtOperatorNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMtOperatorName() {
        return localMtOperatorName;
    }

    /**
     * Auto generated setter method
     * @param param MtOperatorName
     */
    public void setMtOperatorName(java.lang.String param) {
        localMtOperatorNameTracker = param != null;

        this.localMtOperatorName = param;
    }

    public boolean isMtOperatorAddressSpecified() {
        return localMtOperatorAddressTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMtOperatorAddress() {
        return localMtOperatorAddress;
    }

    /**
     * Auto generated setter method
     * @param param MtOperatorAddress
     */
    public void setMtOperatorAddress(java.lang.String param) {
        localMtOperatorAddressTracker = param != null;

        this.localMtOperatorAddress = param;
    }

    public boolean isMtOperatorInnSpecified() {
        return localMtOperatorInnTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMtOperatorInn() {
        return localMtOperatorInn;
    }

    /**
     * Auto generated setter method
     * @param param MtOperatorInn
     */
    public void setMtOperatorInn(java.lang.String param) {
        localMtOperatorInnTracker = param != null;

        this.localMtOperatorInn = param;
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
        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
            xmlWriter);

        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://engine.paymentgate.ru/webservices/merchant");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":agent", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "agent", xmlWriter);
            }
        }

        if (localAgentTypeTracker) {
            if (localAgentType == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "agentType cannot be null!!");
            }

            localAgentType.serialize(new javax.xml.namespace.QName("",
                    "agentType"), xmlWriter);
        }

        if (localPayingOperationTracker) {
            namespace = "";
            writeStartElement(null, namespace, "payingOperation", xmlWriter);

            if (localPayingOperation == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "payingOperation cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPayingOperation);
            }

            xmlWriter.writeEndElement();
        }

        if (localPayingPhonesTracker) {
            namespace = "";
            writeStartElement(null, namespace, "payingPhones", xmlWriter);

            if (localPayingPhones == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "payingPhones cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPayingPhones);
            }

            xmlWriter.writeEndElement();
        }

        if (localPaymentsOperatorPhonesTracker) {
            namespace = "";
            writeStartElement(null, namespace, "paymentsOperatorPhones",
                xmlWriter);

            if (localPaymentsOperatorPhones == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "paymentsOperatorPhones cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPaymentsOperatorPhones);
            }

            xmlWriter.writeEndElement();
        }

        if (localMtOperatorPhonesTracker) {
            namespace = "";
            writeStartElement(null, namespace, "mtOperatorPhones", xmlWriter);

            if (localMtOperatorPhones == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "mtOperatorPhones cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localMtOperatorPhones);
            }

            xmlWriter.writeEndElement();
        }

        if (localMtOperatorNameTracker) {
            namespace = "";
            writeStartElement(null, namespace, "mtOperatorName", xmlWriter);

            if (localMtOperatorName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "mtOperatorName cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localMtOperatorName);
            }

            xmlWriter.writeEndElement();
        }

        if (localMtOperatorAddressTracker) {
            namespace = "";
            writeStartElement(null, namespace, "mtOperatorAddress", xmlWriter);

            if (localMtOperatorAddress == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "mtOperatorAddress cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localMtOperatorAddress);
            }

            xmlWriter.writeEndElement();
        }

        if (localMtOperatorInnTracker) {
            namespace = "";
            writeStartElement(null, namespace, "mtOperatorInn", xmlWriter);

            if (localMtOperatorInn == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "mtOperatorInn cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localMtOperatorInn);
            }

            xmlWriter.writeEndElement();
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals(
                    "http://engine.paymentgate.ru/webservices/merchant")) {
            return "ns1";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
        java.lang.String namespace, java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

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
    private void writeAttribute(java.lang.String prefix,
        java.lang.String namespace, java.lang.String attName,
        java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

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
    private void writeAttribute(java.lang.String namespace,
        java.lang.String attName, java.lang.String attValue,
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
    private void writeQNameAttribute(java.lang.String namespace,
        java.lang.String attName, javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        java.lang.String attributeValue;

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
        java.lang.String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

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
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

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
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

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
        public static Agent parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Agent object = new Agent();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                if (reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                    ":") + 1);

                        if (!"agent".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Agent) merchant.ExtensionMapper.getTypeObject(nsUri,
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
                        new javax.xml.namespace.QName("", "agentType").equals(
                            reader.getName())) {
                    object.setAgentType(merchant.AgentType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "payingOperation").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "payingOperation" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPayingOperation(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "payingPhones").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "payingPhones" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPayingPhones(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                            "paymentsOperatorPhones").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "paymentsOperatorPhones" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPaymentsOperatorPhones(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "mtOperatorPhones").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "mtOperatorPhones" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMtOperatorPhones(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "mtOperatorName").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "mtOperatorName" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMtOperatorName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "mtOperatorAddress").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "mtOperatorAddress" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMtOperatorAddress(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "mtOperatorInn").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "mtOperatorInn" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMtOperatorInn(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()) {
                    // 2 - A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
