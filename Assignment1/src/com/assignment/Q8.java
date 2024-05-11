package com.assignment;

import java.util.Scanner;

public class Q8 {

	public static int rankOfInteger(int arr[],int key) {
		
		
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the key to search - ");
		int key = sc.nextInt();
		
		int index = rankOfInteger(arr, key);
		if (index >= 0)
			System.out.print("The key is at index - " + index);
		else
			System.out.print("The key is not present in the array");
	}
}
