import java.util.Scanner;

public class _07_ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter string2: ");
        String str2 = sc.nextLine();
        System.out.println("Anagram: " + validAnagram(str1, str2));
    }

    public static boolean validAnagram(String str1, String str2){
        if(str1.length()!=str2.length())
            return false;

        int[] arr = new int[26];
        for(int i=0;i<str1.length();i++)
            arr[str1.charAt(i)-'a']++;

        for(int i=0;i<str2.length();i++)
            arr[str2.charAt(i)-'a']--;

        for(int ele : arr){
            if(ele!=0)
                return false;
        }
        return true;
    }
}
