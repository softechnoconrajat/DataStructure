package com.example.datastructures.array;

import com.example.datastructuresUtility.*;


public class ReversalAlgorithmArrayUtility {
	
	public static void rotate(int input[], int rotationIndex, int sizeOfInput) {
		
		int actualRotationCount = rotationIndex % sizeOfInput;
		
		if(actualRotationCount == 0) {
			CommonArrayUtility.printArrayElements(input);
			return;
		}
	
		input = reverseArrayUtility.reverseArray(input, 0, actualRotationCount-1);
		input = reverseArrayUtility.reverseArray(input, actualRotationCount, sizeOfInput-1);
		input = reverseArrayUtility.reverseArray(input, 0, sizeOfInput-1);
		CommonArrayUtility.printArrayElements(input);
			
	}
	
	
}
