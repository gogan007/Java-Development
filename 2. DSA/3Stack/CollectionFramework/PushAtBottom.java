import java.util.Stack;

public class PushAtBottom {

    public static void pushAtBottom(int data, Stack<Integer> s) {

        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack <Integer> num = new Stack<>();

        num.push(7);
        num.push(18);
        num.push(3);
        num.push(45);
        
        pushAtBottom(8, num);

        while (!(num.isEmpty())) {
            System.out.print(num.peek() + " ");
            num.pop();
        }
    }
}