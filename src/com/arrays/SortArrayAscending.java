package com.arrays;

import java.util.Arrays;

/*
 * Sort the given array in ascending order such that elements will be arranged from smallest to largest
Let the original array be as follows: 
-5	-9	8	12	1	3
Array generated after sorting the above array is as follows: 
-9	-5	1	3	8	12
 */
public class SortArrayAscending {

	public static void main(String[] args) {
		Integer a[] = { -5, -9, 8, 12, 1, 3 };

		Arrays.sort(a);

//		Arrays.sort(a, Collections.reverseOrder());

		System.out.println(Arrays.toString(a));

	}

}
