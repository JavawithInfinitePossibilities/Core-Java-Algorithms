/**
 * 
 */
package com.core.java.algorithms;

import com.core.java.algorithms.arrays.PrintAllDiagonals;

/**
 * @author Siddhant sahu
 *
 */
public class TestPrintAllDiagonals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] a = { { 1,  2,  3,  4 },
				      { 5,  6,  7,  8 },
				      { 9,  10, 11, 12 },
				      { 13, 14, 15, 16 } };
		PrintAllDiagonals diagonals = new PrintAllDiagonals();
		diagonals.print(a);
	}

}
