package com.example.datastructuresUtility;

public class reverseArrayUtility {
	
	// function to reverse the array.
	public static int[] reverseArray(int input[], int startPosition, int lastPosition) {
				
		//using while Loop
		while(startPosition < lastPosition) {
			int temp = input[startPosition];
			input[startPosition] = input[lastPosition];
			input[lastPosition] = temp;
			startPosition++;
			lastPosition--;	
		}		
		return input;		
	}

}
