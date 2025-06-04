package com.eample.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _1_FilterEvenNumbers {

	public static void main(String[] args) {

		ArrayList<Integer> values = new ArrayList<>();

		values.add(10);
		values.add(5);
		values.add(25);
		values.add(60);
		values.add(1);
		values.add(20);
		values.add(30);

		System.out.println("Actual value " + values);
		
		
		List<Integer> value = values.stream().filter(n -> n % 2==0).collect(Collectors.toList());
		
		for(int i : value) {
			System.out.println(i);
		}

	}

}
