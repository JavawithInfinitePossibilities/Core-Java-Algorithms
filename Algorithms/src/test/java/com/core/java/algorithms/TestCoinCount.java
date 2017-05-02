/**
 * 
 */
package com.core.java.algorithms;

import com.core.java.algorithms.arrays.CoinCount;

/**
 * @author Siddhant sahu
 *
 */
public class TestCoinCount {
	public static void main(String[] args) {
		long[] a = { 1, 2, 3 };
		CoinCount coinCount = new CoinCount();
		coinCount.getWays(4, 0, a);
	}
}
