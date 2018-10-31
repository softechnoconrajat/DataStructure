package com.example.datastructures.array;

public class RotationCount {
	
	public static void rotaitonCount(int input[]) {
		
		int largestValueIndex = 0;
		largestValueIndex = FindPivotUtility.findPivot(input, 0, input.length);
		//System.out.println(largestValueIndex);
		
		int rotationCount = largestValueIndex + 1;
		
		System.out.println(rotationCount);
	}

}
