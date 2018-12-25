/**
 * ProcessingOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package merchant;


/**
 *  ProcessingOperation bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ProcessingOperation implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = processingOperation
       Namespace URI = http://engine.paymentgate.ru/webservices/merchant
       Namespace Prefix = ns1
     */

    /**
     * field for OperationDate
     * This was an Attribute!
     */
    protected java.util.Calendar localOperationDate;

    /**
     * field for OperationType
     * This was an Attribute!
     */
    protected merchant.ProcessingOperationType localOperationType;

    /**
     * field for Amount
     * This was an Attribute!
     */
    protected long localAmount;

    /**
     * field for Pan
     * This was an Attribute!
     */
    protected java.lang.String localPan;

    /**
     * field for CardHolder
     * This was an Attribute!
     */
    protected java.lang.String localCardHolder;

    /**
     * field for Expiration
     * This was an Attribute!
     */
    protected java.lang.String localExpiration;

    /**
     * field for ProcessingResultCode
     * This was an Attribute!
     */
    protected int localProcessingResultCode;

    /**
     * field for CurrencyCode
     * This was an Attribute!
     */
    protected java.lang.String localCurrencyCode;

    /**
     * field for Success
     * This was an Attribute!
     */
    protected java.lang.String localSuccess;

    /**
     * field for ReferenceNumber
     * This was an Attribute!
     */
    protected java.lang.String localReferenceNumber;

    /**
     * field for AuthCode
     * This was an Attribute!
     */
    protected java.lang.String localAuthCode;

    /**
     * field for ExternalId
     * This was an Attribute!
     */
    protected java.lang.String localExternalId;

    /**
     * field for TerminalId
     * This was an Attribute!
     */
    protected java.lang.String localTerminalId;

    /**
     * field for ParesResult
     * This was an Attribute!
     */
    protected java.lang.String localParesResult;

    /**
     * field for ParesMessage
     * This was an Attribute!
     */
    protected java.lang.String localParesMessage;

    /**
     * field for ParesStatus
     * This was an Attribute!
     */
    protected java.lang.String localParesStatus;

    /**
     * field for VeresEnrolled
     * This was an Attribute!
     */
    protected java.lang.String localVeresEnrolled;

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getOperationDate() {
        return localOperationDate;
    }

    /**
     * Auto generated setter method
     * @param param OperationDate
     */
    public void setOperationDate(java.util.Calendar param) {
        this.localOperationDate = param;
    }

    /**
     * Auto generated getter method
     * @return merchant.ProcessingOperationType
     */
    public merchant.ProcessingOperationType getOperationType() {
        return localOperationType;
    }

    /**
     * Auto generated setter method
     * @param param OperationType
     */
    public void setOperationType(
        merchant.ProcessingOperationType param) {
        this.localOperationType = param;
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

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPan() {
        return localPan;
    }

    /**
     * Auto generated setter method
     * @param param Pan
     */
    public void setPan(java.lang.String param) {
        this.localPan = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCardHolder() {
        return localCardHolder;
    }

    /**
     * Auto generated setter method
     * @param param CardHolder
     */
    public void setCardHolder(java.lang.String param) {
        this.localCardHolder = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getExpiration() {
        return localExpiration;
    }

    /**
     * Auto generated setter method
     * @param param Expiration
     */
    public void setExpiration(java.lang.String param) {
        this.localExpiration = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getProcessingResultCode() {
        return localProcessingResultCode;
    }

    /**
     * Auto generated setter method
     * @param param ProcessingResultCode
     */
    public void setProcessingResultCode(int param) {
        this.localProcessingResultCode = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCurrencyCode() {
        return localCurrencyCode;
    }

    /**
     * Auto generated setter method
     * @param param CurrencyCode
     */
    public void setCurrencyCode(java.lang.String param) {
        this.localCurrencyCode = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSuccess() {
        return localSuccess;
    }

    /**
     * Auto generated setter method
     * @param param Success
     */
    public void setSuccess(java.lang.String param) {
        this.localSuccess = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getReferenceNumber() {
        return localReferenceNumber;
    }

    /**
     * Auto generated setter method
     * @param param ReferenceNumber
     */
    public void setReferenceNumber(java.lang.String param) {
        this.localReferenceNumber = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getAuthCode() {
        return localAuthCode;
    }

    /**
     * Auto generated setter method
     * @param param AuthCode
     */
    public void setAuthCode(java.lang.String param) {
        this.localAuthCode = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getExternalId() {
        return localExternalId;
    }

    /**
     * Auto generated setter method
     * @param param ExternalId
     */
    public void setExternalId(java.lang.String param) {
        this.localExternalId = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTerminalId() {
        return localTerminalId;
    }

    /**
     * Auto generated setter method
     * @param param TerminalId
     */
    public void setTerminalId(java.lang.String param) {
        this.localTerminalId = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getParesResult() {
        return localParesResult;
    }

    /**
     * Auto generated setter method
     * @param param ParesResult
     */
    public void setParesResult(java.lang.String param) {
        this.localParesResult = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getParesMessage() {
        return localParesMessage;
    }

    /**
     * Auto generated setter method
     * @param param ParesMessage
     */
    public void setParesMessage(java.lang.String param) {
        this.localParesMessage = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getParesStatus() {
        return localParesStatus;
    }

    /**
     * Auto generated setter method
     * @param param ParesStatus
     */
    public void setParesStatus(java.lang.String param) {
        this.localParesStatus = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getVeresEnrolled() {
        return localVeresEnrolled;
    }

    /**
     * Auto generated setter method
     * @param param VeresEnrolled
     */
    public void setVeresEnrolled(java.lang.String param) {
        this.localVeresEnrolled = param;
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
                    namespacePrefix + ":processingOperation", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "processingOperation", xmlWriter);
            }
        }

        if (localOperationDate != null) {
            writeAttribute("", "operationDate",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localOperationDate), xmlWriter);
        }

        if (localOperationType != null) {
            writeAttribute("", "operationType", localOperationType.toString(),
                xmlWriter);
        }

        if (localAmount != java.lang.Long.MIN_VALUE) {
            writeAttribute("", "amount",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localAmount), xmlWriter);
        }

        if (localPan != null) {
            writeAttribute("", "pan",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localPan), xmlWriter);
        }

        if (localCardHolder != null) {
            writeAttribute("", "cardHolder",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCardHolder), xmlWriter);
        }

        if (localExpiration != null) {
            writeAttribute("", "expiration",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localExpiration), xmlWriter);
        }

        if (localProcessingResultCode != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "processingResultCode",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localProcessingResultCode), xmlWriter);
        }

        if (localCurrencyCode != null) {
            writeAttribute("", "currencyCode",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCurrencyCode), xmlWriter);
        }

        if (localSuccess != null) {
            writeAttribute("", "success",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localSuccess), xmlWriter);
        }

        if (localReferenceNumber != null) {
            writeAttribute("", "referenceNumber",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localReferenceNumber), xmlWriter);
        }

        if (localAuthCode != null) {
            writeAttribute("", "authCode",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localAuthCode), xmlWriter);
        }

        if (localExternalId != null) {
            writeAttribute("", "externalId",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localExternalId), xmlWriter);
        }

        if (localTerminalId != null) {
            writeAttribute("", "terminalId",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localTerminalId), xmlWriter);
        }

        if (localParesResult != null) {
            writeAttribute("", "paresResult",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localParesResult), xmlWriter);
        }

        if (localParesMessage != null) {
            writeAttribute("", "paresMessage",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localParesMessage), xmlWriter);
        }

        if (localParesStatus != null) {
            writeAttribute("", "paresStatus",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localParesStatus), xmlWriter);
        }

        if (localVeresEnrolled != null) {
            writeAttribute("", "veresEnrolled",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localVeresEnrolled), xmlWriter);
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
        public static ProcessingOperation parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            ProcessingOperation object = new ProcessingOperation();

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

                        if (!"processingOperation".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (ProcessingOperation) merchant.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "operationDate"
                java.lang.String tempAttribOperationDate = reader.getAttributeValue(null,
                        "operationDate");

                if (tempAttribOperationDate != null) {
                    java.lang.String content = tempAttribOperationDate;

                    object.setOperationDate(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribOperationDate));
                } else {
                }

                handledAttributes.add("operationDate");

                // handle attribute "operationType"
                java.lang.String tempAttribOperationType = reader.getAttributeValue(null,
                        "operationType");

                if (tempAttribOperationType != null) {
                    java.lang.String content = tempAttribOperationType;

                    object.setOperationType(merchant.ProcessingOperationType.Factory.fromString(
                            reader, tempAttribOperationType));
                } else {
                }

                handledAttributes.add("operationType");

                // handle attribute "amount"
                java.lang.String tempAttribAmount = reader.getAttributeValue(null,
                        "amount");

                if (tempAttribAmount != null) {
                    java.lang.String content = tempAttribAmount;

                    object.setAmount(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            tempAttribAmount));
                } else {
                    object.setAmount(java.lang.Long.MIN_VALUE);
                }

                handledAttributes.add("amount");

                // handle attribute "pan"
                java.lang.String tempAttribPan = reader.getAttributeValue(null,
                        "pan");

                if (tempAttribPan != null) {
                    java.lang.String content = tempAttribPan;

                    object.setPan(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribPan));
                } else {
                }

                handledAttributes.add("pan");

                // handle attribute "cardHolder"
                java.lang.String tempAttribCardHolder = reader.getAttributeValue(null,
                        "cardHolder");

                if (tempAttribCardHolder != null) {
                    java.lang.String content = tempAttribCardHolder;

                    object.setCardHolder(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribCardHolder));
                } else {
                }

                handledAttributes.add("cardHolder");

                // handle attribute "expiration"
                java.lang.String tempAttribExpiration = reader.getAttributeValue(null,
                        "expiration");

                if (tempAttribExpiration != null) {
                    java.lang.String content = tempAttribExpiration;

                    object.setExpiration(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribExpiration));
                } else {
                }

                handledAttributes.add("expiration");

                // handle attribute "processingResultCode"
                java.lang.String tempAttribProcessingResultCode = reader.getAttributeValue(null,
                        "processingResultCode");

                if (tempAttribProcessingResultCode != null) {
                    java.lang.String content = tempAttribProcessingResultCode;

                    object.setProcessingResultCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribProcessingResultCode));
                } else {
                    object.setProcessingResultCode(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("processingResultCode");

                // handle attribute "currencyCode"
                java.lang.String tempAttribCurrencyCode = reader.getAttributeValue(null,
                        "currencyCode");

                if (tempAttribCurrencyCode != null) {
                    java.lang.String content = tempAttribCurrencyCode;

                    object.setCurrencyCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribCurrencyCode));
                } else {
                }

                handledAttributes.add("currencyCode");

                // handle attribute "success"
                java.lang.String tempAttribSuccess = reader.getAttributeValue(null,
                        "success");

                if (tempAttribSuccess != null) {
                    java.lang.String content = tempAttribSuccess;

                    object.setSuccess(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribSuccess));
                } else {
                }

                handledAttributes.add("success");

                // handle attribute "referenceNumber"
                java.lang.String tempAttribReferenceNumber = reader.getAttributeValue(null,
                        "referenceNumber");

                if (tempAttribReferenceNumber != null) {
                    java.lang.String content = tempAttribReferenceNumber;

                    object.setReferenceNumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribReferenceNumber));
                } else {
                }

                handledAttributes.add("referenceNumber");

                // handle attribute "authCode"
                java.lang.String tempAttribAuthCode = reader.getAttributeValue(null,
                        "authCode");

                if (tempAttribAuthCode != null) {
                    java.lang.String content = tempAttribAuthCode;

                    object.setAuthCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribAuthCode));
                } else {
                }

                handledAttributes.add("authCode");

                // handle attribute "externalId"
                java.lang.String tempAttribExternalId = reader.getAttributeValue(null,
                        "externalId");

                if (tempAttribExternalId != null) {
                    java.lang.String content = tempAttribExternalId;

                    object.setExternalId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribExternalId));
                } else {
                }

                handledAttributes.add("externalId");

                // handle attribute "terminalId"
                java.lang.String tempAttribTerminalId = reader.getAttributeValue(null,
                        "terminalId");

                if (tempAttribTerminalId != null) {
                    java.lang.String content = tempAttribTerminalId;

                    object.setTerminalId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribTerminalId));
                } else {
                }

                handledAttributes.add("terminalId");

                // handle attribute "paresResult"
                java.lang.String tempAttribParesResult = reader.getAttributeValue(null,
                        "paresResult");

                if (tempAttribParesResult != null) {
                    java.lang.String content = tempAttribParesResult;

                    object.setParesResult(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribParesResult));
                } else {
                }

                handledAttributes.add("paresResult");

                // handle attribute "paresMessage"
                java.lang.String tempAttribParesMessage = reader.getAttributeValue(null,
                        "paresMessage");

                if (tempAttribParesMessage != null) {
                    java.lang.String content = tempAttribParesMessage;

                    object.setParesMessage(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribParesMessage));
                } else {
                }

                handledAttributes.add("paresMessage");

                // handle attribute "paresStatus"
                java.lang.String tempAttribParesStatus = reader.getAttributeValue(null,
                        "paresStatus");

                if (tempAttribParesStatus != null) {
                    java.lang.String content = tempAttribParesStatus;

                    object.setParesStatus(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribParesStatus));
                } else {
                }

                handledAttributes.add("paresStatus");

                // handle attribute "veresEnrolled"
                java.lang.String tempAttribVeresEnrolled = reader.getAttributeValue(null,
                        "veresEnrolled");

                if (tempAttribVeresEnrolled != null) {
                    java.lang.String content = tempAttribVeresEnrolled;

                    object.setVeresEnrolled(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribVeresEnrolled));
                } else {
                }

                handledAttributes.add("veresEnrolled");

                reader.next();

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
