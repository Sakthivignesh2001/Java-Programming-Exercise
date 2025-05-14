package com.example.reverse;

/*
 * 
 *  Input: {1, 2, 3, 4}
 *  
 *  Output: {4, 3, 2, 1}
 */
public class ReverseAllTheElementArray {

	public static void main(String[] args) {
		
		int[] input = {1,2,3,4};
		
		for(int i = input.length-1 ; i >= 0 ; i--) {
			System.out.print(input[i] + " ");
		}
		
		

	}

}
