package com.ilpbatch4.utility;

public class sumOfFactorialAsDenominator_Q6 {

	public static void main(String[] args) {
		int input = 5;
		factorialSum(input);

	}
	
	private static int factorial(int input) {
		int factorialNum = 1;
		for (int i = 1; i <= input; i++) {
			factorialNum = factorialNum * i;
		}
		return factorialNum;
	}
	
	private static void factorialSum(int input) {
		float sum = 0;
		for (int i = 1; i <= input; i++) {
			sum = sum + ((float) i / (float) factorial(i));
		}
		System.out.println("Sum = " + sum);
	}


}
