/**
 * 
 */
package com.core.java.algorithms.arrays;

/**
 * @author Siddhant sahu
 *
 */
public class PrintAllDiagonals {
	public void print(int[][] arr) {
		int row = 0;
		int col;
		while (row < arr.length) {
			col = 0;
			int tempRow = row;
			while (tempRow >= 0) {
				System.out.print(arr[tempRow][col] + " ");
				tempRow--;
				col++;
			}
			row++;
			System.out.println();
		}

		col = 1;
		while (col < arr.length) {
			row = arr.length - 1;
			int tempCol = col;
			while (tempCol <= arr.length - 1) {
				System.out.print(arr[row][tempCol] + " ");
				tempCol++;
				row--;
			}
			col++;
			System.out.println();
		}
	}
}
