package com.example.StringValueReverse;


/*
 * Input: Sakthi vignesh bala
 * 
 * Output: bala vignesh Sakthi 
 */
public class ReverseTwoWords {

	public static void main(String[] args) {

		String s1 = "Sakthi vignesh bala";
		String s2 = "";
		
		String arr[] = s1.split(" ");
		
		for(int i = arr.length-1 ; i >= 0 ; i--) {
			s2 = s2 + arr[i] +  " ";
		}
		
		System.out.println("Input String value: " + s1);
		System.out.println("Output String value: " + s2);

	}

}
