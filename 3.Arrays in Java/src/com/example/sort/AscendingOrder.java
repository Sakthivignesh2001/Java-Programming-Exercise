package com.example.sort;

/*
 * 
 *  Input: {5, 2, 8, 1, 3}
 *  
 *  Output: 1 2 3 5 8
 *  
 *  Bubble sorting
 */

public class AscendingOrder {

	public static void main(String[] args) {

		int[] input = { 5, 2, 8, 1, 3 };

		for (int i = 0; i < input.length; i++) {
			for (int j = 1; j < input.length - i; j++) {
				if (input[j] < input[j - 1]) {
					int temp = input[j];
					input[j] = input[j - 1];
					input[j - 1] = temp;
				}
			}
		}
		for (int i : input) {
			System.out.print(i + " ");
		}

	}

}
