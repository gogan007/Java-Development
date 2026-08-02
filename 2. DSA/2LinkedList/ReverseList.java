public class ReverseList {

    Node head;
    private int size;

    ReverseList () {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add node in linked list
    // Add First
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add last
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

    // Delete node from linked list
    // Delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        size--;
        head = head.next;
    }

    // Delete Last
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondlast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            secondlast = secondlast.next;
            lastNode = lastNode.next;
        }
        secondlast.next = null;
    }

    // Return size of linked list
    public int getSize() {
        return size;
    }


    // Reverse LinkeedList
    public void reverseList() {

        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // Update
            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args) {

        ReverseList num = new ReverseList();

        num.addFirst(3);
        num.addLast(7);
        num.addLast(10);
        num.addLast(18);
        num.addLast(45);

        num.printList();

        num.reverseList();
        num.printList();

    }
}
