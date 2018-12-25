/**
 * OrderInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package merchant;


/**
 *  OrderInfo bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class OrderInfo implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = orderInfo
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
     * field for Ordernumber
     * This was an Attribute!
     */
    protected java.lang.String localOrdernumber;

    /**
     * field for Amount
     * This was an Attribute!
     */
    protected long localAmount;

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
     * field for CurrencyCode
     * This was an Attribute!
     */
    protected short localCurrencyCode;

    /**
     * field for State
     * This was an Attribute!
     */
    protected merchant.TransactionState localState;

    /**
     * field for FraudLevel
     * This was an Attribute!
     */
    protected int localFraudLevel;

    /**
     * field for Cardholder
     * This was an Attribute!
     */
    protected java.lang.String localCardholder;

    /**
     * field for PanMasked
     * This was an Attribute!
     */
    protected java.lang.String localPanMasked;

    /**
     * field for Ip
     * This was an Attribute!
     */
    protected java.lang.String localIp;

    /**
     * field for ActionCode
     * This was an Attribute!
     */
    protected java.lang.String localActionCode;

    /**
     * field for Date
     * This was an Attribute!
     */
    protected java.util.Calendar localDate;

    /**
     * field for BankName
     * This was an Attribute!
     */
    protected java.lang.String localBankName;

    /**
     * field for ApprovalCode
     * This was an Attribute!
     */
    protected java.lang.String localApprovalCode;

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
    public java.lang.String getOrdernumber() {
        return localOrdernumber;
    }

    /**
     * Auto generated setter method
     * @param param Ordernumber
     */
    public void setOrdernumber(java.lang.String param) {
        this.localOrdernumber = param;
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
     * @return short
     */
    public short getCurrencyCode() {
        return localCurrencyCode;
    }

    /**
     * Auto generated setter method
     * @param param CurrencyCode
     */
    public void setCurrencyCode(short param) {
        this.localCurrencyCode = param;
    }

    /**
     * Auto generated getter method
     * @return merchant.TransactionState
     */
    public merchant.TransactionState getState() {
        return localState;
    }

    /**
     * Auto generated setter method
     * @param param State
     */
    public void setState(
        merchant.TransactionState param) {
        this.localState = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getFraudLevel() {
        return localFraudLevel;
    }

    /**
     * Auto generated setter method
     * @param param FraudLevel
     */
    public void setFraudLevel(int param) {
        this.localFraudLevel = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCardholder() {
        return localCardholder;
    }

    /**
     * Auto generated setter method
     * @param param Cardholder
     */
    public void setCardholder(java.lang.String param) {
        this.localCardholder = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPanMasked() {
        return localPanMasked;
    }

    /**
     * Auto generated setter method
     * @param param PanMasked
     */
    public void setPanMasked(java.lang.String param) {
        this.localPanMasked = param;
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
    public java.lang.String getActionCode() {
        return localActionCode;
    }

    /**
     * Auto generated setter method
     * @param param ActionCode
     */
    public void setActionCode(java.lang.String param) {
        this.localActionCode = param;
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
    public java.lang.String getBankName() {
        return localBankName;
    }

    /**
     * Auto generated setter method
     * @param param BankName
     */
    public void setBankName(java.lang.String param) {
        this.localBankName = param;
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
                    namespacePrefix + ":orderInfo", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "orderInfo", xmlWriter);
            }
        }

        if (localOrdernumber != null) {
            writeAttribute("", "ordernumber",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localOrdernumber), xmlWriter);
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

        if (localCurrencyCode != java.lang.Short.MIN_VALUE) {
            writeAttribute("", "currencyCode",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCurrencyCode), xmlWriter);
        }
        else {
            throw new org.apache.axis2.databinding.ADBException(
                "required attribute localCurrencyCode is null");
        }

        if (localState != null) {
            writeAttribute("", "state", localState.toString(), xmlWriter);
        }

        if (localFraudLevel != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "fraudLevel",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localFraudLevel), xmlWriter);
        }
        else {
            throw new org.apache.axis2.databinding.ADBException(
                "required attribute localFraudLevel is null");
        }

        if (localCardholder != null) {
            writeAttribute("", "cardholder",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCardholder), xmlWriter);
        }

        if (localPanMasked != null) {
            writeAttribute("", "panMasked",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localPanMasked), xmlWriter);
        }

        if (localIp != null) {
            writeAttribute("", "ip",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localIp), xmlWriter);
        }

        if (localActionCode != null) {
            writeAttribute("", "actionCode",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localActionCode), xmlWriter);
        }

        if (localDate != null) {
            writeAttribute("", "date",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localDate), xmlWriter);
        }

        if (localBankName != null) {
            writeAttribute("", "bankName",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localBankName), xmlWriter);
        }

        if (localApprovalCode != null) {
            writeAttribute("", "approvalCode",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localApprovalCode), xmlWriter);
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
        public static OrderInfo parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            OrderInfo object = new OrderInfo();

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

                        if (!"orderInfo".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (OrderInfo) merchant.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "ordernumber"
                java.lang.String tempAttribOrdernumber = reader.getAttributeValue(null,
                        "ordernumber");

                if (tempAttribOrdernumber != null) {
                    java.lang.String content = tempAttribOrdernumber;

                    object.setOrdernumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribOrdernumber));
                } else {
                }

                handledAttributes.add("ordernumber");

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

                // handle attribute "currencyCode"
                java.lang.String tempAttribCurrencyCode = reader.getAttributeValue(null,
                        "currencyCode");

                if (tempAttribCurrencyCode != null) {
                    java.lang.String content = tempAttribCurrencyCode;

                    object.setCurrencyCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToShort(
                            tempAttribCurrencyCode));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "Required attribute currencyCode is missing");
                }

                handledAttributes.add("currencyCode");

                // handle attribute "state"
                java.lang.String tempAttribState = reader.getAttributeValue(null,
                        "state");

                if (tempAttribState != null) {
                    java.lang.String content = tempAttribState;

                    object.setState(merchant.TransactionState.Factory.fromString(
                            reader, tempAttribState));
                } else {
                }

                handledAttributes.add("state");

                // handle attribute "fraudLevel"
                java.lang.String tempAttribFraudLevel = reader.getAttributeValue(null,
                        "fraudLevel");

                if (tempAttribFraudLevel != null) {
                    java.lang.String content = tempAttribFraudLevel;

                    object.setFraudLevel(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribFraudLevel));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "Required attribute fraudLevel is missing");
                }

                handledAttributes.add("fraudLevel");

                // handle attribute "cardholder"
                java.lang.String tempAttribCardholder = reader.getAttributeValue(null,
                        "cardholder");

                if (tempAttribCardholder != null) {
                    java.lang.String content = tempAttribCardholder;

                    object.setCardholder(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribCardholder));
                } else {
                }

                handledAttributes.add("cardholder");

                // handle attribute "panMasked"
                java.lang.String tempAttribPanMasked = reader.getAttributeValue(null,
                        "panMasked");

                if (tempAttribPanMasked != null) {
                    java.lang.String content = tempAttribPanMasked;

                    object.setPanMasked(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribPanMasked));
                } else {
                }

                handledAttributes.add("panMasked");

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

                // handle attribute "actionCode"
                java.lang.String tempAttribActionCode = reader.getAttributeValue(null,
                        "actionCode");

                if (tempAttribActionCode != null) {
                    java.lang.String content = tempAttribActionCode;

                    object.setActionCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribActionCode));
                } else {
                }

                handledAttributes.add("actionCode");

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

                // handle attribute "bankName"
                java.lang.String tempAttribBankName = reader.getAttributeValue(null,
                        "bankName");

                if (tempAttribBankName != null) {
                    java.lang.String content = tempAttribBankName;

                    object.setBankName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribBankName));
                } else {
                }

                handledAttributes.add("bankName");

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
