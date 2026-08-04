public class CheckCycle {

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

    // Add Cycle Node
    public void createCycle(int position) {

    if (head == null) {
        return;
    }

    Node cycleNode = null;
    Node currNode = head;
    int index = 1;

    while (currNode.next != null) {

        if (index == position) {
            cycleNode = currNode;
        }

        currNode = currNode.next;
        index++;
    }

    currNode.next = cycleNode;
}

    // Check list has poison (Cycle)
    public void isCycle() {

        if (head == null) {
            System.out.println("List is Empty. So there is no Cycle.");
            return;
        }

        if (head.next == null) {
            System.out.println("List has only 1 Node so there is no cycle.");
            return;
        }

        Node rabbit = head; // Fast
        Node turtle = head; // Slow


        while (rabbit != null && rabbit.next != null) {
            rabbit =  rabbit.next.next;
            turtle = turtle.next;
            if (rabbit == turtle) {
                System.out.println("List has Cycle.");
                return;
            }
        }
        System.out.println("List has not cycle.");
        return;
    }
     
    public static void main(String[] args) {

        CheckCycle num = new CheckCycle();

        num.addLast(3);
        num.addLast(7);
        num.addLast(10);
        num.addLast(18);
        num.addLast(45);
        num.addLast(8);

        System.out.print("Before linked list : ");
        num.printList();

        num.createCycle(4);

        num.isCycle();
    }
}