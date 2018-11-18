package com.example.datastructures.Strings;

public class NameInitials {
	
	
	public static void nameInitails(String input) {
		
		int i;
		
		System.out.print(Character.toUpperCase(input.charAt(0)));
		System.out.print(" ");
		
		for(i=0;i<input.length();i++) {
			if(Character.isSpaceChar(input.charAt(i))){
				System.out.print(Character.toUpperCase(input.charAt(i+1)));
				System.out.print(" ");
				
			}
		}
		
	}

}
