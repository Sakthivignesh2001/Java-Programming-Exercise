package com.example.Palindrome;

public class Demo2 {

	public static void main(String[] args) {

		String s1 = "A man, a plan, a canal: Panama";
		String s2 = "";

		//Ignoring all special char
		s1 = s1.replaceAll("[^a-zA-Z]", "");

		
		String lowerCase = "";
		// Converting lower case
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') {
				lowerCase = lowerCase + (char) (s1.charAt(i) + 32);
			} else {
				lowerCase = lowerCase + s1.charAt(i);
			}
		}
		
		for(int i = lowerCase.length() - 1; i >= 0 ; i--) {
			s2 = s2 + lowerCase.charAt(i);
		}
		
		if(lowerCase.equals(s2)) {
			System.out.println("The given String '" + s2 + "' is an Palindrom..!" );
		}else {
			System.out.println("The given String '" + s2 + "' is not an Palindrom..!" );
		}
		
	}
}
