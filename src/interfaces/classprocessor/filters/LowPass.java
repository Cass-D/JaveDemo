package interfaces.classprocessor.filters;

/**
 * Created by dw on 2017-3-8.
 */
public class LowPass extends Filter{
    double cutoff;
    public  LowPass(double cutoff){
        this.cutoff=cutoff;
    }
    public Waveform process(Waveform input){return input;}
}
