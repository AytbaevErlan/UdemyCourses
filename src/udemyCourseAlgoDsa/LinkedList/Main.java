package udemyCourseAlgoDsa.LinkedList;


public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);

        System.out.println(myLinkedList.get(3).value);


        myLinkedList.printAll();
        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeLast().value);
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeLast().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeLast());


        System.out.println("Before prepend():");
        System.out.println("-----------------");
        myLinkedList.printAll();

        myLinkedList.prepend(1);

        System.out.println("\n\nAfter prepend():");
        System.out.println("----------------");
        myLinkedList.printAll();

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeFirst());
    }

}
