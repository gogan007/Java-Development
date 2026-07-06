public class SubSequences {
    
    public static void subSequences(String str, int index, String newStr) {

        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(index);
        // To be
        subSequences(str, index+1, newStr+currChar);

        // To not be
        subSequences(str, index+1, newStr);
    }
    public static void main(String[] args) {
        String str = "abc";

        subSequences(str, 0, "");
    }
}
