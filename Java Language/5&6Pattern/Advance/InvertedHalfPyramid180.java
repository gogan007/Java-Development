package Simple;
import java.util.Scanner;

public class InvertedHalfPyramid180 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Rows : ");
        int r = sc.nextInt();

        for (int i=0;i<r;i++) {
            for (int j=0;j<r-i-1;j++){
            System.out.print(" ");
            }
            for (int k=0;k<i+1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for (int i=r;i>0;i--) {
        //     for (int j=0;j<i-1;j++){
        //         System.out.print("  ");
        //     }
        //     for (int j=0;j<r-i+1;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        sc.close();
    }    
}
