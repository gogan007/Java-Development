// Write a function that calculates the Greatest Common Divisor of 2 numbers.
import java.util.Scanner;

public class GCD {

    public static void gcd(int a, int b) {
        while(a != b) {  
           if(a>b) { 
               a = a - b; 
           } else { 
               b = b - a; 
           } 
       }
       System.out.println("GCD is : "+ b);
    }
 public static void main(String args[]) { 

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter 1st number : ");
       int n1 = sc.nextInt();
       System.out.print("Enter 2nd number : ");
       int n2 = sc.nextInt(); 
 
       gcd(n1, n2);
        
       sc.close();
   }    
}
