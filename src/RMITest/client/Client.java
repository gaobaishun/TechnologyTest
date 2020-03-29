package RMITest.client;

import RMITest.server.A;
import RMITest.server.ARemote;
import RMITest.server.ARemoteImp;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @Author gaobaishun
 * @Date 2020-03-29 17:13
 * imformation：
 */
public class Client {
    public static void main(String[] args) {
        try {
            Registry registry= LocateRegistry.getRegistry(1098);
            ARemote aRemoteImp=(ARemote) registry.lookup("atest");
            A a=aRemoteImp.getA();
            System.out.println(a.getName());
        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }
}
