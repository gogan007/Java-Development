import java.util.Scanner;

public class PlaceTiles {

    public static int claculateTilesPlacements(int m, int n) {

        if (m == n) {
            return 2;
        }

        if (m < n) {
            return 1;
        }

        // Calculates verticlly placements
        int vertiPlace = claculateTilesPlacements(m-n, n);

        // Calculates horizontally placements
        int horiPlace = claculateTilesPlacements(m-1, n);

        return vertiPlace + horiPlace;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int m = sc.nextInt();

        System.out.print("Enter columns : ");
        int n = sc.nextInt();

        int totalPlacements = claculateTilesPlacements(m, n);

        System.out.println("Total Placements for Grid : " + m + "*" + n + " is : " + totalPlacements);

        sc.close();
    }
}