package com.example.datastructures;

import com.example.datastructures.Strings.ExpandStringNumberFromRange;

public class CallerString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		expandString();	
	}
	
	public static void expandString() {
		String input = "1, 3-5, 9, 20-22";
		ExpandStringNumberFromRange.expand1(input);

}

}