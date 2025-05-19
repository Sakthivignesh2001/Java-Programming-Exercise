package com.example.swap;

/*
 *  Input: {1, 2, 3, 4} 
 *  
 *  Output: Copied array: 1 2 3 4
 */

public class CopyOneArrayToAnother {

	public static void main(String[] args) {
		
		int[] input = {1, 2, 3, 4};
		
		int[] output = new int[input.length];
		
		for(int i = 0 ; i < input.length ; i++) {
			output[i] = input[i];
		}
		
		for(int i : output) {
			System.out.print(i + " ");
		}
		
		

	}

}
