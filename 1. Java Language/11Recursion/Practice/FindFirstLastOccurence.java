import java.util.Scanner;

public class FindFirstLastOccurence {

    public static int fIndex = -1;
    public static int lIndex = -1;

    public static void getIndices(String str, char el, int idx) {
        if (idx == str.length()) {
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == el) {
            if (fIndex == -1) {
                fIndex = idx;
            } else {
                lIndex = idx;
            }
        }
        getIndices(str, el, idx + 1);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String str = "mahi mar raha hai";
        System.out.println(str);

        System.out.print("Enter Character : ");
        char element = sc.next().charAt(0);

        
        getIndices(str, element, 0);
        System.out.println("First occurence : " + fIndex);
        System.out.println("Last occurence : " + lIndex);

        sc.close();
    }
}
