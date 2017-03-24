package polymorphism.music;

/**
 * Created by dw on 2017-3-23.
 */
class Stringed extends Instrument{
    public void play(Note n){
        System.out.print("Stringed.play()"+"\n");
    }
}
class Brass extends Instrument{
    public void play(Note n){
        System.out.print("Brass.play()"+"\n");
    }
}
public class Music2 {
    public static void tune(Wind i){
        i.play(Note.middle_c);
    }
    public static void tune(Stringed i){
        i.play(Note.middle_c);
    }
    public static void tune(Brass i){
        i.play(Note.middle_c);
    }
    public static void main(String[]args){
        Wind flute=new Wind();
        Stringed violin=new Stringed();
        Brass frevhHorn=new Brass();
        tune(flute);
        tune(violin);
        tune(frevhHorn);
    }
}
