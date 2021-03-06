package polymorphism;

/**
 * Created by dw on 2017-3-24.
 */
class Characteristic{
    private String s;
    Characteristic(String s){
        this.s=s;
        System.out.println("Creating Characteristic"+s);
    }
    protected void dispose(){
        System.out.println("dispose Characteristic"+s);
    }
}
class Description{
    private String s;
    Description(String s){
        this.s=s;
        System.out.println("Creating Description"+s);
    }
    protected void dispose(){
        System.out.println("dispose Description"+s);
    }
}
class LivingCreature{
    private Characteristic p=new Characteristic("is alive");
    private Description t=new Description("basic living creature");
    LivingCreature(){
        System.out.println("LivingCreature()");
    }
    protected void dispose(){
        System.out.println("LivingCreature dispose");
        t.dispose();
        p.dispose();
    }
}
class Animal extends LivingCreature{
    private Characteristic p=new Characteristic("has heart");
    private Description t=new Description("animal not vegetable");
    Animal(){
        System.out.println("Animal()");
    }
    protected void dispose(){
        System.out.println("Animal dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
class Amphibian extends Animal{
    private Characteristic p=new Characteristic("can live in water");
    private Description t=new Description("both water and land");
    Amphibian(){
        System.out.println("Amphibian()");
    }
    protected void dispose(){
        System.out.println("Amphibian dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
public class Frog extends Amphibian {
    private Characteristic p=new Characteristic("Croaks");
    private Description t=new Description("eats bugs");
    Frog(){
        System.out.println("Frog()");
    }
    protected void dispose(){
        System.out.println("Frog dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
    public static void main(String[] args){
        Frog frog=new Frog();
        System.out.println("Bye!");
        frog.dispose();
    }
}
