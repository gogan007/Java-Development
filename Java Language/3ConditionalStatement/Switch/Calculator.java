import java.util.Scanner;

public class Calculator {
            public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd Number : ");
        int n2 = sc.nextInt();

        System.out.print("What you want to do (+,-,*,/,%)");
        String op = sc.next();

         switch (op) {
            case "+" : 
            System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
            break;

            case "-" : 
            System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
            break;

            case "*" : 
            System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
            break;

            case "/" : 
            System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
            break;

            case "%" : 
            System.out.println(n1 + " % " + n2 + " = " + (n1%n2));
            break;            

            default :
            System.out.println("Invalid.....\nPlease enter (+,-,*,/,%)");

         }
        sc.close();
    }    
}
