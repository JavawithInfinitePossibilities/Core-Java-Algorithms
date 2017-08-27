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
	private final int TARGET_SUM;
	private Stack<Integer> stack = new Stack<>();
	private int sumInStack = 0;
	public Set<String> value=new HashSet<>();

	public GetAllSubsetByStack(int target_sum) {
		this.TARGET_SUM = target_sum;
	}

	public void populatedSubStack(int[] data, int fromIndex, int endIndex) {
		if (sumInStack == TARGET_SUM) {
			print(stack);
		}
		for (int currentIndex = fromIndex; currentIndex <= endIndex; currentIndex++) {
			if (sumInStack + data[currentIndex] <= TARGET_SUM) {
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
