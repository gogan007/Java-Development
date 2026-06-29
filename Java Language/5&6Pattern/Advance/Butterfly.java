import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Rows : ");
        int r = sc.nextInt();

        // 1st Half
        for (int i=1;i<=r;i++) {

            // First *'s
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }

            // Space
            for (int j=1;j<=2*(r-i);j++){
                System.out.print("  ");
            }

            // Last *'s
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2nd Half
        for (int i=r;i>=1;i--) {

            // First *'s
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }

            // Space
            for (int j=1;j<=2*(r-i);j++){
                System.out.print("  ");
            }

            // Last *'s
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}