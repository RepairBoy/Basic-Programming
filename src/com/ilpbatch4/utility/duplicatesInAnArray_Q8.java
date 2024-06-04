package com.ilpbatch4.utility;

import java.util.HashSet;

public class duplicatesInAnArray_Q8 {

	public static void main(String[] args) {
		int array[] = { 3, 5, 2, 8, 2, 4, 7, 4, 1, 2 };
		findDuplicate(array);

	}

	private static void findDuplicate(int[] array) {
		HashSet<Integer> seen = new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			if (!seen.add(array[i])) {
				duplicates.add(array[i]);
			}
		}
		if (duplicates.isEmpty()) {
			System.out.println("no duplicates found");
		} else {
			for (int value : duplicates) {
				System.out.println(value + " ");
			}
		}
	}

}
