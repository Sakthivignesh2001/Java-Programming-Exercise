package com.example.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _1_ConvertStringstoUppercase {

	public static void main(String[] args) {

		ArrayList<String> values = new ArrayList<>();

		values.add("Sachin Tendulkar");
		values.add("MSD");
		values.add("Virat Kohli");
		values.add("Raina");
		values.add("Gill");

		System.out.println("Actual value " + values);

		List<String> streamValues = values.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());

		for (String s : streamValues) {
			System.out.print(s + ", ");
		}

	}

}
