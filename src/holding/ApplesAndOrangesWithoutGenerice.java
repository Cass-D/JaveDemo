package holding;

import java.util.ArrayList;

/**
 * Created by dw on 2017-3-13.
 */
class Apple{
    private static long counter;
    private final long id=counter++;
    public long id(){return id;}
}
class Oranges{}
public class ApplesAndOrangesWithoutGenerice {
    public static void main(String[]args){
        ArrayList<Apple> apples=new ArrayList<Apple>();
        for(int i=0;i<4;i++)
            apples.add(new Apple());
       // apples.add(new Oranges());
        for (int i=0;i<apples.size();i++)
            System.out.print(apples.get(i).id());
        for(Apple c : apples)
            System.out.print(c.id());
    }
}
