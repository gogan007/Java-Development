public class MoveAllX {

    public static void moveX(String str, int index, int count, String newStr) {

        if (index == str.length()) {
            for (int i=0;i<count;i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(index);
        if (currChar == 'x') {
            count++;
            moveX(str, index+1, count, newStr);
        } else {
            newStr += currChar;
            moveX(str, index+1, count, newStr);
        }
    }
    public static void main(String[] args) {
        
        String str = "abxcxxd";

        System.out.println(str);
        moveX(str, 0, 0, "");
    }
}
