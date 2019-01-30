/**
 * MerchantServiceImplServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package sberbank;


import merchant.*;

/**
 *  MerchantServiceImplServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class MerchantServiceImplServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public MerchantServiceImplServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public MerchantServiceImplServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getLastOrdersForMerchants method
     * override this method for handling normal response from getLastOrdersForMerchants operation
     */
    public void receiveResultgetLastOrdersForMerchants(
        GetLastOrdersForMerchantsResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getLastOrdersForMerchants operation
     */
    public void receiveErrorgetLastOrdersForMerchants(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateSSLCardList method
     * override this method for handling normal response from updateSSLCardList operation
     */
    public void receiveResultupdateSSLCardList(
        UpdateSSLCardListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateSSLCardList operation
     */
    public void receiveErrorupdateSSLCardList(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for verifyEnrollment method
     * override this method for handling normal response from verifyEnrollment operation
     */
    public void receiveResultverifyEnrollment(
        VerifyEnrollmentResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from verifyEnrollment operation
     */
    public void receiveErrorverifyEnrollment(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for extendBinding method
     * override this method for handling normal response from extendBinding operation
     */
    public void receiveResultextendBinding(
        ExtendBindingResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from extendBinding operation
     */
    public void receiveErrorextendBinding(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for registerOrderPreAuth method
     * override this method for handling normal response from registerOrderPreAuth operation
     */
    public void receiveResultregisterOrderPreAuth(
        RegisterOrderPreAuthResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from registerOrderPreAuth operation
     */
    public void receiveErrorregisterOrderPreAuth(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getOrderStatusExtended method
     * override this method for handling normal response from getOrderStatusExtended operation
     */
    public void receiveResultgetOrderStatusExtended(
        GetOrderStatusExtendedResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getOrderStatusExtended operation
     */
    public void receiveErrorgetOrderStatusExtended(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getLastOrders method
     * override this method for handling normal response from getLastOrders operation
     */
    public void receiveResultgetLastOrders(
        GetLastOrdersResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getLastOrders operation
     */
    public void receiveErrorgetLastOrders(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getBindings method
     * override this method for handling normal response from getBindings operation
     */
    public void receiveResultgetBindings(
        GetBindingsResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getBindings operation
     */
    public void receiveErrorgetBindings(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for paymentOrderBinding method
     * override this method for handling normal response from paymentOrderBinding operation
     */
    public void receiveResultpaymentOrderBinding(
        PaymentOrderBindingResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from paymentOrderBinding operation
     */
    public void receiveErrorpaymentOrderBinding(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for applePay method
     * override this method for handling normal response from applePay operation
     */
    public void receiveResultapplePay(
        ApplePayResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from applePay operation
     */
    public void receiveErrorapplePay(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addParams method
     * override this method for handling normal response from addParams operation
     */
    public void receiveResultaddParams(
        AddParamsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addParams operation
     */
    public void receiveErroraddParams(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for applePayDirect method
     * override this method for handling normal response from applePayDirect operation
     */
    public void receiveResultapplePayDirect(
        ApplePayDirectResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from applePayDirect operation
     */
    public void receiveErrorapplePayDirect(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for androidPay method
     * override this method for handling normal response from androidPay operation
     */
    public void receiveResultandroidPay(
        AndroidPayResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from androidPay operation
     */
    public void receiveErrorandroidPay(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for registerOrder method
     * override this method for handling normal response from registerOrder operation
     */
    public void receiveResultregisterOrder(
        RegisterOrderResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from registerOrder operation
     */
    public void receiveErrorregisterOrder(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createBindingNoPayment method
     * override this method for handling normal response from createBindingNoPayment operation
     */
    public void receiveResultcreateBindingNoPayment(
        CreateBindingNoPaymentResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createBindingNoPayment operation
     */
    public void receiveErrorcreateBindingNoPayment(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for unBindCard method
     * override this method for handling normal response from unBindCard operation
     */
    public void receiveResultunBindCard(
        UnBindCardResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from unBindCard operation
     */
    public void receiveErrorunBindCard(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for refundOrder method
     * override this method for handling normal response from refundOrder operation
     */
    public void receiveResultrefundOrder(
        RefundOrderResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from refundOrder operation
     */
    public void receiveErrorrefundOrder(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for paymentOrder method
     * override this method for handling normal response from paymentOrder operation
     */
    public void receiveResultpaymentOrder(
        PaymentOrderResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from paymentOrder operation
     */
    public void receiveErrorpaymentOrder(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getOrderStatus method
     * override this method for handling normal response from getOrderStatus operation
     */
    public void receiveResultgetOrderStatus(
        GetOrderStatusResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getOrderStatus operation
     */
    public void receiveErrorgetOrderStatus(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for depositOrder method
     * override this method for handling normal response from depositOrder operation
     */
    public void receiveResultdepositOrder(
        DepositOrderResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from depositOrder operation
     */
    public void receiveErrordepositOrder(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for checkAuthenticate method
     * override this method for handling normal response from checkAuthenticate operation
     */
    public void receiveResultcheckAuthenticate(
        CheckAuthenticateResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from checkAuthenticate operation
     */
    public void receiveErrorcheckAuthenticate(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for samsungPay method
     * override this method for handling normal response from samsungPay operation
     */
    public void receiveResultsamsungPay(
        SamsungPayResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from samsungPay operation
     */
    public void receiveErrorsamsungPay(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateWhiteCardList method
     * override this method for handling normal response from updateWhiteCardList operation
     */
    public void receiveResultupdateWhiteCardList(
        UpdateWhiteCardListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateWhiteCardList operation
     */
    public void receiveErrorupdateWhiteCardList(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for paymentOrderOtherWay method
     * override this method for handling normal response from paymentOrderOtherWay operation
     */
    public void receiveResultpaymentOrderOtherWay(
        PaymentOrderOtherWayResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from paymentOrderOtherWay operation
     */
    public void receiveErrorpaymentOrderOtherWay(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for recurrentPayment method
     * override this method for handling normal response from recurrentPayment operation
     */
    public void receiveResultrecurrentPayment(
        RecurrentPaymentResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from recurrentPayment operation
     */
    public void receiveErrorrecurrentPayment(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for finishThreeDs method
     * override this method for handling normal response from finishThreeDs operation
     */
    public void receiveResultfinishThreeDs(
        FinishThreeDsResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from finishThreeDs operation
     */
    public void receiveErrorfinishThreeDs(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateBlackCardList method
     * override this method for handling normal response from updateBlackCardList operation
     */
    public void receiveResultupdateBlackCardList(
        UpdateBlackCardListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateBlackCardList operation
     */
    public void receiveErrorupdateBlackCardList(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for bindCard method
     * override this method for handling normal response from bindCard operation
     */
    public void receiveResultbindCard(
        BindCardResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from bindCard operation
     */
    public void receiveErrorbindCard(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for reverseOrder method
     * override this method for handling normal response from reverseOrder operation
     */
    public void receiveResultreverseOrder(
        ReverseOrderResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from reverseOrder operation
     */
    public void receiveErrorreverseOrder(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for googlePayDirect method
     * override this method for handling normal response from googlePayDirect operation
     */
    public void receiveResultgooglePayDirect(
        GooglePayDirectResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from googlePayDirect operation
     */
    public void receiveErrorgooglePayDirect(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for processRawPositionOrderRefund method
     * override this method for handling normal response from processRawPositionOrderRefund operation
     */
    public void receiveResultprocessRawPositionOrderRefund(
        ProcessRawPositionOrderRefundResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from processRawPositionOrderRefund operation
     */
    public void receiveErrorprocessRawPositionOrderRefund(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for processRawSumOrderRefund method
     * override this method for handling normal response from processRawSumOrderRefund operation
     */
    public void receiveResultprocessRawSumOrderRefund(
        ProcessRawSumOrderRefundResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from processRawSumOrderRefund operation
     */
    public void receiveErrorprocessRawSumOrderRefund(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for googlePay method
     * override this method for handling normal response from googlePay operation
     */
    public void receiveResultgooglePay(
        GooglePayResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from googlePay operation
     */
    public void receiveErrorgooglePay(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getBindingsByCardOrId method
     * override this method for handling normal response from getBindingsByCardOrId operation
     */
    public void receiveResultgetBindingsByCardOrId(
        GetBindingsByCardOrIdResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getBindingsByCardOrId operation
     */
    public void receiveErrorgetBindingsByCardOrId(Exception e) {
    }
}
