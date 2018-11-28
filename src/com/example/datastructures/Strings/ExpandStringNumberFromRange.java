package com.example.datastructures.Strings;


import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExpandStringNumberFromRange {
	
//	 static String[] split(String input) {
//		
//		// Count how many words in our string
//		 //Irrespective of spaces
//		 
//		 int wc = countWords(input);
//		 
//		 String w[] = new String[wc];
//		 
//		 char[] c = input.toCharArray();
//		 int k = 0;
//		 for(int i=0; i<c.length; i++) {
//			 String s = "";
//			 
//			 //Whenever we found an non-spcae character
//			 while(i< c.length && c[i] !=  ' ') {
//				 //Concat with the String s
//				 //Increment the value of i
//				 
//				 s = s + c[i];
//				 i++;
//			 }
//			 
//			 //If the String is not empty
//			 if(s.length()!=0) {
//				 //Add the String to the String[]
//				 //Array
//				 w[k] = s;
//				 k++;
//				 
//			 }
//			 
//		 }
//		 return w;
//		 
//		
//	}
	 
	 // Function to count the number of words
	 
//	 static int countWords(String str) {
//		 
//		 int count = 0;
//		 
//		 for(int i=0 ; i< str.length(); i++) {
//			 // the below condition to check 
//			 //whether the first character is 
//			 //space or not
//			 if(i ==0 && str.charAt(i) != ' ' || str.charAt(i) != ' ' && str.charAt(i-1) == ' ') {
//				 count++;
//			 }
//		 }
//		 
//		 return count;
//		 
//	 }
	 
	 
	 public static void expand(String s) {
		 
		 String p = s;
		 String[] arr = p.split("-");
		 String k = "";
		 
//		 for(int i = 0; i<arr.length;i++) {
//			 
//			 System.out.println(arr[i]);
//		 }
//		 
		 for(int i=0; i<arr.length; i++) {
			 if(i  != arr.length-1) {
				 
				 String[] arr1 = arr[i].split(", ");
				 String[] arr2 = arr[i + 1].split(", ");
				 
				 int a = Integer.parseInt(arr1[arr1.length -1]);
				 int b = Integer.parseInt(arr2[0]);
				 
				 for(int j = a+1; j<b; j++) {
					 arr[i] = arr[i] + ", " + j;
				 }
				 
			 }
			 
			 if(k != "")
				 k = k +  ", " + arr[i];
			 else
				 k = k + arr[i];
			 
		 }
		 System.out.println(arr);
				 
		 
	 }
	 
	 public static void expand1(String s) {
		 String p = s;
		 String k = "";
		 
		 String[] arr = p.split("-");
		 
		 for(int i=0; i< arr.length; i++){
			 
			 if(i != arr.length-1) {
				 
				 String[] arr1 = arr[i].split(", ");
				 String[] arr2 = arr[i + 1].split(", ");
				 
				 int a = Integer.parseInt(arr1[arr1.length-1]);
				 int b = Integer.parseInt(arr2[0]);
				 
				 for(int j = a + 1 ; j<b ; j++) {
					 arr[i] = arr[i] + ", " + j;
				 }
				  
			 }
			 
			 
			 if(k != "")
				 k = k +  ", " + arr[i];
			 else
				 k = k + arr[i];
			 
		 }
		 
		 System.out.println(k);
		
		 
		 
		 
	 }
	 

}
