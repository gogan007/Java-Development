// Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.

import java.util.Scanner;

public class DeleteGreater25 {

    Node head;
    private int size;

    DeleteGreater25() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add node in linked list
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
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
        if (head == null) {
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

    // Remove Node which data is more than 25
    public void removeMoreThan25() {

        while (head != null && head.data > 25) {
            head = head.next;
        }

        Node currNode = head;
        while (currNode != null && currNode.next != null) {
            if (currNode.next.data > 25) {
                currNode.next = currNode.next.next;
            }
            else {
                currNode = currNode.next;
            }
        }
    }

    // Return size of linked list
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DeleteGreater25 num = new DeleteGreater25();

        System.out.print("Enter size of Linked List : ");
        int size = sc.nextInt();

        System.out.println("Enter data range of 1-50");
        for (int i = 0; i < size; i++) {
            System.out.print(i + " --> ");
            num.addLast(sc.nextInt());
        }

        num.printList();
        num.removeMoreThan25();
        num.printList();

        sc.close();
    }
}