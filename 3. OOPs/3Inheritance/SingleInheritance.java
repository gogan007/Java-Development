class Shape {

   public void area() {
       System.out.println("Displays Area of Shape");
   }
}

class Triangle extends Shape {
   public void area(int h, int b) {
       System.out.println((1.0/2)*b*h);
   }  
}

public class SingleInheritance {
    public static void main(String[] args) {
        
        Shape shape1 = new Shape();
        shape1.area();

        Triangle t1 = new Triangle();
        t1.area();
        t1.area(7, 3);
    }
}
