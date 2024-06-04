package com.ilpbatch4.utility;

public class sumAndDiffOddNumbersWithPower_Q5 {

	public static void main(String[] args) {

		int input = 5;
		int indexVal = (input * 2) - 1;
		oddNumSumAndSubWithPow(indexVal);

	}

	private static void oddNumSumAndSubWithPow(int input) {
		double result = 0;
		int flag = 1;
		int count = 1;
		for (int i = 1; i <= input; i++) {
			if (i % 2 != 0) {
				if (flag == 1) {
					result = result + Math.pow(i, count);
					count++;
					flag = 0;
				} else {
					result = result - Math.pow(i, count);
					count++;
					flag = 1;
				}
			}
		}
		System.out.println("The Output is: " + result);
	}

}
