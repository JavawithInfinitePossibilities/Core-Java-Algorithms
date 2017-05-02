/**
 * 
 */
package com.core.java.algorithms;

import com.core.java.algorithms.arrays.SnakeSequence;

/**
 * @author Siddhant sahu
 *
 */
public class TestSnakeSequence {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 1, 2 }, 
				           { 7, 7, 2, 5 },
				           { 6, 4, 3, 4 },
				           { 1, 2, 2, 5 } };
		SnakeSequence sequence = new SnakeSequence();
		sequence.getMaxSequence(matrix);
	}
}
