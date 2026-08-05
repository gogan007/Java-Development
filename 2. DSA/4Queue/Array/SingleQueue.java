public class SingleQueue {

    class Queue {
        int arr[];
        int size;
        int rear = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        // Check for empty Queue
        public boolean isEmpty() {
            return rear == -1;
        }

        // Enque operation
        public void add(int data) {
            if (rear == size-1) {
                System.out.println("Queue is full.");
                return;
            }

            rear++;
            arr [rear] = data;
        }

        // Dequeue operation
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty.");
                return -1;
            }
            int front = arr [0];

            for (int i=0; i<rear; i++) {
                arr [i] = arr [i+1];
            }
            rear--;
            return front;
        }

        // Peek operation
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty.");
                return -1;
            }
            return arr [0];
        }

        // Display Queue
        public void printQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return;
            }

            for (int i=0; i<=rear; i++) {
                System.out.print(arr [i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        
        SingleQueue obj = new SingleQueue();
        Queue q = obj.new Queue(7);

        q.add(1);
        q.add(2);
        q.add(3);

        q.printQueue();
        System.out.println();
    
        q.remove();

        q.printQueue();
        System.out.println();

        System.out.println("Front of Queue is : " + q.peek());

    }
}
 