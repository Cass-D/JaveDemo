package interfaces.classprocessor.filters;

/**
 * Created by dw on 2017-3-8.
 */
public class HighPass extends Filter {
    double cutoff;
    public  HighPass(double cutoff){
        this.cutoff=cutoff;
    }
    public Waveform process(Waveform input){return input;}
}
