// Write a program to print Fibonacci series of n terms where n is input by user : 
// 0 1 1 2 3 5 8 13 21 .....  
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it

import java.util.Scanner;

public class Fibonaci {

    public static void printFibo(int x) {
        int f1 = 0;
        int f2 = 1;

        System.out.print(f1 + " ");

        if (x>1) {
            for (int i=1;i<x;i++) {
                System.out.print(f2 + " ");
                int temp = f2;
                f2 = f1 + f2;
                f1 = temp;
            }
        }
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many terms you want : ");
        int n = sc.nextInt();

        printFibo(n);

        sc.close();
    }
}
