package com.example.star.basic;

/*
 * 
 * 	Print H
 * 
 * i -> row(left to right)
 * j -> column (top to bottom)
 * 
 * (n-1)/2 -> center line
 * 
 */

public class Pattern03 {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(j == 0 || j == n-1 || i == (n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		


	}

}
