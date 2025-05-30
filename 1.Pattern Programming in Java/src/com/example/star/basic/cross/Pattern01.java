package com.example.star.basic.cross;

/*
 * 
 * 	Print X and square box
 * 
 * i -> row(left to right)
 * j -> column (top to bottom)
 * 
 * i == j -> left cross line
 * 
 * i + j == n-1 -> Right cross line
 * 
 */

public class Pattern01 {

	public static void main(String[] args) {
		
		int n = 10;
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(
					(j == 0) ||
					(i == 0) ||
					(j == n-1)||
					(i == n-1) ||
					(i == j) ||		// Left cross line
					(i + j == n-1)	// Right cross line
				) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

//**********
//**      **
//* *    * *
//*  *  *  *
//*   **   *
//*   **   *
//*  *  *  *
//* *    * *
//**      **
//**********
