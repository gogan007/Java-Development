import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Full name : ");
        String fName = sc.nextLine();
        System.out.println(fName);

        System.out.print("Enter your name : ");
        String name = sc.next();
        System.out.println(name);

        System.out.print("Enter your letter : ");
        char l = sc.next().charAt(0);
        System.out.println(l);


        sc.close();
    }
}
