package com.ilpbatch4.utility;

public class continuousSubArrayAddingToS_Q11 {

	public static void main(String[] args) {
		int array[] = { 3, 5, 1, 6, 9, 4, 6, 5, 8, 3, 3, 6 };
		int sumCheck = 6;
		int sum = 0;
		findSubArray(array, sumCheck, sum);
	}

	private static void findSubArray(int[] array, int sumCheck, int sum) {
		for (int i = 0; i < array.length; i++) {
			if (sum == sumCheck) {
				break;
			}
			sum = 0;
			for (int j = i; j < array.length; j++) {
				sum = sum + array[j];
				if (sum > sumCheck) {
					break;
				} else if (sum == sumCheck) {
					System.out.println("The sub array from index " + (i) + " to " + (j) + " adds up to " + sumCheck);
					break;
				}
			}
		}
	}

}
