package com.example.datastructures.array;

public class BlockSwapAlgorithm {
	
	public static void rotateArrayLeft(int input[], int rotateIndex, int sizeOfInput) {
		int i, j;
		if(rotateIndex == 0 || sizeOfInput == rotateIndex)
			return;
	
		i=rotateIndex;
		j=sizeOfInput-rotateIndex;
		
		while(i != j) {
			if(i<j)
			{
				SwapUtility.swapArray(input, rotateIndex - i, rotateIndex+j-i, i);
				j -= i;
			}
			else {
				SwapUtility.swapArray(input, rotateIndex - i, rotateIndex, j);
				i -= j;
			}		
		}	
		
		SwapUtility.swapArray(input, rotateIndex - i, rotateIndex, i);	
		
		CommonArrayUtility.printArrayElements(input);
	}
}
