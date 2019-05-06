package com.datastructure;

import java.util.Arrays;

/**
 * Java program to sort integer array using bubble sort sorting algorithm.
 * bubble sort is one of the simplest sorting algorithm but performance of
 * bubble sort is not good, its average and worst case performance ranges in
 * O(n2) and that's why it is not used to sort large set of unsorted data.
 * Bubble sort can be used for educational and testing purpose to sort small
 * number of data to avoid performance penalty. This program is also a good
 * example of how to print contents of Array in Java
 * 
 * @author http://java67.blogspot.com
 */
public class SortingTechniquies {

	public static void main(String args[]) {

		// testing our bubble sort method in Java
		int[] unsorted = { 32, 39, 21, 45, 23, 3 };
		bubbleSort(unsorted);
		selectionSort(unsorted);
		insertionSort(unsorted);

		// one more testing of our bubble sort code logic in Java
		int[] test = { 5, 3, 2, 1 };
		bubbleSort(test);
		selectionSort(test);

	}

	/*
	 * In bubble sort we need n-1 iteration to sort n elements at end of first
	 * iteration larget number is sorted and subsequently numbers smaller than
	 * that.
	 * Bubble sort is a simple sorting algorithm that works by repeatedly stepping through the list to be sorted, 
	 * comparing each pair of adjacent items and swapping them if they are in the wrong order. 
	 * The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted. 
	 * The algorithm gets its name from the way smaller elements bubble to the top of the list. 
	 * Because it only uses comparisons to operate on elements, it is a comparison sort. You can see the code implementation below:
	 * 
	 * http://www.java2novice.com/java-interview-programs/bubble-sort/
	 */
	public static void bubbleSort(int[] unsorted) {
		System.out.println("\nunsorted array before sorting : "
				+ Arrays.toString(unsorted));

		// Outer loop - need n-1 iteration to sort n elements
		for (int i = 0; i < unsorted.length - 1; i++) {

			// Inner loop to perform comparision and swapping between adjacent
			// numbers
			// After each iteration one index from last is sorted
			for (int j = 1; j < unsorted.length - i; j++) {

				// If current number is greater than swap those two
				if (unsorted[j - 1] > unsorted[j]) {
					int temp = unsorted[j];
					unsorted[j] = unsorted[j - 1];
					unsorted[j - 1] = temp;
				}
			}
			
		}
		System.out.printf("Bubble Sort : "+Arrays.toString(unsorted));
	}

	/**
	 * The selection sort is a combination of searching and sorting. 
	 * During each pass, the unsorted element with the smallest (or largest) value is moved to its proper position in the array. 
	 * The number of times the sort passes through the array is one less than the number of items in the array. 
	 * In the selection sort, the inner loop finds the next smallest (or largest) value and the outer loop places that value into its proper location.
	 * @param arr
	 */
	public static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[index])
					index = j;

			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		System.out.println("\nSelection Sort : " + Arrays.toString(arr));
	}
	
	 public static void insertionSort(int[] arr){
         
	        int temp;
	        for (int i = 1; i < arr.length; i++) {
	            for(int j = i ; j > 0 ; j--){
	                if(arr[j] < arr[j-1]){
	                    temp = arr[j];
	                    arr[j] = arr[j-1];
	                    arr[j-1] = temp;
	                }
	            }
	        }
	        System.out.println("insertions Sort : " + Arrays.toString(arr));
	    }
}
