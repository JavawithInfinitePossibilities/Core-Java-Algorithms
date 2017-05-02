/**
 * 
 */
package com.core.java.algorithms;

import com.core.java.algorithms.arrays.PrintAllPathIn2DArray;

/**
 * @author Siddhant sahu
 *
 */
public class TestPrintAllPathIn2DArray {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 },
				      { 4, 5, 6 },
				      { 7, 8, 9 } };
		PrintAllPathIn2DArray array = new PrintAllPathIn2DArray(a);
		array.printAll(0, 0, "");
	}
}
