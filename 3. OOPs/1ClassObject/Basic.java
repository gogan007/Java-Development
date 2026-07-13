class Student {
    String color; // Class data
    String type;

    public void write() { // class Member
        System.out.println("Pen is writting.....");
    }
}

public class Basic {
    public static void main(String[] args) {

        Student pen1 = new Student();

        pen1.name = "Blue";
        pen1.age = "Gel";

        pen1.write();

    }
}
