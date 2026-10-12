package Exercise2;
//Yakup Bartu Başkaya
//240444051
//12.10.2026
/**
 * Represents a singly linked list and provides a method to delete its middle node.
 */
public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public void deleteMiddle() {
        if (head == null) {
            return;
        }

        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        int middleIndex = count / 2;
        if (middleIndex == 0) {
            head = head.next;
            return;
        }

        current = head;
        for (int index = 0; index < middleIndex - 1; index++) {
            current = current.next;
        }
        current.next = current.next.next;
    }

    public Node getHead() {
        return head;
    }
}
