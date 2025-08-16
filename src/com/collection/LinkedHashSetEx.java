package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {

	public static void main(String[] args) {
	
		Set<Integer> s =new HashSet<Integer>();
		s.add(34);
		s.add(56);
		s.add(98);
		s.add(45);
		s.add(24);
		
		Set<Integer> hs = new LinkedHashSet<Integer>();
		hs.add(34);
		hs.add(55);
		hs.add(90);
		hs.add(45);
		System.out.println("Set 1 is : "+s);
		System.out.println("Set 2 is :"+hs);
		
		hs.add(null);
		System.out.println(hs);
		
		//Union 
		s.addAll(hs); 		//Unique Element will be merge
		System.out.println("After Adding hs element on s "+s);
		
		s.removeAll(hs) ;		//common Element will be removed 
		System.out.println("After removeing hs element on s "+s);
		
		s.retainAll(hs);	//Common Element will be retrieve
		System.out.println("Common Element will be retrieve from s and hs :"+s);
	}
}
