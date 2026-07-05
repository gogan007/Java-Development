import java.util.Scanner;

public class Average {

    public static float calculateAverage(float a, float b, float c) {
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        float n1 = sc.nextFloat();

        System.out.print("Enter 2nd number : ");
        float n2 = sc.nextFloat();

        System.out.print("Enter 3rd number : ");
        float n3 = sc.nextFloat();

        float avg = calculateAverage(n1, n2, n3);

        System.out.println(avg);

        sc.close();
    }
}
