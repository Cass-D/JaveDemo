package interfaces;

/**
 * Created by dw on 2017-3-24.
 */
interface Monster{
    void menace();
}
interface DangerousMonster extends Monster{
    void destroy();
}
interface Lethal{
    void kill();
}
class DragonZilla implements DangerousMonster{
    public void menace(){}
    public void destroy(){}
}
interface  Vampire extends DangerousMonster,Lethal{
    void drinkBlood();
}
class VeryBadVampire implements Vampire{
    @Override
    public void drinkBlood() {}
    @Override
    public void destroy() {}
    @Override
    public void kill() {}
    @Override
    public void menace() {}
}
public class HorrorShow {
    static void u(Monster b){b.menace();}
    static void v(DangerousMonster d){d.menace();d.destroy();}
    static void w(Lethal l){l.kill();}
    public static void main(String[] args){
        DangerousMonster barney=new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad=new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
