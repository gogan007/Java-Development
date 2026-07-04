public class ClearBit {
    public static void main(String[] args) {
        
        // Bit Mask : 1 << i
        // Operation : Not then And
        int n = 77; // 1001101
        int pos = 3;

        int bitMask = 1 << pos;
        int notBitMask = ~(bitMask);
        int newN = notBitMask & n;

        System.out.println(n);
        System.out.println(newN);
    }
}