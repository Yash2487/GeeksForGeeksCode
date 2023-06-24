package com.programs.pattern;

/*
 * A pyramid number pattern of row size r = 5 would look like:
        1 
      2 3 2 
    3 4 5 4 3 
  4 5 6 7 6 5 4 
5 6 7 8 9 8 7 6 5
 */
public class PyramidNumberRow5 {

	public static void main(String[] args) {

//		int r = 4;
		int r = 5;

		// outer loop
		for (int i = 1; i <= r; i++) {
			int x = i - 1;

			for (int j = i; j <= r - 1; j++) {
				// first number space
				System.out.print(" ");

				// space between numbers
				System.out.print("  ");
			}

			// pyramid printing
			for (int j = 0; j <= x; j++)
				System.out.print((i + j) < 10 ? (i + j) + "  " : (i + j) + " ");

			for (int j = 1; j <= x; j++)
				System.out.print((i + x - j) < 10 ? (i + x - j) + "  " : (i + x - j) + " ");

			// By now we reach end for one row, so
			// new line to switch to next
			System.out.println();

		}

	}
}
