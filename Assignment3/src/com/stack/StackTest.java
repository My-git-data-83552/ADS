package com.stack;

import java.util.Arrays;
import java.util.Scanner;

public class StackTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of stack - ");
		int size = sc.nextInt();

		Stack s = new Stack(size);

		int choice;

		do {
			System.out.println("0. EXIT ");
			System.out.println("1. PUSH ");
			System.out.println("2. POP");
			System.out.println("3. PEEK");
			System.out.println("4. Find Maximum value in the stack");
			System.out.println("5. Reverse the array");
			System.out.print("Enter your choice - ");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you!");
				break;

			case 1:
				int value;
				System.out.print("Enter the value to push - ");
				value = sc.nextInt();
				if (!s.isFull()) {
					s.push(value);
					System.out.println("Element pushed!!!");
				} else
					System.out.println("stack is full...");

				break;

			case 2:
				if (!s.isEmpty()) {
					s.pop();
					System.out.println("Element popped!!!");
				} else
					System.out.println("stack is empty...");

				break;

			case 3:
				if (!s.isEmpty())
					System.out.println("Value at Top is - " + s.peek());
				else
					System.out.println("stack is empty...");
				break;

			case 4:
				// Insert 5 elements in stack and find maximum value in stack without traversing
				// it.
				System.out.println("maximum value in stack = " + s.findMaxValue());
				break;

			case 5:
				int arr[] = { 1, 2, 3, 4, 5 };
				int length = arr.length;

				int revArr[] = new int[length];

				for (int i = 0; i < length; i++) {
					s.push(arr[i]);
				}
				for (int i = 0; i < length; i++) {
					revArr[i] = arr[s.pop()];
				}
				System.out.println(Arrays.toString(revArr));
				break;

			default:
				System.out.println("Wrong choice...");
				break;
			}

		} while (choice != 0);
	}

}
