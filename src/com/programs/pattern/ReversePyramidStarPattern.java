package com.programs.pattern;
/*
 * Input: number = 7
 
Output:

*************
 ***********
  *********
   *******
    *****
     ***
      *
 */

/*
 * Steps to solve this problem:

1. Initialize the size of the pyramid ‘number =7’

2. The outer loop will run through rows of the pyramid with ‘i’ starting from number and decrementing by 1 in each iteration.

3. First inner loop will start to print the gaps in each row with ‘j’ starting from ‘i’ and incrementing by 1 until it reaches number.

4. Now start second inner loop with ‘j’ starting at 1 and increment it by 1 until it reaches (2 * i – 1) to print the stars in each row.

5. Print new line to end each row, then repeat steps 3 through 5 until the outer loop ends.
 */

public class ReversePyramidStarPattern {

	public static void main(String[] args) {
		int n = 7;
		// outer loop
		for (int i = n; i >= 1; i--) {

			// inner loop-> print space
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}

			// inner loop-> print star
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}

			// ending line after each row
			System.out.println();
		}

	}

}
