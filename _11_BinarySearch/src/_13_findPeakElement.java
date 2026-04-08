import java.util.Scanner;

public class _13_findPeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements into array: ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();
        System.out.println("Peak Index: " + findPeakIndex(nums));
    }

    public static int findPeakIndex(int[] nums){
        int n = nums.length;
        if(nums.length==1 || nums[0] > nums[1])
            return 0;
        if(nums[n-1]>nums[n-2])
            return n-1;
        int low = 1, high = n-2;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])
                return mid;
            else if(nums[mid]>nums[mid+1])
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
}
