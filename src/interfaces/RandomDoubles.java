package interfaces;

import java.util.Random;

/**
 * Created by dw on 2017-3-8.
 */
public class RandomDoubles  {
    private static Random rand=new Random(47);
    public double next(){return rand.nextDouble();}
    public static void main(String[] args){
        RandomDoubles rd=new RandomDoubles();
        for (int i=0;i<7;i++){
            System.out.println(rd.next());
        }
    }
}
