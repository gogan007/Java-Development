import java.util.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class CQueue {
    public static void main(String[] args) {

        // Queue <Integer> q = new LinkedList<>();
        Queue <Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
    
        q.remove();

        q.add(5);

        System.out.println("Front of Queue is : " + q.peek());

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }

    }
}
