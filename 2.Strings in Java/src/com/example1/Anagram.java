package com.example1;

public class Anagram {

	public static void main(String[] args) {

		String input1 = "AnaGRam";
		String input2 = "nagarAM";

		String input1LowerCase = "";
		String input2LowerCase = "";

		for (int i = 0; i < input1.length(); i++) {

			if (input1.charAt(i) >= 65 && input1.charAt(i) <= 91) {
				input1LowerCase = input1LowerCase + (char) (input1.charAt(i) + 32);
			} else {
				input1LowerCase = input1LowerCase + input1.charAt(i);
			}
		}

		System.out.println("Input-1-LowerCase-Value: " + input1LowerCase);

		for (int i = 0; i < input2.length(); i++) {
			if (input2.charAt(i) >= 65 && input2.charAt(i) <= 91) {
				input2LowerCase = input2LowerCase + (char) (input2.charAt(i) + 32);
			} else {
				input2LowerCase = input2LowerCase + input2.charAt(i);
			}
		}

		System.out.println("Input-2-LowerCase-Value: " + input2LowerCase);

		char[] c1 = new char[input1LowerCase.length()];
		char[] c2 = new char[input2LowerCase.length()];

		for (int i = 0; i < input1LowerCase.length(); i++) {
			c1[i] = input1LowerCase.charAt(i);
		}

		for (int i = 0; i < input2LowerCase.length(); i++) {
			c2[i] = input2LowerCase.charAt(i);
		}

		for (int i = 0; i < c1.length; i++) {
			for (int j = 1; j < c1.length - i; j++) {
				if(c1[j] < c1[j-1]) {
					char temp = c1[j];
					c1[j] = c1[j-1];
					c1[j-1] = temp;
				}
			}
		}
		
		for(int i = 0 ; i < c2.length ; i++) {
			for(int j = 1 ; j < c2.length -i ; j++) {
				if(c2[j] < c2[j-1]) {
					char temp = c2[j];
					c2[j] = c2[j-1];
					c2[j-1] = temp;
				}
			}
		}
		
		boolean isAnagram = true;
		
		if(c1.length != c2.length) {
			isAnagram = false;
		} else {
			for(int i = 0 ; i < c1.length ; i++) {
				if(c1[i] != c2[i]) {
					isAnagram = false;
					break;
				}
			}
		}
		
		if (isAnagram) {
			System.out.println("The given string are anagram..!");
		} else {
			System.out.println("The given String are not an anagram..!");
		}

	}

}
