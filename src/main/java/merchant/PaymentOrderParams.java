/**
 * PaymentOrderParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package merchant;


/**
 *  PaymentOrderParams bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class PaymentOrderParams implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = paymentOrderParams
       Namespace URI = http://engine.paymentgate.ru/webservices/merchant
       Namespace Prefix = ns1
     */

    /**
     * field for Params
     * This was an Array!
     */
    protected merchant.ServiceParam[] localParams;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localParamsTracker = false;

    /**
     * field for OrderId
     * This was an Attribute!
     */
    protected java.lang.String localOrderId;

    /**
     * field for Year
     * This was an Attribute!
     */
    protected java.lang.String localYear;

    /**
     * field for Month
     * This was an Attribute!
     */
    protected java.lang.String localMonth;

    /**
     * field for Pan
     * This was an Attribute!
     */
    protected java.lang.String localPan;

    /**
     * field for Cvc
     * This was an Attribute!
     */
    protected java.lang.String localCvc;

    /**
     * field for CardholderName
     * This was an Attribute!
     */
    protected java.lang.String localCardholderName;

    /**
     * field for Language
     * This was an Attribute!
     */
    protected java.lang.String localLanguage;

    /**
     * field for Ip
     * This was an Attribute!
     */
    protected java.lang.String localIp;

    /**
     * field for Email
     * This was an Attribute!
     */
    protected java.lang.String localEmail;

    /**
     * field for PostAddress
     * This was an Attribute!
     */
    protected java.lang.String localPostAddress;

    /**
     * field for PointsAmount
     * This was an Attribute!
     */
    protected java.lang.String localPointsAmount;

    /**
     * field for LoyaltyId
     * This was an Attribute!
     */
    protected java.lang.String localLoyaltyId;

    public boolean isParamsSpecified() {
        return localParamsTracker;
    }

    /**
     * Auto generated getter method
     * @return merchant.ServiceParam[]
     */
    public merchant.ServiceParam[] getParams() {
        return localParams;
    }

    /**
     * validate the array for Params
     */
    protected void validateParams(
        merchant.ServiceParam[] param) {
    }

    /**
     * Auto generated setter method
     * @param param Params
     */
    public void setParams(
        merchant.ServiceParam[] param) {
        validateParams(param);

        localParamsTracker = param != null;

        this.localParams = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param merchant.ServiceParam
     */
    public void addParams(
        merchant.ServiceParam param) {
        if (localParams == null) {
            localParams = new merchant.ServiceParam[] {
                    
                };
        }

        //update the setting tracker
        localParamsTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localParams);
        list.add(param);
        this.localParams = (merchant.ServiceParam[]) list.toArray(new merchant.ServiceParam[list.size()]);
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getOrderId() {
        return localOrderId;
    }

    /**
     * Auto generated setter method
     * @param param OrderId
     */
    public void setOrderId(java.lang.String param) {
        this.localOrderId = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getYear() {
        return localYear;
    }

    /**
     * Auto generated setter method
     * @param param Year
     */
    public void setYear(java.lang.String param) {
        this.localYear = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMonth() {
        return localMonth;
    }

    /**
     * Auto generated setter method
     * @param param Month
     */
    public void setMonth(java.lang.String param) {
        this.localMonth = param;
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
    public java.lang.String getCvc() {
        return localCvc;
    }

    /**
     * Auto generated setter method
     * @param param Cvc
     */
    public void setCvc(java.lang.String param) {
        this.localCvc = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCardholderName() {
        return localCardholderName;
    }

    /**
     * Auto generated setter method
     * @param param CardholderName
     */
    public void setCardholderName(java.lang.String param) {
        this.localCardholderName = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getLanguage() {
        return localLanguage;
    }

    /**
     * Auto generated setter method
     * @param param Language
     */
    public void setLanguage(java.lang.String param) {
        this.localLanguage = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getIp() {
        return localIp;
    }

    /**
     * Auto generated setter method
     * @param param Ip
     */
    public void setIp(java.lang.String param) {
        this.localIp = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEmail() {
        return localEmail;
    }

    /**
     * Auto generated setter method
     * @param param Email
     */
    public void setEmail(java.lang.String param) {
        this.localEmail = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPostAddress() {
        return localPostAddress;
    }

    /**
     * Auto generated setter method
     * @param param PostAddress
     */
    public void setPostAddress(java.lang.String param) {
        this.localPostAddress = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPointsAmount() {
        return localPointsAmount;
    }

    /**
     * Auto generated setter method
     * @param param PointsAmount
     */
    public void setPointsAmount(java.lang.String param) {
        this.localPointsAmount = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getLoyaltyId() {
        return localLoyaltyId;
    }

    /**
     * Auto generated setter method
     * @param param LoyaltyId
     */
    public void setLoyaltyId(java.lang.String param) {
        this.localLoyaltyId = param;
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
                    namespacePrefix + ":paymentOrderParams", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "paymentOrderParams", xmlWriter);
            }
        }

        if (localOrderId != null) {
            writeAttribute("", "orderId",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localOrderId), xmlWriter);
        }

        if (localYear != null) {
            writeAttribute("", "year",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localYear), xmlWriter);
        }

        if (localMonth != null) {
            writeAttribute("", "month",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localMonth), xmlWriter);
        }

        if (localPan != null) {
            writeAttribute("", "pan",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localPan), xmlWriter);
        }

        if (localCvc != null) {
            writeAttribute("", "cvc",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCvc), xmlWriter);
        }

        if (localCardholderName != null) {
            writeAttribute("", "cardholderName",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCardholderName), xmlWriter);
        }

        if (localLanguage != null) {
            writeAttribute("", "language",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localLanguage), xmlWriter);
        }

        if (localIp != null) {
            writeAttribute("", "ip",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localIp), xmlWriter);
        }

        if (localEmail != null) {
            writeAttribute("", "email",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localEmail), xmlWriter);
        }

        if (localPostAddress != null) {
            writeAttribute("", "postAddress",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localPostAddress), xmlWriter);
        }

        if (localPointsAmount != null) {
            writeAttribute("", "pointsAmount",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localPointsAmount), xmlWriter);
        }

        if (localLoyaltyId != null) {
            writeAttribute("", "loyaltyId",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localLoyaltyId), xmlWriter);
        }

        if (localParamsTracker) {
            if (localParams != null) {
                for (int i = 0; i < localParams.length; i++) {
                    if (localParams[i] != null) {
                        localParams[i].serialize(new javax.xml.namespace.QName(
                                "", "params"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "params cannot be null!!");
            }
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
        public static PaymentOrderParams parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            PaymentOrderParams object = new PaymentOrderParams();

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

                        if (!"paymentOrderParams".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (PaymentOrderParams) merchant.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "orderId"
                java.lang.String tempAttribOrderId = reader.getAttributeValue(null,
                        "orderId");

                if (tempAttribOrderId != null) {
                    java.lang.String content = tempAttribOrderId;

                    object.setOrderId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribOrderId));
                } else {
                }

                handledAttributes.add("orderId");

                // handle attribute "year"
                java.lang.String tempAttribYear = reader.getAttributeValue(null,
                        "year");

                if (tempAttribYear != null) {
                    java.lang.String content = tempAttribYear;

                    object.setYear(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribYear));
                } else {
                }

                handledAttributes.add("year");

                // handle attribute "month"
                java.lang.String tempAttribMonth = reader.getAttributeValue(null,
                        "month");

                if (tempAttribMonth != null) {
                    java.lang.String content = tempAttribMonth;

                    object.setMonth(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribMonth));
                } else {
                }

                handledAttributes.add("month");

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

                // handle attribute "cvc"
                java.lang.String tempAttribCvc = reader.getAttributeValue(null,
                        "cvc");

                if (tempAttribCvc != null) {
                    java.lang.String content = tempAttribCvc;

                    object.setCvc(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribCvc));
                } else {
                }

                handledAttributes.add("cvc");

                // handle attribute "cardholderName"
                java.lang.String tempAttribCardholderName = reader.getAttributeValue(null,
                        "cardholderName");

                if (tempAttribCardholderName != null) {
                    java.lang.String content = tempAttribCardholderName;

                    object.setCardholderName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribCardholderName));
                } else {
                }

                handledAttributes.add("cardholderName");

                // handle attribute "language"
                java.lang.String tempAttribLanguage = reader.getAttributeValue(null,
                        "language");

                if (tempAttribLanguage != null) {
                    java.lang.String content = tempAttribLanguage;

                    object.setLanguage(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribLanguage));
                } else {
                }

                handledAttributes.add("language");

                // handle attribute "ip"
                java.lang.String tempAttribIp = reader.getAttributeValue(null,
                        "ip");

                if (tempAttribIp != null) {
                    java.lang.String content = tempAttribIp;

                    object.setIp(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribIp));
                } else {
                }

                handledAttributes.add("ip");

                // handle attribute "email"
                java.lang.String tempAttribEmail = reader.getAttributeValue(null,
                        "email");

                if (tempAttribEmail != null) {
                    java.lang.String content = tempAttribEmail;

                    object.setEmail(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribEmail));
                } else {
                }

                handledAttributes.add("email");

                // handle attribute "postAddress"
                java.lang.String tempAttribPostAddress = reader.getAttributeValue(null,
                        "postAddress");

                if (tempAttribPostAddress != null) {
                    java.lang.String content = tempAttribPostAddress;

                    object.setPostAddress(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribPostAddress));
                } else {
                }

                handledAttributes.add("postAddress");

                // handle attribute "pointsAmount"
                java.lang.String tempAttribPointsAmount = reader.getAttributeValue(null,
                        "pointsAmount");

                if (tempAttribPointsAmount != null) {
                    java.lang.String content = tempAttribPointsAmount;

                    object.setPointsAmount(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribPointsAmount));
                } else {
                }

                handledAttributes.add("pointsAmount");

                // handle attribute "loyaltyId"
                java.lang.String tempAttribLoyaltyId = reader.getAttributeValue(null,
                        "loyaltyId");

                if (tempAttribLoyaltyId != null) {
                    java.lang.String content = tempAttribLoyaltyId;

                    object.setLoyaltyId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribLoyaltyId));
                } else {
                }

                handledAttributes.add("loyaltyId");

                reader.next();

                java.util.ArrayList list1 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "params").equals(
                            reader.getName())) {
                    // Process the array and step past its final element's end.
                    list1.add(merchant.ServiceParam.Factory.parse(
                            reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone1 = false;

                    while (!loopDone1) {
                        // We should be at the end element, but make sure
                        while (!reader.isEndElement())
                            reader.next();

                        // Step out of this element
                        reader.next();

                        // Step to next element event.
                        while (!reader.isStartElement() &&
                                !reader.isEndElement())
                            reader.next();

                        if (reader.isEndElement()) {
                            //two continuous end elements means we are exiting the xml structure
                            loopDone1 = true;
                        } else {
                            if (new javax.xml.namespace.QName("", "params").equals(
                                        reader.getName())) {
                                list1.add(merchant.ServiceParam.Factory.parse(
                                        reader));
                            } else {
                                loopDone1 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setParams((merchant.ServiceParam[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            merchant.ServiceParam.class,
                            list1));
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
