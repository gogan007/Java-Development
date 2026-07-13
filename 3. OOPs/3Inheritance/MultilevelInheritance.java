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

class EquilateralTriangle extends Triangle {
   int side;
}

// class RightTriangle extends Triangle {
//    int side;
// }

public class MultilevelInheritance {
    public static void main(String[] args) {
        
        Shape shape0 = new Shape();
        shape0.area();

        System.out.println();

        Triangle t0 = new Triangle();
        t0.area();
        t0.area(7, 8);

        System.out.println();

        EquilateralTriangle t2 = new EquilateralTriangle();

        t2.area();
        t2.area(7, 5);
        
    }
}
