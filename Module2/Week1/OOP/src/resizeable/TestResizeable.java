package resizeable;

import shape.Shape;

import java.util.Objects;

public class TestResizeable {
    public static void main(String[] args) {
        shape.Shape[] shapes = new shape.Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(8,12);
        shapes[2] = new Square(5);


        for(Shape shape : shapes){
            System.out.println(shape);
            ((Resizeable) shape).resize(50);
            System.out.println(shape);
        }

    }
}

