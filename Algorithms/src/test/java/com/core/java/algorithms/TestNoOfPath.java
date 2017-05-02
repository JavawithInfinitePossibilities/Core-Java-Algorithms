/**
 * 
 */
package com.core.java.algorithms;

import com.core.java.algorithms.arrays.NoOfPath;

/**
 * @author Siddhant sahu
 *
 */
public class TestNoOfPath {
	public static void main(String... args) {
		int arrA[][] = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		NoOfPath path = new NoOfPath();
		System.out.println("No Of Path (Recursion):-" + path.count(arrA, 0, 0));
		System.out.println("No Of Path (DP):-" + path.countDP(arrA));
	}
}
