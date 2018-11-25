package CollectionAndGenerics;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListVsVector {
	
	
	public static void main(String[] args) {
		
		//ArrayList class implements Vector Interface
		
		ArrayList<Integer> aL = new ArrayList<Integer>();
		
		aL.add(1);
		aL.add(2);
		//aL.addAll(aL);
		aL.add(1);
		aL.add(2);
		aL.addAll(aL);
		
		
		
		for(int i : aL) {
			System.out.println(i);
		}
		System.out.println(aL.size());
		
		//Vector class implements List Interface 
		
		
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		
		
		System.out.println(v.capacity());
		
		
	}
	
	//Difference between ArrayList and Vector,
	//1. Vector is sync. so it is thread Safe where as Array List is not.
	//2. Vector add 100% of extra space in case of extra space required where as ArrayList adds only 50%
	//3. Vector is slow with respect to ArrayList. 
	//Note: Prefer ArrayList unless it is mentioned to use vector.
	
	

}
