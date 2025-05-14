package com.example.maximum;

/*
 * Input: {10, 5, 20, 8}
 * 
 * Output: 20
 * 
 */

public class FindMaximumValueOfArray {

	public static void main(String[] args) {
		
		int[] input = {10, 5, 20, 8};
		
		int temp = 0;
		
		for(int i : input) {
			if(temp < i) {
				temp = i;
			}
		}
		
//		for(int i = 0 ; i < input.length ; i++) {
//			if(temp < input[i]) {
//				temp = input[i];
//			}
//		}
		
		System.out.println("Highest value of the array is: " + temp);

	}

}
