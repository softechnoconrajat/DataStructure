package com.example.datastructures;

import com.example.datastructures.array.RotateArrayUtility;

public class Caller {

	public static void main(String[] args) {
		Caller.testArrayRotation();
	}
	
	private static void testArrayRotation() {
		int inputArray[] = {1,2,3,4,5,6,7,8,9,0};
		int rotationIndex = 7;
		RotateArrayUtility.leftRotateArray(inputArray, rotationIndex);	
	}
}
