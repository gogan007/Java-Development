import java.util.Scanner;

public class Print1ToNN {

    // Recursion Fuction
    public static void printNumbers(int x,int n) {
        // Stoping condition
        if(x == n+1) { 
        return;
        }
        System.out.println(x);  // work
        printNumbers(x+1,n);      // Call itself
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int n = sc.nextInt();

        printNumbers(1,n);

        sc.close();
    }
}
