package com.example.sum;

/*
 * 
 * Input: {2, 5, 6, 9, 8} 
 * 
 * Output: Even: 3, Odd: 2
 */

public class CountEvenAndOddNumber {

	public static void main(String[] args) {

		int[] input = { 2, 5, 6, 9, 8 };

		int even = 0;
		int odd = 0;

//		for(int i : input) {
//			
//			if(i%2 == 0) {
//				even++;
//			}else {
//				odd++;
//			}
//		}

		for (int i = 0; i < input.length; i++) {
			if (i % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		
		System.out.println("Count of the Even number is: " + even);
		System.out.println("Count of the Odd number is: " + odd);

	}

}
