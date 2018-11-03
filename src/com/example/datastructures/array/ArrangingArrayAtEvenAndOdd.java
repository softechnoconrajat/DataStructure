package com.example.datastructures.array;

import com.example.datastructuresUtility.MergeSortUtility;

public class ArrangingArrayAtEvenAndOdd {
	public static void arrangeEvenOdd(int input[]) {
		
		int[] shortedPositionArray = new int[input.length];
		//Shorting the Array Using mergeShore.
		
		MergeSortUtility.mergeShort(input);
		
		int midOfInput = input.length/2;
		int i = 0;
		int k = midOfInput;
		
		while(i < input.length) {
			shortedPositionArray[i] = input[k];
			
			k = k - 1;
			i = i + 2;	
		}
		
		i = 1;
		k = midOfInput;
		
		while(i < input.length) {
			shortedPositionArray[i] = input[midOfInput+1];

			midOfInput = midOfInput + 1;
			i = i + 2;	
		}
		
		CommonArrayUtility.printArrayElements(shortedPositionArray);
		
	}
}
