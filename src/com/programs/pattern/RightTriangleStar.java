package com.programs.pattern;

/*
 * Input : n = 5
Output: 
* 
* * 
* * * 
* * * * 
* * * * *  
 */
public class RightTriangleStar {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

}
