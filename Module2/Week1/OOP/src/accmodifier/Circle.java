package accmodifier;

public class Circle {

    private double radius = 1.0;
    private String color = "red";

    public Circle(){

    }

    public void setRadius(double r){
        this.radius = r;
    }

    public Circle(double r){
        this.radius = r;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

//    public void display(){
//        System.out.printf("R = %.1f\nColor: %s\n",this.radius,color);
//        System.out.printf("Area = %.1f\n",getArea());
//    }
    public String toString(){
        return String.format("R = %f\nColor: %s\nArea: %.12f\n",radius,color,getArea());
    }



}
