import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operation : ");
        int oper = sc.nextInt();

        System.out.print("Enter Position : ");
        int pos = sc.nextInt();

        int n = 77; // 1001101

        int bitMask = 1 << pos;
        int newN;
        // Set Bit
        if (oper == 1){
            newN = bitMask | n;
        } 
        // Clear Bit
        else {
            int notBitMask = ~(bitMask);
            newN = notBitMask & n;
        }
        System.out.println(n);
        System.out.println(newN);
        
        sc.close();
    }
}
