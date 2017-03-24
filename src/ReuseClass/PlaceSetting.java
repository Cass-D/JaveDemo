package ReuseClass;

/**
 * Created by DaWei on 2017/2/4.
 */

class plate {
    plate(int i) {
        System.out.print("plate constructor！" + "\n");
    }

    class dinnerplate extends plate {
        dinnerplate(int i) {
            super(i);
            System.out.print("dinnerplate constructor！" + "\n");
        }
    }

    class utensil {

    }
}

public class PlaceSetting {
}
