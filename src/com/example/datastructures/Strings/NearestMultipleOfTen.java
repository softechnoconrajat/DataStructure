package com.example.datastructures.Strings;

public class NearestMultipleOfTen {
	
	public static int nearestMultipleOfTen(int input) {
		
		int a = (input/10)*10;
		
		int b = a + 10;
				
		return (input-a > b-input)?b:a;
	}
	

}
