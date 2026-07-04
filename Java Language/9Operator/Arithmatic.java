public class Arithmatic {
    public static void main(String[] args) {
        int a = 7;
        int b = 18;

        // Binary
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);


        // Unary

        System.out.println(a++); // a = a + 1
        System.out.println(--b); // b = b - 1


        System.out.println();
        // Pre and Post Increment
        int x = 10;
        int y = x++;

        System.out.println(x);
        System.out.println(y);

        int x1 = 10;
        int y2 = --x1;

        System.out.println(x1);
        System.out.println(y2);
    }
    
}
