class Pen {
    String color; // Class data
    String type;

    public void write() { // class Member
        System.out.println("Pen is writting.....");
    }

    public void printColor() {
        System.out.println("Pen's color is : " + this.color);
    }
}

public class This {
    public static void main(String[] args) {

        Student pen1 = new Student();
        Student pen2 = new Student();

        pen1.name = "Blue";
        pen1.age = "Gel";

        pen2.name = "Black";
        pen2.age = "Ball Point";

        pen1.write();

        pen1.printInfo();
        pen2.printInfo();

    }
}
