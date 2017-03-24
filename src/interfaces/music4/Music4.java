package interfaces.music4;

import polymorphism.music.Note;

/**
 * Created by dw on 2017-3-24.
 */
abstract class Instrument{
    private int i;
    public abstract void play(Note n);
    public String what(){return "Instrument";}
    public abstract void adjust();
}
class Wind extends Instrument{
    public void play(Note n){System.out.print("Wind.play()"+"\n");}
    public String what(){return "Wind";}
    @Override
    public void adjust() {}
}
class Percussion extends Instrument{
    public void play(Note n){System.out.print("Percussion.play()"+"\n");}
    public String what(){return "Percussion";}
    @Override
    public void adjust() {}
}
class Stringed extends Instrument{
    public void play(Note n){System.out.print("Stringed.play()"+"\n");}
    public String what(){return "Stringed";}
    @Override
    public void adjust() {}
}
class Brass extends Wind{
    public void play(Note n){System.out.print("Brass.play()"+"\n");}
    public void adjust() {
        System.out.print("Brass.adjust()"+"\n");
    }
}
class WoodWind extends Wind{
    public void play(Note n){System.out.print("WoodWind.play()"+"\n");}
    public String what() {return "WoodWind";}
}
public class Music4 {
    static void tune(Instrument i){
        i.play(Note.middle_c);
    }
    static void tuneAll(Instrument[]e){
        for (Instrument i : e)
            tune(i);
    }
    public static void main(String[] args){
        Instrument[] orchestra={
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new WoodWind()
        };
        tuneAll(orchestra);
    }
}
