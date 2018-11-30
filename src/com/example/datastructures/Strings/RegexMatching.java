package com.example.datastructures.Strings;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexMatching {
	
	public boolean integerMatching(String input) {
		Pattern p =  Pattern.compile("[+-]?[0-9]*");
		Matcher m = p.matcher(input);
		boolean b = m.matches();
		return b;	
	}
	
	public boolean floatingNumberMatching(String input) {
		
	    String regex = "[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?";
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(input);
		boolean b = m.matches();
		
		return b;
		
	}
	
	public void wordsFirstLetter(String input) {
		
		String regex = "\\b[a-zA-Z]";
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(input);
		
		while(m.find()) {
			System.out.println(m.group());
		}
			
		
		
		
		
	}
	
	
	

}
