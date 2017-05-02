/**
 * 
 */
package com.core.java.algorithms;

import java.util.Arrays;

import com.core.java.algorithms.arrays.ReverseArray;

/**
 * @author Siddhant sahu
 *
 */
public class TestReverseArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4 };
		ReverseArray array = new ReverseArray();
		System.out.println("Original Array" + Arrays.toString(a));
		array.reverseIteration(a);
		System.out.println("Reversed - Array(Iteration):" + Arrays.toString(a));
		array.reverseRecursive(a, 0, a.length - 1);
		System.out.println("Reversed Again - Array(Recursion):" + Arrays.toString(a));
	}

}
