package search_algorithm;

import java.security.spec.RSAOtherPrimeInfo;

public class SelectionSort {
    static double list[] = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void  selectionSort(double[] list) {
        for(int i = 0; i < list.length; i++){
                double min = list[i];
                int index = i;
           for(int j = i; j < list.length; j++){
               if(min > list[j]){
                   min = list[j];
                   index = j;
               }
           }
           if(index != i && min != list[i]){
               double temp = list[i];
               list[i] = list[index];
               list[index] = temp;
           }
        }
    }

    public static void main(String[] args) {
        System.out.printf("Before Swap\n");
        for(int i = 0; i < list.length; i++){
            System.out.printf("%.1f ",list[i]);
        }
        System.out.println();
        selectionSort(list);
        System.out.printf("After Swap\n");
        for(int i = 0; i < list.length; i++){
            System.out.printf("%.1f ",list[i]);
        }
    }
}
