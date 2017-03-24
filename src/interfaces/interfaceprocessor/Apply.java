package interfaces.interfaceprocessor;

/**
 * Created by dw on 2017-3-24.
 */
public class Apply {
    public static void process(Processor p,Object s){
        System.out.println("Using Process"+p.name());
        System.out.println(p.process(s));
    }
}
