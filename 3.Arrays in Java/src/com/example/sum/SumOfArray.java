package com.example.sum;

/*
 * 
 * Input: {1, 2, 3, 4, 5}
 * 
 * Output: 15
 */

public class SumOfArray {

	public static void main(String[] args) {
		int[] input = {1,2,3,4,5};
		int result = 0;
		
		for(int i = 0 ; i < input.length ; i++) {
			result = result + input[i];
		}
		System.out.println("Sum of the array is: " + result);
	}

}
