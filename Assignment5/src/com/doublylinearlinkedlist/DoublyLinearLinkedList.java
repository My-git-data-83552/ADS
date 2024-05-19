package com.doublylinearlinkedlist;

import java.util.Arrays;

public class DoublyLinearLinkedList {

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
	private Node tail;

	public DoublyLinearLinkedList() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	public void display() {
		Node trav = head;
		while (trav != null) {
			System.out.print(" " + trav.data);
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
			head.prev = newnode;
			head = newnode;
		}
	}

	public void deleteFirst() {
		if (isEmpty())
			return;
		else if (head.next == null)
			tail = head = null;
		else {
			head = head.next;
			head.prev = null;
		}
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (isEmpty())

			tail = head = newnode;
		else {
			newnode.prev = tail;
			tail.next = newnode;
			tail = newnode;
		}
	}

	public void deleteLast() {
		if (isEmpty())
			return;
		else if (head.next == null)
			tail = head = null;
		else {
			tail.prev.next = null;
			tail = tail.prev;
		}
	}

	public int getTailData() {
		return tail.data;
	}

	public int getHeadData() {
		return head.data;
	}

}
