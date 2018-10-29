package com.example.datastructures;

import com.example.datastructures.array.BlockSwapAlgorithm;
import com.example.datastructures.array.CyclicallyRotateByOne;
import com.example.datastructures.array.ReversalAlgorithmArrayUtility;
import com.example.datastructures.array.RotateArrayUtility;


public class Caller {

	public static void main(String[] args) {
//		Caller.testArrayRotation();
	//	Caller.reversalAlgorithmRotation();
		//Caller.blockSwapAlgorithmRotation1();
		Caller.cyclicallyRotateByone();
	}
	
	private static void testArrayRotation() {
		int inputArray[] = {1,2,3,4,5,6,7,8,9,0};
		int rotationIndex = 7;
		RotateArrayUtility.leftRotateArray(inputArray, rotationIndex);	
	}
	
	private static void reversalAlgorithmRotation() {
		int inputArray[] = {1,2,3,4,5,6,7,8,9,0};
		int rotationIndex = 7;
		int sizeOfInput = inputArray.length;
		
		ReversalAlgorithmArrayUtility.rotate(inputArray, rotationIndex, sizeOfInput);
		
		
	}
	
	
	private static void blockSwapAlgorithmRotation1() {
		int inputArray[] = {1,2,3,4,5,6,7,8,9,0};
		int rotationIndex = 8;
		int sizeOfInput = inputArray.length;
		
		BlockSwapAlgorithm.rotateArrayLeft(inputArray, rotationIndex, sizeOfInput);
		
	}
	
	private static void cyclicallyRotateByone() {
		int inputArray[] = {1,2,3,4,5,6,7,8,9,0};

		CyclicallyRotateByOne.cyclicallyRotateByone(inputArray);
		
	}
}
