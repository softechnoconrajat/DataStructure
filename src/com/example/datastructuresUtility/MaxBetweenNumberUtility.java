package com.example.datastructuresUtility;

public class MaxBetweenNumberUtility {
	
	public static int maxNumber(int num1, int num2) {
		if(num1 == num2)
			return num1;
		
		if(num1>num2)
			return num1;
		return num2;
	}

}
