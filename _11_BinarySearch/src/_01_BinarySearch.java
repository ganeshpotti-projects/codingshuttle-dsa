import java.util.Scanner;

/*
    Testcase:
    Example 1:
    Input: nums = [-1,0,3,5,9,12], target = 9
    Output: 4
    Explanation: 9 exists in nums and its index is 4
 */

/*
    Time Complexity:
 */
public class _01_BinarySearch {
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
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target){
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
}
