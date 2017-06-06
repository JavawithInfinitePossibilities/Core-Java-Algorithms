/**
 * 
 */
package com.core.java.algorithms.Map.Sorting;

import java.util.Comparator;
import java.util.Map.Entry;

/**
 * @author Siddhant sahu
 *
 */
public class MapEntrySort implements Comparator<Entry<Integer, String>> {

	@Override
	public int compare(Entry<Integer, String> obj1, Entry<Integer, String> obj2) {
		return obj1.getValue().compareTo(obj2.getValue());
	}

}
