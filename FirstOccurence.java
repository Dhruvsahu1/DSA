import java.util.*;
public class FirstOccurence {
    public static int firstOccurence(int arr[],int target){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
                
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element inside the array");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target element whose first occurence you want");
        int target = sc.nextInt();
        if(firstOccurence(arr, n) == 0){
            System.out.println("element is not found");
        }
        else{
            System.out.println("first occurencr of your element is "+firstOccurence(arr, target)+1);
        }
    }
}
