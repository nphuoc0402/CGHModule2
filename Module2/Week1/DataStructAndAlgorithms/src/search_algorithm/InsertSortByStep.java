package search_algorithm;

import org.w3c.dom.ls.LSOutput;

public class InsertSortByStep {
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                System.out.printf("Swap %d with %d\n",array[pos],array[pos-1]);
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
            for(int j = 0; j < array.length; j++){
                System.out.printf("%d ",array[j]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int arr[] = {1,5,2,4,3};
        System.out.printf("Before Swap array:\n");
        insertionSort(arr);
        System.out.println("After Swap aray:");
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%d ",arr[i]);;
        }

    }
}
