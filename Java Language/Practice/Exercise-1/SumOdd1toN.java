// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class SumOdd1toN {

    public static int sumoddnumber(int x) {
        int sum = 0;
        for (int i=1;i<x;i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int sumOdd = sumoddnumber(num);

        System.out.println(sumOdd);

        sc.close();

    }
    
}
