import java.util.Scanner;

public class _11_NoOfRotationsInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements into array: ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();
        System.out.println("No of Rotations: " + findRotations(nums));
    }

    public static int findRotations(int[] nums) {
        int low = 0, high = nums.length-1;
        int min = Integer.MAX_VALUE, ans = -1;
        while(low <= high){
            if(nums[low] <= nums[high]){
                return low;
            }
            int mid = (low+high)/2;
            if(nums[low] <= nums[mid]){
                if(nums[low]<min){
                    min = Math.min(min, nums[low]);
                    ans = low;
                }
                low = mid+1;
            }else{
                if(nums[mid]<min){
                    min = Math.min(min, nums[mid]);
                    ans = mid;
                }
                high = mid-1;
            }
        }
        return ans;
    }
}
