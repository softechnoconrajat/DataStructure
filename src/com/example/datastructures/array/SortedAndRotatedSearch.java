package com.example.datastructures.array;

public class SortedAndRotatedSearch {
	
	public static int pivotedBinarySearch(int input[], int n,  int searchItem) {
		
		int pivot = FindPivotUtility.findPivot(input, 0, n-1);
		
		if(pivot == -1)
			return BinarySearchUtility.binarySearch(input, 0, n-1, searchItem);
		
		if(input[pivot] == searchItem)
			return pivot;
		if(input[0]<=searchItem)
			return BinarySearchUtility.binarySearch(input, pivot+1, n-1, searchItem);
		
		return BinarySearchUtility.binarySearch(input, pivot+1, n-1, searchItem);
		
	
	}
	
	
	
	//Improved method to solve the above problem.
	
	public static int  rotatedArrayBinarySearch(int input[], int startIndex, int lastIndex, int searchItem) {
		
		if(startIndex > lastIndex)
			return -1;
		
		int midIndex = (lastIndex + startIndex)/2;
		if(input[midIndex] == searchItem)
			return midIndex;
		
		if(input[startIndex]<=input[midIndex])
		{
			if(searchItem >= input[startIndex] && searchItem <= input[midIndex])
				return rotatedArrayBinarySearch(input, startIndex, midIndex-1, searchItem);
			
			return rotatedArrayBinarySearch(input, midIndex + 1, lastIndex-1, searchItem);
		}
		
		if(searchItem >=  input[midIndex] && searchItem <= input[lastIndex])
			return rotatedArrayBinarySearch(input, midIndex + 1, lastIndex, searchItem);
		
		return rotatedArrayBinarySearch(input, startIndex, midIndex-1, searchItem);
		
		
		
	}

}
