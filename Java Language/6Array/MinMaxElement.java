public class MinMaxElement {
    public static void main(String[] args) {

        int numbers[] = {3,7,8,10,1,165,-18,33,45,48};

        int size = numbers.length;

        // Display Array
        for (int i=0;i<size;i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Finding minimum Element
        int min = numbers[0];       // int min = Integer.MAX_VALUE;
        for (int i=1;i<size;i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum element is : " + min);

        // Finding maximum Element
        int max = numbers[0];        // int max = Integer.MIN_VALUE;
        for (int i=1;i<size;i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum element is : " + max);
    }
}
