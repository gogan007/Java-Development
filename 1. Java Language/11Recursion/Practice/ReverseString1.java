import java.util.Scanner;

public class ReverseString1 {

    public static void revString(String str, int index) {
        if(index == -1) {
            return;
        }

        System.out.print(str.charAt(index));
        revString(str,index-1);
        }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        revString(str,str.length()-1);

        sc.close();
    }
}
