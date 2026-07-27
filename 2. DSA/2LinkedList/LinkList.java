public class LinkList {

    Node head;
    private int size;

    LinkList () {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node (String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add node in linked list
    // Add First
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add last
    public void addLast(String data) {
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

    public static void main(String[] args) {
        int size;

        LinkList list = new LinkList();

        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.addLast(".");
        list.printList();

        list.addFirst("This");
        list.printList();
        size = list.getSize();
        System.out.println("Size of Linked List is : " + size);

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
        size = list.getSize();
        System.out.println("Size of Linked List is : " + size);

    }
}
