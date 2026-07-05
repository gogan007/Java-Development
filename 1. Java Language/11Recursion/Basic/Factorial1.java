import java.util.Scanner;

public class Factorial1 {
    // Recursion Fuction
    public static int calculateFactorial(int n) {
        // Stoping condition
        if(n == 1 || n == 0) { 
            return 1;
        }
        int factNm1 = calculateFactorial(n-1);
        int factN = n * factNm1;
        return factN;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int n = sc.nextInt();

        int fact = calculateFactorial(n);

        System.out.println(n + "! = " + fact);

        sc.close();
    }
}
