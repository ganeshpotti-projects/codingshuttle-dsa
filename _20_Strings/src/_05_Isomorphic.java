import java.util.Scanner;

public class _05_Isomorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter String2: ");
        String str2 = sc.nextLine();
        System.out.println("Result: "+isomorphic(str1, str2));
    }

    public static boolean isomorphic(String str1, String str2){
        if(str1.length()!=str2.length())
            return false;
        int[] t1 = new int[256];
        int[] t2 = new int[256];

        for(int i=0;i<str1.length();i++){
            if(t1[str1.charAt(i)]!=t2[str2.charAt(i)])
                return false;
            t1[str1.charAt(i)] = i+1;
            t2[str2.charAt(i)] = i+1;
        }
        return true;
    }
}
