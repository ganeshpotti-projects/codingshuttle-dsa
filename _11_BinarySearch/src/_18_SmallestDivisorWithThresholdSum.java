import java.util.Scanner;

public class _18_SmallestDivisorWithThresholdSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements into array: " );
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Threshold: ");
        int target = sc.nextInt();
        System.out.println("Min Divisor: "+findMinDivisor(arr, target));
    }

    public static int findMinDivisor(int[] arr, int target){
        int max = Integer.MIN_VALUE;
        for(int ele : arr)
            max = Math.max(ele, max);
        int low = 1, high = max, ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(isMinDivisor(arr, target, mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static boolean isMinDivisor(int[] arr, int target, int mid){
        long res = 0;
        for(int ele : arr){
            res += (int) (Math.ceil((double) ele/mid));
        }
        return res<=target;
    }
}
