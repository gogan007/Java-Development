import java.util.Scanner;

public class Grater {

    public static int graternum(int a, int b) {
        if (a>b) {
            return a;
        }
        else {
            return b;
        }
    }
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 1st Number : ");
        int num2 = sc.nextInt();

        int big = graternum(num1, num2);

        System.out.println(big);

        sc.close();
    }
}
