package com.collection;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
		//ArrayList<Integer> al =new ArrayList<Integer>();
		List<Integer> l =new ArrayList<Integer>();
		l.add(20);
		l.add(35);
		l.add(60);
		l.add(75);
		
		System.out.print("Element in Array-List : ");
		for(int i :l)
		{	
		System.out.print(" "+i);
		}
		System.out.println();
		System.out.println("length of Array list is : "+l.size());
		
		l.add(null);
		System.out.println("After adding null Value : "+l );
		
		l.add(35); //duplicate element 
		System.out.println(l);
		
		l.addFirst(89);
		System.out.println(l);
		
		l.addLast(90);
		System.out.println(l);
		
		System.out.println("Remove First Element : "+l.removeFirst());
		System.out.println("Remove Last Element : "+l.removeLast());
		System.out.println("Remove Element by index number : "+l.remove(2));
		
		System.out.println("Check List is empty or not : "+l.isEmpty());
		
		System.out.println("Search Element in the list : " + l.contains(20));
		
	
		
		System.out.println("Size is : " +l.size());
		
		
		System.out.println(l);
		//get second index value
		System.out.println("Get Second index value : "+l.get(2));
		System.out.println("Get First index value : "+l.getFirst());
		System.out.println("Get Last index value : "+l.getLast());
		
		//(search left to right)
		System.out.println("Get First index number of  : "+l.indexOf(35)); 	//print first index value.
		
		//(search right to left)
		System.out.println("Get Last index vlaue using Element or object  : "+l.lastIndexOf(35));
		//Iterator : Is used to iterate the value of collection object.
	//	Collections.sort(l);
		Iterator<Integer> i = l.iterator();
	
		while(i.hasNext())
		{
			System.out.print(" "+i.next());
		}
		
		//for Each loop //It throws the Exception if collection contain null value  

//		for(int x : l)
//		{
//			System.out.print(" "+l);
//		}
	}

}
