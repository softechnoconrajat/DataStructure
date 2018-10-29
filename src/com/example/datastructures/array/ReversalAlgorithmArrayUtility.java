package com.example.datastructures.array;

public class ReversalAlgorithmArrayUtility {
	
	public static void rotate(int input[], int rotationIndex, int sizeOfInput) {
		
		int actualRotationCount = rotationIndex % sizeOfInput;
		
		if(actualRotationCount == 0) {
			CommonArrayUtility.printArrayElements(input);
			return;
		}
	
		input = reverseArray(input, 0, actualRotationCount-1);
		input = reverseArray(input, actualRotationCount, sizeOfInput-1);
		input = reverseArray(input, 0, sizeOfInput-1);
		CommonArrayUtility.printArrayElements(input);
			
	}
	
	// function to reverse the array.
	private static int[] reverseArray(int input[], int startPosition, int lastPosition) {
				
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
