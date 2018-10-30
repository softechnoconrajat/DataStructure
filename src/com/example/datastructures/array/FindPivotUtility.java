package com.example.datastructures.array;

public class FindPivotUtility {
	
public static int findPivot(int input[], int lowIndex, int highIndex) {
		
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
