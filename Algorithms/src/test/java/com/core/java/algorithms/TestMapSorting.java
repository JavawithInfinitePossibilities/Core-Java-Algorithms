/**
 * 
 */
package com.core.java.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import com.core.java.algorithms.Map.SortMapByValues;

/**
 * @author Siddhant sahu
 *
 */
public class TestMapSorting {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Siddhant");
		map.put(2, "Kunmun");
		map.put(3, "Gunupur");
		map.put(4, "Lenovo");
		SortMapByValues mapByValues = new SortMapByValues();
		Map<Integer, String> map1 = mapByValues.getSortByValue(map);
		Map<Integer, String> map2 = mapByValues.getSortByValueByComp(map);
		for (Entry<Integer, String> element : map1.entrySet()) {
			System.out.println(element.getKey() + "-" + element.getValue());
		}
		System.out.println("================");
		for (Entry<Integer, String> element : map2.entrySet()) {
			System.out.println(element.getKey() + "-" + element.getValue());
		}
	}

	@Test
	public void testMapSortingByEntry() {

	}
}
