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
    public static java.lang.Object getTypeObject(
        java.lang.String namespaceURI, java.lang.String typeName,
        javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "itemDetails".equals(typeName)) {
            return merchant.ItemDetails.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "entry_type7".equals(typeName)) {
            return merchant.Entry_type7.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "tax".equals(typeName)) {
            return merchant.Tax.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "androidError".equals(typeName)) {
            return merchant.AndroidError.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "threeDSInfo".equals(typeName)) {
            return merchant.ThreeDSInfo.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "recurrentPaymentResponse".equals(typeName)) {
            return merchant.RecurrentPaymentResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "orderResult".equals(typeName)) {
            return merchant.OrderResult.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "createBindingNoPaymentResponse".equals(typeName)) {
            return merchant.CreateBindingNoPaymentResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "cardBindingInfo".equals(typeName)) {
            return merchant.CardBindingInfo.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "paymentOrderOtherWayParams".equals(typeName)) {
            return merchant.PaymentOrderOtherWayParams.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "orderInfo".equals(typeName)) {
            return merchant.OrderInfo.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "applePayPaymentResponse".equals(typeName)) {
            return merchant.ApplePayPaymentResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "features_type0".equals(typeName)) {
            return merchant.Features_type0.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "entry_type1".equals(typeName)) {
            return merchant.Entry_type1.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "googlePayError".equals(typeName)) {
            return merchant.GooglePayError.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "entry_type2".equals(typeName)) {
            return merchant.Entry_type2.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "entry_type0".equals(typeName)) {
            return merchant.Entry_type0.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "recurrentPaymentError".equals(typeName)) {
            return merchant.RecurrentPaymentError.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "entry_type5".equals(typeName)) {
            return merchant.Entry_type5.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "depositOrderParams".equals(typeName)) {
            return merchant.DepositOrderParams.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "entry_type6".equals(typeName)) {
            return merchant.Entry_type6.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "entry_type3".equals(typeName)) {
            return merchant.Entry_type3.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "entry_type4".equals(typeName)) {
            return merchant.Entry_type4.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "agentInterest".equals(typeName)) {
            return merchant.AgentInterest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "paymentAmountInfo".equals(typeName)) {
            return merchant.PaymentAmountInfo.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "googlePayDirectRequest".equals(typeName)) {
            return merchant.GooglePayDirectRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "abstractResponse".equals(typeName)) {
            return merchant.AbstractResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "abstractServiceRequest".equals(typeName)) {
            return merchant.AbstractServiceRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "agent".equals(typeName)) {
            return merchant.Agent.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "data".equals(typeName)) {
            return merchant.Data.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "googlePayResponse".equals(typeName)) {
            return merchant.GooglePayResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "orderStatusRequest".equals(typeName)) {
            return merchant.OrderStatusRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "googlePayData".equals(typeName)) {
            return merchant.GooglePayData.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "transactionStates".equals(typeName)) {
            return merchant.TransactionStates.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "orderInfoArray".equals(typeName)) {
            return merchant.OrderInfoArray.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "getOrderStatusExtendedResponse".equals(typeName)) {
            return merchant.GetOrderStatusExtendedResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "getBindingsByCardOrIdRequest".equals(typeName)) {
            return merchant.GetBindingsByCardOrIdRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "getLastOrdersForMerchantsResponse".equals(typeName)) {
            return merchant.GetLastOrdersForMerchantsResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "quantity".equals(typeName)) {
            return merchant.Quantity.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "reversalOrderParams".equals(typeName)) {
            return merchant.ReversalOrderParams.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "androidPayPaymentResponse".equals(typeName)) {
            return merchant.AndroidPayPaymentResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "transactionState".equals(typeName)) {
            return merchant.TransactionState.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "cartItems".equals(typeName)) {
            return merchant.CartItems.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "merchants".equals(typeName)) {
            return merchant.Merchants.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "finishThreeDSRequest".equals(typeName)) {
            return merchant.FinishThreeDSRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "paymentOrderOtherWayResult".equals(typeName)) {
            return merchant.PaymentOrderOtherWayResult.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "loyaltyInfo".equals(typeName)) {
            return merchant.LoyaltyInfo.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "paymentOrderResult".equals(typeName)) {
            return merchant.PaymentOrderResult.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "orderStatusResponse".equals(typeName)) {
            return merchant.OrderStatusResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "createBindingNoPaymentRequest".equals(typeName)) {
            return merchant.CreateBindingNoPaymentRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "error".equals(typeName)) {
            return merchant.Error.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "extendBindingResponse".equals(typeName)) {
            return merchant.ExtendBindingResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "refundOrderParams".equals(typeName)) {
            return merchant.RefundOrderParams.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "paymentOrderParams".equals(typeName)) {
            return merchant.PaymentOrderParams.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "samsungPayPaymentRequest".equals(typeName)) {
            return merchant.SamsungPayPaymentRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "rawPositionRefundRequest".equals(typeName)) {
            return merchant.RawPositionRefundRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "customerDetails".equals(typeName)) {
            return merchant.CustomerDetails.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "bindings_type0".equals(typeName)) {
            return merchant.Bindings_type0.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "samsungPayPaymentResponse".equals(typeName)) {
            return merchant.SamsungPayPaymentResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "recurrentPaymentData".equals(typeName)) {
            return merchant.RecurrentPaymentData.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "paymentOrderBindingParams".equals(typeName)) {
            return merchant.PaymentOrderBindingParams.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "bankInfo".equals(typeName)) {
            return merchant.BankInfo.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "applePayDirectPaymentRequest".equals(typeName)) {
            return merchant.ApplePayDirectPaymentRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "item".equals(typeName)) {
            return merchant.Item.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "loyalty".equals(typeName)) {
            return merchant.Loyalty.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "samsungError".equals(typeName)) {
            return merchant.SamsungError.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "loyaltyOperation".equals(typeName)) {
            return merchant.LoyaltyOperation.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "itemAttribute".equals(typeName)) {
            return merchant.ItemAttribute.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "refund".equals(typeName)) {
            return merchant.Refund.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "getLastOrdersForMerchantsRequest".equals(typeName)) {
            return merchant.GetLastOrdersForMerchantsRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "awardBonus".equals(typeName)) {
            return merchant.AwardBonus.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "registerOrderResponse".equals(typeName)) {
            return merchant.RegisterOrderResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "discount".equals(typeName)) {
            return merchant.Discount.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "binding".equals(typeName)) {
            return merchant.Binding.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "abstractServiceResponse".equals(typeName)) {
            return merchant.AbstractServiceResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "finishThreeDSResponse".equals(typeName)) {
            return merchant.FinishThreeDSResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "recurrentPaymentRequest".equals(typeName)) {
            return merchant.RecurrentPaymentRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "itemAttributes".equals(typeName)) {
            return merchant.ItemAttributes.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "taxType".equals(typeName)) {
            return merchant.TaxType.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "applePayPaymentRequest".equals(typeName)) {
            return merchant.ApplePayPaymentRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "additionalParameters_type3".equals(typeName)) {
            return merchant.AdditionalParameters_type3.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "additionalParameters_type2".equals(typeName)) {
            return merchant.AdditionalParameters_type2.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "verifyEnrollmentResponse".equals(typeName)) {
            return merchant.VerifyEnrollmentResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "additionalParameters_type1".equals(typeName)) {
            return merchant.AdditionalParameters_type1.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "additionalParameters_type0".equals(typeName)) {
            return merchant.AdditionalParameters_type0.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "getOrderStatusExtendedRequest".equals(typeName)) {
            return merchant.GetOrderStatusExtendedRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "additionalParameters_type7".equals(typeName)) {
            return merchant.AdditionalParameters_type7.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "additionalParameters_type6".equals(typeName)) {
            return merchant.AdditionalParameters_type6.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "additionalParameters_type5".equals(typeName)) {
            return merchant.AdditionalParameters_type5.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "additionalParameters_type4".equals(typeName)) {
            return merchant.AdditionalParameters_type4.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "androidData".equals(typeName)) {
            return merchant.AndroidData.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "deliveryInfo".equals(typeName)) {
            return merchant.DeliveryInfo.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "loyalties".equals(typeName)) {
            return merchant.Loyalties.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "itemDetailsParam".equals(typeName)) {
            return merchant.ItemDetailsParam.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "orderFeature".equals(typeName)) {
            return merchant.OrderFeature.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "loginParams".equals(typeName)) {
            return merchant.LoginParams.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "operation".equals(typeName)) {
            return merchant.Operation.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "paymentBonus".equals(typeName)) {
            return merchant.PaymentBonus.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "secureAuthInfo".equals(typeName)) {
            return merchant.SecureAuthInfo.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "extendBindingRequest".equals(typeName)) {
            return merchant.ExtendBindingRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "orderParams".equals(typeName)) {
            return merchant.OrderParams.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "rawSumRefundRequest".equals(typeName)) {
            return merchant.RawSumRefundRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "getBindingsRequest".equals(typeName)) {
            return merchant.GetBindingsRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "payerData".equals(typeName)) {
            return merchant.PayerData.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "orderBundle".equals(typeName)) {
            return merchant.OrderBundle.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "processingOperation".equals(typeName)) {
            return merchant.ProcessingOperation.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "agentType".equals(typeName)) {
            return merchant.AgentType.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "getBindingsResponse".equals(typeName)) {
            return merchant.GetBindingsResponse.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "serviceParam".equals(typeName)) {
            return merchant.ServiceParam.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "processingOperationType".equals(typeName)) {
            return merchant.ProcessingOperationType.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "cardAuthInfo".equals(typeName)) {
            return merchant.CardAuthInfo.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "googlePayRequest".equals(typeName)) {
            return merchant.GooglePayRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) &&
                "androidPayPaymentRequest".equals(typeName)) {
            return merchant.AndroidPayPaymentRequest.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "samsungData".equals(typeName)) {
            return merchant.SamsungData.Factory.parse(reader);
        }

        if ("http://engine.paymentgate.ru/webservices/merchant".equals(
                    namespaceURI) && "addParamsRequest".equals(typeName)) {
            return merchant.AddParamsRequest.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
