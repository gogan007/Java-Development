// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

import java.util.Scanner;

public class Count0PN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 for Continue or 0 for Exit : ");
        int input = sc.nextInt();

        int P = 0;
        int N = 0;
        int O = 0;

        while (input == 1) {
            System.out.print("Enter number : ");
            int num = sc.nextInt();

            if (num == 0) {
                O++;
            }

            else if (num > 0) {
                P++;
            }

            else {
                N++;
            }

            System.out.print("Enter 1 for Continue or 0 for Exit : ");
            input = sc.nextInt();
        }

        System.out.println("Positive Numbers is " + P);
        System.out.println("Negative Numbers is " + N);
        System.out.println("0 Numbers is " + O);



        sc.close();
        
    }

}
