/**
 * 
 */
package com.core.java.algorithms.Map.Sorting;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Siddhant sahu
 *
 */
public class MapSortByValue implements Comparator<Integer> {
	private Map<Integer, String> map;

	public MapSortByValue(Map<Integer, String> map) {
		this.map = map;
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		return map.get(o1).compareTo(map.get(o2));
	}
}
