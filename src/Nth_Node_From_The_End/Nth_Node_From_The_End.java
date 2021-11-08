package Nth_Node_From_The_End;

import Middle_Element_Linked_List.Node;

public class Nth_Node_From_The_End {

	Node head;
	int size;

	public static void main(String[] args) {

		Nth_Node_From_The_End list = new Nth_Node_From_The_End();
		list.insertAtTail(3);
		list.insertAtTail(5);
		list.insertAtTail(7);
		list.insertAtTail(9);
		list.insertAtTail(11);

		list.show();
		System.out.println();
		int result = list.getNthNodeFromLast(list, 3);
		System.out.println(result);
	}

	
	public int getNthNodeFromLast(Nth_Node_From_The_End list, int n) {

		int indexFromStart = size - n;
		Node node = head;
		for (int i = 0; i < indexFromStart - 1; i++) {
			node = node.getNext();
		}
		return node.getData();
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

}
