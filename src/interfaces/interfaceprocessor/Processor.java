package interfaces.interfaceprocessor;

/**
 * Created by dw on 2017-3-24.
 */
public interface Processor {
    String name();
    Object process(Object input);
}
