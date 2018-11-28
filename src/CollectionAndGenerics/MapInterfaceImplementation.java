package CollectionAndGenerics;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapInterfaceImplementation {
	
	public static void main(String[] args) {
		
		// Hash-Map is not thread safe and asynchronous in nature.
		Map<String, String> values = new HashMap<>();
		
		values.put("Name", "Rajat");
		values.put("LoveLife", "Happy");
		values.put("Class", "First");
		
		Set<String> key = values.keySet();
		
		for(String i: key) {
			System.out.println(i + ":" + values.get(i));
		}
		
		// Hash-Table is not thread safe and asynchronous in nature.
		
		Map<String, String> tableValue = new Hashtable<>();
		
		tableValue.put("Name", "Rajat");
		tableValue.put("LoveLife", "Happy");
		tableValue.put("Class", "First");
		tableValue.put("LoverName", "Medha");
		
		Set<String> keyValue = tableValue.keySet();
		
		for(String i : keyValue) {
			System.out.println(i + ":" + tableValue.get(i));
		}
		
		// Implementing Entry Interface. Map(Interface) <- Entry(Interface)
		
		Map<String, String> tableValue1 = new Hashtable<>();
		
		tableValue1.put("Name", "Rajat");
		tableValue1.put("LoveLife", "Happy");
		tableValue1.put("Class", "First");
		tableValue1.put("LoverName", "Medha");
		
		Set<Map.Entry<String, String>> e = tableValue1.entrySet();
		
		for(Map.Entry<String, String> i : e ) {
			System.out.println(i.getKey() + ":" + i.getValue());
		}
		
		
		
	}

}
