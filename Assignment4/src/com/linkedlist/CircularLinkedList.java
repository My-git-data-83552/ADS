package com.linkedlist;

public class CircularLinkedList {

	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node tail;

	public CircularLinkedList() {
		tail = null;
	}

	public boolean isEmpty() {
		return tail == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			tail = newnode;
			newnode.next = newnode;
		} else {
			newnode.next = tail.next;
			tail.next = newnode;
		}
	}

	public void display() {
		Node trav = tail.next;
		do {
			System.out.print(trav.data+"\t");
			trav = trav.next;

		} while (trav != tail.next);
		System.out.println();
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			tail = newnode;
			newnode.next = newnode;
		} else {
			newnode = tail.next;
			tail.next = newnode;
			tail = newnode;
		}
	}
}
