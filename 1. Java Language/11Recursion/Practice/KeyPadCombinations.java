import java.util.Scanner;

public class KeyPadCombinations {

    public static String [] keyPad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printCombi (String str, int index, String combinations) {

        if (index == str.length()) {
            System.out.println(combinations);
            return;
        }

        char currChar = str.charAt(index);
        String map = keyPad[currChar - '0'];

        for (int i=0;i<map.length();i++) {
            printCombi(str, index+1, combinations+map.charAt(i));
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i=0;i<keyPad.length;i++) {
            System.out.println(i + " --> " + keyPad[i]);
        }

        System.out.print("Enter your choice : ");
        String str = sc.next();

        printCombi(str, 0, "");


        sc.close();
        
    }
}
