import java.util.Scanner;

public class ReverseString {

    public static String revString(String str) {
        if(str.length() == 1) {
        return str;
        }
        char currChar = str.charAt(0);
        String nextString = revString(str.substring(1));
        return nextString + currChar;
        }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        String reversed = revString(str);
        System.out.println(reversed);

        sc.close();
    }
}
