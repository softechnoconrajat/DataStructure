package com.example.datastructures.array;

public class MaxSum {
	
	public static void maxSum(int input[]) {
		int arraySum = 0 ;
		int currSumValue = 0;
		
		for(int i = 0; i < input.length; i++) {
			arraySum = arraySum + input[i];
			currSumValue = currSumValue + i*input[i];	
		}
		
		int maxSumValue = currSumValue;
		
		for(int j=1; j<input.length;j++) {
			currSumValue = (currSumValue + arraySum) - (input.length)*input[input.length -j];
			if(currSumValue > maxSumValue) {
				maxSumValue = currSumValue;
			}	
		}
		System.out.println(maxSumValue);
	}

 }
