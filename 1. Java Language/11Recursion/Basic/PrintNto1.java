import java.util.Scanner;

public class PrintNto1 {

    // Recursion Fuction
    public static void printNumbers(int n) {
        // Stoping condition
        if(n == 0) { 
        return;
        }
        System.out.println(n);  // work
        printNumbers(n-1);      // Call itself
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int n = sc.nextInt();

        printNumbers(n);

        sc.close();
    }
}
