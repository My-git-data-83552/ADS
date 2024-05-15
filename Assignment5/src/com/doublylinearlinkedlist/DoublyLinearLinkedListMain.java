package com.doublylinearlinkedlist;

public class DoublyLinearLinkedListMain {

	public static void main(String[] args) {
		Deque deque=new Deque();
		
		deque.push_back(10);
		deque.push_back(20);
		deque.push_back(30);
		deque.push_back(40);
		
//		deque.pop_front();
		
		System.out.println(deque.peek_back());//
		System.out.println(deque.peek_front());//
		
		deque.push_front(05);
		System.out.println(deque.peek_front());
		System.out.println(deque.peek_back());
		
		
	}
}
