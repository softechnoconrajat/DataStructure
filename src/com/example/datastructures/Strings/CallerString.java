package com.example.datastructures.Strings;

import com.example.datastructures.Strings.RegexMatching;

public class CallerString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		regExpression();		
	}
	
	private static void regExpression() {
		
		RegexMatching regObj = new RegexMatching();
		
		String integerInput = "+132424";
		String floatInput = "2e10";
		
		String anyInput = "Hi I am Rajat";
		
		boolean intResult;
		boolean floatResult;
		
		intResult = regObj.integerMatching(integerInput);
		floatResult = regObj.floatingNumberMatching(floatInput);
		
		regObj.wordsFirstLetter(anyInput);
		
//		System.out.println(intResult);
//		System.out.println(floatResult);
		
		
	}
	

}
