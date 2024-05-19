package com.linkedlist;

import java.util.Scanner;

public class LinearLinkedListMain {

	public static void main(String[] args) {
		LinearLinkedList l1 = new LinearLinkedList();

		int temp = 0, value;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter value(Enter 0 to cancel) = ");
			value = sc.nextInt();
			if (value == 0)
				break;
			if (value > temp)
				l1.addLast(value);
			else
				l1.addSecondLast(value);
			temp = value;
		} while (value != 0);

//		l1.addFirst(40);
//		l1.addFirst(30);
//		l1.addFirst(20);
//		l1.addFirst(10);
//		l1.addLast(50);
//		l1.display();

//		l1.deleteLast();
//		l1.deleteFirst();		
//		l1.addAfterNode(80, 8);
//		l1.deleteAfterNode(8);

		l1.display();
//		l1.displayReverse(l1.getHead());

	}
}
