package polymorphism;

/**
 * Created by dw on 2017-3-24.
 */
class Super{
    public int field=0;
    public int getField(){return field;}
}
class Sub extends Super{
    public int field=1;
    public int getField(){return field;}
    public int getSuperField(){return  super.field;}
}
public class FieldAccess {
    public static void main(String[]args){
        Super sup=new Super();//upcast
        System.out.println("sub.field="+ sup.field+""
                +",,,,,,sub.getfield()="+sup.getField()+"\n");
        Sub sub=new Sub();
        System.out.println("sub.field="+ sub.field+""
                +",,,,,,sub.getfield()="+sub.getField()
                +",,,,,,sub.gersuperfield()="+sub.getSuperField());
    }
}
