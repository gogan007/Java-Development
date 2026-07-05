public class StringMethods {
    public static void main(String[] args) {
        
        // concatenation
        String fiName = "Gogan";
        String lName = "Karmur";

        String fName = fiName + lName;
        fName = fiName + " " + lName;

        System.out.println(fName);

        // Length
        int size = fName.length();
        System.out.println("fName has " + size + " Characters.");


        // charAt
        char fletter = fName.charAt(0);
        System.out.println(fletter);

        for (int i=0;i<fName.length();i++) {
            System.out.println(fName.charAt(i));
        }
    }
}
