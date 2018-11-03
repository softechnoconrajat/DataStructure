package com.example.datastructuresUtility;

public class QuickSortUtility {
	
	public static int[] quickSort(int[] input, int start, int end) {
		
		if(start<=end) {
			int partitionIndex = sort(input,start,end);
			quickSort(input, start,partitionIndex-1);
			quickSort(input, partitionIndex+1, end);
		}
		return input;	
	}
	
	private static int sort(int[] input, int startIndex, int lastIndex) {
		int partitionIndex = startIndex;
		int pivot = lastIndex;
		
			for(int i=startIndex;i<lastIndex;i++) {
				if(input[i] <= input[pivot]) {
					int temp = input[i];
					input[i] = input[partitionIndex];
					input[partitionIndex] = temp;
					partitionIndex = partitionIndex +1;
				}
			}
			int temp1 = input[partitionIndex];
			input[partitionIndex] = input[pivot];
			input[pivot] = temp1;
			
		return partitionIndex;
			
	}
	
}
