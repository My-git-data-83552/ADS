package com.linkedlist;

public class CircularLinkedListMain {

	public static void main(String[] args) {
		CircularLinkedList c1 = new CircularLinkedList();

		c1.addFirst(30);
		c1.addFirst(20);
		c1.addFirst(10);
		c1.display();
//		System.out.println("done");
		c1.addLast(40);
		c1.display();

	}
}
