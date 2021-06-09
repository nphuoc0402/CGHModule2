package point;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setXY(5,  8.6f);
        System.out.println(p1.toString());

        Point p2 = new Point(5.7f,8.3f);
        System.out.println(p2.toString());
    }
}
