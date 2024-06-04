package com.ilpbatch4.utility;

public class oddNumbersSumAndSubtract_Q3 {

	public static void main(String[] args) {
		int input = 10;
		int indexVal = (input * 2) - 1;
		oddNumSumAndSub(indexVal);
	}

	private static void oddNumSumAndSub(int indexVal) {
		int result = 0;
		int flag = 1;
		for (int i = 1; i <= indexVal; i++) {
			if (i % 2 != 0) {
				if (flag == 1) {
					result = result + i;
					flag = 0;
				} else {
					result = result - i;
					flag = 1;
				}
			}
		}
		System.out.println("The Output is: " + result);
	}

}
