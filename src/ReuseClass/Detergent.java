package ReuseClass;

/**
 * Created by DaWei on 2017/2/4.
 */
class Cleanser {
    private String s = "cleanser!!" + "\n";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append("dilute()!!" + "\n");
    }

    public void apply() {
        append("apply()!!" + "\n");
    }

    public void scrub() {
        append("scrub()!!" + "\n");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.print(x);
    }
}

public class Detergent extends Cleanser {
    public void scrub() {
        //change a method
        append("detergent.scrub()!!" + "\n");
        super.scrub();
    }

    //add method to the interface
    public void foam() {
        append("foam()!!" + "\n");
    }

    //test the new class
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.print(x);
        System.out.print("testing base class:" + "\n");
        Cleanser.main(args);
    }
}
