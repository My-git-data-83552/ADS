package com.insertionsort;

import java.util.Arrays;

//2. Modify the insertion sort algorithm to sort the array in descending order

public class Q2InsertionSortDesc {
	public static int insertionSort(int arr[]) {
		int j, temp;
		int comparisons = 0;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				if (temp < arr[j]) {
					arr[j + 1] = arr[j];
					j--;
				}
				comparisons++;
			}
			arr[j + 1] = temp;
		}
		return comparisons;
	}

	public static void main(String[] args) {
		int arr[] = { 6, 5, 4, 3, 2, 1 };
		System.out.println("Before Sort");
		System.out.println(Arrays.toString(arr));
		int comparisons = insertionSort(arr);
		System.out.println("After Sort");
		System.out.println(Arrays.toString(arr));

		System.out.println("Number of comparisons required = " + comparisons);
	}
}
