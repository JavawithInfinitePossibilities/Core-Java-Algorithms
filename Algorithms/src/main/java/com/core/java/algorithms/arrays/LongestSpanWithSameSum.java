/**
 * 
 */
package com.core.java.algorithms.arrays;

import java.util.Arrays;

/**
 * @author Siddhant sahu
 *
 */
public class LongestSpanWithSameSum {
	public int longestCommonSum(int[] arr1, int[] arr2, int length) {
		int maxLen = 0;
		for (int i = 0; i < length; i++) {
			int sumArr1 = 0, sumArr2 = 0;
			for (int j = i; j < length; j++) {
				sumArr1 += arr1[j];
				sumArr2 += arr2[j];
				if (sumArr1 == sumArr2) {
					int len = j - i + 1;
					if (len > maxLen) {
						maxLen = len;
					}
				}
			}
		}
		return maxLen;
	}

	public int longestCommonSum(int[] arr1, int[] arr2, int length, boolean status) {
		int[] tempArr = new int[(2 * length) + 1];
		Arrays.fill(tempArr, -1);
		int maxLen = 0, preSum1 = 0, preSum2 = 0;
		for (int i = 0; i < length; i++) {
			preSum1 += arr1[i];
			preSum2 += arr2[i];
			int currentDiff = preSum1 - preSum2;
			int diffIndex = length + currentDiff;
			if (currentDiff == 0) {
				maxLen = i + 1;
			} else if (tempArr[diffIndex] == -1) {
				tempArr[diffIndex] = i;
			} else {
				int len = i - tempArr[diffIndex];
				if (len > maxLen) {
					maxLen = len;
				}
			}
		}
		return maxLen;
	}
}
