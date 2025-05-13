package com.example.updateStringCases;

/*
 * Input: saKThiVIgnESh
 * 
 * Output: SAktHIviGNesH
 * 
 * 	A -> 65 .... Z -> 91
	a -> 97 ... z -> 122
 */
public class ConverMixedFormat {

	public static void main(String[] args) {

		String s1 = "saKThiVIgnESh";
		String s2 = "";
		
		for(int i = 0 ; i < s1.length() ; i ++) {

//			if(s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') {
//				s2 = s2 + (char)(s1.charAt(i) + 32);
//			}else if(s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
//				s2 = s2 + (char)(s1.charAt(i) - 32);
//			}
			
			// Use any one approach..!
			
			if(s1.charAt(i) >= 65 && s1.charAt(i) <= 91) {
				s2 = s2 + (char)(s1.charAt(i) + 32);
			}else if(s1.charAt(i) >= 97 && s1.charAt(i) <= 122) {
				s2 = s2 + (char)(s1.charAt(i) - 32);
			}
		}
		
		System.out.println("Input String value: " + s1);
		System.out.println("Output String value: " + s2);

	}

}
