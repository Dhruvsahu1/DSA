import java.util.*;
public class LinearSearch {
    public static boolean Linear(int arr[],int target){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in an array");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target element which you want to search");
        int target = sc.nextInt();
       if(Linear(arr, target)){
        System.out.println("element was found ");
       }
       else{
        System.out.println("element not found");
       }
    }
}
