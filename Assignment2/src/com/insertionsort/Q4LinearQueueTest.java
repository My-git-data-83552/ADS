package com.insertionsort;

import java.util.Scanner;

public class Q4LinearQueueTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of queue - ");
		int size = sc.nextInt();

		Q4LinearQueue queue = new Q4LinearQueue(size);
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
				if (queue.isFull()) {
					queue.push(value);
					System.out.println("Element pushed!!!");
				} else
					System.out.println("Queue is full...");

				break;

			case 2:
				if (!queue.isEmpty()) {
					queue.pop();
					System.out.println("Element popped!!!");
				} else
					System.out.println("Queue is empty...");

				break;

			case 3:
				if (!queue.isEmpty())
					System.out.println("Value at front is - " + queue.peek());
				else
					System.out.println("Queue is empty...");
				break;

			default:
				System.out.println("Wrong choice...");
				break;
			}

		} while (choice != 0);
	}

}
