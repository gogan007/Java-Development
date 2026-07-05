// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings. 

import java.util.Scanner;

public class CumulativeLength {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Strings Array : ");
        int size = sc.nextInt();

        String names [] = new String[size];

        // Taking Input Names
        for (int i=0;i<size;i++) {
            System.out.print("Enter name at index " + i + " : ");
            names[i] = sc.next();
        }

        // Display 
        for (int i=0;i<size;i++) {
            System.out.print(names[i] + " ");
        }
        
        System.out.println("\n" + names.length);

        // Calculate Combined length
        int totalLength = 0;
        for (int i=0;i<size;i++) {
            totalLength += names[i].length();
        }
        System.out.println("String Array size is : " + names.length);
        System.out.println("Total Combine length of Strings Array is : " + totalLength);
        sc.close();
    }
}
