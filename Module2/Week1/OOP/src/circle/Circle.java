package circle;

public class Circle {
    private double radius;
    private String color;

    public Circle(){

    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return Math.PI*2*radius;
    }

    public String toString(){
        return String.format("Radius = %f\nColor: %s\nPerimeter: %f\nArea: %f",getRadius(),getColor(),getPerimeter(),getArea());
    }
}
