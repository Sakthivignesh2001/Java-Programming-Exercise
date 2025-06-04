package com.example.distinct;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _1_RemoveDuplicates {

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
		
		List<Integer> streamValue = values.stream().distinct().collect(Collectors.toList());
		
		for(int i : streamValue) {
			System.out.println(i);
		}

	}

}
