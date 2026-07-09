import java.util.ArrayList;

public class Basic {
    public static void main(String args[]) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // It can be Float, Character, String, Double.....

        // Add elements
        numbers.add(3);
        numbers.add(7);
        numbers.add(45);
        numbers.add(18);

        System.out.println(numbers);

        // Get an element
        int element = numbers.get(1); // 0 is the index
        System.out.println(element);

        // Add element in between
        numbers.add(2, 10); // 1 is the index and 2 is the element to be added
        System.out.println(numbers);

        // Set element
        numbers.set(4, 8);
        System.out.println(numbers);

        // Delete elements
        numbers.remove(0); // 0 is the index
        System.out.println(numbers);

        // Size of list
        int size = numbers.size();
        System.out.println(size);

    }

}
