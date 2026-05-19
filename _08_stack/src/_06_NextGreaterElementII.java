import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class _06_NextGreaterElementII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();
        System.out.println("Result (Circular NGE): ");
        int[] res = nextGreaterElements(nums);
        for(int ele : res)
            System.out.print(ele + " ");
    }

    public static int[] nextGreaterElements(int[] nums){
        int n = nums.length;
        int[] nge = new int[n];
        Arrays.fill(nge, -1);
        Stack<Integer> st = new Stack<>();

        for(int i=n*2-1;i>=0;i--){
            int ind = i%n;
            int currEle = nums[ind];
            while(!st.isEmpty() && st.peek() <= currEle)
                st.pop();

            if(i<n && !st.isEmpty())
                nge[i] = st.peek();

            st.push(currEle);
        }
        return nge;
    }
}
