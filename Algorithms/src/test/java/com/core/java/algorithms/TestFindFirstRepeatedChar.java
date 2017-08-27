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
		long start = System.currentTimeMillis();
		repeatedChar.mapToFindRepeatationByDoublePointer(value);
		long end = System.currentTimeMillis();
		System.out.println("Time taken by mapToFindRepeatationByDoublePointer :" + (end - start));
		
		/*Thread thread1 = new Thread(() -> {
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
		Thread thread3 = new Thread(() -> {
			long start = System.currentTimeMillis();
			repeatedChar.mapToFindRepeatationByDoublePointer(value);
			long end = System.currentTimeMillis();
			System.out.println("Time taken by mapToFindRepeatationByDoublePointer :" + (end - start));
		});
		thread1.start();
		thread2.start();
		thread3.start();
		try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
	}
}
