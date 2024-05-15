package com.linkedlist;

public class LinearLinkedListMain {

	public static void main(String[] args) {
		LinearLinkedList l1 = new LinearLinkedList();
		
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		l1.addLast(50);
		
//		l1.deleteLast();
//		l1.deleteFirst();		
		l1.addAfterNode(80, 8);

		l1.display();
	}
}
