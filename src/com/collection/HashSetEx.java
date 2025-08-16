package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<Integer> s =new HashSet<Integer>();
		s.add(34);
		s.add(56);
		s.add(98);
		s.add(45);
		s.add(24);
		
		System.out.println("Set s1 is : "+s);
		s.add(null); //null element
		System.out.println(s);
		s.add(98);		//duplicate element
		System.out.println(s);
		
		System.out.println("Size is : "+s.size());
		System.out.println("isEmpty : "+s.isEmpty());
		System.out.println("HashCode : "+s.hashCode());

		System.out.println("Search 56 element : "+s.contains(56));
		
		System.out.println("Remove Element : "+s.remove(56));
		System.out.println("After Remove : "+s);
		Iterator<Integer> it =s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
