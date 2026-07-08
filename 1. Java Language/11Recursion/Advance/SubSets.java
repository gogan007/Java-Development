import java.util.Scanner;
import java.util.ArrayList;

public class SubSets {
    public static void printSubsets(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubsets(subset);
            return;
        }

        // To be
        subset.add(n);
        findSubsets(n-1, subset);

        // To not be
        subset.remove(subset.size() - 1);
        findSubsets(n-1, subset);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        ArrayList <Integer> subSet = new ArrayList<>();

        findSubsets(n, subSet);

        sc.close();
    }

}
