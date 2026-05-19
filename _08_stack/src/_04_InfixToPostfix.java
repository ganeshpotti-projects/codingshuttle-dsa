import java.util.Scanner;
import java.util.Stack;

public class _04_InfixToPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter infix string: ");
        String str = sc.nextLine();
        System.out.println("Result postfix string: "+convertToPostfix(str));
    }

    public static String convertToPostfix(String str){
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(Character.isLetterOrDigit(ch))
                sb.append(ch);
            else if(ch=='(')
                st.push(ch);
            else if(ch==')'){
                while (!st.isEmpty() && st.peek()!='(')
                    sb.append(st.pop());
                st.pop();
            }else{
                while(!st.isEmpty() && (st.peek() != '(' && getPrecedence(ch) <= getPrecedence(st.peek())))
                    sb.append(st.pop());
                st.push(ch);
            }
        }
        while(!st.isEmpty())
            sb.append(st.pop());
        return sb.toString();
    }

    public static int getPrecedence(char ch){
        if(ch=='^')
            return 3;
        else if(ch=='/' || ch=='*')
            return 2;
        else if(ch=='-' || ch=='+')
            return 1;
        else
            return -1;
    }
}
