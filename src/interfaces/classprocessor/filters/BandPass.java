package interfaces.classprocessor.filters;

/**
 * Created by dw on 2017-3-8.
 */
public class BandPass extends Filter{
    double lowCutoff,highCutoff;
    public  BandPass(double lowCutoff,double highCutoff){
        this.lowCutoff=lowCutoff;
        this.highCutoff=highCutoff;
    }
    public Waveform process(Waveform input){return input;}
}
