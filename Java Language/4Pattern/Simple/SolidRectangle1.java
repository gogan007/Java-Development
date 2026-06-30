package Simple;
import java.util.Scanner;

public class SolidRectangle1{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Rows : ");
        int r = sc.nextInt();

        System.out.print("Enter no. of Columns : ");
        int c = sc.nextInt();

        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++){

            System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}