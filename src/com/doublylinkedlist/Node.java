package com.doublylinkedlist;

public class Node {

	int value;
	Node next;
	Node prev;

	public Node() {
		super();
	}
	
	public Node(int value) {
		super();
		this.value = value;
	}

	public Node(int data, Node next, Node prev) {
		super();
		this.value = data;
		this.next = next;
		this.prev = prev;
	}

}
