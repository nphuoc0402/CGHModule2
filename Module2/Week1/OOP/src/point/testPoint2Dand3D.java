package point;

import java.security.cert.PolicyNode;
import java.util.Arrays;

public class testPoint2Dand3D {
    public static  void main(String[] args) {

        Point2D point1 = new Point2D();
        point1.setXY(2,4);
        System.out.println(point1.toString());
        System.out.println(Arrays.toString((point1).getXY()));

        Point2D point2 = new Point3D(2,5,9);
        point2.setXY(10,9);
        System.out.println(point2.toString());
        System.out.println(Arrays.toString(((Point3D) point2).getXYZ()));

    }
}
