package com.example.StringValueReverse;

/*
 * Input: Sakthi vignesh bala
 * 
 * Output: alab hsengiv ihtkaS
 */

public class ReverseTheWholeWord {

	public static void main(String[] args) {
		
		String s1 = "Sakthi vignesh bala";
		String s2 = "";
		
		for(int i  = s1.length()-1 ; i >= 0 ; i--) {
			s2 = s2 + s1.charAt(i);
		}

		System.out.println("Input String value: " + s1);
		System.out.println("Output String value: " + s2);
	}

}
