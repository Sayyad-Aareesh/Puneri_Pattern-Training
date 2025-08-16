package com.collection;

import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;

public class LegancyClass {

	public static void main(String[] args) {
//		Vector<Integer> v = new Vector<Integer>();
//		
//		v.add(11);
//		v.add(45);
//		v.add(96);
//		v.add(23);
//		System.out.println(v);
//		
//		//remove element by using index number
//		System.out.println(v.remove(2));
//		System.out.println(v);
	//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
		Stack<Integer> s = new Stack<Integer>(); //LIFO
		s.add(23);
		s.add(24);
		s.add(96);
		s.add(11);
		s.add(11);	//allowed duplicate element
		s.add(null);	//allowed null value
		System.out.println(s);
		
		//add element at the last position
		s.push(23);
		System.out.println(s); //add after null
		s.pop(); 		//remove last element
		System.out.println(s); 			//remove 23
		
		//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
		
		Hashtable<Integer, Integer> h =new Hashtable<Integer,Integer>();
		h.put(1, 11);
		h.put(2, 22);
		h.put(3,33);
		h.put(4, 44);
		h.put(5, 55); //Not key and value is not allowed
		System.out.println("HashTable is : "+h);
		h.putIfAbsent(6, 66);
		System.out.println("HashTable is : "+h);
					
	}

}
