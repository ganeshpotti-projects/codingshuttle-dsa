import java.util.Scanner;

public class _02_ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println("Result: "+reverseWords(str));
    }

    public static String reverseWords(String str){
        StringBuilder sb = new StringBuilder();
        int i = str.length()-1;
        while(i>=0){
            while(i>=0 && str.charAt(i)==' ')
                i--;
            if(i<=0) break;
            int end = i;
            while(i>=0 && str.charAt(i)!=' ')
                i--;
            int start = i+1;
            String temp = str.substring(start, end+1);
            if(sb.length()>1)
                sb.append(" ");
            sb.append(temp);
        }
        return sb.toString();
    }
}
