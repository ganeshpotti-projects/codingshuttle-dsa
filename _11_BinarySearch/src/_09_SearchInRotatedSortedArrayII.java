import java.util.Scanner;

public class _09_SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements into array: ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        System.out.println("isPresent: " + search(nums, target));
    }

    public static boolean search(int[] nums, int target){
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid]==target)
                return true;
            if(nums[low] == nums[mid] && nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low] <= target && target <= nums[mid])
                    high = mid-1;
                else
                    low = mid+1;
            } else {
                if(nums[mid]<= target && target <= nums[high])
                    low = mid+1;
                else
                    high = mid-1;
            }
        }
        return false;
    }
}
