package com.ilpbatch4.utility;

public class NewPattern {

	public static void main(String[] args) {
		int index = 5;
		printPattern(index);

	}

	private static void printPattern(int index) {
		for (int i = 0; i < index; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}