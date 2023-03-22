package MyLinkedList_BTH2;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList addFirst = new MyLinkedList(10);
        addFirst.addFirst(11);
        addFirst.addFirst(12);
        addFirst.addFirst(13);

        addFirst.add(4,9);
        addFirst.add(4,9);
        addFirst.printList();
    }
}
