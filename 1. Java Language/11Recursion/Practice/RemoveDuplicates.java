public class RemoveDuplicates {

    public static String removeDuplicates(String str, int index, boolean present[]) {
        if (index == str.length()) {
            return "";
        }
        char curr = str.charAt(index);
        if (present[curr - 'a']) {
            return removeDuplicates(str, index + 1, present);
        } else {
            present[curr - 'a'] = true;
            return curr + removeDuplicates(str, index + 1, present);
        }
    }

    public static void main(String args[]) {
        String str = "ababccabccab";
        boolean present[] = new boolean[str.length()];

        System.out.println(str);
        System.out.println(removeDuplicates(str, 0, present));
    }
}
