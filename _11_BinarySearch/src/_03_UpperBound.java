import java.util.Scanner;
/*
    Testcase:

    Example 1
    Input : nums= [1,2,2,3], x = 2
    Output:3
    Explanation:
    Index 3 is the smallest index such that arr[3] > x.
 */

/*
    Time Complexity: O(logN)
 */

/*
    Upper Bound (Element > target)
 */
public class _03_UpperBound {
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
        System.out.println(upperBound(nums, target));
    }

    public static int upperBound(int [] nums, int target){
        int low = 0, high = nums.length-1;
        int ans = nums.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(target<nums[mid]){
                ans = mid;
                high = mid-1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
