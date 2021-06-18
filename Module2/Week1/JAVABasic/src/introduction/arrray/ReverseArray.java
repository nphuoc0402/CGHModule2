package introduction.arrray;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int array[];
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter a size: ");
            size = input.nextInt();
            if(size>20){
                System.out.println("Size doesn't exceed 20");
            }
        }while(size>20);
        array = new int[size];
        for(int i=0;i<array.length;i++){
            System.out.printf("Enter element %d : ",i+1);
            array[i] = input.nextInt();
        }
        System.out.printf("%-20s%s","Element in array: ","");
        for(int j=0;j<array.length;j++){
            System.out.printf("%d\t", array[j]);

        }
        System.out.println();

        for(int j =0;j<array.length/2;j++){
            int temp = array[j];

            array[j] = array[array.length-1 - j];
            array[array.length-j-1] = temp;
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for(int i =0;i<array.length;i++){
            System.out.printf("%d\t",array[i]);
        }
    }
}
