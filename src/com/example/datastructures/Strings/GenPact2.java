package com.example.datastructures.Strings;


import java.util.ArrayList;
import java.util.List;

public class GenPact2 {
	
public static void main(String[] args) {
	
	List<String> arrayList1 = new ArrayList<>();
	List<String> arrayList2 = new ArrayList<>();
	
	arrayList1.add("dasdsa sada");
	arrayList1.add("czx Itexzczxm");
	arrayList1.add("mkdznbf Item");
	arrayList1.add("mkfsnaskm");
	
	arrayList2.add("First Item");
	arrayList2.add("Second Item");
	arrayList2.add("Third Item");
	arrayList2.add("Fourth Item");
	
	List<Integer> l = GenPact2.mainSolution(arrayList1, arrayList2);
	GenPact2.print(l);
}

private static void print(List<Integer> arrayList) {
	for(Integer i : arrayList) {
		System.out.println(i);
		
	}	
}


private static List<Integer> mainSolution(List<String> a, List<String> b) {
	
	int k = 0;
	
	List<Integer> finalArray = new ArrayList<>();
	
	for(String i : a) {
		
		char[] ch = i.toCharArray();
		int score = 0;
		
		//System.out.println(ch);
		
		for(int j =0 ; j< ch.length; j++) {
			//Write the hash table function
			//System.out.println(ch[j]);
			boolean result = compareSubString(b, k, ch[j]);
			if(result != true) {
				score = score +1;
			}	
		}
		finalArray.add(score);
		k = k + 1;
	}
	return finalArray;	
}


private static boolean compareSubString(List<String> b, int indexValue, char c) {
	
	//char[] ch = i.toCharArray();
	char[] ch = b.get(indexValue).toCharArray();
	
	boolean resultSearch = searchItem(ch, c);
	
	return resultSearch;
}

private static Boolean searchItem(char[] ch, char c) {
	
	for(int i = 0; i<ch.length; i++) {
		if(ch[i]==c)
			return true;
			
	}
	return false;	
}
	
}
