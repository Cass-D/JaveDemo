package polymorphism.shape;

/**
 * Created by dw on 2017-3-24.
 */
public class Shapes {
    private static RandomShapeGenerator gen=
            new RandomShapeGenerator();
    public static void main(String[]args){
        Shape[] s=new Shape[9];
        //fill up the array with shapes
        for(int i=0;i<s.length;i++){
            s[i]=gen.next();
            //make polymorphic method calls
        }
        for(Shape shp : s)
            shp.draw();
    }
}
