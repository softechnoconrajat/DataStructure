package com.example.datastructures.Strings;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class CommonExampleString {
	
	
	public static void caseHandling(String str) {
		
		switch(str) {
		case "A":
			System.out.println("Its A");
			break;
		
		case "B":
			System.out.println("Its B");
			break;
			
		case "C":
			System.out.println("Its C");
			break;
		
		default:
			System.out.println("No Match");
			
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		byte b[] = {97,122,32, 97,122};
		//creating new string by decoding
		
	//	Charset cs = Charset.defaultCharset();
		
		String str;
		try {
			str = new String(b, "UTF-8");
			//System.out.println(str);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StringBuffer strBuff = new StringBuffer("Hello");
		
		String ns = new String(strBuff);
//		System.out.println(ns);
		
		StringBuilder sb = new StringBuilder(ns);
		//System.out.println(sb);
		
		caseHandling("A");
		
	}
	

}
