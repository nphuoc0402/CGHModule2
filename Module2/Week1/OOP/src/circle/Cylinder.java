package circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){

    }

    public Cylinder(double radius, String color, double height){
        super(radius,color);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    @Override
    public double getArea(){
        return getPerimeter()*height + 2*super.getArea();
    }

    public double  getVolume(){
        return super.getArea()*height;
    }

    @Override
    public String toString(){
        return String.format("Radius: %f\nColor: %s\nHeight: %f\nAre: %f\nVolume: %f",getRadius(),getColor(),getHeight(),getArea(),getVolume());
    }

}

