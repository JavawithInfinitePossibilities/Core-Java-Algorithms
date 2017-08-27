/**
 * 
 */
package com.core.java.algorithms.arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Siddhant sahu
 *
 */
public class FindTheFirstRepeatedChar {
	public void doubleIteration(String value) {
		boolean flag = true;
		for (int i = 0; i < value.length() && flag; i++) {
			for (int j = i + 1; j < value.length(); j++) {
				if (value.charAt(i) == value.charAt(j)) {
					System.out.println("The first repeated value:" + value.charAt(i));
					flag = false;
					break;
				}
			}
		}
	}

	public void mapToFindRepeatation(String value) {
		Map<Character, Integer> repeatation = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < value.length(); i++) {
			if (repeatation.containsKey(value.charAt(i))) {
				repeatation.put(value.charAt(i), repeatation.get(value.charAt(i)) + 1);
			} else {
				repeatation.put(value.charAt(i), 1);
			}
		}
		for (Entry<Character, Integer> element : repeatation.entrySet()) {
			if (element.getValue() > 1) {
				System.out.println("The first repeated value:" + element.getKey());
				break;
			}
		}
	}

	public void mapToFindRepeatationByDoublePointer(String value) {
		Map<Character, Integer> repeatation = new LinkedHashMap<Character, Integer>();
		for (int i = 0, j=value.length()-1; i <j || i==j; i++,j--) {
			if (repeatation.containsKey(value.charAt(i))) {
				repeatation.put(value.charAt(i), repeatation.get(value.charAt(i)) + 1);
			} else {
				repeatation.put(value.charAt(i), 1);
			}
			if (repeatation.containsKey(value.charAt(j))) {
				repeatation.put(value.charAt(j), repeatation.get(value.charAt(j)) + 1);
			} else {
				repeatation.put(value.charAt(j), 1);
			}
		}
		for (Entry<Character, Integer> element : repeatation.entrySet()) {
			if (element.getValue() > 1) {
				System.out.println("The first repeated value:" + element.getKey());
				break;
			}
		}
	}
}
