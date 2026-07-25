class Student { 
   static String college; 
   String name;    
} 
 
public class Static { 
   public static void main(String args[]) { 

       Student.college = "GEC Gandhinagr"; 

       Student s1 = new Student(); 
       Student s2 = new Student(); 
 
       s1.name = "Gogan"; 
       s2.name = "Ridham"; 
 
       System.out.println(s1.name + " --> " + s1.college); 
       System.out.println(s2.name + " --> " + s2.college); 
   } 
} 