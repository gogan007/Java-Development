import java.util.Scanner;

public class Prime {

    public static void checkPrime(int x) {
        boolean isPrime = true;

        if (x<2) {
            isPrime = false;
        }

        else {
            for (int i=2;i<=Math.sqrt(x);i++) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(x + " is a Prime number.");
        }
        else {
            System.out.println(x + " is not a Prime number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        checkPrime(n);

        sc.close();
    }
}
