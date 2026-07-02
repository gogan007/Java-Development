// Take an array of numbers as input and check if it is an array sorted in ascending order. 

import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size : ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        // Taking user input
        for (int i=0;i<size;i++) {
            System.out.print("Enter values at Position " + i + " : ");
            numbers[i] = sc.nextInt();
        }

        // Printing Array
        for (int i=0;i<size;i++) {
            System.out.print(numbers[i] + " ");
        }

        // Check Array is sorted or not
        boolean sorted = true;
        for (int i=0;i<size-1;i++) {
            if (numbers[i] > numbers[i+1]) {
                sorted = false;
            }
        }

        if (sorted) {
            System.out.println("Array is sorted..");
        }
        else {
            System.out.println("Array is not Sorted..");
        }

        sc.close();
    }

}
