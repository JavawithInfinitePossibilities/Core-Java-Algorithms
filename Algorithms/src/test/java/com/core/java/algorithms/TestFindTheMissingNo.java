/**
 * 
 */
package com.core.java.algorithms;

import com.core.java.algorithms.arrays.FindTheMissingNo;

/**
 * @author Siddhant sahu
 *
 */
public class TestFindTheMissingNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindTheMissingNo missingNo = new FindTheMissingNo();
		int[] array = { 1, 2, 4, 5 };
		System.out.println(missingNo.getMissingNo(array, 5));
		System.out.println(missingNo.getMissingNoXOR(array, 5));
	}

}
