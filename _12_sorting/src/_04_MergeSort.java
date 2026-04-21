import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    Algorithm: T(c) - (nlog)
    1. Mergesort(arr, low, mid)
    2. Mergesort(arr, mid+1, high)
    3. Merge(arr, low, mid, high)

    Merge:
    1. Create a List, Initialise l=low, r=mid+1
    2. Loop until l<=mid && r<=high
    3. If arr[l]<=arr[r] Add arr[l++] to list
    4. Else Add arr[r++] to list
    5. End of loop
    6. Check Whether l<=mid to add remaining elements to list
    7. Check Whether r<=high to add remaining elements to list
    8. Update back into array by traversing elements in list list.get(i-row)
 */
public class _04_MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements in Array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements into Array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        mergeSort(arr, 0, arr.length-1);
        System.out.println("Resultant Array: ");
        for(int ele : arr)
            System.out.print(ele+" ");
    }

    public static void mergeSort(int [] arr, int low, int high){
        if(low>=high)
            return;
        int mid = low + (high - low)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr,mid+1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high){
        int left = low, right = mid+1;
        List<Integer> temp = new ArrayList<>();
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right])
                temp.add(arr[left++]);
            else
                temp.add(arr[right++]);
        }
        while(left<=mid)
            temp.add(arr[left++]);
        while(right<=high)
            temp.add(arr[right++]);
        for(int i=low;i<=high;i++)
            arr[i] = temp.get(i-low);
    }
}
