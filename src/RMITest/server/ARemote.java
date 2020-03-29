package RMITest.server;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Author gaobaishun
 * @Date 2020-03-29 17:02
 * imformation：
 */
public interface ARemote extends Remote{
    void setA(A a) throws RemoteException;
    A getA()throws RemoteException;
}
