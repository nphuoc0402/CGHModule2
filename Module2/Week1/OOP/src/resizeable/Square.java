package resizeable;


import testColorable.Colorable;

public class Square extends Rectangle implements Resizeable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "side="
                + getSide()
                + ", "
                + super.toString()
                + ",Area = " + getArea()
                + ", Perimeter = " + getPerimeter();
    }
    public void howToColor(){
        System.out.println("Filled color four sides");
    }

    @Override
    public void resize(double percent) {
        super.resize(percent);
    }
}

//class SquareTest {
//    public static void main(String[] args) {
//        Square square = new Square();
//        System.out.println(square);
//
//        square = new Square(2.3);
//        System.out.println(square);
//
//        square = new Square(5.8, "yellow", true);
//        System.out.println(square);
//    }
//}