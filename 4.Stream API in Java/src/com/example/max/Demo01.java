package com.example.max;

import java.util.ArrayList;
import java.util.Comparator;

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
		
		int value = nums.stream().max((x, y) -> x.compareTo(y)).get();
		
		System.out.println("Max value is :: " + value);
	}

}
