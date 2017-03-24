package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by dw on 2017-3-13.
 */
class Snow{}
class Powder extends Snow{}
class Light extends Snow{}
class Heavy extends Snow{}
class Crusty extends Snow{}
class Slush extends Snow{}
public class AsListInference {
    public static void main(String[]args){
        List<Snow> snows1= Arrays.asList(new Crusty(),new Slush(),new Powder());
        for (Snow i:snows1)
            System.out.println("way1:"+i);
        List<Snow> snows3=new ArrayList<Snow>();
        Collections.addAll(snows3,new Light(),new Heavy());
        for (Snow i:snows3)
            System.out.println("way3:"+i);
        List<Snow> snows4=Arrays.<Snow>asList(new Light(),new Heavy());
        for (Snow i:snows4)
            System.out.println("way4:"+i);
    }
}
