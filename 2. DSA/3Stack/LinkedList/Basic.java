public class Basic {

    // Create Node
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{

        static Node head;

        // Check empty stack
        public static boolean isEmpty() {
            return (head == null);
        }

        // Push operation in stack
        public static void push(int  data) {

            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // Pop operation in stack
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // Peek operation in stack
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        // Display stack elements
        public static void printStack() {
            Node currNode = head;
            while (currNode != null) {
                System.out.println(currNode.data);
                currNode = currNode.next;
            }
        }
    }


    public static void main(String[] args) {

        Stack.push(3);
        Stack.push(7);
        Stack.push(8);
        Stack.push(10);
        Stack.push(18);
        Stack.push(45);
        Stack.push(48);
        Stack.push(99);

        System.out.println("----------------------------");
        Stack.printStack();

        Stack.pop();
        Stack.pop();

        System.out.println("----------------------------");
        Stack.printStack();
        System.out.println("----------------------------");

        System.out.println("Top of stack is : " + Stack.peek());
    }
}