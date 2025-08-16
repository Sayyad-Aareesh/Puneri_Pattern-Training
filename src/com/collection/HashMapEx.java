package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<Integer , String> m = new HashMap<Integer ,String>();
		
		//Add element on map in the form of key value pairs
		m.put(1, "abc");
		m.put(2, "efg");
		m.put(3, "ghi");
		m.put(4, "jkl");
		
		
		System.out.println("Map 1 : "+m);
		m.containsKey(2);
		m.containsValue("jkl");
		
		
//		m.remove(4);		//remove the element from map by using key.
//		System.out.println(m);
		

//		m.remove(4, "jkl"); 		//remove element if key and value are same.
//		System.out.println(m);
		
//		m.replace(1, "xyz"); 		//replace element by using key
//		System.out.println(m);

//		m.replace(2, "efg", "uvw");				//replace the element if key and value are equal.	
//		System.out.println(m);

		
//		for (Map.Entry<Integer, String> entry : m.entrySet()) {
//			Integer key = entry.getKey();
//			String val = entry.getValue();
//			
//			System.out.println("Map key is : "+key+" Value is : "+val);
//			
//		}
		
		
		//m.clear();				//remove all the element.
		//System.out.println(m);

	}

}
