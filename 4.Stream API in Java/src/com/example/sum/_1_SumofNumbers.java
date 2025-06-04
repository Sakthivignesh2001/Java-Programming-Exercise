package com.example.sum;

import java.util.ArrayList;

public class _1_SumofNumbers {

	public static void main(String[] args) {
		
		ArrayList<Integer> values = new ArrayList<>();

		values.add(10);
		values.add(5);
		values.add(25);
		values.add(60);
		values.add(10);
		values.add(25);
		values.add(30);

		System.out.println("Actual value " + values);
		
		int sumValue = values.stream().mapToInt(i -> i.intValue()).sum();
		
		System.out.println(sumValue);

	}

}
