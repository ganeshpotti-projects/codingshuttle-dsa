import java.util.*;
// TC = O(n)
public class _4_3_sum_of_n_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println(sumOfNumbers(n));

    }

    public static int sumOfNumbers(int n){
        if(n==1)
            return 1;
        return sumOfNumbers(n-1) + n;
    }
}
