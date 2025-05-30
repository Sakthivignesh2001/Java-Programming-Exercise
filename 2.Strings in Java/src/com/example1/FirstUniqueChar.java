package com.example1;

public class FirstUniqueChar {

	public static void main(String[] args) {

		String input = "institutions";

		int[] value = new int[256];

		char[] c = new char[input.length()];

		for (int i = 0; i < input.length(); i++) {
			c[i] = input.charAt(i);
		}

		for (int i : c) {
			value[i]++;
		}

		boolean result = false;

		for (char ch : c) {
			if (value[ch] == 1) {
				System.out.println("The first non repeating char is: " + ch);
				result = true;
				break;
			}
		}
		if (result == false) {
			System.out.println("All the char are repeated");
		}

	}

}
