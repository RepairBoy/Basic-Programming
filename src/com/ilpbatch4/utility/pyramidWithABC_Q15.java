package com.ilpbatch4.utility;

public class pyramidWithABC_Q15 {

	public static void main(String[] args) {
		int input = 4;
		makePyramid(input);
	}

	private static void makePyramid(int input) {
		for (int i = 1; i <= input; i++) {
			for (int j = 0; j < input - i; j++) {
				System.out.print(" ");
			}
			for (int l = 0; l < i; l++) {
				System.out.print((char) (65 + l));
			}
			for (int k = 0; k < i; k++) {
				System.out.print(k + 1);
			}

			System.out.println("");
		}

	}

}
