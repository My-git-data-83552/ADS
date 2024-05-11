package com.assignment;

import java.util.Scanner;

public class Q7 {

	public static int repeatElements(int arr[]) {
		int num;
		for (int i = 0; i < arr.length; i++) {
			int flag = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					if (i == j)
						continue;
					num = arr[i];
					flag = 1;
				}
			}
			if (flag == 0)
				return arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };

		int index = repeatElements(arr);
		if (index >= 0)
			System.out.print("The key is at index - " + index);
		else
			System.out.print("The key is not present in the array");
	}
}
