import java.util.Scanner;

public class XpowerN {
    // Recursion Fuction
    public static int calcuXpowerN(int x, int n) {
        // Stoping condition
        if(n == 0) {        // Base 1
            return 1;
        }
        if (x == 0) return 0;   // Base 2

        int xpowNm1 = calcuXpowerN(x, n-1); // Work and Calling Itself
        int xpowN = x * xpowNm1;
        return xpowN;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Base : ");
        int x = sc.nextInt();

        System.out.print("Enter a Power : ");
        int n = sc.nextInt();

        int ans = calcuXpowerN(x,n);

        System.out.println(x + "^" + n + " = " + ans);

        sc.close();
    }
}
