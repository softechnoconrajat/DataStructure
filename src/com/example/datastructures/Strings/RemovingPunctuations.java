package com.example.datastructures.Strings;

public class RemovingPunctuations {
	
	public static String[] removingPunctuation(String str) {
		
		String[] tempArray = new String[str.length()];
		int i;
		int count=0;
		
		for(i=0;i<str.length();i++) {
			
			if('A'<=str.charAt(i) && str.charAt(i)<='Z') {
				tempArray[count] = Character.toString(str.charAt(i));
				count++;	
			}
			else if('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
				tempArray[count] = Character.toString(str.charAt(i));
				count++;
			}
			else if (str.charAt(i)==32){
				
				tempArray[count] = Character.toString((char)32);
				count++;
			}
			
		}
		return tempArray;
	}

}
