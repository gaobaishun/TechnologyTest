package RMITest.server;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Author gaobaishun
 * @Date 2020-03-29 17:04
 * imformation：
 */
public class ARemoteImp extends UnicastRemoteObject implements ARemote {
    private  A a;
    public ARemoteImp() throws RemoteException {
    }

    @Override
    public void setA(A a) {
        this.a=a;
    }

    @Override
    public A getA() {
        return this.a;
    }
}
