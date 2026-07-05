import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {

        int numbers[] = {3,7,8,10,18,33,45,48};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Element to find : ");
        int find = sc.nextInt();

        int size = numbers.length;

        // Display Array
        for (int i=0;i<size;i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Finding Element's index
        for (int i=0;i<size;i++) {
            if (find == numbers[i]) {
                System.out.println(find + " Present at index " + i);
            }
        }

        sc.close();
    }
    
}
