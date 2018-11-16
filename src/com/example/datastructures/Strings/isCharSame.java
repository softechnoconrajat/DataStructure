package com.example.datastructures.Strings;



public class isCharSame {
	
	public static boolean isCharSame(String input) {
		
		int i;
		
		char firstCharacter = input.charAt(0);
		
		for(i=0; i<input.length();i++) {
			if(input.charAt(i)!=firstCharacter)
				return false;
		}
		
		return true;
	}

}
