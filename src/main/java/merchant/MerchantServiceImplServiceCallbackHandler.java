/**
 * MerchantServiceImplServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package merchant;


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
        merchant.GetLastOrdersForMerchantsResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getLastOrdersForMerchants operation
     */
    public void receiveErrorgetLastOrdersForMerchants(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateSSLCardList method
     * override this method for handling normal response from updateSSLCardList operation
     */
    public void receiveResultupdateSSLCardList(
        merchant.UpdateSSLCardListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateSSLCardList operation
     */
    public void receiveErrorupdateSSLCardList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for verifyEnrollment method
     * override this method for handling normal response from verifyEnrollment operation
     */
    public void receiveResultverifyEnrollment(
        merchant.VerifyEnrollmentResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from verifyEnrollment operation
     */
    public void receiveErrorverifyEnrollment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for extendBinding method
     * override this method for handling normal response from extendBinding operation
     */
    public void receiveResultextendBinding(
        merchant.ExtendBindingResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from extendBinding operation
     */
    public void receiveErrorextendBinding(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for registerOrderPreAuth method
     * override this method for handling normal response from registerOrderPreAuth operation
     */
    public void receiveResultregisterOrderPreAuth(
        merchant.RegisterOrderPreAuthResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from registerOrderPreAuth operation
     */
    public void receiveErrorregisterOrderPreAuth(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getOrderStatusExtended method
     * override this method for handling normal response from getOrderStatusExtended operation
     */
    public void receiveResultgetOrderStatusExtended(
        merchant.GetOrderStatusExtendedResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getOrderStatusExtended operation
     */
    public void receiveErrorgetOrderStatusExtended(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getLastOrders method
     * override this method for handling normal response from getLastOrders operation
     */
    public void receiveResultgetLastOrders(
        merchant.GetLastOrdersResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getLastOrders operation
     */
    public void receiveErrorgetLastOrders(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getBindings method
     * override this method for handling normal response from getBindings operation
     */
    public void receiveResultgetBindings(
        merchant.GetBindingsResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getBindings operation
     */
    public void receiveErrorgetBindings(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for paymentOrderBinding method
     * override this method for handling normal response from paymentOrderBinding operation
     */
    public void receiveResultpaymentOrderBinding(
        merchant.PaymentOrderBindingResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from paymentOrderBinding operation
     */
    public void receiveErrorpaymentOrderBinding(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for applePay method
     * override this method for handling normal response from applePay operation
     */
    public void receiveResultapplePay(
        merchant.ApplePayResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from applePay operation
     */
    public void receiveErrorapplePay(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addParams method
     * override this method for handling normal response from addParams operation
     */
    public void receiveResultaddParams(
        merchant.AddParamsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addParams operation
     */
    public void receiveErroraddParams(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for applePayDirect method
     * override this method for handling normal response from applePayDirect operation
     */
    public void receiveResultapplePayDirect(
        merchant.ApplePayDirectResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from applePayDirect operation
     */
    public void receiveErrorapplePayDirect(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for androidPay method
     * override this method for handling normal response from androidPay operation
     */
    public void receiveResultandroidPay(
        merchant.AndroidPayResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from androidPay operation
     */
    public void receiveErrorandroidPay(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for registerOrder method
     * override this method for handling normal response from registerOrder operation
     */
    public void receiveResultregisterOrder(
        merchant.RegisterOrderResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from registerOrder operation
     */
    public void receiveErrorregisterOrder(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createBindingNoPayment method
     * override this method for handling normal response from createBindingNoPayment operation
     */
    public void receiveResultcreateBindingNoPayment(
        merchant.CreateBindingNoPaymentResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createBindingNoPayment operation
     */
    public void receiveErrorcreateBindingNoPayment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for unBindCard method
     * override this method for handling normal response from unBindCard operation
     */
    public void receiveResultunBindCard(
        merchant.UnBindCardResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from unBindCard operation
     */
    public void receiveErrorunBindCard(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for refundOrder method
     * override this method for handling normal response from refundOrder operation
     */
    public void receiveResultrefundOrder(
        merchant.RefundOrderResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from refundOrder operation
     */
    public void receiveErrorrefundOrder(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for paymentOrder method
     * override this method for handling normal response from paymentOrder operation
     */
    public void receiveResultpaymentOrder(
        merchant.PaymentOrderResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from paymentOrder operation
     */
    public void receiveErrorpaymentOrder(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getOrderStatus method
     * override this method for handling normal response from getOrderStatus operation
     */
    public void receiveResultgetOrderStatus(
        merchant.GetOrderStatusResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getOrderStatus operation
     */
    public void receiveErrorgetOrderStatus(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for depositOrder method
     * override this method for handling normal response from depositOrder operation
     */
    public void receiveResultdepositOrder(
        merchant.DepositOrderResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from depositOrder operation
     */
    public void receiveErrordepositOrder(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for checkAuthenticate method
     * override this method for handling normal response from checkAuthenticate operation
     */
    public void receiveResultcheckAuthenticate(
        merchant.CheckAuthenticateResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from checkAuthenticate operation
     */
    public void receiveErrorcheckAuthenticate(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for samsungPay method
     * override this method for handling normal response from samsungPay operation
     */
    public void receiveResultsamsungPay(
        merchant.SamsungPayResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from samsungPay operation
     */
    public void receiveErrorsamsungPay(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateWhiteCardList method
     * override this method for handling normal response from updateWhiteCardList operation
     */
    public void receiveResultupdateWhiteCardList(
        merchant.UpdateWhiteCardListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateWhiteCardList operation
     */
    public void receiveErrorupdateWhiteCardList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for paymentOrderOtherWay method
     * override this method for handling normal response from paymentOrderOtherWay operation
     */
    public void receiveResultpaymentOrderOtherWay(
        merchant.PaymentOrderOtherWayResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from paymentOrderOtherWay operation
     */
    public void receiveErrorpaymentOrderOtherWay(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for recurrentPayment method
     * override this method for handling normal response from recurrentPayment operation
     */
    public void receiveResultrecurrentPayment(
        merchant.RecurrentPaymentResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from recurrentPayment operation
     */
    public void receiveErrorrecurrentPayment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for finishThreeDs method
     * override this method for handling normal response from finishThreeDs operation
     */
    public void receiveResultfinishThreeDs(
        merchant.FinishThreeDsResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from finishThreeDs operation
     */
    public void receiveErrorfinishThreeDs(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateBlackCardList method
     * override this method for handling normal response from updateBlackCardList operation
     */
    public void receiveResultupdateBlackCardList(
        merchant.UpdateBlackCardListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateBlackCardList operation
     */
    public void receiveErrorupdateBlackCardList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for bindCard method
     * override this method for handling normal response from bindCard operation
     */
    public void receiveResultbindCard(
        merchant.BindCardResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from bindCard operation
     */
    public void receiveErrorbindCard(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for reverseOrder method
     * override this method for handling normal response from reverseOrder operation
     */
    public void receiveResultreverseOrder(
        merchant.ReverseOrderResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from reverseOrder operation
     */
    public void receiveErrorreverseOrder(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for googlePayDirect method
     * override this method for handling normal response from googlePayDirect operation
     */
    public void receiveResultgooglePayDirect(
        merchant.GooglePayDirectResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from googlePayDirect operation
     */
    public void receiveErrorgooglePayDirect(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for processRawPositionOrderRefund method
     * override this method for handling normal response from processRawPositionOrderRefund operation
     */
    public void receiveResultprocessRawPositionOrderRefund(
        merchant.ProcessRawPositionOrderRefundResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from processRawPositionOrderRefund operation
     */
    public void receiveErrorprocessRawPositionOrderRefund(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for processRawSumOrderRefund method
     * override this method for handling normal response from processRawSumOrderRefund operation
     */
    public void receiveResultprocessRawSumOrderRefund(
        merchant.ProcessRawSumOrderRefundResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from processRawSumOrderRefund operation
     */
    public void receiveErrorprocessRawSumOrderRefund(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for googlePay method
     * override this method for handling normal response from googlePay operation
     */
    public void receiveResultgooglePay(
        merchant.GooglePayResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from googlePay operation
     */
    public void receiveErrorgooglePay(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getBindingsByCardOrId method
     * override this method for handling normal response from getBindingsByCardOrId operation
     */
    public void receiveResultgetBindingsByCardOrId(
        merchant.GetBindingsByCardOrIdResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getBindingsByCardOrId operation
     */
    public void receiveErrorgetBindingsByCardOrId(java.lang.Exception e) {
    }
}
