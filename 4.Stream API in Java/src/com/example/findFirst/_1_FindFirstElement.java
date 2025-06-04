package com.example.findFirst;

import java.util.ArrayList;
import java.util.Optional;

public class _1_FindFirstElement {

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
		
		Optional<String> firstValue = values.stream().findFirst();
		if(firstValue != null) {
			System.out.println("First value is :: " +firstValue.get());
		}

		//-------------------------------------------------------------------------
		
		System.out.println("----------------------------------------------------------");
		
		ArrayList<String> values2 = new ArrayList<>();


		System.out.println("Actual value " + values2);
		
		Optional<String> firstValue2 = values2.stream().findFirst();
		if(firstValue2.isPresent()) {
			System.out.println("First value is :: " +firstValue2);
		} else {
			System.out.println("No values are added");
		}

	}

}
