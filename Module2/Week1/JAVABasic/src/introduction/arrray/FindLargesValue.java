package introduction.arrray;

import java.util.Scanner;

public class FindLargesValue {
    public static void main(String[] args) {
        System.out.printf("Print The largest in Array");
        int size;
        int arr[];
        Scanner input = new Scanner(System.in);
        do{
            System.out.printf("Enter the size:");
            size = input.nextInt();
            if(size>20){
                System.out.printf("Size should not exceed 20");
            }
        }while(size>20);
        arr = new int[size];
        for(int i = 0;i<arr.length;i++){
            System.out.printf("Enter the arr[%d]: ",i);
            arr[i] = input.nextInt();
        }
        System.out.printf("Print the Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.printf("%d\t",arr[i]);
        }
        System.out.println();

        int max = arr[0];
        int index = 0;

        for(int i = 0;i< arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        System.out.printf("The largest property value in the Array is: %d at %d",max,index+1);
    }
}
