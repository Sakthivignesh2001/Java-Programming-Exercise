package com.example.checking;

import java.util.HashSet;
import java.util.Set;

/*
 * It will retrun all duplicate value
 */

public class FindTheALlDuplicateValue {

	public static void main(String[] args) {

		int[] nums = { 3, 1, 3, 5, 1, 2, 4, 2 , 5};

		int[] value = findDuplicateValue(nums);

		if (value.length == 0) {
			System.out.println("No duplicate value are present");
		} else {
			for (int i = 0; i < value.length; i++) {
				System.out.println(value[i]);
			}
		}

	}

	private static int[] findDuplicateValue(int[] nums) {

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		for (int i : nums) {

			if (!set1.add(i)) {
				set2.add(i);
			}
		}

		int[] result = new int[set2.size()];

		int index = 0;
		
		for (int num : set2) {
			result[index++] = num;
		}

		return result;
	}

}
