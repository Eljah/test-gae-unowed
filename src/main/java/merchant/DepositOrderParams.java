/**
 * DepositOrderParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package merchant;


/**
 *  DepositOrderParams bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class DepositOrderParams extends AbstractServiceRequest
    implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = depositOrderParams
       Namespace URI = http://engine.paymentgate.ru/webservices/merchant
       Namespace Prefix = ns1
     */

    /**
     * field for DepositItems
     */
    protected CartItems localDepositItems;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDepositItemsTracker = false;

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
     * field for Agent
     */
    protected Agent localAgent;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAgentTracker = false;

    /**
     * field for SupplierPhones
     */
    protected String localSupplierPhones;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSupplierPhonesTracker = false;

    /**
     * field for OrderId
     * This was an Attribute!
     */
    protected String localOrderId;

    /**
     * field for DepositAmount
     * This was an Attribute!
     */
    protected long localDepositAmount;

    public boolean isDepositItemsSpecified() {
        return localDepositItemsTracker;
    }

    /**
     * Auto generated getter method
     * @return ru.paymentgate.engine.webservices.merchant.CartItems
     */
    public CartItems getDepositItems() {
        return localDepositItems;
    }

    /**
     * Auto generated setter method
     * @param param DepositItems
     */
    public void setDepositItems(
        CartItems param) {
        localDepositItemsTracker = param != null;

        this.localDepositItems = param;
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

    public boolean isAgentSpecified() {
        return localAgentTracker;
    }

    /**
     * Auto generated getter method
     * @return ru.paymentgate.engine.webservices.merchant.Agent
     */
    public Agent getAgent() {
        return localAgent;
    }

    /**
     * Auto generated setter method
     * @param param Agent
     */
    public void setAgent(Agent param) {
        localAgentTracker = param != null;

        this.localAgent = param;
    }

    public boolean isSupplierPhonesSpecified() {
        return localSupplierPhonesTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public String getSupplierPhones() {
        return localSupplierPhones;
    }

    /**
     * Auto generated setter method
     * @param param SupplierPhones
     */
    public void setSupplierPhones(String param) {
        localSupplierPhonesTracker = param != null;

        this.localSupplierPhones = param;
    }

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
     * @return long
     */
    public long getDepositAmount() {
        return localDepositAmount;
    }

    /**
     * Auto generated setter method
     * @param param DepositAmount
     */
    public void setDepositAmount(long param) {
        this.localDepositAmount = param;
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
                "type", namespacePrefix + ":depositOrderParams", xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "type", "depositOrderParams", xmlWriter);
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

        if (localDepositAmount != Long.MIN_VALUE) {
            writeAttribute("", "depositAmount",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localDepositAmount), xmlWriter);
        }
        else {
            throw new org.apache.axis2.databinding.ADBException(
                "required attribute localDepositAmount is null");
        }

        if (localDepositItemsTracker) {
            if (localDepositItems == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "depositItems cannot be null!!");
            }

            localDepositItems.serialize(new javax.xml.namespace.QName("",
                    "depositItems"), xmlWriter);
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

        if (localAgentTracker) {
            if (localAgent == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "agent cannot be null!!");
            }

            localAgent.serialize(new javax.xml.namespace.QName("", "agent"),
                xmlWriter);
        }

        if (localSupplierPhonesTracker) {
            namespace = "";
            writeStartElement(null, namespace, "supplierPhones", xmlWriter);

            if (localSupplierPhones == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "supplierPhones cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSupplierPhones);
            }

            xmlWriter.writeEndElement();
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
        public static DepositOrderParams parse(
            javax.xml.stream.XMLStreamReader reader) throws Exception {
            DepositOrderParams object = new DepositOrderParams();

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

                        if (!"depositOrderParams".equals(type)) {
                            //find namespace for the prefix
                            String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (DepositOrderParams) ExtensionMapper.getTypeObject(nsUri,
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

                // handle attribute "depositAmount"
                String tempAttribDepositAmount = reader.getAttributeValue(null,
                        "depositAmount");

                if (tempAttribDepositAmount != null) {
                    String content = tempAttribDepositAmount;

                    object.setDepositAmount(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            tempAttribDepositAmount));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "Required attribute depositAmount is missing");
                }

                handledAttributes.add("depositAmount");

                reader.next();

                java.util.ArrayList list2 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "depositItems").equals(
                            reader.getName())) {
                    object.setDepositItems(CartItems.Factory.parse(
                            reader));

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
                    list2.add(ServiceParam.Factory.parse(
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
                                list2.add(ServiceParam.Factory.parse(
                                        reader));
                            } else {
                                loopDone2 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setParams((ServiceParam[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            ServiceParam.class,
                            list2));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "agent").equals(
                            reader.getName())) {
                    object.setAgent(Agent.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "supplierPhones").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "supplierPhones" +
                            "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setSupplierPhones(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

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
