package shape;

public class Triangle extends Shape{
    private double side1 = 1.0f;
    private double side2 = 1.0f;
    private double side3 = 1.0f;

    public Triangle(){

    }

    public Triangle (double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1(){
        return side1;
    }

    public void setSide1(double side1){
        this.side1 = side1;
    }

    public double getSide2(){
        return side2;
    }

    public void setSide2(double side2){
        this.side2 = side2;
    }

    public double getSide3(){
        return side3;
    }

    public void setSide3(double side3){
        this.side3 = side3;
    }

    public double getArea(){
        double p = getPerimeter()/2;
        return ((2*(Math.sqrt(p*(p-side1)*(p-side2)*(p-side3)))/side1)*side1)/2;
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    public String toString(){
        return String.format("Color: %s\nArea: %.2f\nPerimeter: %.2f",super.getColor(),getArea(),getPerimeter());
    }

}
class testTriangle{
    public static void main(String[] args) {
        Shape triangle = new Triangle(3,4,5);
//        ((Triangle) triangle).setSide1(8);
        triangle.setColor("BLue");
        System.out.println(triangle.toString());

        Shape triangle1 = new Triangle();
        ((Triangle) triangle1).setSide1(8);
        ((Triangle) triangle1).setSide2(12);
        ((Triangle) triangle1).setSide3(16);
        System.out.println(triangle1.toString());

    }
}
