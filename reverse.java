

public class reverse {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        reverse_array(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print (arr[i]+" ");
        }
    }
    public static void reverse_array(int arr[]){
        int n = arr.length-1;
        for(int i = 0;i<n/2;i++){
            swap(arr[i],arr[n-i-1]);
        }
    }
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
