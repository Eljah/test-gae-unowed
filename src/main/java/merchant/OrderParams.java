/**
 * OrderParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package merchant;


/**
 *  OrderParams bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class OrderParams implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = orderParams
       Namespace URI = http://engine.paymentgate.ru/webservices/merchant
       Namespace Prefix = ns1
     */

    /**
     * field for ReturnUrl
     */
    protected java.lang.String localReturnUrl;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReturnUrlTracker = false;

    /**
     * field for FailUrl
     */
    protected java.lang.String localFailUrl;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFailUrlTracker = false;

    /**
     * field for MerchantLogin
     */
    protected java.lang.String localMerchantLogin;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMerchantLoginTracker = false;

    /**
     * field for Email
     */
    protected java.lang.String localEmail;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEmailTracker = false;

    /**
     * field for PostAddress
     */
    protected java.lang.String localPostAddress;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPostAddressTracker = false;

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
     * field for ClientId
     */
    protected java.lang.String localClientId;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localClientIdTracker = false;

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
     * field for Features
     */
    protected merchant.Features_type0 localFeatures;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFeaturesTracker = false;

    /**
     * field for MerchantOrderNumber
     * This was an Attribute!
     */
    protected java.lang.String localMerchantOrderNumber;

    /**
     * field for Description
     * This was an Attribute!
     */
    protected java.lang.String localDescription;

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
     * field for Language
     * This was an Attribute!
     */
    protected java.lang.String localLanguage;

    /**
     * field for PageView
     * This was an Attribute!
     */
    protected java.lang.String localPageView;

    /**
     * field for SessionTimeoutSecs
     * This was an Attribute!
     */
    protected int localSessionTimeoutSecs;

    /**
     * field for TaxSystem
     * This was an Attribute!
     */
    protected int localTaxSystem;

    /**
     * field for BindingId
     * This was an Attribute!
     */
    protected java.lang.String localBindingId;

    /**
     * field for ExpirationDate
     * This was an Attribute!
     */
    protected java.util.Calendar localExpirationDate;

    /**
     * field for AutocompletionDate
     * This was an Attribute!
     */
    protected java.util.Calendar localAutocompletionDate;

    public boolean isReturnUrlSpecified() {
        return localReturnUrlTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getReturnUrl() {
        return localReturnUrl;
    }

    /**
     * Auto generated setter method
     * @param param ReturnUrl
     */
    public void setReturnUrl(java.lang.String param) {
        localReturnUrlTracker = param != null;

        this.localReturnUrl = param;
    }

    public boolean isFailUrlSpecified() {
        return localFailUrlTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFailUrl() {
        return localFailUrl;
    }

    /**
     * Auto generated setter method
     * @param param FailUrl
     */
    public void setFailUrl(java.lang.String param) {
        localFailUrlTracker = param != null;

        this.localFailUrl = param;
    }

    public boolean isMerchantLoginSpecified() {
        return localMerchantLoginTracker;
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
        localMerchantLoginTracker = param != null;

        this.localMerchantLogin = param;
    }

    public boolean isEmailSpecified() {
        return localEmailTracker;
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
        localEmailTracker = param != null;

        this.localEmail = param;
    }

    public boolean isPostAddressSpecified() {
        return localPostAddressTracker;
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
        localPostAddressTracker = param != null;

        this.localPostAddress = param;
    }

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

    public boolean isClientIdSpecified() {
        return localClientIdTracker;
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
        localClientIdTracker = param != null;

        this.localClientId = param;
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

    public boolean isFeaturesSpecified() {
        return localFeaturesTracker;
    }

    /**
     * Auto generated getter method
     * @return merchant.Features_type0
     */
    public merchant.Features_type0 getFeatures() {
        return localFeatures;
    }

    /**
     * Auto generated setter method
     * @param param Features
     */
    public void setFeatures(
        merchant.Features_type0 param) {
        localFeaturesTracker = param != null;

        this.localFeatures = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMerchantOrderNumber() {
        return localMerchantOrderNumber;
    }

    /**
     * Auto generated setter method
     * @param param MerchantOrderNumber
     */
    public void setMerchantOrderNumber(java.lang.String param) {
        this.localMerchantOrderNumber = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDescription() {
        return localDescription;
    }

    /**
     * Auto generated setter method
     * @param param Description
     */
    public void setDescription(java.lang.String param) {
        this.localDescription = param;
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
    public java.lang.String getPageView() {
        return localPageView;
    }

    /**
     * Auto generated setter method
     * @param param PageView
     */
    public void setPageView(java.lang.String param) {
        this.localPageView = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getSessionTimeoutSecs() {
        return localSessionTimeoutSecs;
    }

    /**
     * Auto generated setter method
     * @param param SessionTimeoutSecs
     */
    public void setSessionTimeoutSecs(int param) {
        this.localSessionTimeoutSecs = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getTaxSystem() {
        return localTaxSystem;
    }

    /**
     * Auto generated setter method
     * @param param TaxSystem
     */
    public void setTaxSystem(int param) {
        this.localTaxSystem = param;
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
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getExpirationDate() {
        return localExpirationDate;
    }

    /**
     * Auto generated setter method
     * @param param ExpirationDate
     */
    public void setExpirationDate(java.util.Calendar param) {
        this.localExpirationDate = param;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getAutocompletionDate() {
        return localAutocompletionDate;
    }

    /**
     * Auto generated setter method
     * @param param AutocompletionDate
     */
    public void setAutocompletionDate(java.util.Calendar param) {
        this.localAutocompletionDate = param;
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
                    namespacePrefix + ":orderParams", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "orderParams", xmlWriter);
            }
        }

        if (localMerchantOrderNumber != null) {
            writeAttribute("", "merchantOrderNumber",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localMerchantOrderNumber), xmlWriter);
        }

        if (localDescription != null) {
            writeAttribute("", "description",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localDescription), xmlWriter);
        }

        if (localAmount != java.lang.Long.MIN_VALUE) {
            writeAttribute("", "amount",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localAmount), xmlWriter);
        }

        if (localCurrency != null) {
            writeAttribute("", "currency",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCurrency), xmlWriter);
        }

        if (localLanguage != null) {
            writeAttribute("", "language",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localLanguage), xmlWriter);
        }

        if (localPageView != null) {
            writeAttribute("", "pageView",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localPageView), xmlWriter);
        }

        if (localSessionTimeoutSecs != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "sessionTimeoutSecs",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localSessionTimeoutSecs), xmlWriter);
        }

        if (localTaxSystem != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "taxSystem",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localTaxSystem), xmlWriter);
        }

        if (localBindingId != null) {
            writeAttribute("", "bindingId",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localBindingId), xmlWriter);
        }

        if (localExpirationDate != null) {
            writeAttribute("", "expirationDate",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localExpirationDate), xmlWriter);
        }

        if (localAutocompletionDate != null) {
            writeAttribute("", "autocompletionDate",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localAutocompletionDate), xmlWriter);
        }

        if (localReturnUrlTracker) {
            namespace = "";
            writeStartElement(null, namespace, "returnUrl", xmlWriter);

            if (localReturnUrl == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "returnUrl cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localReturnUrl);
            }

            xmlWriter.writeEndElement();
        }

        if (localFailUrlTracker) {
            namespace = "";
            writeStartElement(null, namespace, "failUrl", xmlWriter);

            if (localFailUrl == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "failUrl cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localFailUrl);
            }

            xmlWriter.writeEndElement();
        }

        if (localMerchantLoginTracker) {
            namespace = "";
            writeStartElement(null, namespace, "merchantLogin", xmlWriter);

            if (localMerchantLogin == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "merchantLogin cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localMerchantLogin);
            }

            xmlWriter.writeEndElement();
        }

        if (localEmailTracker) {
            namespace = "";
            writeStartElement(null, namespace, "email", xmlWriter);

            if (localEmail == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "email cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localEmail);
            }

            xmlWriter.writeEndElement();
        }

        if (localPostAddressTracker) {
            namespace = "";
            writeStartElement(null, namespace, "postAddress", xmlWriter);

            if (localPostAddress == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "postAddress cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPostAddress);
            }

            xmlWriter.writeEndElement();
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

        if (localClientIdTracker) {
            namespace = "";
            writeStartElement(null, namespace, "clientId", xmlWriter);

            if (localClientId == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "clientId cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localClientId);
            }

            xmlWriter.writeEndElement();
        }

        if (localOrderBundleTracker) {
            if (localOrderBundle == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "orderBundle cannot be null!!");
            }

            localOrderBundle.serialize(new javax.xml.namespace.QName("",
                    "orderBundle"), xmlWriter);
        }

        if (localFeaturesTracker) {
            if (localFeatures == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "features cannot be null!!");
            }

            localFeatures.serialize(new javax.xml.namespace.QName("", "features"),
                xmlWriter);
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
        public static OrderParams parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            OrderParams object = new OrderParams();

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

                        if (!"orderParams".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (OrderParams) merchant.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "merchantOrderNumber"
                java.lang.String tempAttribMerchantOrderNumber = reader.getAttributeValue(null,
                        "merchantOrderNumber");

                if (tempAttribMerchantOrderNumber != null) {
                    java.lang.String content = tempAttribMerchantOrderNumber;

                    object.setMerchantOrderNumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribMerchantOrderNumber));
                } else {
                }

                handledAttributes.add("merchantOrderNumber");

                // handle attribute "description"
                java.lang.String tempAttribDescription = reader.getAttributeValue(null,
                        "description");

                if (tempAttribDescription != null) {
                    java.lang.String content = tempAttribDescription;

                    object.setDescription(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribDescription));
                } else {
                }

                handledAttributes.add("description");

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

                // handle attribute "pageView"
                java.lang.String tempAttribPageView = reader.getAttributeValue(null,
                        "pageView");

                if (tempAttribPageView != null) {
                    java.lang.String content = tempAttribPageView;

                    object.setPageView(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribPageView));
                } else {
                }

                handledAttributes.add("pageView");

                // handle attribute "sessionTimeoutSecs"
                java.lang.String tempAttribSessionTimeoutSecs = reader.getAttributeValue(null,
                        "sessionTimeoutSecs");

                if (tempAttribSessionTimeoutSecs != null) {
                    java.lang.String content = tempAttribSessionTimeoutSecs;

                    object.setSessionTimeoutSecs(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribSessionTimeoutSecs));
                } else {
                    object.setSessionTimeoutSecs(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("sessionTimeoutSecs");

                // handle attribute "taxSystem"
                java.lang.String tempAttribTaxSystem = reader.getAttributeValue(null,
                        "taxSystem");

                if (tempAttribTaxSystem != null) {
                    java.lang.String content = tempAttribTaxSystem;

                    object.setTaxSystem(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribTaxSystem));
                } else {
                    object.setTaxSystem(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("taxSystem");

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

                // handle attribute "expirationDate"
                java.lang.String tempAttribExpirationDate = reader.getAttributeValue(null,
                        "expirationDate");

                if (tempAttribExpirationDate != null) {
                    java.lang.String content = tempAttribExpirationDate;

                    object.setExpirationDate(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribExpirationDate));
                } else {
                }

                handledAttributes.add("expirationDate");

                // handle attribute "autocompletionDate"
                java.lang.String tempAttribAutocompletionDate = reader.getAttributeValue(null,
                        "autocompletionDate");

                if (tempAttribAutocompletionDate != null) {
                    java.lang.String content = tempAttribAutocompletionDate;

                    object.setAutocompletionDate(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribAutocompletionDate));
                } else {
                }

                handledAttributes.add("autocompletionDate");

                reader.next();

                java.util.ArrayList list6 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "returnUrl").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "returnUrl" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setReturnUrl(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "failUrl").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "failUrl" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFailUrl(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "merchantLogin").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "merchantLogin" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMerchantLogin(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "email").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "email" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setEmail(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "postAddress").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "postAddress" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPostAddress(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "params").equals(
                            reader.getName())) {
                    // Process the array and step past its final element's end.
                    list6.add(merchant.ServiceParam.Factory.parse(
                            reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone6 = false;

                    while (!loopDone6) {
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
                            loopDone6 = true;
                        } else {
                            if (new javax.xml.namespace.QName("", "params").equals(
                                        reader.getName())) {
                                list6.add(merchant.ServiceParam.Factory.parse(
                                        reader));
                            } else {
                                loopDone6 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setParams((merchant.ServiceParam[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            merchant.ServiceParam.class,
                            list6));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "clientId").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "clientId" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setClientId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
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

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "features").equals(
                            reader.getName())) {
                    object.setFeatures(merchant.Features_type0.Factory.parse(
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
