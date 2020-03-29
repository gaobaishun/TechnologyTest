package RMITest.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @Author gaobaishun
 * @Date 2020-03-29 17:05
 * imformation：
 */
public class RegistA {
    public static void main(String[] args) {
        try {
            Registry registry= LocateRegistry.createRegistry(1098);
            ARemoteImp aRemoteImp=new ARemoteImp();
            aRemoteImp.setA(new A("test"));
            registry.rebind("atest",aRemoteImp);
            System.out.println("启动rmi成功");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
