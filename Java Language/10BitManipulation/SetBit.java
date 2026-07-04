public class SetBit {
    public static void main(String[] args) {
        
        // Bit Mask : 1 << i
        // Operation : Or
        int n = 77; // 1001101
        int pos = 1;

        int bitMask = 1 << pos;
        int newN = bitMask | n;

        System.out.println(n);
        System.out.println(newN);
    }
}
