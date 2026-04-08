import java.util.Scanner;

public class _10_MinInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements into array: ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();
        System.out.println("Minimum: " + findMin(nums));
    }

    public static int findMin(int[] nums) {
        int low = 0, high = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(low <= high){
            if(nums[high]>=nums[low])
                min = Math.min(min,nums[low]);
            int mid = (low+high)/2;
            if(nums[low] <= nums[mid]){
                min = Math.min(min, nums[low]);
                low = mid+1;
            }else{
                min = Math.min(min, nums[mid]);
                high = mid-1;
            }
        }
        return min;
    }
}
