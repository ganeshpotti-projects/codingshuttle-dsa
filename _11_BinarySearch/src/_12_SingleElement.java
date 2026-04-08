import java.util.Scanner;

public class _12_SingleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements into array: ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();
        System.out.println("Single Elemet: " + findSingle(nums));
    }

    public static int findSingle(int [] nums){
        if(nums.length==1 || nums[0]!=nums[1])
            return nums[0];
        int n = nums.length;
        if(nums[n-1]!=nums[n-2])
            return nums[n-1];
        int low = 1, high = n-2;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])
                return nums[mid];
            if((mid%2==0 && nums[mid]==nums[mid+1]) || (mid%2==1 && nums[mid]==nums[mid-1])){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return -1;
    }
}