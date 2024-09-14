import java.util.*;
public class BinarySearch {
    public static int binarySearch(int arr[],int target){
        int low = 0,high = arr.length-1,mid;
        while(low<=high){
            mid  = low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]< target){
                low = mid+1;
            }
            else{
                high= mid-1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        if(binarySearch(arr, target)==0){
            System.out.println("element not found");
        }
        else{
            System.out.println("your element is found at "+binarySearch(arr, target)+1);
        }
    }
    
}
