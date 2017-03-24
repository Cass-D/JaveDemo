package interfaces.interfaceprocessor;

import interfaces.classprocessor.filters.BandPass;
import interfaces.classprocessor.filters.Filter;
import interfaces.classprocessor.filters.LowPass;
import interfaces.classprocessor.filters.Waveform;

/**
 * Created by dw on 2017-3-24.
 */
class FilterAdapter implements Processor{
    Filter filter;
    public FilterAdapter(Filter filter){
        this.filter=filter;
    }
    @Override
    public String name() {
        return filter.name();
    }
    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform)input);
    }
}
public class FilterProcessor {
    public static void main(String[]args){
        Waveform w=new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)),w);
        Apply.process(new FilterAdapter(new LowPass(2.0)),w);
        Apply.process(new FilterAdapter(new BandPass(3.0,4.0)),w);
    }
}