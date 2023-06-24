package com.arrays;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int a[] = { 5, -2, 23, 7, 87, -42, 509 };
		System.out.println("Original array Is>> " + Arrays.toString(a));

		Arrays.sort(a);
		System.out.println("Sorted Array Is>> " + Arrays.toString(a));

	}

}
