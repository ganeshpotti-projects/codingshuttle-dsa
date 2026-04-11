import java.util.Scanner;

public class _17_MinDaysToMakeMBouquets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of roses: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter roses maturity days array: ");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter No.of Bouquets to be made: ");
        int m = sc.nextInt();
        System.out.println("Enter No.of Roses to be in 1 bouquet: ");
        int k = sc.nextInt();
        System.out.println("Min days req to make m bouquets with 'k' flowers adjacently: "+calculateDays(arr, m, k));
    }

    public static int calculateDays(int[] arr, int m, int k){
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, ans = -1;
        for(int ele : arr){
            min = Math.min(min, ele);
            max = Math.max(max, ele);
        }
        int low = min, high = max;
        while(low<=high){
            int mid = (low+high)/2;
            if(isPossible(arr, m, k, mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] arr, int m, int k, int mid){
        int cnt = 0, totalBouquets=0;
        for (int ele : arr) {
            if (ele <= mid)
                cnt++;
            else {
                totalBouquets += cnt / k;
                cnt = 0;
            }
        }
        totalBouquets += cnt/k;
        return totalBouquets>=m;
    }
}
