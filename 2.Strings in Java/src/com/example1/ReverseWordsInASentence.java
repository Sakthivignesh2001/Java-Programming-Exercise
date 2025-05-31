package com.example1;

/*
 * 
 * Input: Sri Ramakrishna Institute Of Technology
 * 
 * Output: Technology Of Institute Ramakrishna Sri 
 */

public class ReverseWordsInASentence {

	public static void main(String[] args) {

		String input = "Sri Ramakrishna Institute Of Technology";
		String output = "";

		String arr[] = input.split(" ");

		for (int i = arr.length - 1; i >= 0; i--) {
			output = output + arr[i] + " ";
		}

		System.out.println(output);

	}
}
