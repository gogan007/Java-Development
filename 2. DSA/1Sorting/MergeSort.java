import java.util.Scanner;

public class MergeSort {
    
    public static void conquer(int arr[], int start, int mid, int end) {
        int merged[] = new int[end - start + 1];
        int idx1 = start;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= end) {
            merged[x++] = arr[idx2++];
        }
        for (int i=0, j=start; i<merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }

        public static void divide(int arr[], int start, int end) {
            if(start >= end) {
                return;
            }
            int mid =start+(end-start)/2;
            divide(arr,start, mid);
            divide(arr,mid+1, end);
            conquer(arr, start, mid, end);    
        }

    public static void main (String []args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();

        int arr [] = new int[size];

        // Input
        for (int i=0;i<size;i++) {
            System.out.print("Enter element at position " + i + " : ");
            arr [i] = sc.nextInt();
        }

        // Display unsorted array
        for (int i=0;i<size;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        divide(arr,0,arr.length-1);

        // Display sorted array
        for (int i=0;i<size;i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}