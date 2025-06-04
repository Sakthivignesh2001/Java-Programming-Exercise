package com.example.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _1_SortaList {

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
		
		List<Integer> streamValues = values.stream().sorted().collect(Collectors.toList());
		
		for(int i : streamValues) {
			System.out.println(i);
		}

	}

}
