import java.util.Scanner;

public class Basic {
            public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int btn = sc.nextInt();

         switch (btn) {
            case 1 : 
            System.out.println("Hello");
            break;

            case 2 : 
            System.out.println("Hii");
            break;

            case 3 : 
            System.out.println("How are you?");
            break;

            default :
            System.out.println("Invalid.....");

         }
        sc.close();
    }
}
