package com.example.StringValueReverse;

/*
 * Input: Sakthi vignesh Bala
 * 
 * Output:  ihtkaS hsengiv alaB 
 */

public class ReverseLetterInSameWord {

	public static void main(String[] args) {

		String s1 = "Sakthi vignesh Bala";
		String s2 = "";

		String[] arr = s1.split(" ");

		for (int i = 0; i < arr.length; i++) {
			String value = arr[i];
			for (int j = value.length() - 1; j >= 0; j--) {
				s2 = s2 + value.charAt(j);
			}
			s2 = s2 + " ";
		}

		System.out.println("Input String value: " + s1);
		System.out.println("Output String value: " + s2);
	}

}
