import java.util.Scanner;

public class Fibonacci {
    // Recursion Fuction
    public static void calculateFibonacci(int a, int b, int n) {
        // Stoping condition
        if (n == 0) return;

        int c = a + b;
        System.out.println(c);
        calculateFibonacci(b, c, n-1);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.println(a);
        System.out.println(b);

        calculateFibonacci(a,b,n-2);

        sc.close();
    }
}
