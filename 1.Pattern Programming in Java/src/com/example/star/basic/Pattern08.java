package com.example.star.basic;

/*
 * 
 * 	a. Print o (outer 8 * 8 but print o in 5*5)
 *  b. Print o (outer 8 * 8 but print o in 6*6)
 * 
 * i -> row(left to right)
 * j -> column (top to bottom)
 * 
 * n/4 -> quarter
 * 3*n/4 -> 3/4th
 * 
 * 
 */
public class Pattern08 {

	public static void main(String[] args) {
		
		int n = 8;
		
		for (int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				
				if(
					(i == n/4 && j > n/4 && j < (3*n)/4) ||
					(j == n/4 && i > n/4 && i < (3*n)/4) ||
					(i == (3*n)/4 && j > n/4 && j < (3*n)/4) ||
					(j == (3*n)/4 && i > n/4 && i < (3*n)/4)
				){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------");
		
		for (int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				
				if(
					(i == 1 && j > 1 && j < n-2) ||
					(j == 1 && i > 1 && i < n-2) ||
					(i == n-2 && j > 1 && j < n-2) ||
					(j == n-2 && i > 1 && i < n-2)
				){
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

//Output
//
//
// ***  
//*   * 
//*   * 
//*   * 
// ***  
//
//-----------------------------
//
// ****  
//*    * 
//*    * 
//*    * 
//*    * 
// ****  
//
//
