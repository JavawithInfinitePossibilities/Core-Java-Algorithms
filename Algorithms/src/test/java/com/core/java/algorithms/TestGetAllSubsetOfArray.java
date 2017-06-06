/**
 * 
 */
package com.core.java.algorithms;

import com.core.java.algorithms.arrays.GetAllSubsetByStack;

/**
 * @author Siddhant sahu
 *
 */
public class TestGetAllSubsetOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = { 4, 5, 5, 6, 8, 8, 11, 12, 15 };
		GetAllSubsetByStack byStack = new GetAllSubsetByStack(25);
		byStack.populatedSubStack(array, 0, array.length - 1);
		System.out.println(byStack.value);
	}

}
