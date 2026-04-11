import java.util.Scanner;

public class _15_NthRootOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Target Number (m): ");
        long m = sc.nextLong();
        System.out.println("Enter Root (n): ");
        long n = sc.nextLong();
        System.out.println(findNthRoot(m,n));
    }

    public static long findNthRoot(Long m, long n){
        long low = 1, high = m;
        long ans = -1;
        while(low<=high){
            long mid = (low+high)/2;
            int val = findPower(mid, n, m);
            if(val==1)
                return mid;
            else if(val==2)
                high = mid-1;
            else{
                ans = mid;
                low = mid+1;
            }
        }
        return ans;
    }

    public static int findPower(long base, long exp, long limit){
        long ans = 1;
        for(int i=0; i<exp;i++){
            ans *= base;
            if(ans>limit)
                return 2;
        }
        if(ans==limit) return 1;
        return 0;
    }
}
