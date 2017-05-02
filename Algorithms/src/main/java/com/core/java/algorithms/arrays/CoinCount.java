/**
 * 
 */
package com.core.java.algorithms.arrays;

/**
 * @author Siddhant sahu
 *
 */
public class CoinCount {
	private int count;

	public CoinCount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void getWays(long n, int start, long[] c) {
		if (n == 0) {
			this.count++;
		}else{
			for (int i = start; i < c.length; i++) {
				if(n-c[i]>=0){
					getWays(n-c[i], i, c);
				}
			}
		}
	}
}
