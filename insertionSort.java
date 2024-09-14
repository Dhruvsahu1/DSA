import java.util.Arrays;

public class insertionSort{

    public static void insertionsort(int arr[]){
        for(int i = 1;i<arr.length;i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;

            }
        }
    }
    public static void main(String[] args){
        int arr[] = {20,50,25,57,67,32};
        insertionsort(arr);
        System.out.println("you sorted array is");
        System.out.println(Arrays.toString(arr)); 
    }
}