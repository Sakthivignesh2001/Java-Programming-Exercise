package com.example.star.basic;

/*
 * 
 * 	Print E
 * 
 * i -> row(left to right)
 * j -> column (top to bottom)
 * 
 * (n-1)/2 -> center line
 * 
 */

public class Pattern04 {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(i == 0 || i == (n-1)/2 || i == n-1 || j == 0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		


	}

}
