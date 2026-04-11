import java.util.Scanner;

public class _14_SquareRootOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long target = sc.nextLong();
        System.out.println("Floor Square Root: "+ squareRoot(target));
    }

    public static long squareRoot(long target){
        long low = 0, high = target;
        long ans = -1;
        while(low<=high){
            long mid = (low+high)/2;
            if(mid<=target/mid){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}
