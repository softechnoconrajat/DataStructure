package com.example.datastructures.array;

import java.util.*;

public class ArrangeNumbertoGetBiggestNumber {
	
	public static void printLargest(Vector<String> arr){ 
	      
        Collections.sort(arr, new Comparator<String>(){ 
  
        // A comparison function which is used by  
        // sort() in printLargest() 
        @Override
        public int compare(String X, String Y) { 
          
        // first append Y at the end of X 
        String XY=X + Y; 
          
        // then append X at the end of Y 
        String YX=Y + X; 
          
        // Now see which of the two formed numbers  
        // is greater 
        return XY.compareTo(YX) > 0 ? -1:1; 
    } 
    }); 
          
    Iterator it = arr.iterator(); 
  
    while(it.hasNext()) 
        System.out.print(it.next()); 
      
    } 
	

}
