package CollectionAndGenerics;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

 
//For iteration we can use 2 ways: 1) enhanced for loop and 2)iterator
public class CollectionAndGenerics {
	
	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(1234);
		values.add(3122);
		values.add(2428);
		values.add(2234);
		values.add(4567);
		
//		Comparator<Integer> comp = ( o1, o2) -> {
//				
//				if(o1 % 10000 > o2 % 10000)
//					return 1;
//				
//				return -1;
//				
//					
//		};		
//		
		Collections.sort(values, ( o1, o2) -> {
			return o1%10>o2%10?1:-1;	
	});
		
		
	//	Collections.sort(values);
		
		
		//values.forEach(System.out::println);
		
		
//		Iterator i = values.iterator(); 
//		
//		
//		while(i.hasNext()) {
//			
//			System.out.println(i.next());
//			
//		}
//		
		for(Integer i:values){
			
			System.out.println(i);
			
		}
		
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
