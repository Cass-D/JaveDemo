package polymorphism;

/**
 * Created by dw on 2017-3-24.
 */
public class PrivateOverride {
    private void f(){System.out.print("private f()"+"\n");}
    public static void main (String[]args){
        PrivateOverride po=new Derived();
        po.f();
    }
}
class  Derived extends PrivateOverride{
    public void f(){
        System.out.print("public f()"+"\n");
    }
}
