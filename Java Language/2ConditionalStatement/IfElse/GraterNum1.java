import java.util.Scanner;

public class GraterNum1 {
            public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 1st Number : ");
        int num2 = sc.nextInt();

        if (num1 == num2 ) {
            System.out.println(num1 + " = " + num2 + " : (Equal)");
        }

        else if (num1 > num2) {
            System.out.println(num1 + " > " + num2 + " : (Grater)");
            }
            
        else {
            System.out.println(num1 + " < " + num2 + " : (Leaser)");
            }

        sc.close();
    }
}
