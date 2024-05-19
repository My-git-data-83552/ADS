package com.rev.stack;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingStackTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of stack - ");
		int size = sc.nextInt();

		DescendingStack s = new DescendingStack(size);

		int choice;

		do {
			System.out.println("0. EXIT ");
			System.out.println("1. PUSH ");
			System.out.println("2. POP");
			System.out.println("3. PEEK");
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

			default:
				System.out.println("Wrong choice...");
				break;
			}
			System.out.println();
		} while (choice != 0);
	}

}
