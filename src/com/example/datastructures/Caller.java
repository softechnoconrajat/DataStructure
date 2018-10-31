package com.example.datastructures;

import com.example.datastructures.array.BlockSwapAlgorithm;
import com.example.datastructures.array.CyclicallyRotateByOne;
import com.example.datastructures.array.LeftRotationMultipleTimes;
import com.example.datastructures.array.MaxSum;
import com.example.datastructures.array.MaxSumAllRotation;
import com.example.datastructures.array.ReversalAlgorithmArrayUtility;
import com.example.datastructures.array.RotateArrayUtility;
import com.example.datastructures.array.RotationCount;
import com.example.datastructures.array.SortedAndRotatedSearch;


public class Caller {

	public static void main(String[] args) {
//		Caller.testArrayRotation();
	//	Caller.reversalAlgorithmRotation();
		//Caller.blockSwapAlgorithmRotation1();
		//Caller.cyclicallyRotateByone();
		Caller.toFindMaxSumInArray();
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
	
//	private static void cyclicallyRotateByone() {
//		int inputArray[] = {2,3,4,5,6,7,8,19,0,1};
//
//		//CyclicallyRotateByOne.cyclicallyRotateByone(inputArray);
		
		//int x = SortedAndRotatedSearch.pivotedBinarySearch(inputArray, inputArray.length ,  19);
		
//		int x = SortedAndRotatedSearch.rotatedArrayBinarySearch(inputArray, 0, inputArray.length-1, 2);
//		
//		System.out.println(x);
//		
//	}
	
	private static void toFindMaxSumInArray() {
		int inputArray[] = {19, 0,1,2,3,4,5,6,7,8};
//		int rotationIndex = 8;
//		int sizeOfInput = inputArray.length;
		
//		MaxSum.maxSum(inputArray);
		
	//	MaxSumAllRotation.maxSum1(inputArray);
		
//		RotationCount.rotaitonCount(inputArray);
		
		LeftRotationMultipleTimes.multipleRotaion(inputArray, 39);
		
	}
}
