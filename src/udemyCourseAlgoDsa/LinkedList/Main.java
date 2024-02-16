package udemyCourseAlgoDsa.LinkedList;


public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        System.out.println("LL before remove():");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(2).value);
        System.out.println("LL after remove() in middle:");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(0).value);
        System.out.println("LL after remove() of first node:");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(2).value);
        System.out.println("LL after remove() of last node:");
        myLinkedList.printList();
        ;


//        System.out.println("LL before insert():");
//        myLinkedList.printList();
//
//        myLinkedList.insert(1, 2);
//
//        System.out.println("\nLL after insert(2) in middle:");
//        myLinkedList.printList();
//
//        myLinkedList.insert(0, 0);
//
//        System.out.println("\nLL after insert(0) at beginning:");
//        myLinkedList.printList();
//
//        myLinkedList.insert(4, 4);
//
//        System.out.println("\nLL after insert(4) at end:");
//        myLinkedList.printList();
//
//        System.out.println("Linked List before set():");
//        myLinkedList.printList();
//
//        myLinkedList.set(2, 99);
//
//        System.out.println("\nLinked List after set():");
//        myLinkedList.printList();
//
//
//        System.out.println(myLinkedList.get(3).value);
//
//
//        myLinkedList.printAll();
//        // (2) Items - Returns 2 Node
//        System.out.println(myLinkedList.removeLast().value);
//        // (1) Item - Returns 1 Node
//        System.out.println(myLinkedList.removeLast().value);
//        // (0) Items - Returns null
//        System.out.println(myLinkedList.removeLast());
//
//
//
//        System.out.println("Before prepend():");
//        System.out.println("-----------------");
//        myLinkedList.printAll();
//
//        myLinkedList.prepend(1);
//
//        System.out.println("\n\nAfter prepend():");
//        System.out.println("----------------");
//        myLinkedList.printAll();
//
//        // (2) Items - Returns 2 Node
//        System.out.println(myLinkedList.removeFirst().value);
//        // (1) Item - Returns 1 Node
//        System.out.println(myLinkedList.removeFirst().value);
//        // (0) Items - Returns null
//        System.out.println(myLinkedList.removeFirst());
//    }

    }
}
