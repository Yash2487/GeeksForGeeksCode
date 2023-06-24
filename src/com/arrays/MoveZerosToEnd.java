package com.arrays;

/*
 * Given an integer array nums, move all 0,s to the end of it while maintaning the rotation order of the others element
Input: nums = [0,1,0,3,12]
output: [1,3,12,0,0]
 */
public class MoveZerosToEnd {

	public static void main(String[] args) {
		int a[] = { 0, 1, 0, 3, 12 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				a[count++] = a[i];
			}
		}
		while (count < a.length) {
			a[count++] = 0;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
