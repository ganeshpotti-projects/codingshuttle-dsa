import java.util.Scanner;

public class _24_PaintersPartition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of blocks: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter blocks size: ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter no.of painters: ");
        int painters = sc.nextInt();
        System.out.println("Result: "+ findLargestMinDistance(arr, painters));
    }

    public static int findLargestMinDistance(int[] arr, int painters){
        int max = Integer.MIN_VALUE, tot = 0;
        for(int ele : arr){
            max = Math.max(max, ele);
            tot += ele;
        }
        int low = max, high = tot;
        while(low<=high){
            int mid = low + (high-low) / 2;
            int partitions = countPartitions(arr, mid);
            if(partitions<=painters)
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }

    public static int countPartitions(int[] arr, int maxSum){
        int partitions = 1, sum = 0;
        for(int ele : arr){
            if(ele+sum<=maxSum)
                sum += ele;
            else{
                partitions++;
                sum = ele;
            }
        }
        return partitions;
    }
}
