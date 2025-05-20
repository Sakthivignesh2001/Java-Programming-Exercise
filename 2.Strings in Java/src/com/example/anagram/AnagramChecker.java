package com.example.anagram;

/*
 * Here I'm written manually all the step to check the string is an anagram.
 */

public class AnagramChecker {

	public static void main(String[] args) {

		// Input
		String value1 = "Listen";
		String value2 = "Silent";

		// Removing space
		String value1NoSpace = "";
		String value2NoSpace = "";
        for (int i = 0; i < value1.length(); i++) {
        	if(value1.charAt(i) != ' ') {
        		value1NoSpace = value1NoSpace + value1.charAt(i);
        	}
        }
        
        for(int i = 0 ; i < value2.length() ; i++) {
        	if(value2.charAt(i) != ' ') {
        		value2NoSpace = value2NoSpace + value2.charAt(i);
        	}
        }

        // Converting lower case
		String value1LowerCase = "";
		String value2LowerCase = "";
		
		if (value1NoSpace != null) {
			for (int i = 0; i < value1NoSpace.length(); i++) {
				if (value1NoSpace.charAt(i) >= 'A' && value1NoSpace.charAt(i) <= 'Z')
					value1LowerCase = value1LowerCase + (char) (value1NoSpace.charAt(i) + 32);
				else
					value1LowerCase = value1LowerCase + value1NoSpace.charAt(i);
			}
		}

		if (value2NoSpace != null) {
			for (int i = 0; i < value2NoSpace.length(); i++) {
				if (value2NoSpace.charAt(i) >= 'A' && value2NoSpace.charAt(i) <= 'Z') {
					value2LowerCase = value2LowerCase + (char) (value2NoSpace.charAt(i) + 32);
				} else {
					value2LowerCase = value2LowerCase + value2NoSpace.charAt(i);
				}
			}
		}

		// Spiting the value to an char and store it an array.
		char[] charValue1 = new char[value1LowerCase.length()];
		char[] charValue2 = new char[value2LowerCase.length()];

		for (int i = 0; i < value1LowerCase.length(); i++) {
			charValue1[i] = value1LowerCase.charAt(i);
		}

		for (int i = 0; i < value2LowerCase.length(); i++) {
			charValue2[i] = value2LowerCase.charAt(i);
		}

		
		// Sorting the char array ascending order
		for (int i = 0; i < charValue1.length; i++) {
			for (int j = 1; j < charValue1.length - i; j++) {
				if (charValue1[j] < charValue1[j - 1]) {
					char temp = charValue1[j];
					charValue1[j] = charValue1[j - 1];
					charValue1[j - 1] = temp;
				}
			}
		}

		for (int i = 0; i < charValue2.length; i++) {
			for (int j = 1; j < charValue2.length - i; j++) {
				if (charValue2[j] < charValue2[j - 1]) {
					char tempVar = charValue2[j];
					charValue2[j] = charValue2[j - 1];
					charValue2[j - 1] = tempVar;
				}
			}
		}

		// comparing the two char[] array
		boolean isAnagram = true;

		if (charValue1.length != charValue2.length) {
			isAnagram = false;
		} else {
			for (int i = 0; i < charValue1.length; i++) {
				if (charValue1[i] != charValue2[i]) {
					isAnagram = false;
					break;
				}
			}
		}

		// printing the value
		if (isAnagram) {
			System.out.println("The given string are anagram..!");
		} else {
			System.out.println("The given String are not an anagram..!");
		}

	}

}
