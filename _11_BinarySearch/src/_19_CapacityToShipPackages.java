import java.util.Scanner;

public class _19_CapacityToShipPackages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.of Packages: ");
        int n = sc.nextInt();
        int[] weights = new int[n];
        System.out.println("Enter weights of "+ n + "packages: ");
        for(int i=0;i<n;i++)
            weights[i] = sc.nextInt();
        System.out.println("Enter No.of Days: ");
        int days = sc.nextInt();
        System.out.println("Min Weight needed per day to ship with 'D' Days: " + calculateWeight(weights, days));
    }

    public static int calculateWeight(int[] weights, int days){
        int max = Integer.MIN_VALUE, total = 0;
        for(int ele : weights){
            max = Math.max(ele, max);
            total += ele;
        }
        int low = max, high = total, ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            int minDays = calculateDays(weights, mid);
            if(minDays<=days) {
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static int calculateDays(int[] weights, int maxCapacity){
        int days = 1, capacity = 0;
        for(int weight : weights){
            if(weight+capacity>maxCapacity){
                days++;
                capacity = weight;
            }else{
                capacity += weight;
            }
        }
        return days;
    }
}
