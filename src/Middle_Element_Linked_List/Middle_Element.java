package Middle_Element_Linked_List;

public class Middle_Element {

    Node head;
    int size;

    public static void main(String[] args) {

        Middle_Element main = new Middle_Element();
        main.insertAtTail(3);
        main.insertAtTail(5);
        main.insertAtTail(7);
        main.show();
        // main.middleElement();

    }

    // Middle Element Of The LinkedList
    public void middleElement() {

        Node n = head;
        Node result = head;
        while (n != null && n.getNext() != null) {
            n = n.getNext().getNext();
            result = result.getNext();
        }
        System.out.println();
        System.out.println("Middle Element : " + result.getData());

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
            size++;
        }

    }

    public void show() {
        Node n = head;
        if (head == null)
            return;
        System.out.print(n.getData() + " -> ");
        while (n.getNext() != null) {
            n = n.getNext();
            System.out.print(n.getData() + " -> ");
        }
    }

    public int getSize() {
        return size;
    }

}
