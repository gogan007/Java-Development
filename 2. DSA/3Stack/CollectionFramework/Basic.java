import java.util.Stack;

public class Basic {
    public static void main(String[] args) {
        Stack <Integer> num = new Stack<>();

        num.push(7);
        num.push(18);
        num.push(3);
        num.push(45);
        num.push(8);

        while (!(num.isEmpty())) {
            System.out.print(num.peek() + " --> ");
            num.pop();
        }
        System.out.println("null");
    }
}
