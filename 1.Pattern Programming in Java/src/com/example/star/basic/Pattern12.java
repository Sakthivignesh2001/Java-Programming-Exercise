package com.example.star.basic;

/*
 * 	a. Print 10 * 10 -> M
 * 
 * i -> row(left to right)
 * j -> column (top to bottom)
 * 
 * i == j -> left cross line
 * 
 * i + j == n-1 -> Right cross line
 * 
 */

public class Pattern12 {

	public static void main(String[] args) {

		int n = 10;
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				
				if(
					(j == 0) ||
					(j == n-1) ||
					(i == j && j <= (n-1)/2) ||
					(i + j == n-1 && i <= (n-1)/2) 
				) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

//*        *
//**      **
//* *    * *
//*  *  *  *
//*   **   *
//*        *
//*        *
//*        *
//*        *
//*        *

