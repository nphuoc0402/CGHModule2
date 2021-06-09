package point;

public class TestMoveablePoint {
    public static void main(String[] args) {
        Point sp1 = new MoveablePoint(3,5,10,20);
        System.out.println(sp1.toString());

        System.out.println(((MoveablePoint) sp1).move().toString());
        System.out.println(((MoveablePoint) sp1).move().toString());

    }

}
