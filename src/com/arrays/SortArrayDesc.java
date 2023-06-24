package com.arrays;

import java.util.Arrays;
import java.util.Collections;

/*
 * Sort the given array in descending order, i.e., arrange the elements from largest to smallest. 
 * Input :Array = {2, 6, 23, 98, 24, 35, 78}
Output:[98, 78, 35, 24, 23, 6, 2]

 */
public class SortArrayDesc {

	public static void main(String[] args) {
		Integer a[] = { 2, 6, 23, 98, 24, 35, 78 };

		Arrays.sort(a, Collections.reverseOrder());

		System.out.println(Arrays.toString(a));

	}

}
