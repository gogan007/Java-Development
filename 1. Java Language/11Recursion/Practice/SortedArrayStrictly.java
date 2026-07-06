public class SortedArrayStrictly {

    public static boolean isSorted(int arr[], int index) {
        if (index == arr.length-1) {
            return true;
        }

        if (arr[index] < arr[index+1]) {
            return isSorted(arr, index+1);
        } else{
            return false;
        }
    }
    public static void main(String[] args) {

        int arr [] = {1,2,3,4,5};
        
        boolean check = isSorted(arr, 0);

        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        if (check) {
            System.out.println("Array is Strictly Sorted.");
        } else {
            System.out.println("Array is not Strictly Sorted.");
        }
        
    }
}
