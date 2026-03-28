import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _4_9_print_all_subsets_of_string {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        res.add("");
        printSubsets(str, res, 0, sb);
        for(String s : res){
            System.out.print(s+ " ");
        }
    }

    public static void printSubsets(String str, List<String> res, int i, StringBuilder sb){
        if(i == str.length()){
            res.add(sb.toString());
            return;
        }
        sb.append(str.charAt(i));
        printSubsets(str, res, i+1, sb);
        sb.deleteCharAt(sb.length()-1);
        printSubsets(str, res, i+1, sb);
    }
}
