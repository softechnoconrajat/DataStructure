package com.example.datastructures.Strings;

public class PangramChecking {

	public static boolean pangram(String str) {
		
		//Creating a hash table to mark the 
		//characters present in the string
		//By default all the elements of 
		//mark would be false.
		boolean[] mark = new boolean[26];
		
		// For indexing in mark[]
		int index = 0;
		
		//traverse all character
		for(int i=0; i<str.length();i++) {
			//If upper case character subtracts with 'A' to find the index.
			if('A'<=str.charAt(i) && str.charAt(i)<='Z') {
				index = str.charAt(i) - 'A';
			}
			else if('a'<= str.charAt(i) && str.charAt(i) <='z') {
				index = str.charAt(i) - 'a';
			}
			mark[index] = true;
		}
		
		for(int i=0;i<mark.length;i++) {
			if(mark[i] == false)
				return false;
		}
		
		System.out.println('Z'-'A');
		
		return true;
	}
}
