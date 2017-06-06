/**
 * 
 */
package com.core.java.algorithms.arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author Siddhant sahu
 *
 */
public class GetAllSubsetByStack {
	private final int target_sum;
	private Stack<Integer> stack = new Stack<>();
	private int sumInStack = 0;
	public Set<String> value=new HashSet<>();

	public GetAllSubsetByStack(int target_sum) {
		this.target_sum = target_sum;
	}

	public void populatedSubStack(int[] data, int fromIndex, int endIndex) {
		if (sumInStack == target_sum) {
			print(stack);
		}
		for (int currentIndex = fromIndex; currentIndex <= endIndex; currentIndex++) {
			if (sumInStack + data[currentIndex] <= target_sum) {
				stack.push(data[currentIndex]);
				sumInStack += data[currentIndex];
				populatedSubStack(data, currentIndex + 1, endIndex);
				sumInStack -= stack.pop();
			}
		}
	}

	private void print(Stack<Integer> stack) {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (Integer integer : stack) {
			builder.append(integer+",");
		}
		builder.append("]");
		value.add(builder.toString());
	}
}
