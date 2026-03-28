import java.util.Scanner;

public class _4_11_matrix_path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int m = sc.nextInt();
        System.out.print("Enter cols: ");
        int n = sc.nextInt();
        System.out.println("No.of Ways: "+countPaths(m,n));
    }

    public static int countPaths(int m, int n) {
        if (m == 1 || n == 1)
            return 1;
        return countPaths(m-1,n)+countPaths(m,n-1);
    }
}
