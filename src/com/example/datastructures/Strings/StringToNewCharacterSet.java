package com.example.datastructures.Strings;

import java.nio.charset.Charset;

public class StringToNewCharacterSet {
	
	public static void newCharacterSet(String input) {
		
		String character = "kvmcnophqrszyijadlegwbuft";
		
		int index;

		for(int i=0;i<input.length();i++) {
			
			if('A'<=input.charAt(i) && input.charAt(i)<='Z') {
				index = input.charAt(i) - 'A';
				System.out.println(character.charAt(index-1));
			}
			else if('a'<= input.charAt(i) && input.charAt(i) <='z') {
				index = input.charAt(i) - 'a';
				System.out.println(character.charAt(index-1));
			
		}			
		}
		
	}
}
	
