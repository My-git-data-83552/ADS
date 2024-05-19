package com.rev.stack;

public class DescendingStack {
	private int arr[];
	private final int SIZE;
	private int top;
	
	public DescendingStack(int size) {
		SIZE=size;
		arr= new int[SIZE];
		top=SIZE;
	}
	
	public void push(int value) {
		top--;
		arr[top]=value;
	}
		
	public int pop() {
		return arr[top++];
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top==SIZE;
	}
	public boolean isFull() {
		return top==0;
	}
}
