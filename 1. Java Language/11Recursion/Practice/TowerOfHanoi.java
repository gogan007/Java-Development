import java.util.Scanner;

public class TowerOfHanoi {

    public static void towerOfHanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("Move Disk " + n + " : " + source + " --> " + destination);
            return;
        }
        towerOfHanoi(n-1, source, destination, helper);
        System.out.println("Move Disk " + n + " : " + source + " --> " + destination);
        towerOfHanoi(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of Disks : ");
        int n = sc.nextInt();

        String source = "S";
        String helper = "H";
        String destination = "D";

        towerOfHanoi(n, source, helper, destination);

        sc.close();
    }
}
