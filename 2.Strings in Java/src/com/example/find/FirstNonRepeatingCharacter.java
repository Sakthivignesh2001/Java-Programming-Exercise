package com.example.find;

/*
First Non-Repeating Character:
	
Given a string, find the first character that does not repeat. 
If all characters repeat, then print '-'.

Example:
Input: "swiss"
Output: 'w'

*/

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		String input = "swiss";
		
		int[] count = new int[256];
		
		char[] c = new char[input.length()];
		
		for(int i = 0 ; i < input.length() ; i++) {
			c[i] = input.charAt(i);
		}
		
		for(char ch : c) {
			count[ch]++;
		}
		
		boolean result = false;
		
		for(char ch: c) {
			if(count[ch] == 1) {
				System.out.println("First value of the non repeat char is :: " + ch);
				result = true;
				break;
			}
		}
		if(result == false) {
			System.out.println("All the char are repeated");
		}

	}

}
