import java.util.Scanner;

public class Factorial {
    // Recursion Fuction
    public static void calculateFactorial(int n, int fact) {
        // Stoping condition
        if(n == 1) { 
            System.out.println(fact);
            return;
        }
        fact *= n;                           // work
        calculateFactorial(n-1, fact);      // Call itself
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int n = sc.nextInt();

        calculateFactorial(n, 1);

        sc.close();
    }
}
