/**
 * 
 */
package com.core.java.algorithms;

import org.junit.Test;

import com.core.java.algorithms.arrays.FindTheFirstRepeatedChar;

/**
 * @author Siddhant sahu
 *
 */
public class TestFindFirstRepeatedChar {
	String value = "horizon tutorials";

	@Test
	public void testFindFirstChar() {
		value = value.replaceAll(" ", "");
		FindTheFirstRepeatedChar repeatedChar = new FindTheFirstRepeatedChar();
		Thread thread1 = new Thread(() -> {
			long start = System.currentTimeMillis();
			repeatedChar.doubleIteration(value);
			long end = System.currentTimeMillis();
			System.out.println("Time taken by doubleIteration :" + (end - start));
		});
		Thread thread2 = new Thread(() -> {
			long start = System.currentTimeMillis();
			repeatedChar.mapToFindRepeatation(value);
			long end = System.currentTimeMillis();
			System.out.println("Time taken by mapToFindRepeatation :" + (end - start));
		});
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
