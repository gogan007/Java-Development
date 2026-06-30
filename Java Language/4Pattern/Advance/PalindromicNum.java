package Simple;
import java.util.Scanner;

public class PalindromicNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Rows : ");
        int r = sc.nextInt();

        for (int i=1;i<=r;i++) {

            // Space
            for (int j=1;j<=r-i;j++){
            System.out.print("  ");
            }

            // First part
            for (int j=i;j>1;j--) {
                System.out.print(j + " ");
            }

            // Second part
            for (int j=1;j<=i;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }   
}
