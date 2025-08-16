package com.collection;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer,String> t = new TreeMap<Integer , String>();
		
		t.put(1, "asd");
		t.put(3, "pqr");
		t.put(7, "abc");
		System.out.println(t);
		t.put(2, "que");
		System.out.println(t);
		
		//Returns the least key greater than or equal to the given key,or null if there is no such key
		
		//if entered value is found then it return other wise return largest 
		//number after the entered number or value
		System.out.println(t.ceilingKey(5)); //return 7
		
		//Returns a key-value mapping associated with the greatest key less than or equal to the given key, or null if thereis no such key.
		//if entered value is found then it return other wise return lowest number or value 
		System.out.println(t.floorEntry(5));

		System.out.println("Legth of TreeMap is :"+ t.size());
		
		System.out.println("Generated Hash code is : "+t.hashCode());
		
		System.out.println("Check TreeMap is empty or not : "+t.isEmpty());
		
		//Returns a Set view of the mappings contained in this map
		System.out.println(t.entrySet());
		
		//return the all keys of treeMap in the form of set
		System.out.println(t.keySet());
		
		//Return the values of TreeMap in the form of Set.
		System.out.println(t.values());
		
		//Print all keys in descending order
		System.out.println(t.descendingKeySet());
		
		//print(return) the map element in descending order
		System.out.println(t.descendingMap());
		
		//Search particular element by using key of map
		System.out.println(t.containsKey(1));
		
		//Search particular value is found or not in TreeMap   
		System.out.println(t.containsValue("asd"));
		
		//remove particular element from map using key 
		System.out.println(t.remove(1));
		
		//remove particular element from map if key and value are same as entered key and value.
		System.out.println(t.remove(1, "asd"));
		
		//remove first element from last
		System.out.println(t.pollFirstEntry());
		
		//remove last element from map
		System.out.println(t.pollLastEntry());
	}

}
