/**
 * 
 */
package com.core.java.algorithms.arrays;

/**
 * @author Siddhant sahu
 *
 */
public class FindTheNoInMetrix {
	public void getPositionOfNo(int[][] array, int value) {
		int row = 0;
		int column = array[row].length - 1;
		while (row < array.length && column >= 0) {
			if (value == array[row][column]) {
				System.out.println("Position: Row:" + row + " Column:" + column);
				return;
			} else if (value > array[row][column]) {
				row++;
			} else if (value < array[row][column]) {
				column--;
			}
			if (row == array.length && column == 0) {
				System.out.println("Value " + value + " does not exist...");
			}
		}
	}
}
