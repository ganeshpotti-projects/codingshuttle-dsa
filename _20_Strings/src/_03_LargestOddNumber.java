import java.util.Scanner;

public class _03_LargestOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println("Result: "+largestOddNumber(str));
    }

    public static String largestOddNumber(String str){
        int i=str.length()-1;
        int ind = -1;
        while(i>=0){
            if((str.charAt(i)-'0')%2==1){
                ind = i;
                break;
            }
            i--;
        }
        int j = 0;
        while(j<=ind && str.charAt(j)=='0')
            j++;
        return str.substring(j, ind+1);
    }
}
