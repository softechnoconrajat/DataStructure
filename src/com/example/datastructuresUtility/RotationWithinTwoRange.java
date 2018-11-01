package com.example.datastructuresUtility;

public class RotationWithinTwoRange {
	
	public static int[] rotationWithinRange(int input[], int startIndex, int lastIndex) {
		
		int i;
		int temp[] = input.clone();
		
		
		if(lastIndex > input.length)
			return input;
		
		if(startIndex>lastIndex)
			return input;
		
		for(i=0;i<lastIndex-startIndex + 1; i++) {
			temp[startIndex + i] = input[(lastIndex - i)];
			//System.out.println(input[(lastIndex - i)]);	
		}
		
		return temp;
		
	}

}
