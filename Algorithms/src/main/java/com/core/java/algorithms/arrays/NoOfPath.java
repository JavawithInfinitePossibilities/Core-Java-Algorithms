/**
 * 
 */
package com.core.java.algorithms.arrays;

/**
 * @author Siddhant sahu
 *
 */
public class NoOfPath {
	public int count(int[][] arr, int row, int col) {
		if (row == arr.length - 1 || col == arr.length - 1) {
			return 1;
		}
		return count(arr, row + 1, col) + count(arr, row, col + 1);
	}

	public int countDP(int[][] arr) {
		int[][] result = new int[arr.length][arr.length];

		result[0][0] = 1;

		for (int i = 0; i < result.length; i++) {
			result[0][i] = 1;
		}
		for (int i = 0; i < result.length; i++) {
			result[i][0] = 1;
		}
		for (int i = 1; i < result.length; i++) {
			for (int j = 1; j < result.length; j++) {
				result[i][j] = result[i - 1][j] + result[i][j - 1];
			}
		}
		return result[arr.length - 1][arr.length - 1];
	}
}
