import java.util.Scanner;

// TC: O(n)
public class _4_7_palindrome_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        int l = 0, r = str.length()-1;
        System.out.println(isPalindrome(str, l, r));
    }

    public static boolean isPalindrome(String str, int l, int r){
        if(l>=r)
            return true;
        if(str.charAt(l)!=str.charAt(r))
            return false;
        return isPalindrome(str,l+1,r-1);
    }
}
