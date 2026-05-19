import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class _08_NoOfGreaterElementsToTheRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();
        System.out.println("Result (NGE): ");
        int[] res = noOfNextGreaterElements(nums);
        for(int ele : res)
            System.out.print(ele + " ");
    }

    public static int[] noOfNextGreaterElements(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= nums[i])
                st.pop();

            if(!st.isEmpty())
                res[i] = st.size();

            st.push(nums[i]);
        }
        return res;
    }
}
