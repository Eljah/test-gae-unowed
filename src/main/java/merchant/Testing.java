package merchant;

import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;

/**
 * Created by eljah32 on 12/25/2018.
 */
public class Testing {
    public static void main(String[] args) {
        MerchantServiceImplServiceCallbackHandler merchantServiceImplServiceCallbackHandler=new MerchantServiceImplServiceCallbackHandler() {
            @Override
            public Object getClientData() {
                return super.getClientData();
            }
        };

        try {
            MerchantServiceImplServiceStub merchantServiceImplServiceStub=new MerchantServiceImplServiceStub();
            //CheckAuthenticate checkAuthenticate=new CheckAuthenticate();
            RegisterOrderPreAuth registerOrderPreAuth=new RegisterOrderPreAuth();
            OrderParams orderParams=new OrderParams();
            orderParams.setAmount(100);
            orderParams.setMerchantLogin("");
            orderParams.setMerchantOrderNumber("112");
            registerOrderPreAuth.setOrder(orderParams);
            RegisterOrderPreAuthResponse registerOrderPreAuthResponse=merchantServiceImplServiceStub.registerOrderPreAuth(registerOrderPreAuth);
            System.out.println(registerOrderPreAuthResponse.toString());
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
