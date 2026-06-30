import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size : ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for (int i=0;i<size;i++) {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }
    
}
