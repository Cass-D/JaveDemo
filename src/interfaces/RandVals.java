package interfaces;

import java.util.Random;

/**
 * Created by dw on 2017-3-24.
 */
public interface RandVals {
    Random rand=new Random(47);
    int rand_int=rand.nextInt(10);
    long rand_long=rand.nextLong()*10;
    float rand_float=rand.nextLong()*10;
    double rand_double=rand.nextDouble()*10;
}
