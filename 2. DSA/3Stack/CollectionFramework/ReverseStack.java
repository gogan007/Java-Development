import java.util.Stack;

public class ReverseStack {

    public static void pushAtBottom(int data, Stack<Integer> s) {

        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void reverse(Stack <Integer> s) {

        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }


    public static void main(String[] args) {
        Stack <Integer> num = new Stack<>();

        num.push(7);
        num.push(18);
        num.push(3);
        num.push(45);

        System.out.println(num);

        reverse(num);

        System.out.println(num);
    }
}