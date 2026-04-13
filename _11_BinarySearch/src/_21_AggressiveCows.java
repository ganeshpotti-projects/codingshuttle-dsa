import java.util.Arrays;
import java.util.Scanner;

public class _21_AggressiveCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of sheds: ");
        int n = sc.nextInt();
        System.out.println("Enter the free shed numbers: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter no.of cows to be allocated in shed:");
        int cows = sc.nextInt();
        System.out.println("Max Distance where all cows can be allocated: "+findMaxDistance(arr, cows));
    }

    public static int findMaxDistance(int[] arr, int cows){
        Arrays.sort(arr);
        int len = arr.length;
        int low = 1, high = arr[len-1] - arr[0];
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(canAllocate(arr, cows, mid)){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return high;
    }

    public static boolean canAllocate(int[] arr, int cows, int dist){
        int allocatedCnt = 1, last = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=dist){
                allocatedCnt++;
                last = arr[i];
                if(allocatedCnt >= cows) return true;
            }
        }
        return allocatedCnt>=cows;
    }
}
