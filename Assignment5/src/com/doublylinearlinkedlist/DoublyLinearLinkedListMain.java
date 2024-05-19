package com.doublylinearlinkedlist;

import java.util.Arrays;

public class DoublyLinearLinkedListMain {

	public static void main(String[] args) {
		Deque deque = new Deque();

//		deque.push_back(10);
//		deque.push_back(20);
//		deque.push_back(30);
//		deque.push_back(40);
//		deque.pop_front();
//		System.out.println(deque.peek_back());//
//		System.out.println(deque.peek_front());//
//		
//		deque.push_front(05);
//		System.out.println(deque.peek_front());
//		System.out.println(deque.peek_back());
//		
		String line = "haha huhu haha";
		String arr[] = line.split(" ");
		System.out.println(Arrays.toString(arr));

		HashTable hs = new HashTable(arr.length);
		for (int i = 0; i < arr.length - 1; i++)
			hs.put(arr[i], arr[i]);

		System.out.println(hs.get("huhu"));
		System.out.println(hs.getOccurance("huhu"));

	}
}
