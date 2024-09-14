public class missingElement {
    public static void main(String[] args) {
        int arr[] = {1,2,4,7,6,5};
        System.out.println(missingelemnt(arr));
    }
    public static int missingelemnt(int arr[]){
        int n = arr.length+1;
        int sumOfNatural = n*(n+1)/2;
        int sumOfArray = 0;
        for(int i = 0;i<n-1;i++){
           sumOfArray =sumOfArray+arr[i];
        }
        return sumOfNatural - sumOfArray;
    }
}
