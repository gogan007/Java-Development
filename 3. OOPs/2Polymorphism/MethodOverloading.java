class Student {
   String name;
   int age;
  
   public void displayInfo(String name) {
       System.out.println("Name is : " + name);
   }

   public void displayInfo(int age) {
       System.out.println("Age is : " + age);
   }

   public void displayInfo(String name, int age) {
       System.out.println("Name is : " + name);
       System.out.println("Age is : " + age);
   }
}

public class MethodOverloading {
    public static void main(String[] args) {
        
        Student s7 = new Student();
        s7.name = "Thala";
        s7.age = 43;

        s7.displayInfo(s7.name);
        s7.displayInfo(s7.age);

        System.out.println();
        
        s7.displayInfo(s7.name, s7.age);

    }
    
}
