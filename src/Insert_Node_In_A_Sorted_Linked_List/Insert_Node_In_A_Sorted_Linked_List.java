package Insert_Node_In_A_Sorted_Linked_List;

public class Insert_Node_In_A_Sorted_Linked_List {

	Node head;
	int size;

	public static void main(String[] args) {

		Insert_Node_In_A_Sorted_Linked_List list = new Insert_Node_In_A_Sorted_Linked_List();

		list.insertAtTail(3);
		list.insertAtTail(5);
		list.insertAtTail(7);
		list.insertAtTail(9);
		list.insertAtTail(11);

		list.insertNodeInASortedLinkedList(8);

	}

	public void insertNodeInASortedLinkedList(int data) {

		show(head);
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.getNext() != null && n.getNext().getData() < data) {
				n = n.getNext();
			}
			node.setNext(n.getNext());
			n.setNext(node);
		}
		size++;
		show(head);
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

	public void show(Node node) {
		while (node != null) {
			System.out.print(node.getData() + " ");
			node = node.getNext();
		}
		System.out.println();
	}

}
