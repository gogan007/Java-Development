public class CircularQueue {

    class Queue {
        int arr[];
        int size;
        int rear = -1;
        int front = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        // Check for empty Queue
        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // Check for full Queue
        public boolean isFull() {
            return (rear+1) % size == front;
        }

        // Enque operation
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full.");
                return;
            }
            // 1st element in Queue
            if (front == -1){
                front = 0;
            }

            rear = (rear+1) % size;
            arr [rear] = data;
        }

        // Dequeue operation
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty.");
                return -1;
            }

            int result = arr [front];
            if (front == rear) {
                rear = front = -1;
            }
            else {
                front = (front+1) % size;
            }
            return result;
        }

        // Peek operation
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty.");
                return -1;
            }
            return arr [front];
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
        
        CircularQueue obj = new CircularQueue();
        Queue q = obj.new Queue(4);

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
 