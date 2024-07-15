package part6;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declare Hashmap
		//HashMap hm = new HashMap(); // Declaration 1
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		//Add element to HashMap
		hm.put(101, "Akrem");
		hm.put(102,  "Rosa");
		hm.put(103, "Sawssen");
		hm.put(104, "Sarra");
		
		hm.put(108, "Foued");
		
		System.out.println(hm);
		
		//Remove element from HashMap
		hm.remove(102);
		
		System.out.println("After removing a pair: " +hm);
		
		//Read pairs from HashMap
		for(Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + "" +m.getValue());
		}

	}

}
