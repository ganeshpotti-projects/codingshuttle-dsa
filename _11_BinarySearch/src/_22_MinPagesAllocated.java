import java.util.Scanner;

public class _22_MinPagesAllocated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.of books: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter pages: ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter No.of Students");
        int students = sc.nextInt();
        System.out.println("Minimum Result: "+minAllocation(arr, students));
    }

    public static int minAllocation(int[] arr, int students){
        if(students>arr.length)
            return -1;
        int max = Integer.MIN_VALUE, tot = 0;
        for(int ele : arr){
            max = Math.max(ele, max);
            tot += ele;
        }
        int low = max, high = tot;
        while(low<=high){
            int mid = low+(high-low)/2;
            int allocatedStudents = countStudents(arr, mid);
            if (allocatedStudents > students) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static int countStudents(int[] arr, int maxBooks){
        int students = 1, sum = 0;
        for(int ele : arr){
            if(ele+sum <= maxBooks){
                sum += ele;
            }else{
                students++;
                sum = ele;
            }
        }
        return students;
    }
}
