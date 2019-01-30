/**
 * Item.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package merchant;


/**
 *  Item bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Item implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = item
       Namespace URI = http://engine.paymentgate.ru/webservices/merchant
       Namespace Prefix = ns1
     */

    /**
     * field for Name
     */
    protected String localName;

    /**
     * field for ItemDetails
     */
    protected ItemDetails localItemDetails;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localItemDetailsTracker = false;

    /**
     * field for Quantity
     */
    protected Quantity localQuantity;

    /**
     * field for ItemAmount
     */
    protected long localItemAmount;

    /**
     * field for DepositedItemAmount
     */
    protected long localDepositedItemAmount;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDepositedItemAmountTracker = false;

    /**
     * field for ItemCurrency
     */
    protected int localItemCurrency;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localItemCurrencyTracker = false;

    /**
     * field for ItemCode
     */
    protected String localItemCode;

    /**
     * field for Discount
     */
    protected Discount localDiscount;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDiscountTracker = false;

    /**
     * field for AgentInterest
     */
    protected AgentInterest localAgentInterest;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAgentInterestTracker = false;

    /**
     * field for Tax
     */
    protected Tax localTax;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTaxTracker = false;

    /**
     * field for ItemPrice
     */
    protected long localItemPrice;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localItemPriceTracker = false;

    /**
     * field for ItemAttributes
     */
    protected ItemAttributes localItemAttributes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localItemAttributesTracker = false;

    /**
     * field for PositionId
     * This was an Attribute!
     */
    protected String localPositionId;

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

    public boolean isItemDetailsSpecified() {
        return localItemDetailsTracker;
    }

    /**
     * Auto generated getter method
     * @return ru.paymentgate.engine.webservices.merchant.ItemDetails
     */
    public ItemDetails getItemDetails() {
        return localItemDetails;
    }

    /**
     * Auto generated setter method
     * @param param ItemDetails
     */
    public void setItemDetails(
        ItemDetails param) {
        localItemDetailsTracker = param != null;

        this.localItemDetails = param;
    }

    /**
     * Auto generated getter method
     * @return ru.paymentgate.engine.webservices.merchant.Quantity
     */
    public Quantity getQuantity() {
        return localQuantity;
    }

    /**
     * Auto generated setter method
     * @param param Quantity
     */
    public void setQuantity(
        Quantity param) {
        this.localQuantity = param;
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

    public boolean isDepositedItemAmountSpecified() {
        return localDepositedItemAmountTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getDepositedItemAmount() {
        return localDepositedItemAmount;
    }

    /**
     * Auto generated setter method
     * @param param DepositedItemAmount
     */
    public void setDepositedItemAmount(long param) {
        // setting primitive attribute tracker to true
        localDepositedItemAmountTracker = param != Long.MIN_VALUE;

        this.localDepositedItemAmount = param;
    }

    public boolean isItemCurrencySpecified() {
        return localItemCurrencyTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getItemCurrency() {
        return localItemCurrency;
    }

    /**
     * Auto generated setter method
     * @param param ItemCurrency
     */
    public void setItemCurrency(int param) {
        // setting primitive attribute tracker to true
        localItemCurrencyTracker = param != Integer.MIN_VALUE;

        this.localItemCurrency = param;
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

    public boolean isDiscountSpecified() {
        return localDiscountTracker;
    }

    /**
     * Auto generated getter method
     * @return ru.paymentgate.engine.webservices.merchant.Discount
     */
    public Discount getDiscount() {
        return localDiscount;
    }

    /**
     * Auto generated setter method
     * @param param Discount
     */
    public void setDiscount(
        Discount param) {
        localDiscountTracker = param != null;

        this.localDiscount = param;
    }

    public boolean isAgentInterestSpecified() {
        return localAgentInterestTracker;
    }

    /**
     * Auto generated getter method
     * @return ru.paymentgate.engine.webservices.merchant.AgentInterest
     */
    public AgentInterest getAgentInterest() {
        return localAgentInterest;
    }

    /**
     * Auto generated setter method
     * @param param AgentInterest
     */
    public void setAgentInterest(
        AgentInterest param) {
        localAgentInterestTracker = param != null;

        this.localAgentInterest = param;
    }

    public boolean isTaxSpecified() {
        return localTaxTracker;
    }

    /**
     * Auto generated getter method
     * @return ru.paymentgate.engine.webservices.merchant.Tax
     */
    public Tax getTax() {
        return localTax;
    }

    /**
     * Auto generated setter method
     * @param param Tax
     */
    public void setTax(Tax param) {
        localTaxTracker = param != null;

        this.localTax = param;
    }

    public boolean isItemPriceSpecified() {
        return localItemPriceTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getItemPrice() {
        return localItemPrice;
    }

    /**
     * Auto generated setter method
     * @param param ItemPrice
     */
    public void setItemPrice(long param) {
        // setting primitive attribute tracker to true
        localItemPriceTracker = param != Long.MIN_VALUE;

        this.localItemPrice = param;
    }

    public boolean isItemAttributesSpecified() {
        return localItemAttributesTracker;
    }

    /**
     * Auto generated getter method
     * @return ru.paymentgate.engine.webservices.merchant.ItemAttributes
     */
    public ItemAttributes getItemAttributes() {
        return localItemAttributes;
    }

    /**
     * Auto generated setter method
     * @param param ItemAttributes
     */
    public void setItemAttributes(
        ItemAttributes param) {
        localItemAttributesTracker = param != null;

        this.localItemAttributes = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public String getPositionId() {
        return localPositionId;
    }

    /**
     * Auto generated setter method
     * @param param PositionId
     */
    public void setPositionId(String param) {
        this.localPositionId = param;
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
                    namespacePrefix + ":item", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "item", xmlWriter);
            }
        }

        if (localPositionId != null) {
            writeAttribute("", "positionId",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localPositionId), xmlWriter);
        }

        namespace = "";
        writeStartElement(null, namespace, "name", xmlWriter);

        if (localName == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                "name cannot be null!!");
        } else {
            xmlWriter.writeCharacters(localName);
        }

        xmlWriter.writeEndElement();

        if (localItemDetailsTracker) {
            if (localItemDetails == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "itemDetails cannot be null!!");
            }

            localItemDetails.serialize(new javax.xml.namespace.QName("",
                    "itemDetails"), xmlWriter);
        }

        if (localQuantity == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "quantity cannot be null!!");
        }

        localQuantity.serialize(new javax.xml.namespace.QName("", "quantity"),
            xmlWriter);

        namespace = "";
        writeStartElement(null, namespace, "itemAmount", xmlWriter);

        if (localItemAmount == Long.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "itemAmount cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localItemAmount));
        }

        xmlWriter.writeEndElement();

        if (localDepositedItemAmountTracker) {
            namespace = "";
            writeStartElement(null, namespace, "depositedItemAmount", xmlWriter);

            if (localDepositedItemAmount == Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "depositedItemAmount cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localDepositedItemAmount));
            }

            xmlWriter.writeEndElement();
        }

        if (localItemCurrencyTracker) {
            namespace = "";
            writeStartElement(null, namespace, "itemCurrency", xmlWriter);

            if (localItemCurrency == Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "itemCurrency cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localItemCurrency));
            }

            xmlWriter.writeEndElement();
        }

        namespace = "";
        writeStartElement(null, namespace, "itemCode", xmlWriter);

        if (localItemCode == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                "itemCode cannot be null!!");
        } else {
            xmlWriter.writeCharacters(localItemCode);
        }

        xmlWriter.writeEndElement();

        if (localDiscountTracker) {
            if (localDiscount == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "discount cannot be null!!");
            }

            localDiscount.serialize(new javax.xml.namespace.QName("", "discount"),
                xmlWriter);
        }

        if (localAgentInterestTracker) {
            if (localAgentInterest == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "agentInterest cannot be null!!");
            }

            localAgentInterest.serialize(new javax.xml.namespace.QName("",
                    "agentInterest"), xmlWriter);
        }

        if (localTaxTracker) {
            if (localTax == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "tax cannot be null!!");
            }

            localTax.serialize(new javax.xml.namespace.QName("", "tax"),
                xmlWriter);
        }

        if (localItemPriceTracker) {
            namespace = "";
            writeStartElement(null, namespace, "itemPrice", xmlWriter);

            if (localItemPrice == Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "itemPrice cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localItemPrice));
            }

            xmlWriter.writeEndElement();
        }

        if (localItemAttributesTracker) {
            if (localItemAttributes == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "itemAttributes cannot be null!!");
            }

            localItemAttributes.serialize(new javax.xml.namespace.QName("",
                    "itemAttributes"), xmlWriter);
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
        public static Item parse(javax.xml.stream.XMLStreamReader reader)
            throws Exception {
            Item object = new Item();

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

                        if (!"item".equals(type)) {
                            //find namespace for the prefix
                            String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Item) ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "positionId"
                String tempAttribPositionId = reader.getAttributeValue(null,
                        "positionId");

                if (tempAttribPositionId != null) {
                    String content = tempAttribPositionId;

                    object.setPositionId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribPositionId));
                } else {
                }

                handledAttributes.add("positionId");

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "name").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "name" + "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "itemDetails").equals(
                            reader.getName())) {
                    object.setItemDetails(ItemDetails.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "quantity").equals(
                            reader.getName())) {
                    object.setQuantity(Quantity.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "itemAmount").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "itemAmount" +
                            "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setItemAmount(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "depositedItemAmount").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "depositedItemAmount" +
                            "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setDepositedItemAmount(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setDepositedItemAmount(Long.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "itemCurrency").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "itemCurrency" +
                            "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setItemCurrency(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setItemCurrency(Integer.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "itemCode").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "itemCode" + "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setItemCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "discount").equals(
                            reader.getName())) {
                    object.setDiscount(Discount.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "agentInterest").equals(
                            reader.getName())) {
                    object.setAgentInterest(AgentInterest.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "tax").equals(
                            reader.getName())) {
                    object.setTax(Tax.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "itemPrice").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "itemPrice" + "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setItemPrice(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setItemPrice(Long.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "itemAttributes").equals(
                            reader.getName())) {
                    object.setItemAttributes(ItemAttributes.Factory.parse(
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
