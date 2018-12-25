/**
 * PaymentAmountInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package merchant;


/**
 *  PaymentAmountInfo bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class PaymentAmountInfo implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = paymentAmountInfo
       Namespace URI = http://engine.paymentgate.ru/webservices/merchant
       Namespace Prefix = ns1
     */

    /**
     * field for PaymentState
     * This was an Attribute!
     */
    protected merchant.TransactionState localPaymentState;

    /**
     * field for ApprovedAmount
     * This was an Attribute!
     */
    protected long localApprovedAmount;

    /**
     * field for DepositedAmount
     * This was an Attribute!
     */
    protected long localDepositedAmount;

    /**
     * field for RefundedAmount
     * This was an Attribute!
     */
    protected long localRefundedAmount;

    /**
     * field for FeeAmount
     * This was an Attribute!
     */
    protected long localFeeAmount;

    /**
     * Auto generated getter method
     * @return merchant.TransactionState
     */
    public merchant.TransactionState getPaymentState() {
        return localPaymentState;
    }

    /**
     * Auto generated setter method
     * @param param PaymentState
     */
    public void setPaymentState(
        merchant.TransactionState param) {
        this.localPaymentState = param;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getApprovedAmount() {
        return localApprovedAmount;
    }

    /**
     * Auto generated setter method
     * @param param ApprovedAmount
     */
    public void setApprovedAmount(long param) {
        this.localApprovedAmount = param;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getDepositedAmount() {
        return localDepositedAmount;
    }

    /**
     * Auto generated setter method
     * @param param DepositedAmount
     */
    public void setDepositedAmount(long param) {
        this.localDepositedAmount = param;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getRefundedAmount() {
        return localRefundedAmount;
    }

    /**
     * Auto generated setter method
     * @param param RefundedAmount
     */
    public void setRefundedAmount(long param) {
        this.localRefundedAmount = param;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getFeeAmount() {
        return localFeeAmount;
    }

    /**
     * Auto generated setter method
     * @param param FeeAmount
     */
    public void setFeeAmount(long param) {
        this.localFeeAmount = param;
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
                    namespacePrefix + ":paymentAmountInfo", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "paymentAmountInfo", xmlWriter);
            }
        }

        if (localPaymentState != null) {
            writeAttribute("", "paymentState", localPaymentState.toString(),
                xmlWriter);
        }

        if (localApprovedAmount != java.lang.Long.MIN_VALUE) {
            writeAttribute("", "approvedAmount",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localApprovedAmount), xmlWriter);
        }
        else {
            throw new org.apache.axis2.databinding.ADBException(
                "required attribute localApprovedAmount is null");
        }

        if (localDepositedAmount != java.lang.Long.MIN_VALUE) {
            writeAttribute("", "depositedAmount",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localDepositedAmount), xmlWriter);
        }
        else {
            throw new org.apache.axis2.databinding.ADBException(
                "required attribute localDepositedAmount is null");
        }

        if (localRefundedAmount != java.lang.Long.MIN_VALUE) {
            writeAttribute("", "refundedAmount",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localRefundedAmount), xmlWriter);
        }
        else {
            throw new org.apache.axis2.databinding.ADBException(
                "required attribute localRefundedAmount is null");
        }

        if (localFeeAmount != java.lang.Long.MIN_VALUE) {
            writeAttribute("", "feeAmount",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localFeeAmount), xmlWriter);
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
        public static PaymentAmountInfo parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            PaymentAmountInfo object = new PaymentAmountInfo();

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

                        if (!"paymentAmountInfo".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (PaymentAmountInfo) merchant.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "paymentState"
                java.lang.String tempAttribPaymentState = reader.getAttributeValue(null,
                        "paymentState");

                if (tempAttribPaymentState != null) {
                    java.lang.String content = tempAttribPaymentState;

                    object.setPaymentState(merchant.TransactionState.Factory.fromString(
                            reader, tempAttribPaymentState));
                } else {
                }

                handledAttributes.add("paymentState");

                // handle attribute "approvedAmount"
                java.lang.String tempAttribApprovedAmount = reader.getAttributeValue(null,
                        "approvedAmount");

                if (tempAttribApprovedAmount != null) {
                    java.lang.String content = tempAttribApprovedAmount;

                    object.setApprovedAmount(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            tempAttribApprovedAmount));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "Required attribute approvedAmount is missing");
                }

                handledAttributes.add("approvedAmount");

                // handle attribute "depositedAmount"
                java.lang.String tempAttribDepositedAmount = reader.getAttributeValue(null,
                        "depositedAmount");

                if (tempAttribDepositedAmount != null) {
                    java.lang.String content = tempAttribDepositedAmount;

                    object.setDepositedAmount(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            tempAttribDepositedAmount));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "Required attribute depositedAmount is missing");
                }

                handledAttributes.add("depositedAmount");

                // handle attribute "refundedAmount"
                java.lang.String tempAttribRefundedAmount = reader.getAttributeValue(null,
                        "refundedAmount");

                if (tempAttribRefundedAmount != null) {
                    java.lang.String content = tempAttribRefundedAmount;

                    object.setRefundedAmount(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            tempAttribRefundedAmount));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "Required attribute refundedAmount is missing");
                }

                handledAttributes.add("refundedAmount");

                // handle attribute "feeAmount"
                java.lang.String tempAttribFeeAmount = reader.getAttributeValue(null,
                        "feeAmount");

                if (tempAttribFeeAmount != null) {
                    java.lang.String content = tempAttribFeeAmount;

                    object.setFeeAmount(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            tempAttribFeeAmount));
                } else {
                    object.setFeeAmount(java.lang.Long.MIN_VALUE);
                }

                handledAttributes.add("feeAmount");

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
