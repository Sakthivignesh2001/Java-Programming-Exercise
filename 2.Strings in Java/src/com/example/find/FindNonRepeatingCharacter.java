package com.example.find;

/*
Find Non-Repeating Character:
	
Given a string, find the first character that does not repeat. 
If all characters repeat, then print '-'.

Example:
Input: "swiss"
Output: 'w'

*/

public class FindNonRepeatingCharacter {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter the value: ");
//		String input = scan.next();
		
		String input = "Malayalam";
		
		input = input.toLowerCase();
		
		int[] value = new int[256];
		
		char[] ch = new char[input.length()];
		
		for(int i = 0 ; i < input.length() ; i++) {
			ch[i] = input.charAt(i);
		}
		
		for(char c : ch) {
			value[c]++;
		}
		
		boolean result = false;
		
		for(char c : ch) {
			if(value[c] == 1) {
				System.out.println("Non Repeating char of the string is: '" + c + "'" );
				result = true;
			}
		}
		
		if(result == false) {
			System.out.println("All the char are repeated");
		}
		
	}

}
