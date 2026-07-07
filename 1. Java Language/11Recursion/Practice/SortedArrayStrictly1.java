public class SortedArrayStrictly1 {
    public static boolean sortedStrictly(int arr[], int index) {

        if (index == arr.length - 1) {
            return true;
        }
        if (!sortedStrictly(arr, index + 1)) {
            return false;
        }
        return arr[index] < arr[index + 1];
    }

    public static void main(String args[]) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        if (sortedStrictly(arr1, 0)) {
            System.out.println("Strictly Increasing");
        } else {
            System.out.println("NOT Strictly Increasing");
        }
    }
}
