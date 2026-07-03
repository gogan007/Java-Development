// Insert a Character at Some Index

public class InsertDeleteChar {
   public static void main(String args[]) {

     StringBuilder str = new StringBuilder("Gogan");
     System.out.println(str);

     //Insert char
     str.insert(0, 'S');
     System.out.println(str);

     // Delete char
     str.delete(0, 1);
     System.out.println(str);

   }
}
