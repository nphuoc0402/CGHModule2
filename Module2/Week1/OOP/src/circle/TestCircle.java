package circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle(5,"Red");
        System.out.println("CirCle");
        System.out.println(c.toString());
        System.out.println("Cylinder:");
        Circle c1 = new Cylinder(9,"Blue",5);
        System.out.println(c1.toString());
    }
}
