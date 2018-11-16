package com.example.datastructures.Strings;

public class CheckingDuckNumber {
	
	public static boolean isDuckNumber(String input) {
		
		
		if(input.charAt(0)=='0')
			return false;
		
		for(int i=1;i<input.length();i++) {
			if(input.charAt(i)=='0')
				return true;
		}
		return false;
	}

}
