package search_algorithm;

public class InsertionSort {
    public static void InsertionSort(int list[]){
        int pos,x;
        for (int i = 0; i < list.length; i++){
            x = list[i];
            pos = i;
            while(pos > 0 && x < list[pos - 1]){
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,5,2,4,3,7,12,5,3,9};
        System.out.printf("Before Swap array:\n");
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%d ",arr[i]);;
        }
        System.out.println();
        InsertionSort(arr);
        System.out.println("After Swap aray:");
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%d ",arr[i]);;
        }
    }

}
