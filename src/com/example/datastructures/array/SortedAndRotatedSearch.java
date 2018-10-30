package com.example.datastructures.array;

public class SortedAndRotatedSearch {
	
	public static int pivotedBinarySearch(int input[], int n,  int searchItem) {
		
		int pivot = findPivot(input, 0, n-1);
		
		if(pivot == -1)
			return BinarySearchUtility.binarySearch(input, 0, n-1, searchItem);
		
		if(input[pivot] == searchItem)
			return pivot;
		if(input[0]<=searchItem)
			return BinarySearchUtility.binarySearch(input, pivot+1, n-1, searchItem);
		
		return BinarySearchUtility.binarySearch(input, pivot+1, n-1, searchItem);
		
	
	}
	
	private static int findPivot(int input[], int lowIndex, int highIndex) {
		
		//Base case
		if(highIndex < lowIndex)
			return -1;
		if(highIndex == lowIndex)
			return lowIndex;
		
		//Normal case
		int midIndex = (lowIndex + highIndex)/2;
		if(midIndex < highIndex && input[midIndex] > input[midIndex+1])
			return midIndex;
		if(midIndex > lowIndex && input[midIndex] < input[midIndex - 1])
			return (midIndex-1);
		if(input[lowIndex] >= input[midIndex])
			return findPivot(input, lowIndex, midIndex-1);
		
		return findPivot(input, midIndex +1, highIndex);	
		
	}

}
