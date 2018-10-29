package com.example.datastructures.array;

public class CyclicallyRotateByOne {
	
	public static void cyclicallyRotateByone(int input[]) {

		int temp = input[input.length-1];
		
		for(int i = input.length-1; i > 0; i--) {
			input[i] = input[i-1];
		}
		input[0] = temp;	
		CommonArrayUtility.printArrayElements(input);
	}
}
