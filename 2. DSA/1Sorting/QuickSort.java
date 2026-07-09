import java.util.Scanner;

public class QuickSort {

    public static int partition(int arr [], int low, int high) {
       
        int pivot = arr[high];
        int i = low - 1;

        for (int j=low;j<high;j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap
                int temp = arr[i];
                arr [i] = arr [j];
                arr [j] = temp;
            }
        }

        i++;
        // Pivot position
        int temp = arr[i];
        arr [i] = pivot;           // pivot == arr [high]
        arr [high] = temp;

        return i;  // pivotIndex

    }

    public static void quickSort(int arr [], int low, int high) {

        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
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

        quickSort(arr, 0, size-1);

        // Display sorted array
        for (int i=0;i<size;i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
