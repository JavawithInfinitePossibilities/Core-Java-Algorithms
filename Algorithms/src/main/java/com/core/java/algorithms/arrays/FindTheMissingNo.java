/**
 * 
 */
package com.core.java.algorithms.arrays;

/**
 * @author Siddhant sahu
 *
 */
public class FindTheMissingNo {

	public int getMissingNo(int[] array, int value) {
		int allSum = (value * (value + 1)) / 2;
		for (int i = 0; i < array.length; i++) {
			allSum -= array[i];
		}
		return allSum;
	}

	public int getMissingNoXOR(int[] array, int value) {
		int x = 1;
		for (int i = 1; i <= value; i++) {
			x ^= i;
		}
		int arrSum = 1;
		for (int i = 0; i < array.length; i++) {
			arrSum ^= array[i];
		}
		return x ^ arrSum;
	}
}
