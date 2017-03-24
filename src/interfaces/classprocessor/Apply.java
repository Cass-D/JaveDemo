package interfaces.classprocessor;

import java.util.Arrays;

/**
 *完全解耦
 *
 * 1. apply.process()方法可以接受任何类型的Processor，并将其应用到一个Object对象上
 *
 * 2. 策略设计模式：创建一个能够根据所传递的参数对象的不同而具有不同行为的方法，
 * 这类方法包含所要执行的算法中固定不变的部分而“策略”包含变化的部分。
 * 策略就是传递参数进去的参数对象，包含要执行的代码
 *
 * 3. split()方法是String类的一部分，接受string类型对象，并以传递参数进来的参数作为边界，
 * 将该string对象分割开，然后返回u一个数组string[]
 */

class Processor{
    public String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input){
        return  input;
    }
}
class Upcase extends Processor{
    String process(Object input){
        return ((String)input).toUpperCase();
    }
}
class Downcase extends Processor{
    String process(Object input){
        return (((String)input).toLowerCase());
    }
}
class Splitter extends Processor{
    String process(Object input){
        return Arrays.toString(((String)input).split(""));
    }
}

public class Apply {
    public static void process(Processor p,Object s){
        System.out.println("Using Processor "+p.name());
        System.out.println(p.process(s));
    }
    public static String s="Disagreement with beliefs id by definition incorrect";
    public  static void main(String[]args){
        process(new Upcase(),s);
        process(new Downcase(),s);
        process(new Splitter(),s);
    }
}
