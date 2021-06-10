package testColorable;

import colorable.Colorable;
import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;

public class testInterface {
    public static void main(String[] args) {
        shape.Shape[] shapes = new shape.Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(8,12);
        shapes[2] = new Square(5);

        for(Shape shape : shapes){
            System.out.println(shape);
            if(shape instanceof Colorable){
                ((Colorable) shape).howToColor();
            }
        }
    }

}

