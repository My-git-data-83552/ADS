package com.circularqueue;

public class CircularQueue {

	private int arr[];
	private final int SIZE;
	private int rear, front, counter;

	

	public CircularQueue(int size) {
		SIZE = size;
		rear = front = -1;
		arr = new int[SIZE];

	}

	public void push(int value) {
		rear = (rear + 1) % SIZE;
		arr[rear] = value;
		counter++;
	}

	public int pop() {
		return (front + 1) % SIZE;
	}

	public int peek() {
		return arr[front];
	}

	public boolean isEmpty() {
		return front == rear && rear == -1;
	}

	public boolean isFull() {
		return front == rear && rear != -1;
	}
	public int getCounter() {
		return counter;
	}
}
