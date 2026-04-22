import java.util.Scanner;

public class _01_RemoveOuterMostParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        System.out.println("Result: " + removeOuterParentheses(str));
    }

    public static String removeOuterParentheses(String str){
        StringBuilder sb = new StringBuilder();
        int level = 0;
        for(char ch : str.toCharArray()){
            if(ch == '('){
                if(level!=0) sb.append(ch);
                level++;
            }else{
                level--;
                if(level!=0) sb.append(ch);
            }
        }
        return sb.toString();
    }
}
