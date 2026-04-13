import java.util.Scanner;

public class _23_SplitArrayLargestSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements into array: ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println("No.of Splits: ");
        int splits = sc.nextInt();
        System.out.println("Largest sum: "+ largestSubarraySumMinimized(arr, splits));
    }

    public static int largestSubarraySumMinimized(int[] arr, int maxSplits) {
        int max = Integer.MIN_VALUE, tot = 0;
        for(int ele : arr){
            max = Math.max(max, ele);
            tot += ele;
        }
        int low = max, high = tot;
        while(low<=high){
            int mid = low + (high-low) / 2;
            int splits = countSplits(arr, mid);
            if(splits<=maxSplits)
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }

    public static int countSplits(int[] arr, int maxSum){
        int splits = 1, sum = 0;
        for(int ele : arr){
            if(ele+sum<=maxSum)
                sum += ele;
            else{
                splits++;
                sum = ele;
            }
        }
        return splits;
    }
}
