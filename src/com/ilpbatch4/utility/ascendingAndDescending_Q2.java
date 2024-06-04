package com.ilpbatch4.utility;

public class ascendingAndDescending_Q2 {

	public static void main(String[] args) {
		int nums[] = { 6, 2, 9, 7 };
		arrangeInAscending(nums);
		printInAscending(nums);
		printInDescending(nums);

	}

	private static void printInDescending(int[] nums) {
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.print(nums[i]);
		}
	}

	private static void printInAscending(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
		System.out.println();
	}

	private static void arrangeInAscending(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			int temp = 0;
			if (nums[i] > nums[i + 1]) {
				temp = nums[i];
				nums[i] = nums[i + 1];
				nums[i + 1] = temp;
			}
		}
	}

}
