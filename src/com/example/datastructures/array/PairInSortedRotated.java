package com.example.datastructures.array;

public class PairInSortedRotated {
	
	public static boolean sumPair(int input[], int arraySize, int pairSum) {
		
		for(int i = 0 ; i< arraySize-1; i++) {
			if(input[i] > input[i+1]) 
				break;
			
			int l = (i + 1) % arraySize;
			int r = i;
			
			while(l!=r)
			{
				if(input[l] + input[r] == pairSum)
					return true;
				
				if(input[l] + input[r] < pairSum)
					l = (l+1)%arraySize;
				else
					r = (arraySize + r -1) % pairSum;		
			}
			
		}
		
		return false;	
	}
	

}
