public class palllindrone{
    public static void main(String[] args) {
        int arr[] = {1,2,5,3,2,4,1};
        System.out.println(isPallindrone(arr));

    }
    public static boolean isPallindrone(int arr[]){
        int n = arr.length-1;
        for(int i = 0;i<n;i++){
            if(arr[i] != arr[n]){
                return false;
            }
            n--;
        }
        return true;

    }
}