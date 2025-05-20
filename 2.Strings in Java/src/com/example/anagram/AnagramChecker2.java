package com.example.anagram;

/*
 * Here i'm using all the in-build methods and class to check the string is an anagram.
 */

import java.util.Arrays;

public class AnagramChecker2 {

	public static void main(String[] args) {

		String value1 = "Listen";
		String value2 = "Silent";

		value1 = value1.replace(" ", "");
		value2 = value2.replace(" ", "");
		
		value1 = value1.toLowerCase();
		value2 = value2.toLowerCase();
		
		char[] c1 = value1.toCharArray();
		char[] c2 = value2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)) {
			System.out.println("The given string are anagram..!");
		} else {
			System.out.println("The given String are not an anagram..!");
		}


	}

}
