package com.example.datastructures.Strings;

public class MissingPangramCharacter {
	
	public static void missingPangram(String str) {
		
		String[] markCharacter = new String[26];
		
		String temp;
		
		for(int i=0;i<str.length();i++) {
			if('A'<= str.charAt(i) && str.charAt(i)<='Z') {
				temp = Character.toString(str.charAt(i));
				markCharacter[str.charAt(i)-'A'] = temp;
			}
			else if('a'<=str.charAt(i) && str.charAt(i)<='z') {
				temp = Character.toString(str.charAt(i));
				markCharacter[str.charAt(i)-'a'] = temp;
			}
		}
		for(int i=0;i<markCharacter.length;i++) {
			if(markCharacter[i]==null) {
				System.out.println((char)(i + 65));
			}	
		}
	}
}
