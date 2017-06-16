/**
 * 
 */
package com.core.java.algorithms;

import com.core.java.algorithms.arrays.LongestSpanWithSameSum;

/**
 * @author Siddhant sahu
 *
 */
public class TestLongestSpanWithSameSum {
	public static void main(String[] args) {
		LongestSpanWithSameSum sameSum = new LongestSpanWithSameSum();
		int[] arr1 = { 0, 1, 0, 1, 1, 1, 1 };
		int[] arr2 = { 1, 1, 1, 1, 1, 0, 1 };
		System.out.println(sameSum.longestCommonSum(arr1, arr2, 7));
		System.out.println(sameSum.longestCommonSum(arr1, arr2, 7, false));
	}
}
