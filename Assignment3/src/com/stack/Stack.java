package com.stack;

public class Stack {
	private int arr[];
	private final int SIZE;
	private int top;
	private int temp;
	
	public Stack(int size) {
		SIZE=size;
		arr= new int[SIZE];
		top=-1;
		temp=-1;
	}
	
	public void push(int value) {
		top++;
		arr[top]=value;
		if(value>temp)
			temp=value;
	}
	
	public int findMaxValue() {
		return temp;		
	}
	
	public int pop() {
		return arr[top--];
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==SIZE-1;
	}
}
