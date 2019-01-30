/**
 * CardAuthInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package merchant;


/**
 *  CardAuthInfo bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class CardAuthInfo implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = cardAuthInfo
       Namespace URI = http://engine.paymentgate.ru/webservices/merchant
       Namespace Prefix = ns1
     */

    /**
     * field for SecureAuthInfo
     */
    protected SecureAuthInfo localSecureAuthInfo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSecureAuthInfoTracker = false;

    /**
     * field for MaskedPan
     * This was an Attribute!
     */
    protected String localMaskedPan;

    /**
     * field for Expiration
     * This was an Attribute!
     */
    protected String localExpiration;

    /**
     * field for CardholderName
     * This was an Attribute!
     */
    protected String localCardholderName;

    /**
     * field for ApprovalCode
     * This was an Attribute!
     */
    protected String localApprovalCode;

    /**
     * field for PaymentSystem
     * This was an Attribute!
     */
    protected String localPaymentSystem;

    /**
     * field for Product
     * This was an Attribute!
     */
    protected String localProduct;

    public boolean isSecureAuthInfoSpecified() {
        return localSecureAuthInfoTracker;
    }

    /**
     * Auto generated getter method
     * @return ru.paymentgate.engine.webservices.merchant.SecureAuthInfo
     */
    public SecureAuthInfo getSecureAuthInfo() {
        return localSecureAuthInfo;
    }

    /**
     * Auto generated setter method
     * @param param SecureAuthInfo
     */
    public void setSecureAuthInfo(
        SecureAuthInfo param) {
        localSecureAuthInfoTracker = param != null;

        this.localSecureAuthInfo = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public String getMaskedPan() {
        return localMaskedPan;
    }

    /**
     * Auto generated setter method
     * @param param MaskedPan
     */
    public void setMaskedPan(String param) {
        this.localMaskedPan = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public String getExpiration() {
        return localExpiration;
    }

    /**
     * Auto generated setter method
     * @param param Expiration
     */
    public void setExpiration(String param) {
        this.localExpiration = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public String getCardholderName() {
        return localCardholderName;
    }

    /**
     * Auto generated setter method
     * @param param CardholderName
     */
    public void setCardholderName(String param) {
        this.localCardholderName = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public String getApprovalCode() {
        return localApprovalCode;
    }

    /**
     * Auto generated setter method
     * @param param ApprovalCode
     */
    public void setApprovalCode(String param) {
        this.localApprovalCode = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public String getPaymentSystem() {
        return localPaymentSystem;
    }

    /**
     * Auto generated setter method
     * @param param PaymentSystem
     */
    public void setPaymentSystem(String param) {
        this.localPaymentSystem = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public String getProduct() {
        return localProduct;
    }

    /**
     * Auto generated setter method
     * @param param Product
     */
    public void setProduct(String param) {
        this.localProduct = param;
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
                    namespacePrefix + ":cardAuthInfo", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "cardAuthInfo", xmlWriter);
            }
        }

        if (localMaskedPan != null) {
            writeAttribute("", "maskedPan",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localMaskedPan), xmlWriter);
        }

        if (localExpiration != null) {
            writeAttribute("", "expiration",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localExpiration), xmlWriter);
        }

        if (localCardholderName != null) {
            writeAttribute("", "cardholderName",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCardholderName), xmlWriter);
        }

        if (localApprovalCode != null) {
            writeAttribute("", "approvalCode",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localApprovalCode), xmlWriter);
        }

        if (localPaymentSystem != null) {
            writeAttribute("", "paymentSystem",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localPaymentSystem), xmlWriter);
        }

        if (localProduct != null) {
            writeAttribute("", "product",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localProduct), xmlWriter);
        }

        if (localSecureAuthInfoTracker) {
            if (localSecureAuthInfo == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "secureAuthInfo cannot be null!!");
            }

            localSecureAuthInfo.serialize(new javax.xml.namespace.QName("",
                    "secureAuthInfo"), xmlWriter);
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
        public static CardAuthInfo parse(
            javax.xml.stream.XMLStreamReader reader) throws Exception {
            CardAuthInfo object = new CardAuthInfo();

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

                        if (!"cardAuthInfo".equals(type)) {
                            //find namespace for the prefix
                            String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (CardAuthInfo) ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "maskedPan"
                String tempAttribMaskedPan = reader.getAttributeValue(null,
                        "maskedPan");

                if (tempAttribMaskedPan != null) {
                    String content = tempAttribMaskedPan;

                    object.setMaskedPan(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribMaskedPan));
                } else {
                }

                handledAttributes.add("maskedPan");

                // handle attribute "expiration"
                String tempAttribExpiration = reader.getAttributeValue(null,
                        "expiration");

                if (tempAttribExpiration != null) {
                    String content = tempAttribExpiration;

                    object.setExpiration(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribExpiration));
                } else {
                }

                handledAttributes.add("expiration");

                // handle attribute "cardholderName"
                String tempAttribCardholderName = reader.getAttributeValue(null,
                        "cardholderName");

                if (tempAttribCardholderName != null) {
                    String content = tempAttribCardholderName;

                    object.setCardholderName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribCardholderName));
                } else {
                }

                handledAttributes.add("cardholderName");

                // handle attribute "approvalCode"
                String tempAttribApprovalCode = reader.getAttributeValue(null,
                        "approvalCode");

                if (tempAttribApprovalCode != null) {
                    String content = tempAttribApprovalCode;

                    object.setApprovalCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribApprovalCode));
                } else {
                }

                handledAttributes.add("approvalCode");

                // handle attribute "paymentSystem"
                String tempAttribPaymentSystem = reader.getAttributeValue(null,
                        "paymentSystem");

                if (tempAttribPaymentSystem != null) {
                    String content = tempAttribPaymentSystem;

                    object.setPaymentSystem(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribPaymentSystem));
                } else {
                }

                handledAttributes.add("paymentSystem");

                // handle attribute "product"
                String tempAttribProduct = reader.getAttributeValue(null,
                        "product");

                if (tempAttribProduct != null) {
                    String content = tempAttribProduct;

                    object.setProduct(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribProduct));
                } else {
                }

                handledAttributes.add("product");

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "secureAuthInfo").equals(
                            reader.getName())) {
                    object.setSecureAuthInfo(SecureAuthInfo.Factory.parse(
                            reader));

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
                throw new Exception(e);
            }

            return object;
        }
    } //end of factory class
}
