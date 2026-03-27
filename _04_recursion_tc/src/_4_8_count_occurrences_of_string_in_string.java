import java.util.Scanner;

public class _4_8_count_occurrences_of_string_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Big String: ");
        String s = sc.nextLine();
        System.out.println("Enter Small String: ");
        String t = sc.nextLine();
        System.out.println("Occurrences: " + countOccurrences(s,t, 0));
    }

    public static int countOccurrences(String s, String t, int i){
        if(i>s.length()-t.length())
            return 0;
        int count = countOccurrences(s, t, i+1);
        boolean isSame = s.substring(i, i+t.length()).equals(t);
        return isSame ? count+1 : count;
    }
}
