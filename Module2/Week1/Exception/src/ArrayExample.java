import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
            Random rd = new Random();
            Integer arr[] = new Integer[100];
        System.out.println("Danh sach cac phan tu mang:");
        for (int i = 0; i  < 100; i++){
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer arr[] = arrayExample.createRandom();

        Scanner input = new Scanner(System.in);
        System.out.printf("Nhap chi so mot phan tu bat ky");
        int x = input.nextInt();
        try{
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr[x]);

        }catch (IndexOutOfBoundsException e){
            System.out.println("Chi so vuot qua gioi han cua mang");
        }
    }
}
