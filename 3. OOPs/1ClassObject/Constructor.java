class Student {
    String name; // Class data
    int age;

    // Non parametarize constructor
    Student () {
        System.out.println("Student is studying....");
    }

    // Parametarize construtor
    Student (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Student's name is : " + this.name);
        System.out.println("Student's age is : " + this.age);
    }

    // Copy constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }
}

public class Constructor {
    public static void main(String[] args) {
        
        Student s1 = new Student();

        Student s2 = new Student("Gogan", 21);

        Student s3 = new Student(s2);

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
    }
}