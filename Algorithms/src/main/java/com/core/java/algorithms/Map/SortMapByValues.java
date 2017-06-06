/**
 * 
 */
package com.core.java.algorithms.Map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.core.java.algorithms.Map.Sorting.MapEntrySort;
import com.core.java.algorithms.Map.Sorting.MapSortByValue;

/**
 * @author Siddhant sahu
 *
 */
public class SortMapByValues {

	public Map<Integer, String> getSortByValue(Map<Integer, String> map) {
		LinkedList<Entry<Integer, String>> list = new LinkedList<>(map.entrySet());
		Collections.sort(list, new MapEntrySort());
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		for (Entry<Integer, String> entry : list) {
			linkedHashMap.put(entry.getKey(), entry.getValue());
		}
		return linkedHashMap;
	}

	public Map<Integer, String> getSortByValueByComp(Map<Integer, String> map) {
		MapSortByValue byValue = new MapSortByValue(map);
		TreeMap<Integer, String> treeMap = new TreeMap<>(byValue);
		for (Entry<Integer, String> element : map.entrySet()) {
			treeMap.put(element.getKey(), element.getValue());
		}
		return treeMap;
	}
}
