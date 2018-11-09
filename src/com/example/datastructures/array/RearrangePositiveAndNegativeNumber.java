package com.example.datastructures.array;

public class RearrangePositiveAndNegativeNumber {

	public static int[] rearrangePositiveNegative(int input[]) {
		int count = 0;
		
		for(int i=0;i<input.length;i++) {
			if(input[i]<0) {
				int temp = input[count];
				input[count] = input[i];
				input[i] = temp;
				count++;
			}
			
		}
	return input;
	}
	
}
