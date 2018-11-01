package com.example.datastructuresUtility;

public class HammingDistanceUtility {
	
	public static int hammingDistanceCalculation(int array1[], int array2[]) {
		int hammingDistance = 0;
		int i = 0;
		
		if(array1.length != array2.length)
			return hammingDistance;
		
		
		for(i=0;i<array1.length;i++) {
			if(array1[i] != array2[i]) 
				hammingDistance = hammingDistance + 1;					
		}
		return hammingDistance;	
	}

}
