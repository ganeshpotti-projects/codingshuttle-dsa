import java.util.Scanner;
/*
    Algorithm: T(c) - (nlog)
    1. Assign pivot element as last element (high)
    2. Traverse from low to high.
    3. Any Element found less than equal to pivot swap to front indexes (0,1,i+1)
    4. Now Swap the pivot element also wih i+1
    5. return pivot index (i+1)
    6. Now again apply quicksort again from 0 to pivotIndex-1 and pivotIndex+1 to high
 */
public class _05_QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements in Array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements into Array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        quickSort(arr, 0, arr.length-1);
        System.out.println("Resultant Array: ");
        for(int ele : arr)
            System.out.print(ele+" ");
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}
