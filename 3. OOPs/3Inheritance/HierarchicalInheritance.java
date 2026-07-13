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

class Square extends Shape {
    
    public void area (int side){
        System.out.println(side*side);
    }
}

class Circle extends Shape {
    
    public void area (int r){
        System.out.println(3.14*r*r);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        
        Square sq = new Square();
        sq.area();
        sq.area(7);

        System.out.println();

        Circle c = new Circle();
        c.area();
        c.area(7);
    }
}
