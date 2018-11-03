package com.example.datastructuresUtility;

public class MergeSortUtility {
	
	public static int[] mergeShort(int input[]) {
	
		int j = 0;
		int arrayLength = input.length;
		
		if(arrayLength < 2)
			return null;
		
		int midPointArray;
		midPointArray = arrayLength/2;
		
		int[] leftArray =new int[midPointArray];
		int[] rightArray = new int[arrayLength-midPointArray];
		
		for(int i =0;i<midPointArray; i++) {
			leftArray[i] = input[i];
				
		}
		
		for(int i=midPointArray; i<arrayLength; i++) {
			rightArray[j] = input[i];
			j = j+1;
		}
		mergeShort(leftArray);
		mergeShort(rightArray);
		merge(leftArray, rightArray, input);
		return input;
	}
	
	private static int[] merge(int left[],int right[], int input[]) {
		int leftArrayLength = left.length;
		int rightArrayLength = right.length;
		
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < leftArrayLength && j < rightArrayLength) {
			
			if(left[i] <= right[j]) {
				input[k] = left[i];
				
				i = i + 1;
			}
			else {
				input[k] = right[j];
				j = j + 1;
				
			}
			k = k+ 1;
		}
		while(i < leftArrayLength) {
			input[k] = left[i];
			k = k+1;
			i = i+1;
		}
		while(j < rightArrayLength) {
			input[k] = right[j];
			k = k+1;
			j = j+1;
		}	
		return input;
		
	}

}
