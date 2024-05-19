package com.insertionsort;

import java.util.Arrays;

//1. Write a insertion sort function to sort array and returns no of comparisions.

public class Q1InsertionSort {

	public static int insertionSort(int arr[]) {
		int temp, j; // declare variable required
		int passes = 0;
		int comparisons = 0;
		for (int i = 1; i < arr.length; i++) { // iterate for loop for passes
			temp = arr[i]; // store the value to check in temp variable
							// and compare to the number at left position

			j = i - 1; // initialize j in terms of i
			passes++;
			while (j >= 0 && arr[j] > temp) {

//another iteration, while loop considered as no. of iterations is not fixed.
//1st condition- for i-1 at i=0 j will become -1
//2nd condition- iterate until the position is appropriate. 
//left side is sorted so once temp is no longer smaller than the number at 
//left position it is at the right position

				if (temp < arr[j]) {
					arr[j + 1] = arr[j]; // shifting is done
					j--; // get j ready to check left position no.
				}
				comparisons++;
			}
			arr[j + 1] = temp;
		}
		return comparisons;
	}

	public static void main(String[] args) {
		int arr[] = { 8, 5, 7, 3, 6, 1, 5, 2 };
		System.out.println("Before Sort");
		System.out.println(Arrays.toString(arr));
		int comparisons = insertionSort(arr);
		System.out.println("After Sort");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Number of comparisons required = "+comparisons);
	}

}
