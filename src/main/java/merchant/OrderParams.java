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
    protected String localReturnUrl;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReturnUrlTracker = false;

    /**
     * field for FailUrl
     */
    protected String localFailUrl;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFailUrlTracker = false;

    /**
     * field for MerchantLogin
     */
    protected String localMerchantLogin;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMerchantLoginTracker = false;

    /**
     * field for Email
     */
    protected String localEmail;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEmailTracker = false;

    /**
     * field for PostAddress
     */
    protected String localPostAddress;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPostAddressTracker = false;

    /**
     * field for Params
     * This was an Array!
     */
    protected ServiceParam[] localParams;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localParamsTracker = false;

    /**
     * field for ClientId
     */
    protected String localClientId;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localClientIdTracker = false;

    /**
     * field for OrderBundle
     */
    protected OrderBundle localOrderBundle;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOrderBundleTracker = false;

    /**
     * field for Features
     */
    protected Features_type0 localFeatures;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFeaturesTracker = false;

    /**
     * field for MerchantOrderNumber
     * This was an Attribute!
     */
    protected String localMerchantOrderNumber;

    /**
     * field for Description
     * This was an Attribute!
     */
    protected String localDescription;

    /**
     * field for Amount
     * This was an Attribute!
     */
    protected long localAmount;

    /**
     * field for Currency
     * This was an Attribute!
     */
    protected String localCurrency;

    /**
     * field for Language
     * This was an Attribute!
     */
    protected String localLanguage;

    /**
     * field for PageView
     * This was an Attribute!
     */
    protected String localPageView;

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
    protected String localBindingId;

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
    public String getReturnUrl() {
        return localReturnUrl;
    }

    /**
     * Auto generated setter method
     * @param param ReturnUrl
     */
    public void setReturnUrl(String param) {
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
    public String getFailUrl() {
        return localFailUrl;
    }

    /**
     * Auto generated setter method
     * @param param FailUrl
     */
    public void setFailUrl(String param) {
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
    public String getMerchantLogin() {
        return localMerchantLogin;
    }

    /**
     * Auto generated setter method
     * @param param MerchantLogin
     */
    public void setMerchantLogin(String param) {
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
    public String getEmail() {
        return localEmail;
    }

    /**
     * Auto generated setter method
     * @param param Email
     */
    public void setEmail(String param) {
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
    public String getPostAddress() {
        return localPostAddress;
    }

    /**
     * Auto generated setter method
     * @param param PostAddress
     */
    public void setPostAddress(String param) {
        localPostAddressTracker = param != null;

        this.localPostAddress = param;
    }

    public boolean isParamsSpecified() {
        return localParamsTracker;
    }

    /**
     * Auto generated getter method
     * @return ru.paymentgate.engine.webservices.merchant.ServiceParam[]
     */
    public ServiceParam[] getParams() {
        return localParams;
    }

    /**
     * validate the array for Params
     */
    protected void validateParams(
        ServiceParam[] param) {
    }

    /**
     * Auto generated setter method
     * @param param Params
     */
    public void setParams(
        ServiceParam[] param) {
        validateParams(param);

        localParamsTracker = param != null;

        this.localParams = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param ru.paymentgate.engine.webservices.merchant.ServiceParam
     */
    public void addParams(
        ServiceParam param) {
        if (localParams == null) {
            localParams = new ServiceParam[] {

                };
        }

        //update the setting tracker
        localParamsTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localParams);
        list.add(param);
        this.localParams = (ServiceParam[]) list.toArray(new ServiceParam[list.size()]);
    }

    public boolean isClientIdSpecified() {
        return localClientIdTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public String getClientId() {
        return localClientId;
    }

    /**
     * Auto generated setter method
     * @param param ClientId
     */
    public void setClientId(String param) {
        localClientIdTracker = param != null;

        this.localClientId = param;
    }

    public boolean isOrderBundleSpecified() {
        return localOrderBundleTracker;
    }

    /**
     * Auto generated getter method
     * @return ru.paymentgate.engine.webservices.merchant.OrderBundle
     */
    public OrderBundle getOrderBundle() {
        return localOrderBundle;
    }

    /**
     * Auto generated setter method
     * @param param OrderBundle
     */
    public void setOrderBundle(
        OrderBundle param) {
        localOrderBundleTracker = param != null;

        this.localOrderBundle = param;
    }

    public boolean isFeaturesSpecified() {
        return localFeaturesTracker;
    }

    /**
     * Auto generated getter method
     * @return ru.paymentgate.engine.webservices.merchant.Features_type0
     */
    public Features_type0 getFeatures() {
        return localFeatures;
    }

    /**
     * Auto generated setter method
     * @param param Features
     */
    public void setFeatures(
        Features_type0 param) {
        localFeaturesTracker = param != null;

        this.localFeatures = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public String getMerchantOrderNumber() {
        return localMerchantOrderNumber;
    }

    /**
     * Auto generated setter method
     * @param param MerchantOrderNumber
     */
    public void setMerchantOrderNumber(String param) {
        this.localMerchantOrderNumber = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public String getDescription() {
        return localDescription;
    }

    /**
     * Auto generated setter method
     * @param param Description
     */
    public void setDescription(String param) {
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
    public String getCurrency() {
        return localCurrency;
    }

    /**
     * Auto generated setter method
     * @param param Currency
     */
    public void setCurrency(String param) {
        this.localCurrency = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public String getLanguage() {
        return localLanguage;
    }

    /**
     * Auto generated setter method
     * @param param Language
     */
    public void setLanguage(String param) {
        this.localLanguage = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public String getPageView() {
        return localPageView;
    }

    /**
     * Auto generated setter method
     * @param param PageView
     */
    public void setPageView(String param) {
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
    public String getBindingId() {
        return localBindingId;
    }

    /**
     * Auto generated setter method
     * @param param BindingId
     */
    public void setBindingId(String param) {
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

        if (localAmount != Long.MIN_VALUE) {
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

        if (localSessionTimeoutSecs != Integer.MIN_VALUE) {
            writeAttribute("", "sessionTimeoutSecs",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localSessionTimeoutSecs), xmlWriter);
        }

        if (localTaxSystem != Integer.MIN_VALUE) {
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
        public static OrderParams parse(javax.xml.stream.XMLStreamReader reader)
            throws Exception {
            OrderParams object = new OrderParams();

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

                        if (!"orderParams".equals(type)) {
                            //find namespace for the prefix
                            String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (OrderParams) ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "merchantOrderNumber"
                String tempAttribMerchantOrderNumber = reader.getAttributeValue(null,
                        "merchantOrderNumber");

                if (tempAttribMerchantOrderNumber != null) {
                    String content = tempAttribMerchantOrderNumber;

                    object.setMerchantOrderNumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribMerchantOrderNumber));
                } else {
                }

                handledAttributes.add("merchantOrderNumber");

                // handle attribute "description"
                String tempAttribDescription = reader.getAttributeValue(null,
                        "description");

                if (tempAttribDescription != null) {
                    String content = tempAttribDescription;

                    object.setDescription(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribDescription));
                } else {
                }

                handledAttributes.add("description");

                // handle attribute "amount"
                String tempAttribAmount = reader.getAttributeValue(null,
                        "amount");

                if (tempAttribAmount != null) {
                    String content = tempAttribAmount;

                    object.setAmount(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            tempAttribAmount));
                } else {
                    object.setAmount(Long.MIN_VALUE);
                }

                handledAttributes.add("amount");

                // handle attribute "currency"
                String tempAttribCurrency = reader.getAttributeValue(null,
                        "currency");

                if (tempAttribCurrency != null) {
                    String content = tempAttribCurrency;

                    object.setCurrency(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribCurrency));
                } else {
                }

                handledAttributes.add("currency");

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

                // handle attribute "pageView"
                String tempAttribPageView = reader.getAttributeValue(null,
                        "pageView");

                if (tempAttribPageView != null) {
                    String content = tempAttribPageView;

                    object.setPageView(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribPageView));
                } else {
                }

                handledAttributes.add("pageView");

                // handle attribute "sessionTimeoutSecs"
                String tempAttribSessionTimeoutSecs = reader.getAttributeValue(null,
                        "sessionTimeoutSecs");

                if (tempAttribSessionTimeoutSecs != null) {
                    String content = tempAttribSessionTimeoutSecs;

                    object.setSessionTimeoutSecs(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribSessionTimeoutSecs));
                } else {
                    object.setSessionTimeoutSecs(Integer.MIN_VALUE);
                }

                handledAttributes.add("sessionTimeoutSecs");

                // handle attribute "taxSystem"
                String tempAttribTaxSystem = reader.getAttributeValue(null,
                        "taxSystem");

                if (tempAttribTaxSystem != null) {
                    String content = tempAttribTaxSystem;

                    object.setTaxSystem(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribTaxSystem));
                } else {
                    object.setTaxSystem(Integer.MIN_VALUE);
                }

                handledAttributes.add("taxSystem");

                // handle attribute "bindingId"
                String tempAttribBindingId = reader.getAttributeValue(null,
                        "bindingId");

                if (tempAttribBindingId != null) {
                    String content = tempAttribBindingId;

                    object.setBindingId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribBindingId));
                } else {
                }

                handledAttributes.add("bindingId");

                // handle attribute "expirationDate"
                String tempAttribExpirationDate = reader.getAttributeValue(null,
                        "expirationDate");

                if (tempAttribExpirationDate != null) {
                    String content = tempAttribExpirationDate;

                    object.setExpirationDate(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribExpirationDate));
                } else {
                }

                handledAttributes.add("expirationDate");

                // handle attribute "autocompletionDate"
                String tempAttribAutocompletionDate = reader.getAttributeValue(null,
                        "autocompletionDate");

                if (tempAttribAutocompletionDate != null) {
                    String content = tempAttribAutocompletionDate;

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

                    String content = reader.getElementText();

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

                    String content = reader.getElementText();

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

                    String content = reader.getElementText();

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

                    String content = reader.getElementText();

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

                    String content = reader.getElementText();

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
                    list6.add(ServiceParam.Factory.parse(
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
                                list6.add(ServiceParam.Factory.parse(
                                        reader));
                            } else {
                                loopDone6 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setParams((ServiceParam[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            ServiceParam.class,
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

                    String content = reader.getElementText();

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
                    object.setOrderBundle(OrderBundle.Factory.parse(
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
                    object.setFeatures(Features_type0.Factory.parse(
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
