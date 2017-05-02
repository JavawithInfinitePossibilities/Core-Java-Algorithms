/**
 * 
 */
package com.core.java.algorithms.arrays;

import java.util.Arrays;

/**
 * @author Siddhant sahu
 *
 */
public class SnakeSequence {

	public int getMaxSequence(int[][] matrix) {
		System.out.println(Arrays.deepToString(matrix));
		int row = matrix.length;
		int col = matrix[0].length;
		int maxLength = 1;
		int maxRow = 0;
		int maxCol = 0;

		int[][] result = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				result[i][j] = 1;
			}
		}
		System.out.println(Arrays.deepToString(result));
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i != 0 || j != 0) {
					if (i > 0 && Math.abs(matrix[i][j] - matrix[i - 1][j]) == 1) {
						result[i][j] = Math.max(result[i][j], result[i - 1][j] + 1);
						if (maxLength < result[i][j]) {
							maxLength = result[i][j];
							maxRow = i;
							maxCol = j;
						}
					}
					if (j > 0 && Math.abs(matrix[i][j] - matrix[i][j - 1]) == 1) {
						result[i][j] = Math.max(result[i][j], result[i][j - 1] + 1);
						if (maxLength < result[i][j]) {
							maxLength = result[i][j];
							maxRow = i;
							maxCol = j;
						}
					}
				}
			}
		}
		System.out.println("Max Snake Sequence : " + maxLength);
		printPath(matrix, result, maxLength, maxRow, maxCol);
		return 0;
	}

	private void printPath(int[][] matrix, int[][] result, int maxLength, int maxRow, int maxCol) {
		int len = maxLength;
		while (maxLength >= 1) {
			System.out.print(" - " + matrix[maxRow][maxCol]);
			if ((maxRow > 0) && Math.abs(result[maxRow - 1][maxCol] - result[maxRow][maxCol]) == 1) {
				maxRow--;
			} else if ((maxCol > 0) && Math.abs(result[maxRow][maxCol - 1] - result[maxRow][maxCol]) == 1) {
				maxCol--;
			}
			maxLength--;
		}
	}
}
