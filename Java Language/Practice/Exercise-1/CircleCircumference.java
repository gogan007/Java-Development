// Write a function that takes in the radius as input and returns the circumference of a circle. 

import java.util.Scanner;

public class CircleCircumference {

    public static double cc(int x) {
       return (2 * Math.PI * x);
    }
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of Circle : ");
        int r = sc.nextInt();

        double circumference = cc(r);

        System.out.println(circumference);

        sc.close();
    }
}
