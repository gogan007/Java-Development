import java.util.ArrayList;
import java.util.Collections;

public class LoopSorting {
    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>();

        numbers.add(45);
        numbers.add(7);
        numbers.add(18);
        numbers.add(3);
        numbers.add(10);

        System.out.println(numbers);

        // Loops on lists
        for (int i=0;i<numbers.size();i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        // Sorting the list
        Collections.sort(numbers);
        System.out.println(numbers);
    
    }
}
