package com.example.min;

import java.util.ArrayList;

public class Demo01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(10);
		nums.add(5);
		nums.add(25);
		nums.add(60);
		nums.add(1);
		nums.add(20);
		nums.add(30);
		
		System.out.println("Actual value " + nums);
		
		int value = nums.stream().min((x,y) -> x.compareTo(y)).get();
		
		System.out.println("Min value is :: " + value);
	}

}
