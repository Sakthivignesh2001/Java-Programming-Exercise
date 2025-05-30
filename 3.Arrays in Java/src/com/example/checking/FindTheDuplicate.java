package com.example.checking;

import java.util.HashSet;
import java.util.Set;

/*
 * It will retrun 1st duplicate value
 */

public class FindTheDuplicate {

	public static void main(String[] args) {
		
		int[] nums = {3, 1, 3, 4, 2};
		
		int value = findDuplicateValue(nums);
		
		if(value == 0 ) {
			System.out.println("No duplicate value are present");
		} else {
			System.out.println("Duplicate value are:: " + value);
		}

	}

	private static int findDuplicateValue(int[] nums) {
		
		Set<Integer> set = new HashSet<>();
		
		for(int num : nums) {
			if(!set.add(num)) {
				return num;
			}
		}
		System.out.println(set);
		
		return 0;
	}

}
