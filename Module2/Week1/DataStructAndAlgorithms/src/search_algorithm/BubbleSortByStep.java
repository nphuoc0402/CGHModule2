package search_algorithm;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of List:");
        int size = input.nextInt();
        int list[] = new int[size];
        System.out.println("Enter the element ìn list");

        for (int i = 0; i < size; i++){
            System.out.printf("Enter list[%d] = ",i);
            list[i] = input.nextInt();
        }

        System.out.println("The list");
        for (int i = 0; i < size; i++){
            System.out.printf("%d ",list[i]);
        }
        System.out.println("\nBegin sort processing...");
        BubbleSortByStep(list);


    }

    public static void BubbleSortByStep(int list[]){
        for(int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length -1; j++){
                if (list[j] > list[j + 1]){
                    System.out.printf("List[%d] swap with List[%d] \n",list[j],list[j + 1]);
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    for (int k = 0; k < list.length; k++){
                        System.out.printf("%d ",list[k]);
                    }
                    System.out.println();
                }


            }
        }
        System.out.print("List after the  sort: ");
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + "\t");
        }
        System.out.println();
    }
}
