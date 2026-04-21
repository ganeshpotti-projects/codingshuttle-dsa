import java.util.Scanner;

/*
    Algorithm: T(c) - (n^2)
    1. Compare i and i+1 elements until last and bubble out the Largest Element (inner loop)
    2. If arr[i] > arr[i+1] swap elements
    3. In this way traverse from n-1 to 1 (outer loop)
 */
public class _02_BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements in Array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements into Array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        bubbleSort(arr);
        System.out.println("Resultant Array: ");
        for(int ele : arr)
            System.out.print(ele+" ");
    }

    public static void bubbleSort(int[] arr){
        int n= arr.length;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1])
                    swap(j, j+1, arr);
            }
        }
    }

    public static void swap(int i, int j, int[]arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
