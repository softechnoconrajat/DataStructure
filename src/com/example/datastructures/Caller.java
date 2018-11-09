package com.example.datastructures;

import java.util.Vector;

import com.example.datastructures.array.ArrangeNumbertoGetBiggestNumber;
import com.example.datastructures.array.ArrangingArrayAtEvenAndOdd;
import com.example.datastructures.array.BlockSwapAlgorithm;
import com.example.datastructures.array.CommonArrayUtility;
import com.example.datastructures.array.CyclicallyRotateByOne;
import com.example.datastructures.array.DFEMZ;
import com.example.datastructures.array.LeftRotationMultipleTimes;
import com.example.datastructures.array.LeftRotationWithoutExtraSpace;
import com.example.datastructures.array.MaxSum;
import com.example.datastructures.array.MaxSumAllRotation;
import com.example.datastructures.array.RearrangePositiveAndNegativeNumber;
import com.example.datastructures.array.ReversalAlgorithmArrayUtility;
import com.example.datastructures.array.RotateArrayUtility;
import com.example.datastructures.array.RotationCount;
import com.example.datastructures.array.RotationWithMaxHammingDistance;
import com.example.datastructures.array.SortedAndRotatedSearch;
import com.example.datastructuresUtility.HammingDistanceUtility;
import com.example.datastructuresUtility.MergeSortUtility;
import com.example.datastructuresUtility.QuickSortUtility;
import com.example.datastructuresUtility.ReverseAnArrayUtility;
import com.example.datastructuresUtility.RotationWithinTwoRange;
import com.example.datastructuresUtility.SortingInBuiltUtility;
import com.example.datastructures.Strings.AdjacentAreNotSame;
import com.example.datastructures.Strings.MissingPangramCharacter;
import com.example.datastructures.Strings.PangramChecking;
import com.example.datastructures.Strings.RemovingPunctuations;


public class Caller {

	public static void main(String[] args) {
//		Caller.testArrayRotation();
	//	Caller.reversalAlgorithmRotation();
		//Caller.blockSwapAlgorithmRotation1();
		//Caller.cyclicallyRotateByone();
		//Caller.toFindMaxSumInArray();
		//Caller.toFindHammingDistance();
		//Caller.toFindMaxDistanceUsingHammin();
		
		Caller.panagramResult();
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
	
//	private static void toFindMaxSumInArray() {
//		int inputArray[] = {19, 0,1,2,3,4,5,6,7,8};
////		int rotationIndex = 8;
////		int sizeOfInput = inputArray.length;
//		
////		MaxSum.maxSum(inputArray);
//		
//	//	MaxSumAllRotation.maxSum1(inputArray);
//		
////		RotationCount.rotaitonCount(inputArray);
//		
//		LeftRotationMultipleTimes.multipleRotaion(inputArray, 39);
//		
//	}
	
//	private static void toFindHammingDistance() {
//		int inputArray1[] = {0,1,2,3,4,5,6,7,8, 19};
//		int inputArray2[] = {19, 1,1,3,3,4,5,7,8,8};
//		
//		int x = HammingDistance.hammingDistanceCalculation(inputArray1, inputArray2);
//		System.out.println(x);
//
//
//	}
//	
//	private static void toFindMaxDistanceUsingHammin() {
//		int inputArray[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
//		
//		
//		int x = RotationWithMaxHammingDistance.rotationWithMaxHammingDistance(inputArray);
//		System.out.println(x);
//
//
//	}
	
//	private static void toFindMaxDistanceUsingHammin() {
//		//int inputArray[] = {12, 11, -13, -5, 6, -7, 5, -3, -6};
//		
//		Vector<String> arr = new Vector<>();
//		arr.add("12");
//		arr.add("77");
//		arr.add("187");
//		arr.add("99");
//		arr.add("123");
//		arr.add("99");
//		
		
//		LeftRotationWithoutExtraSpace.leftRotation(inputArray, 2);
		
//		int x[] = RotationWithinTwoRange.rotationWithinRange(inputArray, 1, 6);
//		CommonArrayUtility.printArrayElements(x);
		
//		int x[] = ReverseAnArrayUtility.reverseArray(inputArray);
//		CommonArrayUtility.printArrayElements(x);
		
//		int x[] = MergeShortUtility.mergeShort(inputArray);
//		CommonArrayUtility.printArrayElements(x);
		
	//	ArrangingArrayAtEvenAndOdd.arrangeEvenOdd(inputArray);
		
//		int x[] = QuickSortUtility.quickSort(inputArray, 0, inputArray.length - 1);
//		CommonArrayUtility.printArrayElements(x);
		
//		int x[] = SortingInBuiltUtility.sorting(inputArray);
//		CommonArrayUtility.printArrayElements(x);
		
//		int x[] = DFEMZ.doublefirstElementMovetoZero(inputArray);
//		CommonArrayUtility.printArrayElements(x);
		
		
//		int x[] = RearrangePositiveAndNegativeNumber.rearrangePositiveNegative(inputArray);
//		CommonArrayUtility.printArrayElements(x);
		
		
		//ArrangeNumbertoGetBiggestNumber.printLargest(arr);
		//CommonArrayUtility.printArrayElements(arr);
		
		
//	}
	
	private static void panagramResult() {
		
//		boolean result;
//		result = PangramChecking.pangram("The quick brown fox jumps over the lazy dog");
//		System.out.println(result);
		
		//MissingPangramCharacter.missingPangram("The quick brown fox jumps over the lazy");
		
//		String[] removingPunctuations = RemovingPunctuations.removingPunctuation("Hello!!!, he said ---and went.");
//		CommonArrayUtility.printStringArrayElements(removingPunctuations);
		
		String[] adjacentAreNotSame = AdjacentAreNotSame.adjacentAreNotSame("aaabc");
		CommonArrayUtility.printStringArrayElements(adjacentAreNotSame);
	}
		
			
		
}


