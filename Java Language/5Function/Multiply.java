import java.util.Scanner;

    public class Multiply {

    //Multiply 2 numbers
    public static int mul(int a, int b) {
        return a*b;
    }
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter 2 number : ");
       int a = sc.nextInt();
       int b = sc.nextInt();


       int result = mul(a, b);
       System.out.println(result);
   }
}
