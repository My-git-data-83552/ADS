package com.doublycircularlinkedlist;

public class DoublyCircularLinkedListMain {

	public static void main(String[] args) {
		Stack s = new Stack();

		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.peek());// 10,20,30,40
		// LIFO
		s.pop();
		System.out.println(s.peek());// 10,20,30
	}
}
