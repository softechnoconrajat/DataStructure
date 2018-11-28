package CollectionAndGenerics;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorWithCustomTypes {
	
	
	
	public static void main(String[] args) {
		
		List<Students> items = new ArrayList<Students>();
		
		items.add(new Students("Rajat", 3));
		items.add(new Students("Akash",4));
		items.add(new Students("Pankaj", 1));
		items.add(new Students("Gaurav",2));
		
		//Using Comparator Interface
		
//		Collections.sort(items, (st1, st2) -> {
//			return st1.roll_No > st2.roll_No ? 1: st1.roll_No < st2.roll_No ?-1:0;
//		});
		
		//By using Comparable Interface
		Collections.sort(items);
		
		
		
		for(Students i : items) {
			System.out.println(i.Name);
			System.out.println(i.roll_No);
		}
		
	}
	

}


class Students implements Comparable<Students>{
	String Name;
	int roll_No;
	
	public Students(String Name, int roll_No) {
		
		this.Name = Name;
		this.roll_No = roll_No;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		return this.roll_No > o.roll_No ? -1 : this.roll_No < o.roll_No ? 1 : 0;
	}
	
}
