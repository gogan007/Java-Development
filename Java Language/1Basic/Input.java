import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        // nextLine()
        // nextInt()
        // nextDouble()
        // nextBoolean()
        // nextFloat()
        // nextLong()
        // nextShort()
        // nextByte()
        // nextBigInteger()
        // nextBigDecimal()
        System.out.println("Hello, " + name + "!");

        sc.close();
    }
}
