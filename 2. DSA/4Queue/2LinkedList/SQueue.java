public class SQueue {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class Queue {
        Node head = null;
        Node tail = null;

        // Check for empty Queue
        public boolean isEmpty() {
            return head == null && tail == null;
        }

        // Enque operation
        public void add(int data) {
            Node newNode = new Node(data);

            // 1st element
            if (tail == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // Dequeue operation
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty.");
                return -1;
            }

            int front = head.data;
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }

        // Peek operation
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty.");
                return -1;
            }
            return head.data;
        }

        // Display Queue
        public void printQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return;
            }

            // Code Here
        }
    }

    public static void main(String[] args) {
        
        SQueue obj = new SQueue();
        Queue q = obj.new Queue();

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
 