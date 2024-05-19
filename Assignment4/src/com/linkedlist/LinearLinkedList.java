package com.linkedlist;

public class LinearLinkedList {

	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head; //did with only tail before 
	private Node tail;

	public LinearLinkedList() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return head == null && tail == null;

	}

	public void display() {
		Node trav = head;
		while (trav != null) {
			System.out.print(trav.data + " ");
			trav = trav.next;
		}
		System.out.println();
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = newnode;
			tail = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = newnode;
			tail = newnode;
		} else {
			tail.next = newnode;
			tail = newnode;
		}
	}

	public void deleteLast() {
		if (isEmpty()) {
			return;
		} else if (head == tail) {
			head = tail = null;
		} else {
			Node trav = head;
			while (trav.next.next != null)
				trav = trav.next;
			tail = trav.next;
			trav.next = null;
		}
	}

	public void deleteFirst() {
		if (isEmpty()) {
			return;
		} else if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
		}
	}

	public void addAfterNode(int value, int pos) {
		Node newnode = new Node(value);
		if (pos < 1)
			return;

		Node trav = head;
		if (isEmpty())
			tail = head = newnode;
		else if (pos == 1)
			addFirst(value);
		else {
			for (int i = 1; i < pos && trav.next != null; i++) {
				trav = trav.next;
				if (trav == head)
					return;
			}
			newnode.next = trav.next;
			trav.next = newnode;
			if (trav.next == null)
				tail = newnode;
		}
	}

	public void deleteAfterNode(int pos) {

		Node trav = head;
		if (pos < 1)
			return;

		if (isEmpty())
			return;
		else if (pos == 1)
			deleteFirst();
		else {
			for (int i = 1; i < pos && trav.next != null; i++)
				trav = trav.next;
			if (trav.next == null)
				deleteLast();
			else
				trav.next = trav.next.next;

		}
	}

	public void addSecondLast(int value) {
		Node newnode = new Node(value);
		Node trav = head;
		while (trav.next.next != null)
			trav = trav.next;
		newnode.next = trav.next;
		trav.next = newnode;
		if (trav.next == null)
			tail = newnode;
	}
	

	public Node getHead() {
		return head;
	}

	public void displayReverse(Node trav) {
		if (trav == null)
			return;
		displayReverse(trav.next);
		System.out.print(trav.data + " ");
	}
}
