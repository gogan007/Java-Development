import java.util.Scanner;

public class Permutation {

    public static void printPermutations(String str, int index, String permutations) {
        if (index == 0) {
            System.out.println(permutations);
            return;
        }
        for (int i=0;i<index;i++) {
            char currChar = str.charAt(i);
            String nextString = str.substring(0, i) + str.substring(i+1);
            printPermutations(nextString, index-1, permutations + currChar);
        }
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();

        printPermutations(str, str.length() , "");

        sc.close();
    }
}
