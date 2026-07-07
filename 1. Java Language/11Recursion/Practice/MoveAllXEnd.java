public class MoveAllXEnd {

    // Add all 'x' to the end of the string
    public static String addX(int count) {
        String newStr = "x";
        for (int i = 1; i < count; i++) {
            newStr += 'x';
        }
        return newStr;
    }

    public static String moveAllX(String str, int index, int count) {
        if (index == str.length()) {
            return addX(count);
        }
        if (str.charAt(index) == 'x') {

            return moveAllX(str, index + 1, count + 1);
        } else {
            String nextStr = moveAllX(str, index + 1, count);
            return str.charAt(index) + nextStr;
        }
    }

    public static void main(String args[]) {
        String str = "abcdefxghxixjxxxk";
        int count = 0;
        System.out.println(str);
        String newStr = moveAllX(str, 0, count);
        System.out.println(newStr);
    }
}
