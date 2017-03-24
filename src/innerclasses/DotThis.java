package innerclasses;

/**
 * Created by dw on 2017-3-13.
 */
public class DotThis {
    void f(){System.out.println("DotThis.f()");}
    public class Inner{
        public DotThis outer(){
            return DotThis.this;
        }
    }
    public Inner inner(){return new Inner();}
    public static void main(String[]args){
        DotThis dt=new DotThis();
       // DotThis.Inner dti=dt.Inner();
      //  dti.outer().f();
    }
}
