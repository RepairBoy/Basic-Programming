package com.ilpbatch4.utility;

public class findMissingArrayNumbers_Q7 {

	public static void main(String[] args) {
		int maxValue = 10;
		int array[] = { 3, 8, 1, 8, 4, 9, 3, 5 };
		findMissingNum(array, maxValue);
	}

	private static void findMissingNum(int[] array, int maxValue) {
		int missingNums[] = new int[maxValue];
		int count = 0;
		int flag = 0;
		for (int i = 1; i <= maxValue; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i == array[j]) {
					flag = 1;
				}
			}
			if (flag == 0 && count < maxValue) {
				missingNums[count] = i;
				count++;
			}
			flag = 0;
		}
		for (int i = 0; i < missingNums.length; i++) {
			if (missingNums[i] == 10) {
				System.out.println(missingNums[i]);
				break;
			} else {
				System.out.println(missingNums[i]);
			}

		}
	}

}
