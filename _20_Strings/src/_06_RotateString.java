import java.util.Scanner;

public class _06_RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println("Enter Goal String");
        String goal = sc.nextLine();
        System.out.println("Contains: "+rotateString(str, goal));
    }

    public static boolean rotateString(String str, String goal){
        if(str.length()!=goal.length())
            return false;
        String bigS = str + str;
        return bigS.contains(goal);
    }
}
