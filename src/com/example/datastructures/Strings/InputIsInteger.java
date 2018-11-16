package com.example.datastructures.Strings;
 
public class InputIsInteger {
	
	public static boolean isInteger(String input) {
		
		int i;
		
		for(i=0;i<input.length();i++) {
			if(Character.isDigit(input.charAt(i))== false) {
				return false;
				
			}					
	}
		return true;

}
	
}
