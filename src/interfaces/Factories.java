package interfaces;

/**
 * Created by dw on 2017-3-13.
 */
/*
* 工厂方法设计模式
* 在工厂对象上调用的是创建方法，而该工厂对象将生成接口的某个实现对象，代码将完全与接口实现分离
* */
interface Service{
    void method1();
    void method2();
}
interface ServiceFactories{
    Service getService();
}
class Implementation1 implements Service{
    Implementation1(){}
    public void method1(){System.out.print("Implementation1 method1");}
    public void method2(){System.out.print("Implementation1 method2");}
}
class Implementation1Factories implements ServiceFactories{
    public Service getService(){
        return  new Implementation1();
    }
}
class Implementation2 implements Service{
    Implementation2(){}
    public void method1(){System.out.print("Implementation1 method1!!!");}
    public void method2(){System.out.print("Implementation1 method2!!!");}
}
class Implementation2Factories implements ServiceFactories{
    public Service getService(){
        return  new Implementation1();
    }
}
public class Factories {
    public static void serviceConsumer(ServiceFactories fact){
        Service s=fact.getService();
        s.method1();s.method2();
    }
    public static void main(String[]args){
        serviceConsumer(new Implementation1Factories());
        serviceConsumer(new Implementation2Factories());
    }
}
