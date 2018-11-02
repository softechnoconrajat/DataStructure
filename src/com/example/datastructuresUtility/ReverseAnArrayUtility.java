package com.example.datastructuresUtility;

public class ReverseAnArrayUtility {
	
	public static int[] reverseArray(int input[]) {
		
		int i;
		int j = input.length-1;
		
		for(i=0;i<input.length/2;i++) {
			int temp = input[i];
			input[i] = input[j];
			input[j] = temp;
			j = j-1;
			
		}
		return input;
	}

}
