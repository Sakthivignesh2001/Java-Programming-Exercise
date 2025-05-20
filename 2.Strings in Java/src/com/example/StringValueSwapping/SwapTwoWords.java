package com.example.StringValueSwapping;

public class SwapTwoWords {

	public static void main(String[] args) {
		
		String value1 = "Sakthi vignesh Bala";
		String value2 = "";
		
		String[] arr = value1.split(" ");
		
		for(int i = arr.length-1 ; i >= 0 ; i--) {
			value2 = value2 + arr[i] + " ";
		}
		
		System.out.println("Before Swapping : " + value1);
		System.out.println("After Swapping: " + value2);
	}
}

//Before Swapping : Sakthi vignesh Bala
//After Swapping: Bala vignesh Sakthi 