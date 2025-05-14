package com.example.checking;

import java.util.Scanner;

/*
 * 
 *  Input: Array: {3, 7, 1, 9}, 
 *  
 *  Value to check: 7
 *  
 *  Output: true
 */

public class CheckingTheArrayTheValueIsPresent {

	public static void main(String[] args) {
		
		int[] input = {3,7,1,9};
		boolean flag = false;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the int value to check that value is present or not: ");
		int valueToCheck = scan.nextInt();
		
		for(int i = 0; i < input.length ; i++) {
			
			if(valueToCheck == input[i]) {
				System.out.println("The value is present in the given array..!");
				flag = true;
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("The value is not present in the given array..!");
		}

	}

}
