import java.util.Scanner;

public class preixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1}
        };
        System.out.println("enter the inputs");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println(prefixSum(arr,x1,y1,x2,y2));

    }
    public static int prefixSum(int arr[][],int x,int y,int x2,int y2){
        int sum = 0;
        for(int i = x;i<=x2;i++ ){
            for(int j = y;j<=y2;j++){
                sum = sum+arr[i][j];
            }
        }
        return sum;
    }
    
}
