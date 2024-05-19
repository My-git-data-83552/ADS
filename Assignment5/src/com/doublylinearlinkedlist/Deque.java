package com.doublylinearlinkedlist;

public class Deque {
	DoublyLinearLinkedList l1;

	public Deque() {
		l1 = new DoublyLinearLinkedList();
	}

	public void push_back(int value) {
		l1.addLast(value);
	}

	public void push_front(int value) {
		l1.addFirst(value);
	}

	public void pop_front() {
		l1.deleteFirst();
	}

	public void pop_back() {
		l1.deleteLast();
	}
	public int peek_back() {
		return l1.getTailData();
	}
	public int peek_front() {
		return l1.getHeadData();
	}
	
}
