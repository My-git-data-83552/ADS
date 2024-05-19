package com.insertionsort;

public class Q4LinearQueue {
	private int front;
	private int rear;
	private final int SIZE;
	private int arr[];

	public Q4LinearQueue(int size) {
		SIZE = size;
		rear = front = 0;
		arr = new int[SIZE];
	}

	public void push(int value) {
		arr[++rear] = value;
//		rear++;
	}

	public void pop() {
		front++;
	}

	public int peek() {
		return arr[front + 1];
	}

	public boolean isEmpty() {
		return front == rear;
	}

	public boolean isFull() {
		return rear < SIZE;
	}
}
