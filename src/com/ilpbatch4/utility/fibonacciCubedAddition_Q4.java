package com.ilpbatch4.utility;

public class fibonacciCubedAddition_Q4 {

	public static void main(String[] args) {
		int index = 5;
		fibonacciCubeAddition(index);
	}

	private static void fibonacciCubeAddition(int index) {
		int curNum = 1;
		int prevNum = 1;
		int temp = 0;
		double output = 0;
		for (int i = 1; i <= index; i++) {
			output = output + Math.pow(curNum, 3.0);
			temp = curNum;
			curNum = curNum + prevNum;
			prevNum = temp;
		}
		System.out.println("The output is : " + output);
	}

}
