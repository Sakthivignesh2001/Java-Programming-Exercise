package com.example.find;

public class FindMissingNumber {

	public static void main(String[] args) {
		 
		int[] input = {3,0,2,1,5};
		 
		int value = findTheMissingNumber(input);
		
		System.out.println("Missing number is: " + value);

	}

	private static int findTheMissingNumber(int[] input) {
		
		int n = input.length;
		
		int actualSum = 0;
		
		int expectedSum = n * (n+1)/2;
		
		for(int i : input) {
			actualSum = actualSum + i;
		}
		
		int result = expectedSum - actualSum;
		
		return result;
	}

}
