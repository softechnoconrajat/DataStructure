package com.example.datastructures.array;

public class CommonArrayUtility {

	public static void printArrayElements(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void printStringArrayElements(String arr[]) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.print(arr[i]);
			}
			
		}
	}

}
