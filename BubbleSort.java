import java.util.*;

import javax.xml.transform.Source;
public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for(int i = 0;i<arr.length;i++){
            boolean swap = false;
            for(int  j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swap = true;
                }

            }
            if(!swap){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {20,50,10,43,45,67,90};
        bubbleSort(arr);
        System.out.println("sorted array is");
        System.out.println(Arrays.toString(arr));
    }
}
