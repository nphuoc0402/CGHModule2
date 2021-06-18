package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<Double>();
        arr.add(1.2);
        arr.add(2.1);
        arr.add(5.1);
        arr.add(5.1);
        double sum =0;
        for (Double aDouble : arr) {
            sum += aDouble;
        }

        System.out.printf("%.2f\n",sum);
        arr.remove(2.1);
        System.out.println(arr.toString());
    }
}