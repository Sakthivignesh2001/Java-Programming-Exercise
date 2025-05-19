package com.example.star.basic;

/*
 * 	a. Print 10 * 10 -> G 
 * 
 * i -> row(left to right)
 * j -> column (top to bottom)
 * 
 * n/4 -> quarter
 * n-1 last line
 * n last line
 * n/2 half
 * 
 * 
 */

public class Pattern09 {

	public static void main(String[] args) {
		
		int n = 10;
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				
				if(
					(i == 0 && j > 0 && j < n) || 
					(j == 0 && i > 0 && i < n) ||
					(i == n-1 && j > 0 && j < n/2) ||
					(i == n/2 && j >= n/2 && j < n) ||
					(j == n/2 && i >= n/2 && i <n) ||
					(j == n-1 && i >= n/2 && i < n) ||
					(j == n-1 && i < n/4)
					
				){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

// Output: 
//
//  *********
// *        *
// *         
// *         
// *         
// *    *****
// *    *   *
// *    *   *
// *    *   *
// ******   *

