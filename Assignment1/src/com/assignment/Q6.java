package com.assignment;

import java.util.Scanner;

public class Q6 {

	public static int linearSearch(int arr[], int size, int key) {
		int j = -1;
		for (int i = 0; i < size; i++) {
			if (arr[i] == key) {
				j = i;
			}
		}

		return j;
	}

	public static void main(String[] args) {
		int arr[] = { 7, 4, 5, 2, 3, 1, 6, 6, 6, 6, 9 };

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the key to search - ");
		int key = sc.nextInt();

		int index = linearSearch(arr, arr.length, key);
		if (index >= 0)
			System.out.print("The key is at index - " + index);
		else
			System.out.print("The key is not present in the array");

	}
}
