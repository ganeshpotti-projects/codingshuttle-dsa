import java.util.Scanner;

/*
    Testcase:

    Example 1:
    Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5
    Result: 4 7
    Explanation: The floor of 5 in the array is 4, and the ceiling of 5 in the array is 7.
 */

/*
    Time Complexity: O(logN)
 */

/*
    Floor = Smallest Element less than or equals Target
    Ceil = Smallest Element Greater than or equals Target
 */
public class _05_floorAndCeil {
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
        System.out.println("Floor: " + floor(nums, target) + " Ceil: " + ceil(nums, target));
    }

    public static int ceil(int [] nums, int target){
        int low = 0, high = nums.length-1;
        int ans = nums.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(target<=nums[mid]){
                ans = nums[mid];
                high = mid-1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int floor(int [] nums, int target){
        int low = 0, high = nums.length-1;
        int ans = nums.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(target>=nums[mid]){
                ans = nums[mid];
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return ans;
    }
}
