package CollectionAndGenerics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> values = new HashSet<Integer>();
		//Set do not have duplicate elements. 
		//It only supports unique elements.
		values.add(24);
		values.add(35);
		values.add(32);//Duplicate element won't be stored and return the value as false.
		values.add(41);
		
		//While storing the data HashSet uses the concept of the hashFunction. the value returned by the hash set is in order of their
		//of the memory location it is store in the device. To overcome this we uses tree set which stores the data in asscending order.
		for(int i : values) {
			System.out.println(i);
		}
		
		System.out.println("\n \n Tree Set \n \n");
		
		Set<Integer> treesValue = new TreeSet<Integer>();
		treesValue.add(24);
		treesValue.add(35);
		treesValue.add(32);
		treesValue.add(41);
		
		for(int i: treesValue) {
			System.out.println(i);
		}
	}
}
