package stack;

import java.util.Arrays;

public class ReserveStackTest {
    public static void main(String [] args){
        int[] ar = {1,2,3,4,5};
        String str = "Code Gym Hue!";
//        System.out.println(Arrays.toString(ReserveStack.ReserveNumberUseStack(ar)));
        System.out.println(Arrays.toString(ReserveStack.ReserveNumberUseStack(ar)));
        System.out.print(ReserveStack.ReserveStringUseStack(str));
    }
}
