/**
 * OrderStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package merchant;


/**
 *  OrderStatusResponse bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class OrderStatusResponse extends merchant.AbstractResponse
    implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = orderStatusResponse
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
     * field for OrderBundle
     */
    protected merchant.OrderBundle localOrderBundle;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOrderBundleTracker = false;

    /**
     * field for OrderStatus
     * This was an Attribute!
     */
    protected int localOrderStatus;

    /**
     * field for OrderNumber
     * This was an Attribute!
     */
    protected java.lang.String localOrderNumber;

    /**
     * field for Pan
     * This was an Attribute!
     */
    protected java.lang.String localPan;

    /**
     * field for Hpan
     * This was an Attribute!
     */
    protected java.lang.String localHpan;

    /**
     * field for Expiration
     * This was an Attribute!
     */
    protected java.lang.String localExpiration;

    /**
     * field for CardholderName
     * This was an Attribute!
     */
    protected java.lang.String localCardholderName;

    /**
     * field for Amount
     * This was an Attribute!
     */
    protected long localAmount;

    /**
     * field for Currency
     * This was an Attribute!
     */
    protected java.lang.String localCurrency;

    /**
     * field for ApprovalCode
     * This was an Attribute!
     */
    protected java.lang.String localApprovalCode;

    /**
     * field for AuthCode
     * This was an Attribute!
     */
    protected int localAuthCode;

    /**
     * field for Ip
     * This was an Attribute!
     */
    protected java.lang.String localIp;

    /**
     * field for Date
     * This was an Attribute!
     */
    protected java.util.Calendar localDate;

    /**
     * field for OrderDescription
     * This was an Attribute!
     */
    protected java.lang.String localOrderDescription;

    /**
     * field for MerchantLogin
     * This was an Attribute!
     */
    protected java.lang.String localMerchantLogin;

    /**
     * field for ActionCodeDescription
     * This was an Attribute!
     */
    protected java.lang.String localActionCodeDescription;

    /**
     * field for ClientId
     * This was an Attribute!
     */
    protected java.lang.String localClientId;

    /**
     * field for BindingId
     * This was an Attribute!
     */
    protected java.lang.String localBindingId;

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

    public boolean isOrderBundleSpecified() {
        return localOrderBundleTracker;
    }

    /**
     * Auto generated getter method
     * @return merchant.OrderBundle
     */
    public merchant.OrderBundle getOrderBundle() {
        return localOrderBundle;
    }

    /**
     * Auto generated setter method
     * @param param OrderBundle
     */
    public void setOrderBundle(
        merchant.OrderBundle param) {
        localOrderBundleTracker = param != null;

        this.localOrderBundle = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getOrderStatus() {
        return localOrderStatus;
    }

    /**
     * Auto generated setter method
     * @param param OrderStatus
     */
    public void setOrderStatus(int param) {
        this.localOrderStatus = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getOrderNumber() {
        return localOrderNumber;
    }

    /**
     * Auto generated setter method
     * @param param OrderNumber
     */
    public void setOrderNumber(java.lang.String param) {
        this.localOrderNumber = param;
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
    public java.lang.String getHpan() {
        return localHpan;
    }

    /**
     * Auto generated setter method
     * @param param Hpan
     */
    public void setHpan(java.lang.String param) {
        this.localHpan = param;
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
    public java.lang.String getCurrency() {
        return localCurrency;
    }

    /**
     * Auto generated setter method
     * @param param Currency
     */
    public void setCurrency(java.lang.String param) {
        this.localCurrency = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getApprovalCode() {
        return localApprovalCode;
    }

    /**
     * Auto generated setter method
     * @param param ApprovalCode
     */
    public void setApprovalCode(java.lang.String param) {
        this.localApprovalCode = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getAuthCode() {
        return localAuthCode;
    }

    /**
     * Auto generated setter method
     * @param param AuthCode
     */
    public void setAuthCode(int param) {
        this.localAuthCode = param;
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
     * @return java.util.Calendar
     */
    public java.util.Calendar getDate() {
        return localDate;
    }

    /**
     * Auto generated setter method
     * @param param Date
     */
    public void setDate(java.util.Calendar param) {
        this.localDate = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getOrderDescription() {
        return localOrderDescription;
    }

    /**
     * Auto generated setter method
     * @param param OrderDescription
     */
    public void setOrderDescription(java.lang.String param) {
        this.localOrderDescription = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMerchantLogin() {
        return localMerchantLogin;
    }

    /**
     * Auto generated setter method
     * @param param MerchantLogin
     */
    public void setMerchantLogin(java.lang.String param) {
        this.localMerchantLogin = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getActionCodeDescription() {
        return localActionCodeDescription;
    }

    /**
     * Auto generated setter method
     * @param param ActionCodeDescription
     */
    public void setActionCodeDescription(java.lang.String param) {
        this.localActionCodeDescription = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getClientId() {
        return localClientId;
    }

    /**
     * Auto generated setter method
     * @param param ClientId
     */
    public void setClientId(java.lang.String param) {
        this.localClientId = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getBindingId() {
        return localBindingId;
    }

    /**
     * Auto generated setter method
     * @param param BindingId
     */
    public void setBindingId(java.lang.String param) {
        this.localBindingId = param;
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

        java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                "http://engine.paymentgate.ru/webservices/merchant");

        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "type", namespacePrefix + ":orderStatusResponse", xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "type", "orderStatusResponse", xmlWriter);
        }

        if (localErrorCode != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "errorCode",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localErrorCode), xmlWriter);
        }
        else {
            throw new org.apache.axis2.databinding.ADBException(
                "required attribute localErrorCode is null");
        }

        if (localErrorMessage != null) {
            writeAttribute("", "errorMessage",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localErrorMessage), xmlWriter);
        }

        if (localOrderStatus != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "orderStatus",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localOrderStatus), xmlWriter);
        }
        else {
            throw new org.apache.axis2.databinding.ADBException(
                "required attribute localOrderStatus is null");
        }

        if (localOrderNumber != null) {
            writeAttribute("", "orderNumber",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localOrderNumber), xmlWriter);
        }

        if (localPan != null) {
            writeAttribute("", "pan",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localPan), xmlWriter);
        }

        if (localHpan != null) {
            writeAttribute("", "hpan",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localHpan), xmlWriter);
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

        if (localAmount != java.lang.Long.MIN_VALUE) {
            writeAttribute("", "amount",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localAmount), xmlWriter);
        }
        else {
            throw new org.apache.axis2.databinding.ADBException(
                "required attribute localAmount is null");
        }

        if (localCurrency != null) {
            writeAttribute("", "currency",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCurrency), xmlWriter);
        }

        if (localApprovalCode != null) {
            writeAttribute("", "approvalCode",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localApprovalCode), xmlWriter);
        }

        if (localAuthCode != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "authCode",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localAuthCode), xmlWriter);
        }
        else {
            throw new org.apache.axis2.databinding.ADBException(
                "required attribute localAuthCode is null");
        }

        if (localIp != null) {
            writeAttribute("", "ip",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localIp), xmlWriter);
        }

        if (localDate != null) {
            writeAttribute("", "date",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localDate), xmlWriter);
        }

        if (localOrderDescription != null) {
            writeAttribute("", "orderDescription",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localOrderDescription), xmlWriter);
        }

        if (localMerchantLogin != null) {
            writeAttribute("", "merchantLogin",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localMerchantLogin), xmlWriter);
        }

        if (localActionCodeDescription != null) {
            writeAttribute("", "actionCodeDescription",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localActionCodeDescription), xmlWriter);
        }

        if (localClientId != null) {
            writeAttribute("", "clientId",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localClientId), xmlWriter);
        }

        if (localBindingId != null) {
            writeAttribute("", "bindingId",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localBindingId), xmlWriter);
        }

        if (localOperationsTracker) {
            if (localOperations != null) {
                for (int i = 0; i < localOperations.length; i++) {
                    if (localOperations[i] != null) {
                        localOperations[i].serialize(new javax.xml.namespace.QName(
                                "", "operations"), xmlWriter);
                    } else {
                        writeStartElement(null, "", "operations", xmlWriter);

                        // write the nil attribute
                        writeAttribute("xsi",
                            "http://www.w3.org/2001/XMLSchema-instance", "nil",
                            "1", xmlWriter);
                        xmlWriter.writeEndElement();
                    }
                }
            } else {
                writeStartElement(null, "", "operations", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
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

        if (localOrderBundleTracker) {
            if (localOrderBundle == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "orderBundle cannot be null!!");
            }

            localOrderBundle.serialize(new javax.xml.namespace.QName("",
                    "orderBundle"), xmlWriter);
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
        public static OrderStatusResponse parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            OrderStatusResponse object = new OrderStatusResponse();

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

                        if (!"orderStatusResponse".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (OrderStatusResponse) merchant.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "errorCode"
                java.lang.String tempAttribErrorCode = reader.getAttributeValue(null,
                        "errorCode");

                if (tempAttribErrorCode != null) {
                    java.lang.String content = tempAttribErrorCode;

                    object.setErrorCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribErrorCode));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "Required attribute errorCode is missing");
                }

                handledAttributes.add("errorCode");

                // handle attribute "errorMessage"
                java.lang.String tempAttribErrorMessage = reader.getAttributeValue(null,
                        "errorMessage");

                if (tempAttribErrorMessage != null) {
                    java.lang.String content = tempAttribErrorMessage;

                    object.setErrorMessage(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribErrorMessage));
                } else {
                }

                handledAttributes.add("errorMessage");

                // handle attribute "orderStatus"
                java.lang.String tempAttribOrderStatus = reader.getAttributeValue(null,
                        "orderStatus");

                if (tempAttribOrderStatus != null) {
                    java.lang.String content = tempAttribOrderStatus;

                    object.setOrderStatus(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribOrderStatus));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "Required attribute orderStatus is missing");
                }

                handledAttributes.add("orderStatus");

                // handle attribute "orderNumber"
                java.lang.String tempAttribOrderNumber = reader.getAttributeValue(null,
                        "orderNumber");

                if (tempAttribOrderNumber != null) {
                    java.lang.String content = tempAttribOrderNumber;

                    object.setOrderNumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribOrderNumber));
                } else {
                }

                handledAttributes.add("orderNumber");

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

                // handle attribute "hpan"
                java.lang.String tempAttribHpan = reader.getAttributeValue(null,
                        "hpan");

                if (tempAttribHpan != null) {
                    java.lang.String content = tempAttribHpan;

                    object.setHpan(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribHpan));
                } else {
                }

                handledAttributes.add("hpan");

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

                // handle attribute "amount"
                java.lang.String tempAttribAmount = reader.getAttributeValue(null,
                        "amount");

                if (tempAttribAmount != null) {
                    java.lang.String content = tempAttribAmount;

                    object.setAmount(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            tempAttribAmount));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "Required attribute amount is missing");
                }

                handledAttributes.add("amount");

                // handle attribute "currency"
                java.lang.String tempAttribCurrency = reader.getAttributeValue(null,
                        "currency");

                if (tempAttribCurrency != null) {
                    java.lang.String content = tempAttribCurrency;

                    object.setCurrency(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribCurrency));
                } else {
                }

                handledAttributes.add("currency");

                // handle attribute "approvalCode"
                java.lang.String tempAttribApprovalCode = reader.getAttributeValue(null,
                        "approvalCode");

                if (tempAttribApprovalCode != null) {
                    java.lang.String content = tempAttribApprovalCode;

                    object.setApprovalCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribApprovalCode));
                } else {
                }

                handledAttributes.add("approvalCode");

                // handle attribute "authCode"
                java.lang.String tempAttribAuthCode = reader.getAttributeValue(null,
                        "authCode");

                if (tempAttribAuthCode != null) {
                    java.lang.String content = tempAttribAuthCode;

                    object.setAuthCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribAuthCode));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "Required attribute authCode is missing");
                }

                handledAttributes.add("authCode");

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

                // handle attribute "date"
                java.lang.String tempAttribDate = reader.getAttributeValue(null,
                        "date");

                if (tempAttribDate != null) {
                    java.lang.String content = tempAttribDate;

                    object.setDate(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDate));
                } else {
                }

                handledAttributes.add("date");

                // handle attribute "orderDescription"
                java.lang.String tempAttribOrderDescription = reader.getAttributeValue(null,
                        "orderDescription");

                if (tempAttribOrderDescription != null) {
                    java.lang.String content = tempAttribOrderDescription;

                    object.setOrderDescription(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribOrderDescription));
                } else {
                }

                handledAttributes.add("orderDescription");

                // handle attribute "merchantLogin"
                java.lang.String tempAttribMerchantLogin = reader.getAttributeValue(null,
                        "merchantLogin");

                if (tempAttribMerchantLogin != null) {
                    java.lang.String content = tempAttribMerchantLogin;

                    object.setMerchantLogin(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribMerchantLogin));
                } else {
                }

                handledAttributes.add("merchantLogin");

                // handle attribute "actionCodeDescription"
                java.lang.String tempAttribActionCodeDescription = reader.getAttributeValue(null,
                        "actionCodeDescription");

                if (tempAttribActionCodeDescription != null) {
                    java.lang.String content = tempAttribActionCodeDescription;

                    object.setActionCodeDescription(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribActionCodeDescription));
                } else {
                }

                handledAttributes.add("actionCodeDescription");

                // handle attribute "clientId"
                java.lang.String tempAttribClientId = reader.getAttributeValue(null,
                        "clientId");

                if (tempAttribClientId != null) {
                    java.lang.String content = tempAttribClientId;

                    object.setClientId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribClientId));
                } else {
                }

                handledAttributes.add("clientId");

                // handle attribute "bindingId"
                java.lang.String tempAttribBindingId = reader.getAttributeValue(null,
                        "bindingId");

                if (tempAttribBindingId != null) {
                    java.lang.String content = tempAttribBindingId;

                    object.setBindingId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribBindingId));
                } else {
                }

                handledAttributes.add("bindingId");

                reader.next();

                java.util.ArrayList list1 = new java.util.ArrayList();

                java.util.ArrayList list2 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "operations").equals(
                            reader.getName())) {
                    // Process the array and step past its final element's end.
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        list1.add(null);
                        reader.next();
                    } else {
                        list1.add(merchant.LoyaltyOperation.Factory.parse(
                                reader));
                    }

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
                            if (new javax.xml.namespace.QName("", "operations").equals(
                                        reader.getName())) {
                                nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                        "nil");

                                if ("true".equals(nillableValue) ||
                                        "1".equals(nillableValue)) {
                                    list1.add(null);
                                    reader.next();
                                } else {
                                    list1.add(merchant.LoyaltyOperation.Factory.parse(
                                            reader));
                                }
                            } else {
                                loopDone1 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setOperations((merchant.LoyaltyOperation[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            merchant.LoyaltyOperation.class,
                            list1));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "params").equals(
                            reader.getName())) {
                    // Process the array and step past its final element's end.
                    list2.add(merchant.ServiceParam.Factory.parse(
                            reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone2 = false;

                    while (!loopDone2) {
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
                            loopDone2 = true;
                        } else {
                            if (new javax.xml.namespace.QName("", "params").equals(
                                        reader.getName())) {
                                list2.add(merchant.ServiceParam.Factory.parse(
                                        reader));
                            } else {
                                loopDone2 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setParams((merchant.ServiceParam[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            merchant.ServiceParam.class,
                            list2));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "orderBundle").equals(
                            reader.getName())) {
                    object.setOrderBundle(merchant.OrderBundle.Factory.parse(
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
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
