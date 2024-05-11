package com.assignment;

import java.util.Scanner;

public class Q2LinearSearch {

	public static int linearSearch(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 7, 4, 5, 2, 3, 1, 6 };

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the key to search - ");
		int key = sc.nextInt();

		int index = linearSearch(arr, key);
		if (index >= 0)
			System.out.print("The key is at index - " + index);
		else
			System.out.print("The key is not present in the array");

	}

}
