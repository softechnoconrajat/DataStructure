package com.example.datastructures.Strings;

public class ExpandStringNumberFromRange {
	
	public static void expandString(String input) {
		
		char[] ch = input.toCharArray();
		
		for(int i = 0; i< input.length(); i++) {
			if(ch[i]== '-') {
				System.out.println(ch[i-1] + " "  + ch[i+1]);
				
			}
		}
		
	}

}
