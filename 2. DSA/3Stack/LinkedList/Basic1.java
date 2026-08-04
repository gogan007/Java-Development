public class Basic1 {
// Create Node
    public class Node {
    int data;
    Node next;
    
    public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public class Stack {
        
        Node head;
        
        // Check empty stack
        public boolean isEmpty() {
            return (head == null);
        }
        
        // Push operation in stack
        public void push(int data) {

            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        
        // Pop operation in stack
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        
        // Peek operation in stack
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
        
        // Display stack elements
        public void printStack() {
            Node currNode = head;
            while (currNode != null) {
                System.out.print(currNode.data + " --> ");
                currNode = currNode.next;
            }
            System.out.println("null");
            
        }
    }

    public static void main(String[] args) {

        Basic1 obj = new Basic1();
        Stack numbers = obj.new Stack();
        // Basic1.Stack numbers = obj.new Stack();

        numbers.push(3);
        numbers.push(7);
        numbers.push(8);
        numbers.push(10);
        numbers.push(18);
        numbers.push(45);
        numbers.push(48);
        numbers.push(99);

        numbers.printStack();

        numbers.pop();
        numbers.pop();

        numbers.printStack();

        System.out.println("Top of stack is : " + numbers.peek());
    }
}