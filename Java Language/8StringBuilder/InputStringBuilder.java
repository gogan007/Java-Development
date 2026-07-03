import java.util.Scanner;

public class InputStringBuilder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        StringBuilder nameB = new StringBuilder(name);

        System.out.println(name);
        System.out.println(nameB);

        sc.close();
    }
}
