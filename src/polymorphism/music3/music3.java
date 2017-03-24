package polymorphism.music3;

import polymorphism.music.Note;

/**
 * Created by dw on 2017-3-24.
 */
class Instrument{
    void play(Note n){System.out.print("Instrument.play()"+"\n");}
    String what(){return"instrument";}
    void adjust(){System.out.print("Adjusting Instrument"+"\n");}
}
class Wind extends Instrument{
    void play(Note n){System.out.print("wind.play()"+"\n");}
    String what(){return"wind";}
    void adjust(){System.out.print("Adjusting wind"+"\n");}
}
class Percussion extends Instrument{
    void play(Note n){System.out.print("Percussion.play()"+"\n");}
    String what(){return"Percussion";}
    void adjust(){System.out.print("Adjusting Percussion"+"\n");}
}
class Stringed extends Instrument{
    void play(Note n){System.out.print("Stringed.play()"+"\n");}
    String what(){return"Stringed";}
    void adjust(){System.out.print("Adjusting Stringed"+"\n");}
}
class Brass extends Instrument{
    void play(Note n){System.out.print("Brass.play()"+"\n");}
    void adjust(){System.out.print("Adjusting Brass"+"\n");}
}
class Woodwind extends Instrument{
    void play(Note n){System.out.print("Woodwind.play()"+"\n");}
    String what(){return"Woodwind";}
}
public class music3 {
    //doesn't care about typpe,so new type
    //added to the system still work right
    public static void tune(Instrument i){
        i.play(Note.middle_c);
    }
    public static void tuneAll(Instrument[] e){
        for (Instrument i : e)
            tune(i);
    }
    public static void main(String[]args){
        Instrument[] orchestra={
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
