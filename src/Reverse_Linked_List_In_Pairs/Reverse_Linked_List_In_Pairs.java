package Reverse_Linked_List_In_Pairs;

public class Reverse_Linked_List_In_Pairs {

    static Node head;
    int size;

    public static void main(String[] args) {

        Reverse_Linked_List_In_Pairs list = new Reverse_Linked_List_In_Pairs();

        list.insertAtTail(3);
        list.insertAtTail(5);
        list.insertAtTail(7);
        list.insertAtTail(9);
        list.insertAtTail(11);

        list.swapPairs(head);

    }

    public Node swapPairs(Node head) {

        show(head);
        Node p = head;
        Node new_start = p.next;
        Node q, temp;
        while (true) {
            q = p.next;
            temp = q.next;
            q.next = p;
            if (temp == null || temp.next == null) {
                p.next = temp;
                break;
            }
            p.next = temp.next;
            p = temp;
        }
        show(new_start);
        return new_start;
    }

    public void insertAtTail(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public void show(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

}