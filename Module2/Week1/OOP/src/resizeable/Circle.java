package resizeable;

import shape.Shape;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return Math.PI*2*radius;
    }
    @Override
    public String toString(){
        return String.format("R = %f ,%s,Area = %f,Perimeter = %f",getRadius(),super.toString(),getArea(),getPerimeter());
    }

    public void resize(double percent){
        radius *= (percent/100);
    }
}

//class CircleTest {
//    public static void main(String[] args) {
//        Circle circle = new Circle();
//        System.out.println(circle);
//
//        circle = new Circle(3.5);
//        System.out.println(circle);
//
//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);
//    }
//}
