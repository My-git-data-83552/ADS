package com.doublycircularlinkedlist;

public class DoublyCircularLinkedList {
	static class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node(int value) {
			data = value;
			prev = next = null;
		}
	}

	private Node head;

	public DoublyCircularLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);

		if (isEmpty()) {
			head = newnode;
			newnode.next = newnode.prev = newnode;
		} else {
			newnode.prev = head.prev;
			newnode.next = head;
			
			head.prev.next = newnode;
			head.prev = newnode;
			head = newnode;
		}
	}

	public void addLast(int value) {
		Node newnode = new Node(value);

		if (isEmpty()) {
			head = newnode;
			newnode.next = newnode.prev = newnode;
		} else {
			newnode.prev = head.prev;
			newnode.next = head;

			head.prev.next = newnode;
			head.prev = newnode;
		}
	}

	public void forwardDisplay() {
		if (isEmpty())
			return;
		Node trav = head;
		do {
			System.out.print(" " + trav.data);
			trav = trav.next;
		} while (trav != head);
		System.out.println();
	}

	public void deleteFirst() {
		if (isEmpty())
			return;
		else if (head == head.next)
			head = null;
		else {
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head=head.next;
		}
	}
	public int getHeadData() {
		return head.data;
	}
}
