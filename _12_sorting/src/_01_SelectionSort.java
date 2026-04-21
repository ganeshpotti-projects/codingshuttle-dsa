import java.util.Scanner;

/*
    Algorithm: T(c) - (n^2)
    1. Traverse elements from 0 to n-1 elements
    2. Select(Find) the MinIndex from 1 to n-1 elements
    3. If: arr[minIndex] < arr[0] swap

 */
public class _01_SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements in Array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements into Array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        selectionSort(arr);
        System.out.println("Resultant Array: ");
        for(int ele : arr)
            System.out.print(ele+" ");
    }

    public static void selectionSort(int [] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minInd = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minInd])
                    minInd = j;
            }
            int temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;
        }
    }
}
