// Append a chars
// Append means to add something at the end.

public class AppendChar {
   public static void main(String args[]) {

     StringBuilder str = new StringBuilder("Gogan");
     System.out.println(str);

     str.append(" Karmur");
     System.out.println(str); 


     // Length
    int size = str.length();
    System.out.println(size);

   }
}
