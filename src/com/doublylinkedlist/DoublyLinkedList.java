package com.doublylinkedlist;

public class DoublyLinkedList {

	private Node head;
	private Node tail;
	int size;

	public boolean isEmpty() {
		return head == null;
	}

	public int getSize() {
		return size;
	}

	public void insertAtHead(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			head.prev = node;
			node.next = head;
			head = node;
		}
		size++;
	}

	public void insertAtTail(int value) {
		Node node = new Node(value);
		if (tail == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
		size++;
	}

	public void insertAtIndex(int index, int value) {
		if (index == 0) {
			insertAtHead(value);
		} else {
			Node current = head;
			int currIndex = 0;
			while (current != null && currIndex != index - 1) {
				current = current.next;
				currIndex++;
			}
			if (current == null) {
				insertAtTail(value);
			} else {
				Node node = new Node(value);
				node.next = current.next;
				node.prev = current;
				current.next.prev = node;
				current.next = node;
			}
		}
		size++;
	}

	public void removeAtHead() {
		if (head == null) {
			return;
		}
		if (head == tail) {
			head = null;
			tail = null;
			size--;
			return;
		}
		head = head.next;
		head.prev = null;
		size--;
	}

	public void removeAtTail() {
		if (tail == null) {
			return;
		}
		if (head == tail) {
			head = null;
			tail = null;
			size--;
			return;
		}
		Node node = tail;
		Node prev = tail.prev;
		prev.next = null;
		node.prev = null;
		size--;
	}

	public void removeAtIndex(int index) {
		if (index == 0) {
			removeAtHead();
			return;
		}
		if (index == size - 1) {
			removeAtTail();
			return;
		}
		Node curr = head;
		int currIndex = 0;
		while (curr != null && currIndex != index - 1) {
			curr = curr.next;
			currIndex++;
		}
		Node node = curr.next.next;
		curr.next = node;
		node.prev = curr;
	}

	public void show() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.value + " ");
			curr = curr.next;
		}
	}

}
