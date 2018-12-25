/**
 * GetOrderStatusExtendedResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package merchant;


/**
 *  GetOrderStatusExtendedResponse bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class GetOrderStatusExtendedResponse extends merchant.AbstractServiceResponse
    implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = getOrderStatusExtendedResponse
       Namespace URI = http://engine.paymentgate.ru/webservices/merchant
       Namespace Prefix = ns1
     */

    /**
     * field for MerchantOrderParams
     * This was an Array!
     */
    protected merchant.ServiceParam[] localMerchantOrderParams;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMerchantOrderParamsTracker = false;

    /**
     * field for Attributes
     * This was an Array!
     */
    protected merchant.ServiceParam[] localAttributes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAttributesTracker = false;

    /**
     * field for CardAuthInfo
     */
    protected merchant.CardAuthInfo localCardAuthInfo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCardAuthInfoTracker = false;

    /**
     * field for BindingInfo
     */
    protected merchant.CardBindingInfo localBindingInfo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBindingInfoTracker = false;

    /**
     * field for AuthDateTime
     */
    protected java.util.Calendar localAuthDateTime;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAuthDateTimeTracker = false;

    /**
     * field for TerminalId
     */
    protected java.lang.String localTerminalId;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTerminalIdTracker = false;

    /**
     * field for AuthRefNum
     */
    protected java.lang.String localAuthRefNum;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAuthRefNumTracker = false;

    /**
     * field for PaymentAmountInfo
     */
    protected merchant.PaymentAmountInfo localPaymentAmountInfo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPaymentAmountInfoTracker = false;

    /**
     * field for BankInfo
     */
    protected merchant.BankInfo localBankInfo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBankInfoTracker = false;

    /**
     * field for PayerData
     */
    protected merchant.PayerData localPayerData;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPayerDataTracker = false;

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
     * field for LoyaltyInfo
     */
    protected merchant.LoyaltyInfo localLoyaltyInfo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLoyaltyInfoTracker = false;

    /**
     * field for Refunds
     * This was an Array!
     */
    protected merchant.Refund[] localRefunds;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRefundsTracker = false;

    /**
     * field for Chargeback
     */
    protected boolean localChargeback;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localChargebackTracker = false;

    /**
     * field for Operations
     * This was an Array!
     */
    protected merchant.ProcessingOperation[] localOperations;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOperationsTracker = false;

    /**
     * field for PaymentWay
     */
    protected java.lang.String localPaymentWay;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPaymentWayTracker = false;

    /**
     * field for OrderNumber
     * This was an Attribute!
     */
    protected java.lang.String localOrderNumber;

    /**
     * field for OrderStatus
     * This was an Attribute!
     */
    protected int localOrderStatus;

    /**
     * field for ActionCode
     * This was an Attribute!
     */
    protected int localActionCode;

    /**
     * field for ActionCodeDescription
     * This was an Attribute!
     */
    protected java.lang.String localActionCodeDescription;

    /**
     * field for OriginalActionCode
     * This was an Attribute!
     */
    protected java.lang.String localOriginalActionCode;

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
     * field for Date
     * This was an Attribute!
     */
    protected java.util.Calendar localDate;

    /**
     * field for DepositedDate
     * This was an Attribute!
     */
    protected java.util.Calendar localDepositedDate;

    /**
     * field for RefundedDate
     * This was an Attribute!
     */
    protected java.util.Calendar localRefundedDate;

    /**
     * field for ReversedDate
     * This was an Attribute!
     */
    protected java.util.Calendar localReversedDate;

    /**
     * field for OrderDescription
     * This was an Attribute!
     */
    protected java.lang.String localOrderDescription;

    /**
     * field for Ip
     * This was an Attribute!
     */
    protected java.lang.String localIp;

    public boolean isMerchantOrderParamsSpecified() {
        return localMerchantOrderParamsTracker;
    }

    /**
     * Auto generated getter method
     * @return merchant.ServiceParam[]
     */
    public merchant.ServiceParam[] getMerchantOrderParams() {
        return localMerchantOrderParams;
    }

    /**
     * validate the array for MerchantOrderParams
     */
    protected void validateMerchantOrderParams(
        merchant.ServiceParam[] param) {
    }

    /**
     * Auto generated setter method
     * @param param MerchantOrderParams
     */
    public void setMerchantOrderParams(
        merchant.ServiceParam[] param) {
        validateMerchantOrderParams(param);

        localMerchantOrderParamsTracker = param != null;

        this.localMerchantOrderParams = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param merchant.ServiceParam
     */
    public void addMerchantOrderParams(
        merchant.ServiceParam param) {
        if (localMerchantOrderParams == null) {
            localMerchantOrderParams = new merchant.ServiceParam[] {
                    
                };
        }

        //update the setting tracker
        localMerchantOrderParamsTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localMerchantOrderParams);
        list.add(param);
        this.localMerchantOrderParams = (merchant.ServiceParam[]) list.toArray(new merchant.ServiceParam[list.size()]);
    }

    public boolean isAttributesSpecified() {
        return localAttributesTracker;
    }

    /**
     * Auto generated getter method
     * @return merchant.ServiceParam[]
     */
    public merchant.ServiceParam[] getAttributes() {
        return localAttributes;
    }

    /**
     * validate the array for Attributes
     */
    protected void validateAttributes(
        merchant.ServiceParam[] param) {
    }

    /**
     * Auto generated setter method
     * @param param Attributes
     */
    public void setAttributes(
        merchant.ServiceParam[] param) {
        validateAttributes(param);

        localAttributesTracker = param != null;

        this.localAttributes = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param merchant.ServiceParam
     */
    public void addAttributes(
        merchant.ServiceParam param) {
        if (localAttributes == null) {
            localAttributes = new merchant.ServiceParam[] {
                    
                };
        }

        //update the setting tracker
        localAttributesTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localAttributes);
        list.add(param);
        this.localAttributes = (merchant.ServiceParam[]) list.toArray(new merchant.ServiceParam[list.size()]);
    }

    public boolean isCardAuthInfoSpecified() {
        return localCardAuthInfoTracker;
    }

    /**
     * Auto generated getter method
     * @return merchant.CardAuthInfo
     */
    public merchant.CardAuthInfo getCardAuthInfo() {
        return localCardAuthInfo;
    }

    /**
     * Auto generated setter method
     * @param param CardAuthInfo
     */
    public void setCardAuthInfo(
        merchant.CardAuthInfo param) {
        localCardAuthInfoTracker = param != null;

        this.localCardAuthInfo = param;
    }

    public boolean isBindingInfoSpecified() {
        return localBindingInfoTracker;
    }

    /**
     * Auto generated getter method
     * @return merchant.CardBindingInfo
     */
    public merchant.CardBindingInfo getBindingInfo() {
        return localBindingInfo;
    }

    /**
     * Auto generated setter method
     * @param param BindingInfo
     */
    public void setBindingInfo(
        merchant.CardBindingInfo param) {
        localBindingInfoTracker = param != null;

        this.localBindingInfo = param;
    }

    public boolean isAuthDateTimeSpecified() {
        return localAuthDateTimeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getAuthDateTime() {
        return localAuthDateTime;
    }

    /**
     * Auto generated setter method
     * @param param AuthDateTime
     */
    public void setAuthDateTime(java.util.Calendar param) {
        localAuthDateTimeTracker = param != null;

        this.localAuthDateTime = param;
    }

    public boolean isTerminalIdSpecified() {
        return localTerminalIdTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTerminalId() {
        return localTerminalId;
    }

    /**
     * Auto generated setter method
     * @param param TerminalId
     */
    public void setTerminalId(java.lang.String param) {
        localTerminalIdTracker = param != null;

        this.localTerminalId = param;
    }

    public boolean isAuthRefNumSpecified() {
        return localAuthRefNumTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getAuthRefNum() {
        return localAuthRefNum;
    }

    /**
     * Auto generated setter method
     * @param param AuthRefNum
     */
    public void setAuthRefNum(java.lang.String param) {
        localAuthRefNumTracker = param != null;

        this.localAuthRefNum = param;
    }

    public boolean isPaymentAmountInfoSpecified() {
        return localPaymentAmountInfoTracker;
    }

    /**
     * Auto generated getter method
     * @return merchant.PaymentAmountInfo
     */
    public merchant.PaymentAmountInfo getPaymentAmountInfo() {
        return localPaymentAmountInfo;
    }

    /**
     * Auto generated setter method
     * @param param PaymentAmountInfo
     */
    public void setPaymentAmountInfo(
        merchant.PaymentAmountInfo param) {
        localPaymentAmountInfoTracker = param != null;

        this.localPaymentAmountInfo = param;
    }

    public boolean isBankInfoSpecified() {
        return localBankInfoTracker;
    }

    /**
     * Auto generated getter method
     * @return merchant.BankInfo
     */
    public merchant.BankInfo getBankInfo() {
        return localBankInfo;
    }

    /**
     * Auto generated setter method
     * @param param BankInfo
     */
    public void setBankInfo(
        merchant.BankInfo param) {
        localBankInfoTracker = param != null;

        this.localBankInfo = param;
    }

    public boolean isPayerDataSpecified() {
        return localPayerDataTracker;
    }

    /**
     * Auto generated getter method
     * @return merchant.PayerData
     */
    public merchant.PayerData getPayerData() {
        return localPayerData;
    }

    /**
     * Auto generated setter method
     * @param param PayerData
     */
    public void setPayerData(
        merchant.PayerData param) {
        localPayerDataTracker = param != null;

        this.localPayerData = param;
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

    public boolean isLoyaltyInfoSpecified() {
        return localLoyaltyInfoTracker;
    }

    /**
     * Auto generated getter method
     * @return merchant.LoyaltyInfo
     */
    public merchant.LoyaltyInfo getLoyaltyInfo() {
        return localLoyaltyInfo;
    }

    /**
     * Auto generated setter method
     * @param param LoyaltyInfo
     */
    public void setLoyaltyInfo(
        merchant.LoyaltyInfo param) {
        localLoyaltyInfoTracker = param != null;

        this.localLoyaltyInfo = param;
    }

    public boolean isRefundsSpecified() {
        return localRefundsTracker;
    }

    /**
     * Auto generated getter method
     * @return merchant.Refund[]
     */
    public merchant.Refund[] getRefunds() {
        return localRefunds;
    }

    /**
     * validate the array for Refunds
     */
    protected void validateRefunds(
        merchant.Refund[] param) {
    }

    /**
     * Auto generated setter method
     * @param param Refunds
     */
    public void setRefunds(
        merchant.Refund[] param) {
        validateRefunds(param);

        localRefundsTracker = param != null;

        this.localRefunds = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param merchant.Refund
     */
    public void addRefunds(
        merchant.Refund param) {
        if (localRefunds == null) {
            localRefunds = new merchant.Refund[] {
                    
                };
        }

        //update the setting tracker
        localRefundsTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localRefunds);
        list.add(param);
        this.localRefunds = (merchant.Refund[]) list.toArray(new merchant.Refund[list.size()]);
    }

    public boolean isChargebackSpecified() {
        return localChargebackTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getChargeback() {
        return localChargeback;
    }

    /**
     * Auto generated setter method
     * @param param Chargeback
     */
    public void setChargeback(boolean param) {
        // setting primitive attribute tracker to true
        localChargebackTracker = true;

        this.localChargeback = param;
    }

    public boolean isOperationsSpecified() {
        return localOperationsTracker;
    }

    /**
     * Auto generated getter method
     * @return merchant.ProcessingOperation[]
     */
    public merchant.ProcessingOperation[] getOperations() {
        return localOperations;
    }

    /**
     * validate the array for Operations
     */
    protected void validateOperations(
        merchant.ProcessingOperation[] param) {
    }

    /**
     * Auto generated setter method
     * @param param Operations
     */
    public void setOperations(
        merchant.ProcessingOperation[] param) {
        validateOperations(param);

        localOperationsTracker = param != null;

        this.localOperations = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param merchant.ProcessingOperation
     */
    public void addOperations(
        merchant.ProcessingOperation param) {
        if (localOperations == null) {
            localOperations = new merchant.ProcessingOperation[] {
                    
                };
        }

        //update the setting tracker
        localOperationsTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localOperations);
        list.add(param);
        this.localOperations = (merchant.ProcessingOperation[]) list.toArray(new merchant.ProcessingOperation[list.size()]);
    }

    public boolean isPaymentWaySpecified() {
        return localPaymentWayTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPaymentWay() {
        return localPaymentWay;
    }

    /**
     * Auto generated setter method
     * @param param PaymentWay
     */
    public void setPaymentWay(java.lang.String param) {
        localPaymentWayTracker = param != null;

        this.localPaymentWay = param;
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
     * @return int
     */
    public int getActionCode() {
        return localActionCode;
    }

    /**
     * Auto generated setter method
     * @param param ActionCode
     */
    public void setActionCode(int param) {
        this.localActionCode = param;
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
    public java.lang.String getOriginalActionCode() {
        return localOriginalActionCode;
    }

    /**
     * Auto generated setter method
     * @param param OriginalActionCode
     */
    public void setOriginalActionCode(java.lang.String param) {
        this.localOriginalActionCode = param;
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
     * @return java.util.Calendar
     */
    public java.util.Calendar getDepositedDate() {
        return localDepositedDate;
    }

    /**
     * Auto generated setter method
     * @param param DepositedDate
     */
    public void setDepositedDate(java.util.Calendar param) {
        this.localDepositedDate = param;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getRefundedDate() {
        return localRefundedDate;
    }

    /**
     * Auto generated setter method
     * @param param RefundedDate
     */
    public void setRefundedDate(java.util.Calendar param) {
        this.localRefundedDate = param;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getReversedDate() {
        return localReversedDate;
    }

    /**
     * Auto generated setter method
     * @param param ReversedDate
     */
    public void setReversedDate(java.util.Calendar param) {
        this.localReversedDate = param;
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
                "type", namespacePrefix + ":getOrderStatusExtendedResponse",
                xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "type", "getOrderStatusExtendedResponse", xmlWriter);
        }

        if (localErrorCode != null) {
            writeAttribute("", "errorCode",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localErrorCode), xmlWriter);
        }

        if (localErrorMessage != null) {
            writeAttribute("", "errorMessage",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localErrorMessage), xmlWriter);
        }

        if (localUserMessage != null) {
            writeAttribute("", "userMessage",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localUserMessage), xmlWriter);
        }

        if (localOrderNumber != null) {
            writeAttribute("", "orderNumber",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localOrderNumber), xmlWriter);
        }

        if (localOrderStatus != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "orderStatus",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localOrderStatus), xmlWriter);
        }

        if (localActionCode != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "actionCode",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localActionCode), xmlWriter);
        }

        if (localActionCodeDescription != null) {
            writeAttribute("", "actionCodeDescription",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localActionCodeDescription), xmlWriter);
        }

        if (localOriginalActionCode != null) {
            writeAttribute("", "originalActionCode",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localOriginalActionCode), xmlWriter);
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

        if (localDate != null) {
            writeAttribute("", "date",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localDate), xmlWriter);
        }

        if (localDepositedDate != null) {
            writeAttribute("", "depositedDate",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localDepositedDate), xmlWriter);
        }

        if (localRefundedDate != null) {
            writeAttribute("", "refundedDate",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localRefundedDate), xmlWriter);
        }

        if (localReversedDate != null) {
            writeAttribute("", "reversedDate",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localReversedDate), xmlWriter);
        }

        if (localOrderDescription != null) {
            writeAttribute("", "orderDescription",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localOrderDescription), xmlWriter);
        }

        if (localIp != null) {
            writeAttribute("", "ip",
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localIp), xmlWriter);
        }

        if (localMerchantOrderParamsTracker) {
            if (localMerchantOrderParams != null) {
                for (int i = 0; i < localMerchantOrderParams.length; i++) {
                    if (localMerchantOrderParams[i] != null) {
                        localMerchantOrderParams[i].serialize(new javax.xml.namespace.QName(
                                "", "merchantOrderParams"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "merchantOrderParams cannot be null!!");
            }
        }

        if (localAttributesTracker) {
            if (localAttributes != null) {
                for (int i = 0; i < localAttributes.length; i++) {
                    if (localAttributes[i] != null) {
                        localAttributes[i].serialize(new javax.xml.namespace.QName(
                                "", "attributes"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "attributes cannot be null!!");
            }
        }

        if (localCardAuthInfoTracker) {
            if (localCardAuthInfo == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "cardAuthInfo cannot be null!!");
            }

            localCardAuthInfo.serialize(new javax.xml.namespace.QName("",
                    "cardAuthInfo"), xmlWriter);
        }

        if (localBindingInfoTracker) {
            if (localBindingInfo == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "bindingInfo cannot be null!!");
            }

            localBindingInfo.serialize(new javax.xml.namespace.QName("",
                    "bindingInfo"), xmlWriter);
        }

        if (localAuthDateTimeTracker) {
            namespace = "";
            writeStartElement(null, namespace, "authDateTime", xmlWriter);

            if (localAuthDateTime == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "authDateTime cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localAuthDateTime));
            }

            xmlWriter.writeEndElement();
        }

        if (localTerminalIdTracker) {
            namespace = "";
            writeStartElement(null, namespace, "terminalId", xmlWriter);

            if (localTerminalId == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "terminalId cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTerminalId);
            }

            xmlWriter.writeEndElement();
        }

        if (localAuthRefNumTracker) {
            namespace = "";
            writeStartElement(null, namespace, "authRefNum", xmlWriter);

            if (localAuthRefNum == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "authRefNum cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localAuthRefNum);
            }

            xmlWriter.writeEndElement();
        }

        if (localPaymentAmountInfoTracker) {
            if (localPaymentAmountInfo == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "paymentAmountInfo cannot be null!!");
            }

            localPaymentAmountInfo.serialize(new javax.xml.namespace.QName("",
                    "paymentAmountInfo"), xmlWriter);
        }

        if (localBankInfoTracker) {
            if (localBankInfo == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "bankInfo cannot be null!!");
            }

            localBankInfo.serialize(new javax.xml.namespace.QName("", "bankInfo"),
                xmlWriter);
        }

        if (localPayerDataTracker) {
            if (localPayerData == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "payerData cannot be null!!");
            }

            localPayerData.serialize(new javax.xml.namespace.QName("",
                    "payerData"), xmlWriter);
        }

        if (localOrderBundleTracker) {
            if (localOrderBundle == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "orderBundle cannot be null!!");
            }

            localOrderBundle.serialize(new javax.xml.namespace.QName("",
                    "orderBundle"), xmlWriter);
        }

        if (localLoyaltyInfoTracker) {
            if (localLoyaltyInfo == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "loyaltyInfo cannot be null!!");
            }

            localLoyaltyInfo.serialize(new javax.xml.namespace.QName("",
                    "loyaltyInfo"), xmlWriter);
        }

        if (localRefundsTracker) {
            if (localRefunds != null) {
                for (int i = 0; i < localRefunds.length; i++) {
                    if (localRefunds[i] != null) {
                        localRefunds[i].serialize(new javax.xml.namespace.QName(
                                "", "refunds"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "refunds cannot be null!!");
            }
        }

        if (localChargebackTracker) {
            namespace = "";
            writeStartElement(null, namespace, "chargeback", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "chargeback cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localChargeback));
            }

            xmlWriter.writeEndElement();
        }

        if (localOperationsTracker) {
            if (localOperations != null) {
                for (int i = 0; i < localOperations.length; i++) {
                    if (localOperations[i] != null) {
                        localOperations[i].serialize(new javax.xml.namespace.QName(
                                "", "operations"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "operations cannot be null!!");
            }
        }

        if (localPaymentWayTracker) {
            namespace = "";
            writeStartElement(null, namespace, "paymentWay", xmlWriter);

            if (localPaymentWay == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "paymentWay cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPaymentWay);
            }

            xmlWriter.writeEndElement();
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
        public static GetOrderStatusExtendedResponse parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            GetOrderStatusExtendedResponse object = new GetOrderStatusExtendedResponse();

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

                        if (!"getOrderStatusExtendedResponse".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (GetOrderStatusExtendedResponse) merchant.ExtensionMapper.getTypeObject(nsUri,
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

                    object.setErrorCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribErrorCode));
                } else {
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

                // handle attribute "userMessage"
                java.lang.String tempAttribUserMessage = reader.getAttributeValue(null,
                        "userMessage");

                if (tempAttribUserMessage != null) {
                    java.lang.String content = tempAttribUserMessage;

                    object.setUserMessage(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribUserMessage));
                } else {
                }

                handledAttributes.add("userMessage");

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

                // handle attribute "orderStatus"
                java.lang.String tempAttribOrderStatus = reader.getAttributeValue(null,
                        "orderStatus");

                if (tempAttribOrderStatus != null) {
                    java.lang.String content = tempAttribOrderStatus;

                    object.setOrderStatus(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribOrderStatus));
                } else {
                    object.setOrderStatus(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("orderStatus");

                // handle attribute "actionCode"
                java.lang.String tempAttribActionCode = reader.getAttributeValue(null,
                        "actionCode");

                if (tempAttribActionCode != null) {
                    java.lang.String content = tempAttribActionCode;

                    object.setActionCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribActionCode));
                } else {
                    object.setActionCode(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("actionCode");

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

                // handle attribute "originalActionCode"
                java.lang.String tempAttribOriginalActionCode = reader.getAttributeValue(null,
                        "originalActionCode");

                if (tempAttribOriginalActionCode != null) {
                    java.lang.String content = tempAttribOriginalActionCode;

                    object.setOriginalActionCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribOriginalActionCode));
                } else {
                }

                handledAttributes.add("originalActionCode");

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

                // handle attribute "depositedDate"
                java.lang.String tempAttribDepositedDate = reader.getAttributeValue(null,
                        "depositedDate");

                if (tempAttribDepositedDate != null) {
                    java.lang.String content = tempAttribDepositedDate;

                    object.setDepositedDate(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDepositedDate));
                } else {
                }

                handledAttributes.add("depositedDate");

                // handle attribute "refundedDate"
                java.lang.String tempAttribRefundedDate = reader.getAttributeValue(null,
                        "refundedDate");

                if (tempAttribRefundedDate != null) {
                    java.lang.String content = tempAttribRefundedDate;

                    object.setRefundedDate(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribRefundedDate));
                } else {
                }

                handledAttributes.add("refundedDate");

                // handle attribute "reversedDate"
                java.lang.String tempAttribReversedDate = reader.getAttributeValue(null,
                        "reversedDate");

                if (tempAttribReversedDate != null) {
                    java.lang.String content = tempAttribReversedDate;

                    object.setReversedDate(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribReversedDate));
                } else {
                }

                handledAttributes.add("reversedDate");

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

                reader.next();

                java.util.ArrayList list1 = new java.util.ArrayList();

                java.util.ArrayList list2 = new java.util.ArrayList();

                java.util.ArrayList list13 = new java.util.ArrayList();

                java.util.ArrayList list15 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "merchantOrderParams").equals(
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
                            if (new javax.xml.namespace.QName("",
                                        "merchantOrderParams").equals(
                                        reader.getName())) {
                                list1.add(merchant.ServiceParam.Factory.parse(
                                        reader));
                            } else {
                                loopDone1 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setMerchantOrderParams((merchant.ServiceParam[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            merchant.ServiceParam.class,
                            list1));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "attributes").equals(
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
                            if (new javax.xml.namespace.QName("", "attributes").equals(
                                        reader.getName())) {
                                list2.add(merchant.ServiceParam.Factory.parse(
                                        reader));
                            } else {
                                loopDone2 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setAttributes((merchant.ServiceParam[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            merchant.ServiceParam.class,
                            list2));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "cardAuthInfo").equals(
                            reader.getName())) {
                    object.setCardAuthInfo(merchant.CardAuthInfo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "bindingInfo").equals(
                            reader.getName())) {
                    object.setBindingInfo(merchant.CardBindingInfo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "authDateTime").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "authDateTime" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAuthDateTime(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "terminalId").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "terminalId" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTerminalId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "authRefNum").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "authRefNum" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAuthRefNum(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "paymentAmountInfo").equals(
                            reader.getName())) {
                    object.setPaymentAmountInfo(merchant.PaymentAmountInfo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "bankInfo").equals(
                            reader.getName())) {
                    object.setBankInfo(merchant.BankInfo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "payerData").equals(
                            reader.getName())) {
                    object.setPayerData(merchant.PayerData.Factory.parse(
                            reader));

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
                        new javax.xml.namespace.QName("", "loyaltyInfo").equals(
                            reader.getName())) {
                    object.setLoyaltyInfo(merchant.LoyaltyInfo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "refunds").equals(
                            reader.getName())) {
                    // Process the array and step past its final element's end.
                    list13.add(merchant.Refund.Factory.parse(
                            reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone13 = false;

                    while (!loopDone13) {
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
                            loopDone13 = true;
                        } else {
                            if (new javax.xml.namespace.QName("", "refunds").equals(
                                        reader.getName())) {
                                list13.add(merchant.Refund.Factory.parse(
                                        reader));
                            } else {
                                loopDone13 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setRefunds((merchant.Refund[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            merchant.Refund.class,
                            list13));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "chargeback").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "chargeback" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setChargeback(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "operations").equals(
                            reader.getName())) {
                    // Process the array and step past its final element's end.
                    list15.add(merchant.ProcessingOperation.Factory.parse(
                            reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone15 = false;

                    while (!loopDone15) {
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
                            loopDone15 = true;
                        } else {
                            if (new javax.xml.namespace.QName("", "operations").equals(
                                        reader.getName())) {
                                list15.add(merchant.ProcessingOperation.Factory.parse(
                                        reader));
                            } else {
                                loopDone15 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setOperations((merchant.ProcessingOperation[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            merchant.ProcessingOperation.class,
                            list15));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "paymentWay").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "paymentWay" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPaymentWay(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
