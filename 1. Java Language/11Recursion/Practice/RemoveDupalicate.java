public class RemoveDupalicate {

    public static boolean map [] = new boolean[26];

    public static void removeDupalicate (String str, int index, String newstr) {

        if (index == str.length()) {
            System.out.println(newstr);
            return;
        }

        char currChar = str.charAt(index);
        if (map[currChar - 'a']) {
            removeDupalicate(str, index+1, newstr);
        } else {
            newstr += currChar;
            map[currChar - 'a'] = true;
            removeDupalicate(str, index+1, newstr);
        }
    }

    public static void main(String[] args) { 

        String str = "ababbcd";

        System.out.println(str);

        removeDupalicate(str, 0, "");
        
    }
}
