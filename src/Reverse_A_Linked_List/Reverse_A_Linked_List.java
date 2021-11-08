package Reverse_A_Linked_List;

public class Reverse_A_Linked_List {

    Node head;
    int size;

    public static void main(String[] args) {

        Reverse_A_Linked_List list = new Reverse_A_Linked_List();
        list.insertAtTail(3);
        list.insertAtTail(5);
        list.insertAtTail(7);
        list.insertAtTail(9);
        list.insertAtTail(11);

        list.reverseLinkedList();

    }

    public void reverseLinkedList() {

        // initially current is head
        Node current = head;
        show(current);
        // initially prev is null
        Node prev = null;

        while (current != null) {
            // Save the next node
            Node next = current.getNext();
            // Make the current node point to the prev node
            current.setNext(prev);
            // update prev
            prev = current;
            // update current
            current = next;
        }
        show(prev);
    }

    public void insertAtTail(int data) {

        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.getNext() != null) {
                n = n.getNext();
            }
            n.setNext(node);
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public void show(Node node) {
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

}
