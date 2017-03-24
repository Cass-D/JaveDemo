package polymorphism.shape;

/**
 * Created by dw on 2017-3-24.
 */
public class Triangle extends Shape {
    public void draw(){
        System.out.print("triangle.draw()"+"\n");
    }
    public void erase(){
        System.out.print("triangle.erase()"+"\n");
    }
}
