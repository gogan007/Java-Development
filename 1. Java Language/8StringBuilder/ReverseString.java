import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        // Taking Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name : ");
        String name = sc.nextLine();
        StringBuilder nameB = new StringBuilder(name);

        System.out.println(name);
        System.out.println(nameB);

        // Reverse String
        for(int i=0; i<nameB.length()/2; i++) {
            int front = i;
            int back = nameB.length() - i - 1;

            char frontChar = nameB.charAt(front);
            char backChar = nameB.charAt(back);

            nameB.setCharAt(front, backChar);
            nameB.setCharAt(back, frontChar);
     }

     System.out.println(nameB);


        sc.close();
    }
}
