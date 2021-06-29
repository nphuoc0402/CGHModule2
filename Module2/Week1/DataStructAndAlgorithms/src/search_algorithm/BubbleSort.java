package search_algorithm;

public class BubbleSort {
    static int list[] = {2, 3, 2, 5, 6, 1, 7, 3, 14, 12};

    public static void BubbleSort(int list[]){
        for(int i = 0 ; i < list.length; i++){
            for(int j = 0; j < list.length - 1; j++){
                if(list[j] > list[j+1]){
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort(list);
        for(int i = 0; i < list.length; i++){
            if(i == list.length - 1){
                System.out.println(list[i]);
                break;
            }
            System.out.printf("%d,",list[i]);
        }
    }

}
