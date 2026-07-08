import java.util.Scanner;

public class InviteGuest {
    public static int callGuest(int m) {

        if (m <= 0) {
            return 1;
        }

        // Invite single guest
        int way1 = callGuest(m-1);

        // Invite in pair
        int way2 = (m-1) * callGuest(m-2);

        return way1 + way2;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Guest : ");
        int g = sc.nextInt();

        int totalWays = callGuest(g);

        System.out.println("Total ways to calling : " + g + " Guests is : " + totalWays);

        sc.close();
    }
}
