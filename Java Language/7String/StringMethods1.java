public class StringMethods1 {
    public static void main(String[] args) {

        // compare
        // s1 > s2 --> positive value
        // s1 = s2 --> 0
        // s1 < s2 --> negative value
        String s1 = "Gogan";
        String s2 = "Gagan";

        System.out.println(s1.compareTo(s2));

        if (s1.compareTo(s2) == 0) {
            System.out.println("Stringds are same.");
        }
        else {
            System.out.println("Strings are not same.");
        }

        // equals
        if (s1.equals(s2)) {
            System.out.println("Strings are same.");
        }
        else {
            System.out.println("Strings are nor same.");
        }
        

        // New string
        new String("Karmur");
        System.out.println(new String("Ahir"));


        // sub String
        String sen = "My name is Gogan Karmur.";
        System.out.println(sen);
        String name = sen.substring(11);
        System.out.println(name);
        name = sen.substring(11,16);
        System.out.println(name);



    }
}
