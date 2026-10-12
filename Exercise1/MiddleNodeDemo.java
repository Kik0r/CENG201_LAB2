package Exercise1;
//Yakup Bartu Başkaya
//240444051
//12.10.2026
/**
 * Demonstrates finding the middle node in odd- and even-sized lists.
 */
public class MiddleNodeDemo {
    public static void main(String[] args) {
        System.out.println("=== Find Middle Node Demo ===");
        System.out.println();

        SinglyLinkedList list1 = new SinglyLinkedList();
        for (int value = 1; value <= 5; value++) {
            list1.add(value);
        }
        //bunu yapıyor olması birşey değiştirmez dikkate alınmaz...................::::::DD:D::D:D
        //istersek herbirini tek tek 5 tane alt alta da ekleyebiliriz. ama for döngüsü ile eklemek daha kolay ve kısa oluyor.
        // list1.add(1);
        // list1.add(2); gibi
        System.out.println("List 1:");
        list1.display();
        Node middle1 = list1.findMiddle();
        System.out.println("Middle Node: " + (middle1 == null ? "NULL" : middle1.data));
        System.out.println();

        SinglyLinkedList list2 = new SinglyLinkedList();
        for (int value = 10; value <= 60; value += 10) {
            list2.add(value);
        }

        System.out.println("List 2:");
        list2.display();
        Node middle2 = list2.findMiddle();
        System.out.println("Middle Node: " + (middle2 == null ? "NULL" : middle2.data));
        System.out.println();
    }
}
