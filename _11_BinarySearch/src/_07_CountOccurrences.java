import java.util.Scanner;

/*
    Testcase:
    Example 1
    Input: nums = [5, 7, 7, 8, 8, 10], target = 8
    Output: 2
    Explanation: Count is 2 , (Last Index - First Index + 1) and it appears in the array at indices 3 and 4, so the output is [4-3+1]=2.
 */

/*
    Time Complexity: O(logN)
 */
public class _07_CountOccurrences {
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
        System.out.println("Occurrence Count: " + (last(nums, target) - first(nums, target)+1));
    }

    public static int first(int [] nums, int target){
        int low = 0, high = nums.length-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                ans = mid;
                high = mid-1;
            }else if(nums[mid] > target)
                high = mid-1;
            else
                low = mid+1;
        }
        return ans;
    }

    public static int last(int [] nums, int target){
        int low = 0, high = nums.length-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                ans = mid;
                low = mid+1;
            }else if(nums[mid] > target)
                high = mid-1;
            else
                low = mid+1;
        }
        return ans;
    }
}
