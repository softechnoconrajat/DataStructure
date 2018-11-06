package com.example.datastructures.array;

import com.example.datastructuresUtility.ArrayRotationUtility;

public class DFEMZ {
	
	public static int[] doublefirstElementMovetoZero(int input[]) {
		
		if(input.length == 0)
			return input;
		
		for(int i=0;i<input.length-1;i++) {
			if(input[i] == input[i+1] && input[i] != 0) {
				input[i] = input[i] + input[i+1];
				input[i+1] = 0;
			}
			else {
				input[i] = input[i];
			}
		}
		moveZeroToLast(input);
		
		return input;
	}
	
	private static int[] moveZeroToLast(int input[]) {
		int count = 0;
		for(int i=0;i<input.length; i++) {
			if(input[i]!=0) {
				int temp = input[i];
				input[count] = temp;
				if(i != 0) {
					input[i]=0;
				}
				count++;
			}
		}
		
		return input;
	}

}
