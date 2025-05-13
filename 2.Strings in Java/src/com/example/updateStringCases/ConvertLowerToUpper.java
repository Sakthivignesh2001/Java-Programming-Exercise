package com.example.updateStringCases;

/*
 * 
 * Input: sakthivignesh
 * 
 * output: SAKTHIVIGNESH
 * 
 * A - 65 -> Z - 90
 * 
 * a - 97 -> z - 122
 */

public class ConvertLowerToUpper {

public static void main(String[] args) {
		
		String s1 = "sakthivignesh";
		String s2 = "";
		
		for(int i = 0 ; i < s1.length() ; i++) {
			s2 = s2 + (char)(s1.charAt(i) - 32);
		}
		
		System.out.println("Input String value: " + s1);
		System.out.println("Output String value: " + s2);

	}

}
