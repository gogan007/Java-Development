import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            System.out.print("Enter student marks (out of 100): ");
            int marks = sc.nextInt();

            if (marks >= 90) {
                System.out.println("This is Good");
            } else if (marks >= 60 && marks <= 89) {
                System.out.println("This is also Good");
            } else if (marks >= 0 && marks <= 59) {
                System.out.println("This is Good as well");
            } else {
                System.out.println("Invalid marks entered.");
            }

            System.out.println("Want to continue? (Enter 1 for Yes, 0 for No)");
            input = sc.nextInt();

        } while (input == 1);

        System.out.println("Program terminated. Remember: Effort matters most!");
        sc.close();
    }
}