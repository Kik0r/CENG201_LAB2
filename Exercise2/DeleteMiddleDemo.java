package Exercise2;
//Yakup Bartu Başkaya
//240444051
//12.10.2026
/**
 * Demonstrates deleting the middle node from odd-, even-, and one-node lists.
 */
public class DeleteMiddleDemo {
    public static void main(String[] args) {
        System.out.println("=== Delete Middle Node Demo ===");
        System.out.println();

        SinglyLinkedList list1 = new SinglyLinkedList();
        for (int value = 1; value <= 5; value++) {
            list1.add(value);
        }
        SinglyLinkedList list2 = new SinglyLinkedList();
        for (int value = 10; value <= 60; value += 10) {
            list2.add(value);
        }
        
        System.out.println("Original List 1:");
        list1.display();
        list1.deleteMiddle();
        System.out.println("After deleting middle:");
        list1.display();
        System.out.println();

        

        System.out.println("Original List 2:");
        list2.display();
        list2.deleteMiddle();
        System.out.println("After deleting middle:");
        list2.display();
        System.out.println();

        SinglyLinkedList list3 = new SinglyLinkedList();
        list3.add(999);

        System.out.println("Original List 3:");
        list3.display();
        list3.deleteMiddle();
        System.out.println("After deleting middle:");
        list3.display();
    }
}
