package polymorphism.music;

/**
 * Created by dw on 2017-3-23.
 */
public class Music {
    public static void tune(Instrument i){
        i.play(Note.middle_c);
    }
    public static void main(String[]args){
        Wind flute=new Wind();
        tune(flute);
    }
}
