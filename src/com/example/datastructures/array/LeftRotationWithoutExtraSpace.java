package com.example.datastructures.array;

public class LeftRotationWithoutExtraSpace {
	public static void leftRotation(int input[], int m) {
		
		int i = 0;
		int effectiveIndexOfRotation = m % input.length ;
		
		for(i=0;i<input.length;i++) {
			int j = (i + effectiveIndexOfRotation) % input.length;
			System.out.println(input[j]);	
		}	
	}
}
