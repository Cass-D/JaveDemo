package interfaces.classprocessor.filters;

/**
 * Created by dw on 2017-3-8.
 */
public class Waveform {
    private static long counter;
    private final long id=counter++;
    public String toSting(){
        return "Waveform "+id;
    }
}
