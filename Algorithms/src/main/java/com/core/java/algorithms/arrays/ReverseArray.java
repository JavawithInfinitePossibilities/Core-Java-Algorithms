/**
 * 
 */
package com.core.java.algorithms.arrays;

/**
 * @author Siddhant sahu
 *
 */
public class ReverseArray {
	public void reverseIteration(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		int temp;
		while (start <= end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public void reverseRecursive(int[] arr, int start, int end) {
		int temp;
		if (start <= end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			reverseRecursive(arr, start, end);
		}
	}
}
