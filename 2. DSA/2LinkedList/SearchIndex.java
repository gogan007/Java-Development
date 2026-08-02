// Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.

public class SearchIndex {

    Node head;
    private int size;

    SearchIndex () {
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
    public void addLast(int data){
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

    // Search index of element
    public void searchEle(int ele) {
        int index = 0;
        Node currNode = head;
        while (currNode != null) {
            if (currNode.data == ele) {
                System.out.println(ele + " found at position " + index);
                return;
            }
            else {
                currNode = currNode.next;
                index++;
            }
        }
        System.out.println(ele + " is not in list.");
    }


    // Return size of linked list
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {

        SearchIndex num = new SearchIndex();

        num.addLast(1);
        num.addLast(5);
        num.addLast(7);
        num.addLast(3);
        num.addLast(8);
        num.addLast(2);
        num.addLast(3);

        num.printList();

        num.searchEle(7);
    }
}