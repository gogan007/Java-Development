import java.util.Scanner;

public class Sum1ToN {
    // Recursion Fuction
    public static void sumNumbers(int x,int n, int sum) {
        // Stoping condition
        if(x == n) { 
            sum += x;
            System.out.println("Sum of 1 to " + n + " is : " + sum);
            return;
        }
        sum += x;  // work
        sumNumbers(x+1,n,sum);      // Call itself
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int n = sc.nextInt();

        sumNumbers(1,n,0);

        sc.close();
    }
}
