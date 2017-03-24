package interfaces.classprocessor.filters;

/**
 * Created by dw on 2017-3-8.
 */
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input){return input;}
}
