import java.util.Scanner;

public class SumNTo1 {
    // Recursion Fuction
    public static void sumNumbers(int n, int sum) {
        // Stoping condition
        if(n == 0) { 
            System.out.println(sum);
            return;
        }
        sum += n;                    // work
        sumNumbers(n-1, sum);      // Call itself
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int n = sc.nextInt();
        int sum = 0;

        sumNumbers(n, sum);

        sc.close();
    }
}
