/**
 * RawSumRefundRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package merchant;


/**
 *  RawSumRefundRequest bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class RawSumRefundRequest extends AbstractServiceRequest
    implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = rawSumRefundRequest
       Namespace URI = http://engine.paymentgate.ru/webservices/merchant
       Namespace Prefix = ns1
     */

    /**
     * field for OrderId
     * This was an Attribute!
     */
    protected String localOrderId;

    /**
     * field for Name
     * This was an Attribute!
     */
    protected String localName;

    /**
     * field for ItemAmount
     * This was an Attribute!
     */
    protected long localItemAmount;

    /**
     * field for ItemCode
     * This was an Attribute!
     */
    protected String localItemCode;

    /**
     * field for Tax
     * This was an Attribute!
     */
    protected TaxType localTax;

    /**
     * field for ExpectedDepositedAmount
     * This was an Attribute!
     */
    protected long localExpectedDepositedAmount;

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public String getOrderId() {
        return localOrderId;
    }

    /**
     * Auto generated setter method
     * @param param OrderId
     */
    public void setOrderId(String param) {
        this.localOrderId = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public String getName() {
        return localName;
    }

    /**
     * Auto generated setter method
     * @param param Name
     */
    public void setName(String param) {
        this.localName = param;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getItemAmount() {
        return localItemAmount;
    }

    /**
     * Auto generated setter method
     * @param param ItemAmount
     */
    public void setItemAmount(long param) {
        this.localItemAmount = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public String getItemCode() {
        return localItemCode;
    }

    /**
     * Auto generated setter method
     * @param param ItemCode
     */
    public void setItemCode(String param) {
        this.localItemCode = param;
    }

    /**
     * Auto generated getter method
     * @return ru.paymentgate.engine.webservices.merchant.TaxType
     */
    public TaxType getTax() {
        return localTax;
    }

    /**
     * Auto generated setter method
     * @param param Tax
     */
    public void setTax(TaxType param) {
        this.localTax = param;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getExpectedDepositedAmount() {
        return localExpectedDepositedAmount;
    }

    /**
     * Auto generated setter method
     * @param param ExpectedDepositedAmount
     */
    public void setExpectedDepositedAmount(long param) {
        this.localExpectedDepositedAmount = param;
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
                "type", namespacePrefix + ":rawSumRefundRequest", xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "type", "rawSumRefundRequest", xmlWriter);
        }

        if (localLanguage != null) {
            writeAttribute("", "language",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localLanguage), xmlWriter);
        }

        if (localOrderId != null) {
            writeAttribute("", "orderId",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localOrderId), xmlWriter);
        }

        if (localName != null) {
            writeAttribute("", "name",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localName), xmlWriter);
        }

        if (localItemAmount != Long.MIN_VALUE) {
            writeAttribute("", "itemAmount",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localItemAmount), xmlWriter);
        }

        if (localItemCode != null) {
            writeAttribute("", "itemCode",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localItemCode), xmlWriter);
        }

        if (localTax != null) {
            writeAttribute("", "tax", localTax.toString(), xmlWriter);
        }

        if (localExpectedDepositedAmount != Long.MIN_VALUE) {
            writeAttribute("", "expectedDepositedAmount",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localExpectedDepositedAmount), xmlWriter);
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
        public static RawSumRefundRequest parse(
            javax.xml.stream.XMLStreamReader reader) throws Exception {
            RawSumRefundRequest object = new RawSumRefundRequest();

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

                        if (!"rawSumRefundRequest".equals(type)) {
                            //find namespace for the prefix
                            String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (RawSumRefundRequest) ExtensionMapper.getTypeObject(nsUri,
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

                // handle attribute "orderId"
                String tempAttribOrderId = reader.getAttributeValue(null,
                        "orderId");

                if (tempAttribOrderId != null) {
                    String content = tempAttribOrderId;

                    object.setOrderId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribOrderId));
                } else {
                }

                handledAttributes.add("orderId");

                // handle attribute "name"
                String tempAttribName = reader.getAttributeValue(null,
                        "name");

                if (tempAttribName != null) {
                    String content = tempAttribName;

                    object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribName));
                } else {
                }

                handledAttributes.add("name");

                // handle attribute "itemAmount"
                String tempAttribItemAmount = reader.getAttributeValue(null,
                        "itemAmount");

                if (tempAttribItemAmount != null) {
                    String content = tempAttribItemAmount;

                    object.setItemAmount(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            tempAttribItemAmount));
                } else {
                    object.setItemAmount(Long.MIN_VALUE);
                }

                handledAttributes.add("itemAmount");

                // handle attribute "itemCode"
                String tempAttribItemCode = reader.getAttributeValue(null,
                        "itemCode");

                if (tempAttribItemCode != null) {
                    String content = tempAttribItemCode;

                    object.setItemCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribItemCode));
                } else {
                }

                handledAttributes.add("itemCode");

                // handle attribute "tax"
                String tempAttribTax = reader.getAttributeValue(null,
                        "tax");

                if (tempAttribTax != null) {
                    String content = tempAttribTax;

                    object.setTax(TaxType.Factory.fromString(
                            reader, tempAttribTax));
                } else {
                }

                handledAttributes.add("tax");

                // handle attribute "expectedDepositedAmount"
                String tempAttribExpectedDepositedAmount = reader.getAttributeValue(null,
                        "expectedDepositedAmount");

                if (tempAttribExpectedDepositedAmount != null) {
                    String content = tempAttribExpectedDepositedAmount;

                    object.setExpectedDepositedAmount(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            tempAttribExpectedDepositedAmount));
                } else {
                    object.setExpectedDepositedAmount(Long.MIN_VALUE);
                }

                handledAttributes.add("expectedDepositedAmount");

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
