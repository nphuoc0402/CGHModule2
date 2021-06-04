import java.util.Scanner;

public class MInValueArray {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");
        size = input.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the number of element in  Array:");
        for(int i = 0;i<size;i++){
            System.out.printf("Arr[%d] = ",i);
            a[i] = input.nextInt();
        }
        int min = a[0];
        for(int i = 0;i<size;i++){
            if(min>a[i]){
                min = a[i];
            }
        }
        System.out.printf("The smallest element in Array is : %d",min);


    }
}
