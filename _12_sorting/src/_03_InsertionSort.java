import java.util.Scanner;

/*
    Algorithm: T(c) - (n^2)
    1. Traverse from 1 to n-1 elements
    2. Move the Elements to right by 1 place, until it finds its position up to first index
    3. Insert the value stored
 */
public class _03_InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements in Array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements into Array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        insertionSort(arr);
        System.out.println("Resultant Array: ");
        for(int ele : arr)
            System.out.print(ele+" ");
    }

    public static void insertionSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i-1, value = arr[i];
            while(j>=0 && arr[j]>value){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = value;
        }
    }
}
