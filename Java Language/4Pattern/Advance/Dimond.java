import java.util.Scanner;

public class Dimond {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Rows : ");
        int r = sc.nextInt();

        // 1st Half
        for (int i=1;i<=r;i++) {

            // Space
            for (int j=1;j<=r-i;j++){
            System.out.print("  ");
            }

            // Print *
            for (int j=1;j<=2*i-1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2nd Half
        for (int i=r;i>=1;i--) {

            // Space
            for (int j=1;j<=r-i;j++){
            System.out.print("  ");
            }

            // Print *
            for (int j=1;j<=2*i-1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
