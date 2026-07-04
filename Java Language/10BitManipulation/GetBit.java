public class GetBit {
    public static void main(String[] args) {
        
        // Bit Mask : 1 << i
        // Operation : And
        int n = 77; // 1001101
        int pos = 3;

        int bitMask = 1 << pos;
        int check = bitMask & n;

        if (check == 0) {
            System.out.println("Bit is 0");
        } else {
            System.out.println("Bit is 1");
        }


    }    
}
