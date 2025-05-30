package com.example.find;

import java.util.Scanner;

/*
 * Find the count of all the Character:
 * 
 * Input: "Malayalam"
 * 
 * Output: 
*/

public class FindTheAllCharacterCount {

	public static void main(String[] args) {
		
		String input = "Malayalam";
		
		input = input.toLowerCase();
		
		int[] value = new int[256];
		
		boolean[] printed = new boolean[256];
		
		char[] ch = new char[input.length()];
		
		for(int i = 0 ; i < input.length() ; i++) {
			ch[i] = input.charAt(i);
		}
		
//		char[] ch = input.toCharArray();
		
		for(char c : ch) {
			value[c]++;
		}
		
		for(char c : ch) {
			if (!printed[c]) {
                System.out.println(c + " = " + value[c]);
                printed[c] = true; 
            }
		}
	}

}
