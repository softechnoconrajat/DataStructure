package CollectionAndGenerics;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

 
//For iteration we can use 2 ways: 1) enhanced for loop and 2)iterator
public class CollectionAndGenerics {
	
	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(1);
		values.add(3);
		values.add(5);
		
		values.add(2);
		
		Collections.sort(values);
		
		values.forEach(System.out::println);
		
		
//		Iterator i = values.iterator(); 
//		
//		
//		while(i.hasNext()) {
//			
//			System.out.println(i.next());
//			
//		}
//		
//		for(Integer i:values){
//			
//			System.out.println(i);
//			
//		}
		
//		values.remove(2);
//		
//		for(Integer i:values){
//			
//			System.out.println(i);
//			
//		}
//		
		
		
		
		
	}
	
	

}
