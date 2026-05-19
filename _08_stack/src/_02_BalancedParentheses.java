import java.util.Scanner;
import java.util.Stack;

public class _02_BalancedParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string to check whether its balanced or not? ");
        String str = sc.nextLine();
        System.out.println("Is Balanced: " + isValid(str));
    }

    public static boolean isValid(String str){
        if(str.isEmpty()) return true;
        if(str.length()==1) return false;
        Stack<Character> st = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='[')
                st.push(ch);
            else{
                if(st.isEmpty()) return false;
                if(ch==')' && st.peek()=='(' || ch=='}' && st.peek()=='{' || ch==']' && st.peek()=='[')
                    st.pop();
            }
        }
        return st.isEmpty();
    }
}
