/**
 * 
 */
package com.core.java.algorithms;

import com.core.java.algorithms.arrays.FindTheNoInMetrix;

/**
 * @author Siddhant sahu
 *
 */
public class TestFindTheNoInMetrix {
	public static void main(String[] args) {
		FindTheNoInMetrix metrix = new FindTheNoInMetrix();
		int[][] array = { { 20, 21, 22, 23 },
						  { 30, 31, 32, 33 },
						  { 40, 41, 42, 43 } };
		metrix.getPositionOfNo(array, 42);
	}
}
