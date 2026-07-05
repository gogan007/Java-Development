public class Basic {
    public static void main(String[] args) {

        int[] marks = new int[3];

        // We can create array like this also
        // int marks[] = new int[3];

        // We can create array like this also
        // int [] marks = {92,74,68}

        marks[0] = 92; // Maths
        marks[1] = 74; // Phy
        marks[2] = 68; //Che

        // System.out.println(marks[0]);
        // System.out.println(marks[1]+ "\n" + marks[2]);

        System.out.println("Maths --> " + marks[0]);
        System.out.println("Phy --> " + marks[1]);
        System.out.println("Che --> " + marks[2]);

        System.out.println("Array printing using loop.");
        for (int i=0;i<3;i++) {
            System.out.println(marks[i]);
        }

    }
}
