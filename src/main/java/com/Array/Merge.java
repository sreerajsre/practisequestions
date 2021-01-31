package com.Array;

/* Java program for Merge Sort */
class MergeSort {
	// Merges two subarrays of arr[]. 
	// First subarray is arr[l..m] 
	// Second subarray is arr[m+1..r] 
	void merge(int arr[], int lowptr, int highptr, int upperbound) { 
		// Find sizes of two subarrays to be merged 
		int[] workspace = new int[arr.length];
		int j = 0;
		int lowerBound= lowptr;
		int mid = highptr - 1;
		int n = upperbound - lowerBound + 1;
		while(lowptr<=mid && highptr <= upperbound) {
			if(arr[lowptr] < arr[highptr])
				workspace[j++] = arr[lowptr++];
			else
				workspace[j++] = arr[highptr++];
		}
		while(lowptr <=mid) {
			workspace[j++] = arr[lowptr++];
		}
		while(highptr <=upperbound) {
			workspace[j++] = arr[highptr++];
		}
		
		for(j=0;j<n;j++) {
			arr[lowerBound+j] = workspace[j];
		}
	} 

	// Main function that sorts arr[l..r] using 
	// merge() 
	void sort(int arr[], int l, int r) { 
		if (l < r) { 
			// Find the middle point 
			int m = (l+r)/2; 

			// Sort first and second halves 
			sort(arr, l, m); 
			sort(arr , m+1, r); 

			// Merge the sorted halves 
			merge(arr, l, m+1, r); 
		} 
	} 
}

public class Merge {

	/* A utility function to print array of size n */
	static void printArray(int arr[]){ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 
	public static void main(String args[]) { 
		int arr[] = {12, 11, 13, 5, 6, 7}; 

		System.out.println("Given Array"); 
		printArray(arr); 

		MergeSort ob = new MergeSort(); 
		ob.sort(arr, 0, arr.length-1); 

		System.out.println("\nSorted array"); 
		printArray(arr); 
	}
}
/* This code is contributed by Rajat Mishra */

