package com.example.datastructures.array;

public class LeftRotationMultipleTimes {
	
	public static void multipleRotaion(int input[], int number) {
		
		System.out.println("Array Before Rotation");
		CommonArrayUtility.printArrayElements(input);
		
		int start = number%input.length;
		
		int[] temp = new int[start];
		
		for(int i=0; i< start; i++) {
			temp[i] = input[i];
		}
		int i=0;
		for(int j=start; j<input.length;j++) {
			input[i] = input[j];
			i = i+1;
		}
		int z = 0;
		for(int k = i; k<input.length; k++) {
			input[k] = temp[z];
			z = z+1;
			
		}
		System.out.println("Array After Rotation");
		
		CommonArrayUtility.printArrayElements(input);

	}
	
	
		

	
}