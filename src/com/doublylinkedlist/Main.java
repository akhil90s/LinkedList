package com.doublylinkedlist;

public class Main {

	public static void main(String[] args) {

		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.insertAtHead(5);
		doublyLinkedList.insertAtHead(10);
		doublyLinkedList.insertAtHead(15);
		doublyLinkedList.insertAtHead(20);
		doublyLinkedList.insertAtHead(25);
		doublyLinkedList.insertAtIndex(1, 35);
		doublyLinkedList.insertAtTail(45);
		doublyLinkedList.show();
		System.out.println();
		doublyLinkedList.removeAtHead();
		doublyLinkedList.show();
		System.out.println();
		doublyLinkedList.removeAtTail();
		doublyLinkedList.show();
		System.out.println();
		doublyLinkedList.removeAtIndex(3);
		doublyLinkedList.show();

	}

}
