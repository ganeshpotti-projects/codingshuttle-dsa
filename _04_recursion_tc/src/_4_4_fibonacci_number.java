import java.util.Scanner;

// TC = O(2^n)
public class _4_4_fibonacci_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci Number: "+ fibonacci(n));
    }

    public static int fibonacci(int n){
        if(n<=1)
            return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
