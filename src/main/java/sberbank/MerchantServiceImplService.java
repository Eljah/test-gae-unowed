/**
 * MerchantServiceImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package sberbank;


import merchant.*;

/*
 *  MerchantServiceImplService java interface
 */
public interface MerchantServiceImplService {
    /**
     * Auto generated method signature
     *
     * @param getLastOrdersForMerchants0
     */
    public GetLastOrdersForMerchantsResponseE getLastOrdersForMerchants(
            GetLastOrdersForMerchants getLastOrdersForMerchants0)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getLastOrdersForMerchants0
     */
    public void startgetLastOrdersForMerchants(
            GetLastOrdersForMerchants getLastOrdersForMerchants0,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updateSSLCardList2
     */
    public UpdateSSLCardListResponse updateSSLCardList(
            UpdateSSLCardList updateSSLCardList2)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateSSLCardList2
     */
    public void startupdateSSLCardList(
            UpdateSSLCardList updateSSLCardList2,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param verifyEnrollment4
     */
    public VerifyEnrollmentResponseE verifyEnrollment(
            VerifyEnrollment verifyEnrollment4)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param verifyEnrollment4
     */
    public void startverifyEnrollment(
            VerifyEnrollment verifyEnrollment4,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param extendBinding6
     */
    public ExtendBindingResponseE extendBinding(
            ExtendBinding extendBinding6)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param extendBinding6
     */
    public void startextendBinding(
            ExtendBinding extendBinding6,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param registerOrderPreAuth8
     */
    public RegisterOrderPreAuthResponse registerOrderPreAuth(
            RegisterOrderPreAuth registerOrderPreAuth8)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param registerOrderPreAuth8
     */
    public void startregisterOrderPreAuth(
            RegisterOrderPreAuth registerOrderPreAuth8,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getOrderStatusExtended10
     */
    public GetOrderStatusExtendedResponseE getOrderStatusExtended(
            GetOrderStatusExtended getOrderStatusExtended10)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getOrderStatusExtended10
     */
    public void startgetOrderStatusExtended(
            GetOrderStatusExtended getOrderStatusExtended10,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getLastOrders12
     */
    public GetLastOrdersResponse getLastOrders(
            GetLastOrders getLastOrders12)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getLastOrders12
     */
    public void startgetLastOrders(
            GetLastOrders getLastOrders12,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getBindings14
     */
    public GetBindingsResponseE getBindings(
            GetBindings getBindings14)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getBindings14
     */
    public void startgetBindings(
            GetBindings getBindings14,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param paymentOrderBinding16
     */
    public PaymentOrderBindingResponse paymentOrderBinding(
            PaymentOrderBinding paymentOrderBinding16)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param paymentOrderBinding16
     */
    public void startpaymentOrderBinding(
            PaymentOrderBinding paymentOrderBinding16,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param applePay18
     */
    public ApplePayResponse applePay(
            ApplePay applePay18)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param applePay18
     */
    public void startapplePay(
            ApplePay applePay18,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param addParams20
     */
    public AddParamsResponse addParams(
            AddParams addParams20)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param addParams20
     */
    public void startaddParams(
            AddParams addParams20,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param applePayDirect22
     */
    public ApplePayDirectResponse applePayDirect(
            ApplePayDirect applePayDirect22)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param applePayDirect22
     */
    public void startapplePayDirect(
            ApplePayDirect applePayDirect22,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param androidPay24
     */
    public AndroidPayResponse androidPay(
            AndroidPay androidPay24)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param androidPay24
     */
    public void startandroidPay(
            AndroidPay androidPay24,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param registerOrder26
     */
    public RegisterOrderResponseE registerOrder(
            RegisterOrder registerOrder26)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param registerOrder26
     */
    public void startregisterOrder(
            RegisterOrder registerOrder26,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param createBindingNoPayment28
     */
    public CreateBindingNoPaymentResponseE createBindingNoPayment(
            CreateBindingNoPayment createBindingNoPayment28)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param createBindingNoPayment28
     */
    public void startcreateBindingNoPayment(
            CreateBindingNoPayment createBindingNoPayment28,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param unBindCard30
     */
    public UnBindCardResponse unBindCard(
            UnBindCard unBindCard30)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param unBindCard30
     */
    public void startunBindCard(
            UnBindCard unBindCard30,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param refundOrder32
     */
    public RefundOrderResponse refundOrder(
            RefundOrder refundOrder32)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param refundOrder32
     */
    public void startrefundOrder(
            RefundOrder refundOrder32,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param paymentOrder34
     */
    public PaymentOrderResponse paymentOrder(
            PaymentOrder paymentOrder34)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param paymentOrder34
     */
    public void startpaymentOrder(
            PaymentOrder paymentOrder34,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getOrderStatus36
     */
    public GetOrderStatusResponse getOrderStatus(
            GetOrderStatus getOrderStatus36)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getOrderStatus36
     */
    public void startgetOrderStatus(
            GetOrderStatus getOrderStatus36,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param depositOrder38
     */
    public DepositOrderResponse depositOrder(
            DepositOrder depositOrder38)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param depositOrder38
     */
    public void startdepositOrder(
            DepositOrder depositOrder38,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param checkAuthenticate40
     */
    public CheckAuthenticateResponse checkAuthenticate(
            CheckAuthenticate checkAuthenticate40)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param checkAuthenticate40
     */
    public void startcheckAuthenticate(
            CheckAuthenticate checkAuthenticate40,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param samsungPay42
     */
    public SamsungPayResponse samsungPay(
            SamsungPay samsungPay42)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param samsungPay42
     */
    public void startsamsungPay(
            SamsungPay samsungPay42,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updateWhiteCardList44
     */
    public UpdateWhiteCardListResponse updateWhiteCardList(
            UpdateWhiteCardList updateWhiteCardList44)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateWhiteCardList44
     */
    public void startupdateWhiteCardList(
            UpdateWhiteCardList updateWhiteCardList44,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param paymentOrderOtherWay46
     */
    public PaymentOrderOtherWayResponse paymentOrderOtherWay(
            PaymentOrderOtherWay paymentOrderOtherWay46)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param paymentOrderOtherWay46
     */
    public void startpaymentOrderOtherWay(
            PaymentOrderOtherWay paymentOrderOtherWay46,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param recurrentPayment48
     */
    public RecurrentPaymentResponseE recurrentPayment(
            RecurrentPayment recurrentPayment48)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param recurrentPayment48
     */
    public void startrecurrentPayment(
            RecurrentPayment recurrentPayment48,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param finishThreeDs50
     */
    public FinishThreeDsResponseE finishThreeDs(
            FinishThreeDs finishThreeDs50)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param finishThreeDs50
     */
    public void startfinishThreeDs(
            FinishThreeDs finishThreeDs50,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updateBlackCardList52
     */
    public UpdateBlackCardListResponse updateBlackCardList(
            UpdateBlackCardList updateBlackCardList52)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateBlackCardList52
     */
    public void startupdateBlackCardList(
            UpdateBlackCardList updateBlackCardList52,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param bindCard54
     */
    public BindCardResponse bindCard(
            BindCard bindCard54)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param bindCard54
     */
    public void startbindCard(
            BindCard bindCard54,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param reverseOrder56
     */
    public ReverseOrderResponse reverseOrder(
            ReverseOrder reverseOrder56)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param reverseOrder56
     */
    public void startreverseOrder(
            ReverseOrder reverseOrder56,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param googlePayDirect58
     */
    public GooglePayDirectResponse googlePayDirect(
            GooglePayDirect googlePayDirect58)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param googlePayDirect58
     */
    public void startgooglePayDirect(
            GooglePayDirect googlePayDirect58,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param processRawPositionOrderRefund60
     */
    public ProcessRawPositionOrderRefundResponse processRawPositionOrderRefund(
            ProcessRawPositionOrderRefund processRawPositionOrderRefund60)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param processRawPositionOrderRefund60
     */
    public void startprocessRawPositionOrderRefund(
            ProcessRawPositionOrderRefund processRawPositionOrderRefund60,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param processRawSumOrderRefund62
     */
    public ProcessRawSumOrderRefundResponse processRawSumOrderRefund(
            ProcessRawSumOrderRefund processRawSumOrderRefund62)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param processRawSumOrderRefund62
     */
    public void startprocessRawSumOrderRefund(
            ProcessRawSumOrderRefund processRawSumOrderRefund62,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param googlePay64
     */
    public GooglePayResponseE googlePay(
            GooglePay googlePay64)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param googlePay64
     */
    public void startgooglePay(
            GooglePay googlePay64,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getBindingsByCardOrId66
     */
    public GetBindingsByCardOrIdResponse getBindingsByCardOrId(
            GetBindingsByCardOrId getBindingsByCardOrId66)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getBindingsByCardOrId66
     */
    public void startgetBindingsByCardOrId(
            GetBindingsByCardOrId getBindingsByCardOrId66,
            final MerchantServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    //
}
