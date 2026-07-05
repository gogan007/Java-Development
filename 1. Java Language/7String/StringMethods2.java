public class StringMethods2 {
    public static void main(String[] args) {

        // ParseInt Method of Integer class
        String st = "718";
        System.out.println(st);
        int num = Integer.parseInt(st);
        System.out.println(num);


        // toString Method of String class
        String st1 = Integer.toString(num);
        System.out.println(st1);
        System.out.println(st1.length());


        // replace
        String str = "Gogan";
        String res = str.replace('o','a');
        System.out.println(str);
        System.out.println(res);

    }
}
