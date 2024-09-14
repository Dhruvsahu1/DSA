import java.util.*;
public class SquareRoot {
    public static int SquareRoot(int num){
        int low = 0,high =num,result =-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            long val = mid*mid;
            if(val ==num){
                return mid;
            }
            else if(val<num){
                result = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number which squae you want");
        int num  = sc.nextInt();
        int result = SquareRoot(num);
        System.out.println("you require square root is 1"+result);
    }
    
}
