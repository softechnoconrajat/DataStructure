package com.example.datastructures.array;

import com.example.datastructuresUtility.ArrayRotationUtility;
import com.example.datastructuresUtility.HammingDistanceUtility;
import com.example.datastructuresUtility.MaxBetweenNumberUtility;

public class RotationWithMaxHammingDistance {
	
	public static int rotationWithMaxHammingDistance(int input[]) {
		int currentDistance = 0;
		int maxDistance = 0;		
		int[] tempInput = new int[input.length];
				
		for(int i=1; i<input.length;i++) {
			tempInput = input.clone();
			ArrayRotationUtility.leftRotateArray(tempInput, i);
			currentDistance = HammingDistanceUtility.hammingDistanceCalculation(tempInput, input);
			maxDistance = MaxBetweenNumberUtility.maxNumber(maxDistance, currentDistance);
		}
		return maxDistance;
			
	}
}
