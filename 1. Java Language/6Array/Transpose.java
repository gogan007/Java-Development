import java.util.Scanner;

public class Transpose {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter cols : ");
        int cols = sc.nextInt();

        int[][] basic = new int[rows][cols];

        // Taking user input
        // rows
        for (int i=0;i<rows;i++) {

        // columns 
            for (int j=0;j<cols;j++) {
            System.out.print("Enter values at Index " + i + "," + j + " : ");
            basic[i][j] = sc.nextInt();
            }
        }

        // Display Array
        for (int i=0;i<rows;i++) {

            for (int j=0;j<cols;j++) {
                System.out.print(basic[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose Array 
        System.out.println("Transpose Array is : ");
        for (int i=0;i<cols;i++) {

            for (int j=0;j<rows;j++) {
                System.out.print(basic[j][i] + " ");   // Must check.........
            }
            System.out.println();
        }

        sc.close();
    }
    
}
