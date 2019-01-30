/**
 * PaymentBonus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package merchant;


/**
 *  PaymentBonus bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class PaymentBonus implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = paymentBonus
       Namespace URI = http://engine.paymentgate.ru/webservices/merchant
       Namespace Prefix = ns1
     */

    /**
     * field for ApprovedAmountBonus
     * This was an Attribute!
     */
    protected int localApprovedAmountBonus;

    /**
     * field for DepositedAmountBonus
     * This was an Attribute!
     */
    protected int localDepositedAmountBonus;

    /**
     * field for RefundedAmountBonus
     * This was an Attribute!
     */
    protected int localRefundedAmountBonus;

    /**
     * field for PcId
     * This was an Attribute!
     */
    protected String localPcId;

    /**
     * field for Successful
     * This was an Attribute!
     */
    protected boolean localSuccessful;

    /**
     * field for PaymentOperation
     * This was an Attribute!
     */
    protected Operation localPaymentOperation;

    /**
     * Auto generated getter method
     * @return int
     */
    public int getApprovedAmountBonus() {
        return localApprovedAmountBonus;
    }

    /**
     * Auto generated setter method
     * @param param ApprovedAmountBonus
     */
    public void setApprovedAmountBonus(int param) {
        this.localApprovedAmountBonus = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getDepositedAmountBonus() {
        return localDepositedAmountBonus;
    }

    /**
     * Auto generated setter method
     * @param param DepositedAmountBonus
     */
    public void setDepositedAmountBonus(int param) {
        this.localDepositedAmountBonus = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getRefundedAmountBonus() {
        return localRefundedAmountBonus;
    }

    /**
     * Auto generated setter method
     * @param param RefundedAmountBonus
     */
    public void setRefundedAmountBonus(int param) {
        this.localRefundedAmountBonus = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public String getPcId() {
        return localPcId;
    }

    /**
     * Auto generated setter method
     * @param param PcId
     */
    public void setPcId(String param) {
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
     * @return ru.paymentgate.engine.webservices.merchant.Operation
     */
    public Operation getPaymentOperation() {
        return localPaymentOperation;
    }

    /**
     * Auto generated setter method
     * @param param PaymentOperation
     */
    public void setPaymentOperation(
        Operation param) {
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
                    namespacePrefix + ":paymentBonus", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "paymentBonus", xmlWriter);
            }
        }

        if (localApprovedAmountBonus != Integer.MIN_VALUE) {
            writeAttribute("", "approvedAmountBonus",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localApprovedAmountBonus), xmlWriter);
        }

        if (localDepositedAmountBonus != Integer.MIN_VALUE) {
            writeAttribute("", "depositedAmountBonus",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localDepositedAmountBonus), xmlWriter);
        }

        if (localRefundedAmountBonus != Integer.MIN_VALUE) {
            writeAttribute("", "refundedAmountBonus",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localRefundedAmountBonus), xmlWriter);
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
        public static PaymentBonus parse(
            javax.xml.stream.XMLStreamReader reader) throws Exception {
            PaymentBonus object = new PaymentBonus();

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

                        if (!"paymentBonus".equals(type)) {
                            //find namespace for the prefix
                            String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (PaymentBonus) ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "approvedAmountBonus"
                String tempAttribApprovedAmountBonus = reader.getAttributeValue(null,
                        "approvedAmountBonus");

                if (tempAttribApprovedAmountBonus != null) {
                    String content = tempAttribApprovedAmountBonus;

                    object.setApprovedAmountBonus(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribApprovedAmountBonus));
                } else {
                    object.setApprovedAmountBonus(Integer.MIN_VALUE);
                }

                handledAttributes.add("approvedAmountBonus");

                // handle attribute "depositedAmountBonus"
                String tempAttribDepositedAmountBonus = reader.getAttributeValue(null,
                        "depositedAmountBonus");

                if (tempAttribDepositedAmountBonus != null) {
                    String content = tempAttribDepositedAmountBonus;

                    object.setDepositedAmountBonus(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribDepositedAmountBonus));
                } else {
                    object.setDepositedAmountBonus(Integer.MIN_VALUE);
                }

                handledAttributes.add("depositedAmountBonus");

                // handle attribute "refundedAmountBonus"
                String tempAttribRefundedAmountBonus = reader.getAttributeValue(null,
                        "refundedAmountBonus");

                if (tempAttribRefundedAmountBonus != null) {
                    String content = tempAttribRefundedAmountBonus;

                    object.setRefundedAmountBonus(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribRefundedAmountBonus));
                } else {
                    object.setRefundedAmountBonus(Integer.MIN_VALUE);
                }

                handledAttributes.add("refundedAmountBonus");

                // handle attribute "pcId"
                String tempAttribPcId = reader.getAttributeValue(null,
                        "pcId");

                if (tempAttribPcId != null) {
                    String content = tempAttribPcId;

                    object.setPcId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribPcId));
                } else {
                }

                handledAttributes.add("pcId");

                // handle attribute "successful"
                String tempAttribSuccessful = reader.getAttributeValue(null,
                        "successful");

                if (tempAttribSuccessful != null) {
                    String content = tempAttribSuccessful;

                    object.setSuccessful(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            tempAttribSuccessful));
                } else {
                }

                handledAttributes.add("successful");

                // handle attribute "paymentOperation"
                String tempAttribPaymentOperation = reader.getAttributeValue(null,
                        "paymentOperation");

                if (tempAttribPaymentOperation != null) {
                    String content = tempAttribPaymentOperation;

                    object.setPaymentOperation(Operation.Factory.fromString(
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
                throw new Exception(e);
            }

            return object;
        }
    } //end of factory class
}
