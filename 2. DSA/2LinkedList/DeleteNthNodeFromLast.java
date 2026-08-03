public class DeleteNthNodeFromLast {

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

    // Remove Nth node from last in linked list
    public void removeNthFromLast(int n) {
        
        // Find size
        int size = 0;
        Node currNode = head;
        while (currNode != null) {
            size++;
            currNode = currNode.next;
        }

        if (n<1 || n>size) {
            System.out.println("Enter valid index.");
            return;
        }

        if (head == null) {
            System.out.println("list is empty.");
            return;
        }

        if (head.next == null) {
            head = head.next;
            return;
        }

        if (n == size) {
            head = head.next;
            return;
        }

        // Nth node from last = Size - n + 1
        // for that find previous of it..
        int index = size - n;
        Node preNode = head;
        int i = 1;
        while (i < index) {
            preNode = preNode.next;
            i++;
        }
        preNode.next = preNode.next.next;
        return;
    }


    public static void main(String[] args) {

        DeleteNthNodeFromLast num = new DeleteNthNodeFromLast();

        num.addLast(3);
        num.addLast(7);
        num.addLast(10);
        num.addLast(18);
        num.addLast(45);

        System.out.print("Before linked list : ");
        num.printList();

        num.removeNthFromLast(4);

        System.out.print("After linked list : ");
        num.printList();

    }
}