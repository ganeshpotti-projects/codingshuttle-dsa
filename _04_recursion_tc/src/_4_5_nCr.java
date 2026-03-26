import java.util.Scanner;

// TC = O()
// nCr Formula = (n!)/(n-r)!*r! All Combinations maintain order
// Recursion: nCr = n-1Cr-1 + n-1Cr
// nPr Formula = (n!)/(n-r)! All combinations without order
public class _4_5_nCr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter r: ");
        int r = sc.nextInt();
        System.out.println("Combinations: "+calculateNCR(n,r));
    }

    public static int calculateNCR(int n, int r){
        if(n==r || r==0)
            return 1;
        return calculateNCR(n-1,r-1)+calculateNCR(n-1,r);
    }
}
