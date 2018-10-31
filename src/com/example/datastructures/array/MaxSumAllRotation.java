package com.example.datastructures.array;

public class MaxSumAllRotation {
	
	public static void maxSum(int input[]) {
		
		if(input.length == 0)
			return;
		
		int res = Integer.MIN_VALUE;
		
		for(int i=0; i<input.length;i++) {
			int maxValue = 0;
			
			for(int j = 0; j<input.length;j++) {
				
				int indexValue = (i+j)%input.length;
				maxValue = maxValue + indexValue*input[indexValue];
				
			}
			
			res = Math.max(res, maxValue); 
		}
		
		System.out.println(res);
		
		
	}
	
	//Efficient Solution TimeComplexity: O(n)
	
	public static void maxSum1(int input[]) {
		int currValue =0;
		int arraySum = 0;
		
		for(int i=0; i<input.length; i++) {
			arraySum = arraySum + input[i];
			currValue = currValue + i*input[i];
		}
		
		int res = currValue;
		
		for(int j=1;j<input.length;j++) {
			int nextValue = currValue - (arraySum - input[j-1]) + input[j-1]*(input.length-1);
			currValue = nextValue;
			res = Math.max(res, nextValue);
		}
		
		System.out.println(res);
	}
	

}
