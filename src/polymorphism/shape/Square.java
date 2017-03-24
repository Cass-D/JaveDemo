package polymorphism.shape;

/**
 * Created by dw on 2017-3-23.
 */
public class Square extends Shape {
    public void draw(){
        System.out.print("square.draw()"+"\n");
    }
    public void erase(){
        System.out.print("square.erase()"+"\n");
    }
}
