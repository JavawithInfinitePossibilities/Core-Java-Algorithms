/**
 * 
 */
package com.core.java.algorithms.arrays;

/**
 * @author Siddhant sahu
 *
 */
public class PrintAllPathIn2DArray {
	private int[][] arr;
	private int rowCount;
	private int colCount;

	public PrintAllPathIn2DArray() {
		super();
	}

	public PrintAllPathIn2DArray(int[][] arr) {
		super();
		this.arr = arr;
		this.rowCount = arr.length;
		this.colCount = arr[0].length;
	}

	public void printAll(int currentRowCount, int currentColCount, String path) {
		if (currentRowCount == rowCount - 1) {
			for (int i = currentColCount; i < colCount; i++) {
				path += "-" + arr[currentRowCount][i];
			}
			System.out.println(path);
			return;
		}

		if (currentColCount == colCount - 1) {
			for (int i = currentRowCount; i < rowCount; i++) {
				path += "-" + arr[i][currentColCount];
			}
			System.out.println(path);
			return;
		}

		path = path + "-" + arr[currentRowCount][currentColCount];
		printAll(currentRowCount + 1, currentColCount, path);
		printAll(currentRowCount, currentColCount + 1, path);
	}
}
