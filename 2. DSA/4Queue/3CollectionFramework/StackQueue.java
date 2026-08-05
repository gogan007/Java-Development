import java.util.Stack;

public class StackQueue {

    static class SQueue {

        static Stack <Integer> s1 = new Stack<>();
        static Stack <Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // Enque
        public static void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // Dequeue
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            return s1.pop();
        }

        // Peek operation
        // Dequeue
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            return s1.peek();
        }
    }
    public static void main(String[] args) {

        // Queue <Integer> q = new LinkedList<>();
        SQueue q = new SQueue();
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
