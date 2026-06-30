import java.util.Scanner;

public class Factorial {
    public static int calculateFactorial(int n) {

       if(n < 0) {
           System.out.println("Invalid Number");
           return 0;
       }
       int factorial = 1;

       // loop for calculate the factorial
       for(int i=n; i>=1; i--) {
           factorial = factorial * i;
       }

       return factorial;
   }

   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number : ");
       int n = sc.nextInt();

       System.out.println(n + "! = " + calculateFactorial(n));

       sc.close();
   }

}
