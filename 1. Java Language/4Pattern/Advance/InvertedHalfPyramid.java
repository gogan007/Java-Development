import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Rows : ");
        int r = sc.nextInt();

        // for (int i=0;i<r;i++) {
        //     for (int j=0;j<r-i;j++){
        //     System.out.print("*");
        //     }
        //     System.out.println();
        // }

        for (int i=r;i>0;i--) {
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
