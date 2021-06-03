public class MinValueInArray {
    public static void main(String[] args) {
        int arr[] = {4,12,0,8,1,6,9};
        int index = minValue(arr);
        System.out.printf("The smallest element in array is: %d",index);
    }

    public static int minValue(int arr[]){
        int minValue = arr[0];
        for(int i = 0;i< arr.length;i++){
            if(minValue>arr[i]){
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
