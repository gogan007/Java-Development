import java.util.Scanner;

public class MatrixPath {

    public static int claculatePath(int i, int j, int m, int n) {

        if (i == m || j == n) {
            return 0;
        }

        if (i == m-1 && j == n-1) {
            return 1;
        }

        // Calculates Down Paths
        int downPath = claculatePath(i+1, j, m, n);

        // Calculates Right Paths
        int rightPath = claculatePath(i, j+1, m, n);

        return downPath + rightPath;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int m = sc.nextInt();

        System.out.print("Enter columns : ");
        int n = sc.nextInt();

        int totalPath = claculatePath(0, 0, m, n);

        System.out.println("Total paths for matrix : " + m + "*" + n + " is : " + totalPath);

        sc.close();
    }
}
