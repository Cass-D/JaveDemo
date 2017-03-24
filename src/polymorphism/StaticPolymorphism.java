package polymorphism;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * Created by dw on 2017-3-24.
 */
class StaticSuper{
    public static String staticGet(){
        return "Bass StaticGet()";
    }
    public String dynamicGet(){
        return "Bass DynamicGet()";
    }
}
class StaticSub extends StaticSuper{
    public static String staticGet(){
        return "Derived StaticGet()";
    }
    public String dynamicGet(){
        return "Derived DynamicGet()";
    }
}
public class StaticPolymorphism {
    public static void main(String[]args){
        StaticSuper sup=new StaticSub();
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
    }
}
