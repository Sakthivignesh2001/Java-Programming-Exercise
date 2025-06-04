package com.example.count;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _1_CountStringStartingwithA {

	public static void main(String[] args) {
		
		ArrayList<String> values = new ArrayList<>();

		values.add("Sachin Tendulkar");
		values.add("MSD");
		values.add("Amir");
		values.add("Virat Kohli");
		values.add("Raina");
		values.add("Alpha");
		values.add("Gill");

		System.out.println("Actual value " + values);
		
		long value = values.stream().filter(s -> s.startsWith("A")).count();
		
		System.out.println("Total value start with 'A' is :: " + value);
		
		List<String> getValue = values.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
		
		for(String s : getValue) {
			System.out.println(s);
		}

	}

}
