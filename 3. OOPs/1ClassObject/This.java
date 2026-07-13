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

        Pen pen1 = new Pen();
        Pen pen2 = new Pen();

        pen1.color = "Blue";
        pen1.type = "Gel";

        pen2.color = "Black";
        pen2.type = "Ball Point";

        pen1.write();

        pen1.printColor();
        pen2.printColor();

    }
}
