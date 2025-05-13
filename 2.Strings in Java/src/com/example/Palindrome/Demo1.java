package com.example.Palindrome;

public class Demo1 {

	public static void main(String[] args) {
		
		String s1 = "NITIN";
		String s2 = "";
		
		for(int i = s1.length()-1 ; i >= 0 ; i--) {
			s2 = s2 + s1.charAt(i);
		}
		
		if(s1.equals(s2)) {
			System.out.println("The given String '" + s2 + "' is an Palindrom..!" );
		}else {
			System.out.println("The given String '" + s2 + "' is not an Palindrom..!" );
		}
	}
}
