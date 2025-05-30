package com.example2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String input1 = "Ana GRam";
		String input2 = "nagarA M";
		
		input1 = input1.replace(" ", "");
		input2 = input2.replace(" ", "");
		
		input1 = input1.toLowerCase();
		input2 = input2.toLowerCase();
		
		char[] c1 = input1.toCharArray();
		char[] c2 = input2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)) {
			System.out.println("The given string value is an anagram");
		}else {
			System.out.println("The given string value is not an anagram");
		}

	}

}
