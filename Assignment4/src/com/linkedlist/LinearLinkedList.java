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

	private Node head;
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
			System.out.print(trav.data+" ");
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
		if(pos<1)
			return;
		
		Node trav = head;
		if (isEmpty())
			tail = head = newnode;
		else if(pos==1)
			addFirst(value);
		else {
			for (int i = 1; i < pos; i++) {
				trav = trav.next;
				if(trav==head && trav.next==null )
					return;
			}
			newnode.next = trav.next;
			trav.next = newnode;
		}
	}
}
