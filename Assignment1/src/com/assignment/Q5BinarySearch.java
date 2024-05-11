package com.assignment;

import java.util.Scanner;

public class Q5BinarySearch {

	public static int binarySearch(int arr[], int key) {

		int left = 0;
		int right = arr.length - 1;
		int mid;

		while (right >= left) {
			mid = (left + right) / 2;
			if (arr[mid] == key)
				return mid;
			else if (key < arr[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
//		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		int arr[] = { 50, 40, 30, 20, 10 };

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the key to search - ");
		int key = sc.nextInt();

		int index = binarySearch(arr, key);

		if (index >= 0)
			System.out.print("The key is at index - " + index);
		else
			System.out.print("The key is not present in the array or array is not sorted...");

	}
}
