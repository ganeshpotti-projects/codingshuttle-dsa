import java.util.Scanner;

public class _16_KokoEatingBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of piles: ");
        int n = sc.nextInt();
        int [] piles = new int[n];
        System.out.println("Enter no.of bananas in "+ n + " piles:");
        for(int i=0;i<n;i++)
            piles[i] = sc.nextInt();
        System.out.println("Enter hours: ");
        int h = sc.nextInt();
        System.out.println("Min Bananas to eat in 1 hour: "+minBananas(piles, h));
    }

    public static int minBananas(int[] piles, int h){
        int max = Integer.MIN_VALUE;
        for(int ele : piles)
            max = Math.max(max, ele);
        int low = 1, high = max;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(calculateHours(piles, mid, h)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static boolean calculateHours(int[] piles, int hr, int h){
        int res = 0;
        for (int pile : piles)
            res += (int) Math.ceil((double) pile / hr);
        return res<=h;
    }
}
