import java.util.Arrays;
import java.util.Scanner;

public class _04_LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of words: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        System.out.println("Enter words: ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextLine();
        System.out.println("Result: "+longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] arr){
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        String first = arr[0], last = arr[arr.length-1];
        for(int i=0;i<Math.min(first.length(), last.length());i++){
            if(first.charAt(i)!=last.charAt(i))
                break;
            sb.append(first.charAt(i));
        }
        return sb.toString();
    }
}
