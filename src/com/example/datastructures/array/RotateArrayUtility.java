package com.example.datastructures.array;

public class RotateArrayUtility {
	
	public static void leftRotateArray(int input[], int rotationIndex) {
		
		if (input == null || input.length == 0) {
			System.out.println("No array elements to rotate");
			return;
		}
		
		int actualRoationCount = rotationIndex % input.length;
		
		if(actualRoationCount == 0) {
			CommonArrayUtility.printArrayElements(input);
			return ;			
		}
				
		int[] temp = new int[actualRoationCount] ;
		int j = 0;
		
		for(int i = 0; i < actualRoationCount; i++) {
			temp[i] = input[i];	
		}
		
		input = leftShiftArray(input, actualRoationCount);
		
		for(int i = input.length - actualRoationCount ; i < input.length; i++) {
			input[i] = temp[j];
			j = j + 1;
		}
		CommonArrayUtility.printArrayElements(input);
	}
	
	//to shift within the array by m position.
	private static int[] leftShiftArray(int input[], int rotationIndex) {
		
		for(int i = 0; i < input.length - rotationIndex ; i++) {
			input[i] = input[i + rotationIndex];	
		}
		
		return input;
	}
}
