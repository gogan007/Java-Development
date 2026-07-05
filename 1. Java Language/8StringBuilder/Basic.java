public class Basic {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Gogan Ahir");
        System.out.println(sb);

        // Get A Character from Index
        System.out.println(sb.charAt(0));

        // Set a Character at Index
        sb.setCharAt(0, 'P');
        System.out.println(sb);

    }
}
