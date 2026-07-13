class Student {
    String name; // Class data
    int age;

    public void write() { // class Member
        System.out.println("Student is studying.....");
    }

    public void printInfo() {
        System.out.println("Student's name is : " + this.name);
        System.out.println("Student's age is : " + this.age);
    }
}

public class This1 {
    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student();

        st1.name = "Gogan";
        st1.age = 22;

        st2.name = "Ridham";
        st2.age = 20;

        st1.printInfo();
        st2.printInfo();

    }
}
