package noOriginal;

public class Main {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        LinkedList ll = new LinkedList(10);
        ll.addAtHead(11);
        ll.addAtHead(12);
        ll.addAtHead(13);
        ll.addAtTail(8);
        ll.addAtTail(7);
        ll.addAtIndex(4, 9);
        ll.addAtIndex(4, 9);
        ll.deleteAtIndex(4);
        ll.printList();
    }
}