package com.ilpbatch4.utility;

public class NumberOfSumPairEqualToK_Q10 {

	public static void main(String[] args) {
//		int array[] = {3,6,7,2,5,7,2,9,1,3,2,4,4,6,8,2,2,3,1};
		int array[] = { 3, 2, 6, 1, 4, 1 };
		int input = 5;
		sumPair(array, input);
	}

	private static void sumPair(int[] array, int input) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == input) {
					count++;
				}
			}
		}
		System.out.println("The total number of combinations adding to get 5 is : " + count);
	}

}
