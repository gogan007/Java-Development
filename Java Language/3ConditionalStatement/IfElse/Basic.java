import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are an Adult.");
        }
        else {
            System.out.println("You are not an adult.");
        }
        
        sc.close();
    }
}
