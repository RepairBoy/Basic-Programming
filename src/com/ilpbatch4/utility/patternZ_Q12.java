package com.ilpbatch4.utility;

public class patternZ_Q12 {

	public static void main(String[] args) {
		int input = 5;
		patternZ(input);

	}

	private static void patternZ(int input) {
		for (int i = 1; i <= input; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= input - 2; i++) {
			for (int j = 1; j <= input - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

		for (int i = 1; i <= input; i++) {
			System.out.print("*");
		}
	}

}
