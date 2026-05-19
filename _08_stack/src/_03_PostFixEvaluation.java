import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class _03_PostFixEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of values: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        System.out.println("Enter values to get postfix result: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLine();
        }
        System.out.println("result: "+postfixEvaluation(arr));
    }

    public static int postfixEvaluation(String[] strs){
        Stack<Integer> st = new Stack<>();
        for (String s : strs) {
            if (!isOperator(s))
                st.push(Integer.parseInt(s));
            else {
                int n2 = st.pop();
                int n1 = st.pop();
                int res = 0;
                String str = s;
                switch (str) {
                    case "+":
                        res = n1 + n2;
                        break;
                    case "-":
                        res = n1 - n2;
                        break;
                    case "*":
                        res = n1 * n2;
                        break;
                    case "/":
                        res = n1 / n2;
                        break;
                    case "^":
                        res = (int) Math.pow(n1, n2);
                        break;
                }
                st.push(res);
            }
        }
       return st.pop();
    }

    public static boolean isOperator(String str){
        return Objects.equals(str, "+") ||
                Objects.equals(str, "-") ||
                Objects.equals(str, "*") ||
                Objects.equals(str, "/") ||
                Objects.equals(str, "^");
    }
}
