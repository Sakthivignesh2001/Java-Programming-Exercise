package com.example2;

public class FirstUniqueChar {

	public static void main(String[] args) {

		String input = "Management";

		input = input.replace(" ", "");

		input = input.toLowerCase();

		int[] value = new int[256];

		char[] c = new char[input.length()];

		c = input.toCharArray();

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
