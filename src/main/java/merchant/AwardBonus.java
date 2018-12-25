/**
 * AwardBonus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package merchant;


/**
 *  AwardBonus bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class AwardBonus implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = awardBonus
       Namespace URI = http://engine.paymentgate.ru/webservices/merchant
       Namespace Prefix = ns1
     */

    /**
     * field for ApprovedAmountAward
     * This was an Attribute!
     */
    protected int localApprovedAmountAward;

    /**
     * field for DepositedAmountAward
     * This was an Attribute!
     */
    protected int localDepositedAmountAward;

    /**
     * field for RefundedAmountAward
     * This was an Attribute!
     */
    protected int localRefundedAmountAward;

    /**
     * field for PcId
     * This was an Attribute!
     */
    protected java.lang.String localPcId;

    /**
     * field for Successful
     * This was an Attribute!
     */
    protected boolean localSuccessful;

    /**
     * field for PaymentOperation
     * This was an Attribute!
     */
    protected merchant.Operation localPaymentOperation;

    /**
     * Auto generated getter method
     * @return int
     */
    public int getApprovedAmountAward() {
        return localApprovedAmountAward;
    }

    /**
     * Auto generated setter method
     * @param param ApprovedAmountAward
     */
    public void setApprovedAmountAward(int param) {
        this.localApprovedAmountAward = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getDepositedAmountAward() {
        return localDepositedAmountAward;
    }

    /**
     * Auto generated setter method
     * @param param DepositedAmountAward
     */
    public void setDepositedAmountAward(int param) {
        this.localDepositedAmountAward = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getRefundedAmountAward() {
        return localRefundedAmountAward;
    }

    /**
     * Auto generated setter method
     * @param param RefundedAmountAward
     */
    public void setRefundedAmountAward(int param) {
        this.localRefundedAmountAward = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPcId() {
        return localPcId;
    }

    /**
     * Auto generated setter method
     * @param param PcId
     */
    public void setPcId(java.lang.String param) {
        this.localPcId = param;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getSuccessful() {
        return localSuccessful;
    }

    /**
     * Auto generated setter method
     * @param param Successful
     */
    public void setSuccessful(boolean param) {
        this.localSuccessful = param;
    }

    /**
     * Auto generated getter method
     * @return merchant.Operation
     */
    public merchant.Operation getPaymentOperation() {
        return localPaymentOperation;
    }

    /**
     * Auto generated setter method
     * @param param PaymentOperation
     */
    public void setPaymentOperation(
        merchant.Operation param) {
        this.localPaymentOperation = param;
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
                    namespacePrefix + ":awardBonus", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "awardBonus", xmlWriter);
            }
        }

        if (localApprovedAmountAward != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "approvedAmountAward",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localApprovedAmountAward), xmlWriter);
        }

        if (localDepositedAmountAward != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "depositedAmountAward",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localDepositedAmountAward), xmlWriter);
        }

        if (localRefundedAmountAward != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "refundedAmountAward",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localRefundedAmountAward), xmlWriter);
        }

        if (localPcId != null) {
            writeAttribute("", "pcId",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localPcId), xmlWriter);
        }

        if (true) {
            writeAttribute("", "successful",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localSuccessful), xmlWriter);
        }

        if (localPaymentOperation != null) {
            writeAttribute("", "paymentOperation",
                localPaymentOperation.toString(), xmlWriter);
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
        public static AwardBonus parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            AwardBonus object = new AwardBonus();

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

                        if (!"awardBonus".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (AwardBonus) merchant.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "approvedAmountAward"
                java.lang.String tempAttribApprovedAmountAward = reader.getAttributeValue(null,
                        "approvedAmountAward");

                if (tempAttribApprovedAmountAward != null) {
                    java.lang.String content = tempAttribApprovedAmountAward;

                    object.setApprovedAmountAward(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribApprovedAmountAward));
                } else {
                    object.setApprovedAmountAward(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("approvedAmountAward");

                // handle attribute "depositedAmountAward"
                java.lang.String tempAttribDepositedAmountAward = reader.getAttributeValue(null,
                        "depositedAmountAward");

                if (tempAttribDepositedAmountAward != null) {
                    java.lang.String content = tempAttribDepositedAmountAward;

                    object.setDepositedAmountAward(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribDepositedAmountAward));
                } else {
                    object.setDepositedAmountAward(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("depositedAmountAward");

                // handle attribute "refundedAmountAward"
                java.lang.String tempAttribRefundedAmountAward = reader.getAttributeValue(null,
                        "refundedAmountAward");

                if (tempAttribRefundedAmountAward != null) {
                    java.lang.String content = tempAttribRefundedAmountAward;

                    object.setRefundedAmountAward(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribRefundedAmountAward));
                } else {
                    object.setRefundedAmountAward(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("refundedAmountAward");

                // handle attribute "pcId"
                java.lang.String tempAttribPcId = reader.getAttributeValue(null,
                        "pcId");

                if (tempAttribPcId != null) {
                    java.lang.String content = tempAttribPcId;

                    object.setPcId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribPcId));
                } else {
                }

                handledAttributes.add("pcId");

                // handle attribute "successful"
                java.lang.String tempAttribSuccessful = reader.getAttributeValue(null,
                        "successful");

                if (tempAttribSuccessful != null) {
                    java.lang.String content = tempAttribSuccessful;

                    object.setSuccessful(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            tempAttribSuccessful));
                } else {
                }

                handledAttributes.add("successful");

                // handle attribute "paymentOperation"
                java.lang.String tempAttribPaymentOperation = reader.getAttributeValue(null,
                        "paymentOperation");

                if (tempAttribPaymentOperation != null) {
                    java.lang.String content = tempAttribPaymentOperation;

                    object.setPaymentOperation(merchant.Operation.Factory.fromString(
                            reader, tempAttribPaymentOperation));
                } else {
                }

                handledAttributes.add("paymentOperation");

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
