package com.example.datastructures.Strings;

public class AdjacentAreNotSame {
	
	public static String[] adjacentAreNotSame(String input) {
		
		String[] tempInput = new String[input.length()];
		String prevString = Character.toString(input.charAt(0));
		int count=0;
		tempInput[count] = Character.toString(input.charAt(0));
		
		for(int i=1;i<input.length();i++) {
			if(Character.toString(input.charAt(i)).equals(prevString)) {
				prevString = Character.toString(input.charAt(i));
			}
			else if (input.charAt(i)==32){
				count++;
				tempInput[count] = Character.toString((char)32);
				prevString = Character.toString(input.charAt(i));
			}
			else {
				count++;
				prevString = Character.toString(input.charAt(i));
				tempInput[count] = Character.toString(input.charAt(i));	
			}
		}
		return tempInput;
	}
}
