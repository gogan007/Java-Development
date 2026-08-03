public class Palindrome {

    Node head;

    class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add node in linked list
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }   
        currNode.next = newNode;
    }

    // Display List
    public void printList() {
        if (head == null){
            System.out.println("List is Empty.");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Reverse Linked list
    public Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    // Find Middle
    public Node findMiddle() {
        Node rabbit = head;
        Node turtle = head;

        while (rabbit.next != null && rabbit.next.next != null) {
            rabbit = rabbit.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public void isPalindrome() {

        if (head == null || head.next == null) {
            System.out.println("List is Palindrome.");
            return;
        }

        Node middle = findMiddle(); // End of 1st half
        Node endHead = reverseList(middle.next); // endHead => Head of 2nd half

        Node currNode = head; // first half start
        while (endHead != null) {
            if (currNode.data != endHead.data) {
                System.out.println("List is not Palindrome.");
                return;
            }
            currNode = currNode.next;
            endHead = endHead.next;
        }
        System.out.println("List is Palindrome.");
    }



    public static void main(String[] args) {

        Palindrome num = new Palindrome();

        num.addLast(3);
        num.addLast(7);
        num.addLast(10);
        num.addLast(10);
        num.addLast(7);
        num.addLast(3);

        System.out.print("Before linked list : ");
        num.printList();

        num.isPalindrome();

        System.out.print("After linked list : ");
        num.printList();

    }
}