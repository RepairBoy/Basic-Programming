package com.ilpbatch4.utility;

public class diamondPattern_Q14 {

	public static void main(String[] args) {
		float input = 5;
		int index = (int) Math.ceil(input / 2);
		makeTopPattern(index);
		makeBottomPattern(index);
	}

	private static void makeTopPattern(int input) {
		for (int i = 1; i <= input; i++) {
			for (int j = 0; j < input - i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			for (int j = 2; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	private static void makeBottomPattern(int input) {
		for (int i = input - 1; i >= 1; i--) {
			for (int j = input; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			for (int j = 2; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
