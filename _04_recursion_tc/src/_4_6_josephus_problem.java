import java.util.Scanner;

// TC = O()
public class _4_6_josephus_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Persons: ");
        int n = sc.nextInt();
        System.out.println("Enter frequency: ");
        int k = sc.nextInt();
        System.out.println("Last Person: " + josephus(n,k));
    }

    public static int josephus(int n, int k){
        if(n==1)
            return 0;
        return (josephus(n-1,k)+k)%n;
    }
}
