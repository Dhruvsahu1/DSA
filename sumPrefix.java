import java.util.*;
public class sumPrefix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1}
        };
        System.out.println("enter the inputs");
        PrefixSumMAtrix(arr);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println(sumRegion(arr,x1,y1,x2,y2));

    }
    public static void PrefixSumMAtrix(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0;i<=m;i++){
            for(int j = 1;j<=n;j++){
               arr[i][j] += arr[i][j-1]; 
            }
        }
        for(int j = 0;j<=n;j++){
            for(int i = 1;i<=m;i++){
                arr[i][j] += arr[i-1][j];
            }
        }
    }
    public static int sumRegion(int arr[][],int r1,int c1,int r2,int c2){
        int sum = 0,up = 0,left = 0,repeated_region = 0,result =0;
        sum = arr[r2][c2];
        up = arr[r1-1][c2];
        left = arr[r2][c1-1];
        repeated_region = arr[r1-1][c1-1];
        result = sum-up-left+repeated_region;
        return result; 
    }
}