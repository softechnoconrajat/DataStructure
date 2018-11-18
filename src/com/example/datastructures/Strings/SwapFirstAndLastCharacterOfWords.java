package com.example.datastructures.Strings;

public class SwapFirstAndLastCharacterOfWords {
	
	public static void swapCharacter(String input) {
		
		
		char[] ch = input.toCharArray();
		
		
		
		
		for(int i=0;i<=ch.length;i++) {
			int k=i;
			
			while(i < ch.length && ch[i] != ' '  ) 
				i++;
			char temp = ch[k];
			ch[k] = ch[i-1];
			ch[i-1]= temp;
			
			}	
			System.out.println(ch);
			
		}
		
		
}
	
