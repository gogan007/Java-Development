import java.util.Scanner;

public class StringArray {

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size : ");
        int size = sc.nextInt();

        String[] names = new String[size];

        // Taking user input
        for (int i=0;i<size;i++) {
            System.out.print("Enter values at Position " + i + " : ");
            names[i] = sc.next();
        }

        // Printing Array
        for (int i=0;i<size;i++) {
            System.out.print(names[i] + ",");
        }

        sc.close();
    }
}
