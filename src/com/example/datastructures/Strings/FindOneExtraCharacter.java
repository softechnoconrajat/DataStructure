package com.example.datastructures.Strings;

import java.util.HashMap;

public class FindOneExtraCharacter {
	
	public static void oneExtraChar(String input1, String input2) {
		//
		
		
		HashMap<Character, Character> hashMap = new HashMap<>();
		
		
		for(int i=0;i<input1.length();i++) {
			hashMap.put(input1.charAt(i), input1.charAt(i));
			
		}
		
		for(int i=0; i<input2.length();i++) {
			if(hashMap.get(input2.charAt(i)) != null) {
				hashMap.put(input2.charAt(i), null);
			}
			else {
				System.out.println(input2.charAt(i));	
			}
		} 
	}
}
