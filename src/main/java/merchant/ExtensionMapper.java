/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package merchant;


/**
 *  ExtensionMapper class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ExtensionMapper {
    public static Object getTypeObject(
        String namespaceURI, String typeName,
        javax.xml.stream.XMLStreamReader reader) throws Exception {
        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "itemDetails".equals(typeName)) {
            return ItemDetails.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "entry_type7".equals(typeName)) {
            return Entry_type7.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "tax".equals(typeName)) {
            return Tax.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "androidError".equals(typeName)) {
            return AndroidError.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "threeDSInfo".equals(typeName)) {
            return ThreeDSInfo.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "recurrentPaymentResponse".equals(typeName)) {
            return RecurrentPaymentResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "orderResult".equals(typeName)) {
            return OrderResult.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "createBindingNoPaymentResponse".equals(typeName)) {
            return CreateBindingNoPaymentResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "cardBindingInfo".equals(typeName)) {
            return CardBindingInfo.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "paymentOrderOtherWayParams".equals(typeName)) {
            return PaymentOrderOtherWayParams.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "orderInfo".equals(typeName)) {
            return OrderInfo.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "applePayPaymentResponse".equals(typeName)) {
            return ApplePayPaymentResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "features_type0".equals(typeName)) {
            return Features_type0.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "entry_type1".equals(typeName)) {
            return Entry_type1.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "googlePayError".equals(typeName)) {
            return GooglePayError.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "entry_type2".equals(typeName)) {
            return Entry_type2.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "entry_type0".equals(typeName)) {
            return Entry_type0.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "recurrentPaymentError".equals(typeName)) {
            return RecurrentPaymentError.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "entry_type5".equals(typeName)) {
            return Entry_type5.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "depositOrderParams".equals(typeName)) {
            return DepositOrderParams.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "entry_type6".equals(typeName)) {
            return Entry_type6.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "entry_type3".equals(typeName)) {
            return Entry_type3.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "entry_type4".equals(typeName)) {
            return Entry_type4.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "agentInterest".equals(typeName)) {
            return AgentInterest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "paymentAmountInfo".equals(typeName)) {
            return PaymentAmountInfo.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "googlePayDirectRequest".equals(typeName)) {
            return GooglePayDirectRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "abstractResponse".equals(typeName)) {
            return AbstractResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "abstractServiceRequest".equals(typeName)) {
            return AbstractServiceRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "agent".equals(typeName)) {
            return Agent.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "data".equals(typeName)) {
            return Data.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "googlePayResponse".equals(typeName)) {
            return GooglePayResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "orderStatusRequest".equals(typeName)) {
            return OrderStatusRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "googlePayData".equals(typeName)) {
            return GooglePayData.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "transactionStates".equals(typeName)) {
            return TransactionStates.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "orderInfoArray".equals(typeName)) {
            return OrderInfoArray.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "getOrderStatusExtendedResponse".equals(typeName)) {
            return GetOrderStatusExtendedResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "getBindingsByCardOrIdRequest".equals(typeName)) {
            return GetBindingsByCardOrIdRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "getLastOrdersForMerchantsResponse".equals(typeName)) {
            return GetLastOrdersForMerchantsResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "quantity".equals(typeName)) {
            return Quantity.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "reversalOrderParams".equals(typeName)) {
            return ReversalOrderParams.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "androidPayPaymentResponse".equals(typeName)) {
            return AndroidPayPaymentResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "transactionState".equals(typeName)) {
            return TransactionState.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "cartItems".equals(typeName)) {
            return CartItems.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "merchants".equals(typeName)) {
            return Merchants.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "finishThreeDSRequest".equals(typeName)) {
            return FinishThreeDSRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "paymentOrderOtherWayResult".equals(typeName)) {
            return PaymentOrderOtherWayResult.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "loyaltyInfo".equals(typeName)) {
            return LoyaltyInfo.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "paymentOrderResult".equals(typeName)) {
            return PaymentOrderResult.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "orderStatusResponse".equals(typeName)) {
            return OrderStatusResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "createBindingNoPaymentRequest".equals(typeName)) {
            return CreateBindingNoPaymentRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "error".equals(typeName)) {
            return Error.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "extendBindingResponse".equals(typeName)) {
            return ExtendBindingResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "refundOrderParams".equals(typeName)) {
            return RefundOrderParams.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "paymentOrderParams".equals(typeName)) {
            return PaymentOrderParams.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "samsungPayPaymentRequest".equals(typeName)) {
            return SamsungPayPaymentRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "rawPositionRefundRequest".equals(typeName)) {
            return RawPositionRefundRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "customerDetails".equals(typeName)) {
            return CustomerDetails.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "bindings_type0".equals(typeName)) {
            return Bindings_type0.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "samsungPayPaymentResponse".equals(typeName)) {
            return SamsungPayPaymentResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "recurrentPaymentData".equals(typeName)) {
            return RecurrentPaymentData.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "paymentOrderBindingParams".equals(typeName)) {
            return PaymentOrderBindingParams.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "bankInfo".equals(typeName)) {
            return BankInfo.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "applePayDirectPaymentRequest".equals(typeName)) {
            return ApplePayDirectPaymentRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "item".equals(typeName)) {
            return Item.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "loyalty".equals(typeName)) {
            return Loyalty.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "samsungError".equals(typeName)) {
            return SamsungError.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "loyaltyOperation".equals(typeName)) {
            return LoyaltyOperation.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "itemAttribute".equals(typeName)) {
            return ItemAttribute.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "refund".equals(typeName)) {
            return Refund.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "getLastOrdersForMerchantsRequest".equals(typeName)) {
            return GetLastOrdersForMerchantsRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "awardBonus".equals(typeName)) {
            return AwardBonus.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "registerOrderResponse".equals(typeName)) {
            return RegisterOrderResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "discount".equals(typeName)) {
            return Discount.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "binding".equals(typeName)) {
            return Binding.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "abstractServiceResponse".equals(typeName)) {
            return AbstractServiceResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "finishThreeDSResponse".equals(typeName)) {
            return FinishThreeDSResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "recurrentPaymentRequest".equals(typeName)) {
            return RecurrentPaymentRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "itemAttributes".equals(typeName)) {
            return ItemAttributes.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "taxType".equals(typeName)) {
            return TaxType.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "applePayPaymentRequest".equals(typeName)) {
            return ApplePayPaymentRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "additionalParameters_type3".equals(typeName)) {
            return AdditionalParameters_type3.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "additionalParameters_type2".equals(typeName)) {
            return AdditionalParameters_type2.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "verifyEnrollmentResponse".equals(typeName)) {
            return VerifyEnrollmentResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "additionalParameters_type1".equals(typeName)) {
            return AdditionalParameters_type1.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "additionalParameters_type0".equals(typeName)) {
            return AdditionalParameters_type0.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "getOrderStatusExtendedRequest".equals(typeName)) {
            return GetOrderStatusExtendedRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "additionalParameters_type7".equals(typeName)) {
            return AdditionalParameters_type7.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "additionalParameters_type6".equals(typeName)) {
            return AdditionalParameters_type6.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "additionalParameters_type5".equals(typeName)) {
            return AdditionalParameters_type5.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "additionalParameters_type4".equals(typeName)) {
            return AdditionalParameters_type4.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "androidData".equals(typeName)) {
            return AndroidData.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "deliveryInfo".equals(typeName)) {
            return DeliveryInfo.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "loyalties".equals(typeName)) {
            return Loyalties.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "itemDetailsParam".equals(typeName)) {
            return ItemDetailsParam.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "orderFeature".equals(typeName)) {
            return OrderFeature.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "loginParams".equals(typeName)) {
            return LoginParams.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "operation".equals(typeName)) {
            return Operation.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "paymentBonus".equals(typeName)) {
            return PaymentBonus.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "secureAuthInfo".equals(typeName)) {
            return SecureAuthInfo.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "extendBindingRequest".equals(typeName)) {
            return ExtendBindingRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "orderParams".equals(typeName)) {
            return OrderParams.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "rawSumRefundRequest".equals(typeName)) {
            return RawSumRefundRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "getBindingsRequest".equals(typeName)) {
            return GetBindingsRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "payerData".equals(typeName)) {
            return PayerData.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "orderBundle".equals(typeName)) {
            return OrderBundle.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "processingOperation".equals(typeName)) {
            return ProcessingOperation.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "agentType".equals(typeName)) {
            return AgentType.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "getBindingsResponse".equals(typeName)) {
            return GetBindingsResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "serviceParam".equals(typeName)) {
            return ServiceParam.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "processingOperationType".equals(typeName)) {
            return ProcessingOperationType.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "cardAuthInfo".equals(typeName)) {
            return CardAuthInfo.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "googlePayRequest".equals(typeName)) {
            return GooglePayRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "androidPayPaymentRequest".equals(typeName)) {
            return AndroidPayPaymentRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "samsungData".equals(typeName)) {
            return SamsungData.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "addParamsRequest".equals(typeName)) {
            return AddParamsRequest.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
