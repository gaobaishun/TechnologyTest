package RMITest.server;

import java.io.Serializable;

/**
 * @Author gaobaishun
 * @Date 2020-03-29 16:58
 * imformation：
 */
public class A implements Serializable{
    private String name;
    public A(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
