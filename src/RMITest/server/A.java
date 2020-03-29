package RMITest.server;

import java.io.Serializable;

/**
 * @Author gaobaishun
 * @Date 2020-03-29 16:58
 * imformation：
 */
public class A implements Serializable{
    private String name;
    //transient private B b=new B();
    private B b=new B();
    public A(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public B getB() {
        return b;
    }

}
