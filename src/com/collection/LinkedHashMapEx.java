package com.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		Map<Integer , String> m = new HashMap<Integer ,String>();
		
		//Add element on map in the form of key value pairs
		m.put(1, "abc");
		m.put(2, "efg");
		m.put(3, "ghi");
		m.put(4, "jkl");
		
		Map<Integer ,String> lm =new LinkedHashMap<Integer,String>();
		lm.put(11, "AAA");
		lm.put(22, "BBB");
		lm.put(33, "CCC");
		lm.put(44, "DDD");
		lm.put(55, "DDD");
		
		System.out.println(lm);
		
		System.out.println(lm.isEmpty()); 		//Check map is Empty or not.
		System.out.println(lm.size()); 			//Find the Size.
		System.out.println(lm.hashCode()); 		//Generate hshCode .
		
//		m.putAll(lm); 		//merge two map together .
//		
//		System.out.println(m);
		
		System.out.println(lm.containsKey(11));
		System.out.println(lm.containsValue("AAA"));
		
		System.out.println(lm.keySet()); 	//Return the key in the form of collection array.
		System.out.println(lm.values()); 		//Return the value in the form of collection array.
		
		System.out.println(lm.entrySet()); 		//return the value in the form of collection  or square bracket 
	}

}
