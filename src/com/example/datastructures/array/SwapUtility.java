package com.example.datastructures.array;

public class SwapUtility {
	
public static void swapArray(int input[], int fi, int si , int d) {
	int temp;
		for(int i=0; i<d; i++) {
			
			
			temp = input[fi + i];
			input[fi + i] = input[si + i];
			input[si + i] = temp;	
		}	
		
	}

}
