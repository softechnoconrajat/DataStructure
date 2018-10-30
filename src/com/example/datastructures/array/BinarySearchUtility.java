package com.example.datastructures.array;

public class BinarySearchUtility {
	
	public static int binarySearch(int input[], int lowIndex, int highIndex, int key) {
		if(highIndex<lowIndex)
			return -1;
		
		int midIndex = (lowIndex + highIndex)/2;
		if(key == input[midIndex])
			return midIndex;
		if(key > input[midIndex])
			return binarySearch(input, (midIndex + 1), highIndex, key);
		
		return binarySearch(input, lowIndex, (midIndex-1), key);
		
	}	

}
