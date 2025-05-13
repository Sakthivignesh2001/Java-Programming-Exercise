package com.example.StringValueSwapping;

public class ValueSwaping {
	
	// copy value1 -> value2
	
	public static void main(String[] args) {
		String value1 = "Sakthi";
		String value2 = "";
		
		for(int i = 0 ; i < value1.length() ; i++) {
			value2 = value2 + value1.charAt(i);
		}
		
		
		System.out.println("Value1 is : " + value1);
		System.out.println("Value2 is : " + value2);
	}
	

}
