import java.util.HashSet;

public class UniqueSubSequences {
    
    public static void subSequences(String str, int index, String newStr, HashSet <String> set) {

        if (index == str.length()) {
            if (set.contains(newStr)) {
                return;
            }else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }

        char currChar = str.charAt(index);
        // To be
        subSequences(str, index+1, newStr+currChar, set);

        // To not be
        subSequences(str, index+1, newStr, set);
    }
    public static void main(String[] args) {
        String str = "ddd";
        HashSet <String> set = new HashSet <>();

        subSequences(str, 0, "", set);
    }
}